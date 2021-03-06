/*
 * generated by Xtext 2.11.0
 */
package de.wwu.pi.guidsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import de.wwu.pi.guidsl.guiDsl.Model
import de.wwu.pi.guidsl.guiDsl.Window
import java.util.ArrayList
import de.wwu.pi.guidsl.guiDsl.Element
import de.wwu.pi.guidsl.guiDsl.Label
import de.wwu.pi.guidsl.guiDsl.LabeledText
import de.wwu.pi.guidsl.guiDsl.Button

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class GuiDslGenerator extends AbstractGenerator {

  override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
  	println("Start processing ")
  	val model = resource.contents.head as Model
  	for (win: model.windows){
      println("generating Java SWT code for "+win.id+".java")
  	  fsa.generateFile(win.id+".java",generateWindow(win))}
  	println("Finished ")
  }
	
  def generateWindow(Window win){
  	var CharSequence output = generatePreliminaries(win)
  	var int labelNo = 0
  	var ArrayList<Element> textFields = new ArrayList
	for (elem: win.elements)
	  switch elem {
	    Label: 
	      output =  output + generateLabel(labelNo = labelNo+1,elem.text).toString
	    LabeledText: {
	       if (elem.text === null) elem.text = elem.id
           output =  output + generateLabeledText(elem).toString
	       textFields.add(elem)}
        Button: output =  output + generateButton(elem,textFields).toString
	    }
	output =  output + generateFinish().toString
	return output    
  }
	
  def generatePreliminaries(Window win)'''
	import java.sql.Date;

	import org.eclipse.swt.SWT;
	import org.eclipse.swt.events.*;
	import org.eclipse.swt.layout.GridData;
	import org.eclipse.swt.layout.GridLayout;
	import org.eclipse.swt.widgets.*;

	public class �win.id� {
		
	  �IF win.main !== null� 
	  public static void main(String[] args) {
	  new �win.id�();}
	 �ENDIF�
	  
	  public �win.id�(
	    �IF win.parameters > 0� 
	     �FOR int i: 0..win.parameters-1 SEPARATOR ','�
	        final Object param�i� 	   	 
	     �ENDFOR�
	    �ENDIF�
	  ){
	    final Display display = new Display();
	    final Shell shell = new Shell(display);
	    �IF win.title !== null� 
	      shell.setText("�win.title�");
	     �ENDIF�
	    GridLayout layout = new GridLayout(2, false);
	    shell.setLayout(layout); 
    '''

  def generateLabel(int no, String text)'''
        Label label�no� = new Label(shell, SWT.NONE);
        label�no�.setText("�text�");
        GridData data�no� = new GridData(GridData.FILL, GridData.BEGINNING, true, false, 2, 1);
        label�no�.setLayoutData(data�no�);
  '''

  def generateLabeledText(LabeledText lt)'''
		Label �lt.id�Label = new Label(shell, SWT.NONE);
		�IF lt.text !== null�     	  
	      �lt.id�Label.setText("�lt.text�");
	      �lt.id�Label.setToolTipText("enter �lt.text�");
	    �ELSE�
	      �lt.id�Label.setText("�lt.id�");
	      �lt.id�Label.setToolTipText("enter �lt.id�");
	    �ENDIF�
		final Text �lt.id�Text = new Text(shell, SWT.LEFT);   
  '''


  def generateButton(Button button, ArrayList<Element> textFields)'''
	Button �button.id� =  new Button(shell, SWT.PUSH);
    �IF button.text !== null�     	  
     �button.id�.setText("�button.text�");  
	�ELSE�
	  �button.id�.setText("�button.id�");
    �ENDIF�
	�button.id�.addSelectionListener(
	    		new SelectionAdapter() {
	      @Override
	      public void widgetSelected(SelectionEvent e) {
	      	try{
	      	  �FOR elem: textFields�
	        	  �IF ((elem as LabeledText).validator !== null)� �validate(elem as LabeledText)�
	        	  �ENDIF�
	          �ENDFOR�
	          // ******** begin protected region 2 ****************
	          // call business logic 
	          // e.g. int room = businessLogic.RoomManagement.findRoom(arrival,departure);
	          //      display.dispose();
	          //      new BookRoom(room,arrival,departure); 
	          // ******** end protected region 2 ******************
	          }
	          catch (Exception ex){
	          	MessageBox messageBox�button.id.toFirstUpper� = new MessageBox(shell,SWT.ICON_ERROR);
	          	messageBox�button.id.toFirstUpper�.setMessage(ex.getMessage());
	          	messageBox�button.id.toFirstUpper�.open();
	          	}
		  }});
  '''

  def generateFinish()'''
	// produce layout
	shell.pack();
	shell.open();
	while (!shell.isDisposed()) {
		if (!display.readAndDispatch())
	    	display.sleep();
	}
		display.dispose();
	}} 
  '''

  def validate(LabeledText elem){
	'''String str�elem.id.toFirstUpper� = �elem.id�Text.getText();
	''' +
	switch (elem.validator.restriction){
		case 'numeric': '''
		  int value�elem.id.toFirstUpper� = Integer.parseInt(str�elem.id.toFirstUpper�);
		  '''
		case 'letters': '''
		         for (int i = 0;  i<str�elem.id.toFirstUpper�.length(); i++){
		         	char c = str�elem.id.toFirstUpper�.charAt(i);
		         	if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c == ' '))) {
		         		throw new Exception("erroneous syntax");}}    
			     '''     
		case 'date': '''
		  int day�elem.id.toFirstUpper� = Integer.parseInt(str�elem.id.toFirstUpper�.substring(0,2));
		  if (str�elem.id.toFirstUpper�.charAt(2) != '.') throw new Exception("erroneous syntax");
		  int month�elem.id.toFirstUpper� = Integer.parseInt(str�elem.id.toFirstUpper�.substring(3,5));
		  if (str�elem.id.toFirstUpper�.charAt(5) != '.') throw new Exception("erroneous syntax");
		  int year�elem.id.toFirstUpper� = Integer.parseInt(str�elem.id.toFirstUpper�.substring(6,10));
		  Date date�elem.id.toFirstUpper� = new Date(year�elem.id.toFirstUpper�-1900,month�elem.id.toFirstUpper�-1,day�elem.id.toFirstUpper�);	   
		  '''
	}
  }
	
   def String toFirstUpper(String str) {
     str.substring(0,1).toUpperCase() + str.substring(1)
   }
}
