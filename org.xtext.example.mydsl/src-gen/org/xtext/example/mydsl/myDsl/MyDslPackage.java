/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/MyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslPackage eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ModelImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Windows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__WINDOWS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.WindowImpl <em>Window</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.WindowImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getWindow()
   * @generated
   */
  int WINDOW = 1;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WINDOW__ID = 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WINDOW__TITLE = 1;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WINDOW__PARAMETERS = 2;

  /**
   * The feature id for the '<em><b>Main</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WINDOW__MAIN = 3;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WINDOW__ELEMENTS = 4;

  /**
   * The number of structural features of the '<em>Window</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WINDOW_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ElementImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 2;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__TEXT = 0;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.LabeledTextImpl <em>Labeled Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.LabeledTextImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getLabeledText()
   * @generated
   */
  int LABELED_TEXT = 3;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABELED_TEXT__TEXT = ELEMENT__TEXT;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABELED_TEXT__ID = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Validator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABELED_TEXT__VALIDATOR = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Labeled Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABELED_TEXT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ValidatorImpl <em>Validator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ValidatorImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getValidator()
   * @generated
   */
  int VALIDATOR = 4;

  /**
   * The feature id for the '<em><b>Restriction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATOR__RESTRICTION = 0;

  /**
   * The number of structural features of the '<em>Validator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATOR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.LabelImpl <em>Label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.LabelImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getLabel()
   * @generated
   */
  int LABEL = 5;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__TEXT = ELEMENT__TEXT;

  /**
   * The number of structural features of the '<em>Label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ButtonImpl <em>Button</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ButtonImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getButton()
   * @generated
   */
  int BUTTON = 6;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__TEXT = ELEMENT__TEXT;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__ID = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Button</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.example.mydsl.myDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Model#getWindows <em>Windows</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Windows</em>'.
   * @see org.xtext.example.mydsl.myDsl.Model#getWindows()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Windows();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Window <em>Window</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Window</em>'.
   * @see org.xtext.example.mydsl.myDsl.Window
   * @generated
   */
  EClass getWindow();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Window#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.xtext.example.mydsl.myDsl.Window#getId()
   * @see #getWindow()
   * @generated
   */
  EAttribute getWindow_Id();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Window#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.xtext.example.mydsl.myDsl.Window#getTitle()
   * @see #getWindow()
   * @generated
   */
  EAttribute getWindow_Title();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Window#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Parameters</em>'.
   * @see org.xtext.example.mydsl.myDsl.Window#getParameters()
   * @see #getWindow()
   * @generated
   */
  EAttribute getWindow_Parameters();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Window#getMain <em>Main</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Main</em>'.
   * @see org.xtext.example.mydsl.myDsl.Window#getMain()
   * @see #getWindow()
   * @generated
   */
  EAttribute getWindow_Main();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Window#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.xtext.example.mydsl.myDsl.Window#getElements()
   * @see #getWindow()
   * @generated
   */
  EReference getWindow_Elements();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see org.xtext.example.mydsl.myDsl.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Element#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.xtext.example.mydsl.myDsl.Element#getText()
   * @see #getElement()
   * @generated
   */
  EAttribute getElement_Text();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.LabeledText <em>Labeled Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Labeled Text</em>'.
   * @see org.xtext.example.mydsl.myDsl.LabeledText
   * @generated
   */
  EClass getLabeledText();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.LabeledText#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.xtext.example.mydsl.myDsl.LabeledText#getId()
   * @see #getLabeledText()
   * @generated
   */
  EAttribute getLabeledText_Id();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.LabeledText#getValidator <em>Validator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Validator</em>'.
   * @see org.xtext.example.mydsl.myDsl.LabeledText#getValidator()
   * @see #getLabeledText()
   * @generated
   */
  EReference getLabeledText_Validator();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Validator <em>Validator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Validator</em>'.
   * @see org.xtext.example.mydsl.myDsl.Validator
   * @generated
   */
  EClass getValidator();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Validator#getRestriction <em>Restriction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Restriction</em>'.
   * @see org.xtext.example.mydsl.myDsl.Validator#getRestriction()
   * @see #getValidator()
   * @generated
   */
  EAttribute getValidator_Restriction();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Label <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Label</em>'.
   * @see org.xtext.example.mydsl.myDsl.Label
   * @generated
   */
  EClass getLabel();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Button <em>Button</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Button</em>'.
   * @see org.xtext.example.mydsl.myDsl.Button
   * @generated
   */
  EClass getButton();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Button#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.xtext.example.mydsl.myDsl.Button#getId()
   * @see #getButton()
   * @generated
   */
  EAttribute getButton_Id();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyDslFactory getMyDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ModelImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Windows</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__WINDOWS = eINSTANCE.getModel_Windows();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.WindowImpl <em>Window</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.WindowImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getWindow()
     * @generated
     */
    EClass WINDOW = eINSTANCE.getWindow();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WINDOW__ID = eINSTANCE.getWindow_Id();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WINDOW__TITLE = eINSTANCE.getWindow_Title();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WINDOW__PARAMETERS = eINSTANCE.getWindow_Parameters();

    /**
     * The meta object literal for the '<em><b>Main</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WINDOW__MAIN = eINSTANCE.getWindow_Main();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WINDOW__ELEMENTS = eINSTANCE.getWindow_Elements();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ElementImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT__TEXT = eINSTANCE.getElement_Text();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.LabeledTextImpl <em>Labeled Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.LabeledTextImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getLabeledText()
     * @generated
     */
    EClass LABELED_TEXT = eINSTANCE.getLabeledText();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABELED_TEXT__ID = eINSTANCE.getLabeledText_Id();

    /**
     * The meta object literal for the '<em><b>Validator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LABELED_TEXT__VALIDATOR = eINSTANCE.getLabeledText_Validator();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ValidatorImpl <em>Validator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ValidatorImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getValidator()
     * @generated
     */
    EClass VALIDATOR = eINSTANCE.getValidator();

    /**
     * The meta object literal for the '<em><b>Restriction</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALIDATOR__RESTRICTION = eINSTANCE.getValidator_Restriction();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.LabelImpl <em>Label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.LabelImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getLabel()
     * @generated
     */
    EClass LABEL = eINSTANCE.getLabel();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ButtonImpl <em>Button</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ButtonImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getButton()
     * @generated
     */
    EClass BUTTON = eINSTANCE.getButton();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUTTON__ID = eINSTANCE.getButton_Id();

  }

} //MyDslPackage
