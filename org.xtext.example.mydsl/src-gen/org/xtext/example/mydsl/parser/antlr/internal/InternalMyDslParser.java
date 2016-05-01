package org.xtext.example.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Window'", "'{'", "'Title'", "'Parameters'", "'main'", "'}'", "'LabeledText'", "'Validator'", "'numeric'", "'letters'", "'date'", "'Label'", "'Button'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;
     	
        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:68:2: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:76:1: ruleModel returns [EObject current=null] : ( (lv_windows_0_0= ruleWindow ) )+ ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_windows_0_0 = null;


         enterRule(); 
            
        try {
            // InternalMyDsl.g:79:28: ( ( (lv_windows_0_0= ruleWindow ) )+ )
            // InternalMyDsl.g:80:1: ( (lv_windows_0_0= ruleWindow ) )+
            {
            // InternalMyDsl.g:80:1: ( (lv_windows_0_0= ruleWindow ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:81:1: (lv_windows_0_0= ruleWindow )
            	    {
            	    // InternalMyDsl.g:81:1: (lv_windows_0_0= ruleWindow )
            	    // InternalMyDsl.g:82:3: lv_windows_0_0= ruleWindow
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getWindowsWindowParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_3);
            	    lv_windows_0_0=ruleWindow();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"windows",
            	            		lv_windows_0_0, 
            	            		"org.xtext.example.mydsl.MyDsl.Window");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleWindow"
    // InternalMyDsl.g:106:1: entryRuleWindow returns [EObject current=null] : iv_ruleWindow= ruleWindow EOF ;
    public final EObject entryRuleWindow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWindow = null;


        try {
            // InternalMyDsl.g:107:2: (iv_ruleWindow= ruleWindow EOF )
            // InternalMyDsl.g:108:2: iv_ruleWindow= ruleWindow EOF
            {
             newCompositeNode(grammarAccess.getWindowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWindow=ruleWindow();

            state._fsp--;

             current =iv_ruleWindow; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWindow"


    // $ANTLR start "ruleWindow"
    // InternalMyDsl.g:115:1: ruleWindow returns [EObject current=null] : (otherlv_0= 'Window' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Title' ( (lv_title_4_0= RULE_STRING ) ) )? (otherlv_5= 'Parameters' ( (lv_parameters_6_0= RULE_INT ) ) )? ( (lv_main_7_0= 'main' ) )? ( (lv_elements_8_0= ruleElement ) )* otherlv_9= '}' ) ;
    public final EObject ruleWindow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_title_4_0=null;
        Token otherlv_5=null;
        Token lv_parameters_6_0=null;
        Token lv_main_7_0=null;
        Token otherlv_9=null;
        EObject lv_elements_8_0 = null;


         enterRule(); 
            
        try {
            // InternalMyDsl.g:118:28: ( (otherlv_0= 'Window' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Title' ( (lv_title_4_0= RULE_STRING ) ) )? (otherlv_5= 'Parameters' ( (lv_parameters_6_0= RULE_INT ) ) )? ( (lv_main_7_0= 'main' ) )? ( (lv_elements_8_0= ruleElement ) )* otherlv_9= '}' ) )
            // InternalMyDsl.g:119:1: (otherlv_0= 'Window' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Title' ( (lv_title_4_0= RULE_STRING ) ) )? (otherlv_5= 'Parameters' ( (lv_parameters_6_0= RULE_INT ) ) )? ( (lv_main_7_0= 'main' ) )? ( (lv_elements_8_0= ruleElement ) )* otherlv_9= '}' )
            {
            // InternalMyDsl.g:119:1: (otherlv_0= 'Window' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Title' ( (lv_title_4_0= RULE_STRING ) ) )? (otherlv_5= 'Parameters' ( (lv_parameters_6_0= RULE_INT ) ) )? ( (lv_main_7_0= 'main' ) )? ( (lv_elements_8_0= ruleElement ) )* otherlv_9= '}' )
            // InternalMyDsl.g:119:3: otherlv_0= 'Window' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Title' ( (lv_title_4_0= RULE_STRING ) ) )? (otherlv_5= 'Parameters' ( (lv_parameters_6_0= RULE_INT ) ) )? ( (lv_main_7_0= 'main' ) )? ( (lv_elements_8_0= ruleElement ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getWindowAccess().getWindowKeyword_0());
                
            // InternalMyDsl.g:123:1: ( (lv_id_1_0= RULE_ID ) )
            // InternalMyDsl.g:124:1: (lv_id_1_0= RULE_ID )
            {
            // InternalMyDsl.g:124:1: (lv_id_1_0= RULE_ID )
            // InternalMyDsl.g:125:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            			newLeafNode(lv_id_1_0, grammarAccess.getWindowAccess().getIdIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWindowRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

                	newLeafNode(otherlv_2, grammarAccess.getWindowAccess().getLeftCurlyBracketKeyword_2());
                
            // InternalMyDsl.g:145:1: (otherlv_3= 'Title' ( (lv_title_4_0= RULE_STRING ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:145:3: otherlv_3= 'Title' ( (lv_title_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_7); 

                        	newLeafNode(otherlv_3, grammarAccess.getWindowAccess().getTitleKeyword_3_0());
                        
                    // InternalMyDsl.g:149:1: ( (lv_title_4_0= RULE_STRING ) )
                    // InternalMyDsl.g:150:1: (lv_title_4_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:150:1: (lv_title_4_0= RULE_STRING )
                    // InternalMyDsl.g:151:3: lv_title_4_0= RULE_STRING
                    {
                    lv_title_4_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    			newLeafNode(lv_title_4_0, grammarAccess.getWindowAccess().getTitleSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWindowRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"title",
                            		lv_title_4_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:167:4: (otherlv_5= 'Parameters' ( (lv_parameters_6_0= RULE_INT ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:167:6: otherlv_5= 'Parameters' ( (lv_parameters_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_9); 

                        	newLeafNode(otherlv_5, grammarAccess.getWindowAccess().getParametersKeyword_4_0());
                        
                    // InternalMyDsl.g:171:1: ( (lv_parameters_6_0= RULE_INT ) )
                    // InternalMyDsl.g:172:1: (lv_parameters_6_0= RULE_INT )
                    {
                    // InternalMyDsl.g:172:1: (lv_parameters_6_0= RULE_INT )
                    // InternalMyDsl.g:173:3: lv_parameters_6_0= RULE_INT
                    {
                    lv_parameters_6_0=(Token)match(input,RULE_INT,FOLLOW_10); 

                    			newLeafNode(lv_parameters_6_0, grammarAccess.getWindowAccess().getParametersINTTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWindowRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"parameters",
                            		lv_parameters_6_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:189:4: ( (lv_main_7_0= 'main' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:190:1: (lv_main_7_0= 'main' )
                    {
                    // InternalMyDsl.g:190:1: (lv_main_7_0= 'main' )
                    // InternalMyDsl.g:191:3: lv_main_7_0= 'main'
                    {
                    lv_main_7_0=(Token)match(input,15,FOLLOW_11); 

                            newLeafNode(lv_main_7_0, grammarAccess.getWindowAccess().getMainMainKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWindowRule());
                    	        }
                           		setWithLastConsumed(current, "main", lv_main_7_0, "main");
                    	    

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:204:3: ( (lv_elements_8_0= ruleElement ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17||(LA5_0>=22 && LA5_0<=23)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:205:1: (lv_elements_8_0= ruleElement )
            	    {
            	    // InternalMyDsl.g:205:1: (lv_elements_8_0= ruleElement )
            	    // InternalMyDsl.g:206:3: lv_elements_8_0= ruleElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWindowAccess().getElementsElementParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_11);
            	    lv_elements_8_0=ruleElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWindowRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_8_0, 
            	            		"org.xtext.example.mydsl.MyDsl.Element");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_9=(Token)match(input,16,FOLLOW_2); 

                	newLeafNode(otherlv_9, grammarAccess.getWindowAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWindow"


    // $ANTLR start "entryRuleElement"
    // InternalMyDsl.g:234:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalMyDsl.g:235:2: (iv_ruleElement= ruleElement EOF )
            // InternalMyDsl.g:236:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalMyDsl.g:243:1: ruleElement returns [EObject current=null] : (this_LabeledText_0= ruleLabeledText | this_Label_1= ruleLabel | this_Button_2= ruleButton ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_LabeledText_0 = null;

        EObject this_Label_1 = null;

        EObject this_Button_2 = null;


         enterRule(); 
            
        try {
            // InternalMyDsl.g:246:28: ( (this_LabeledText_0= ruleLabeledText | this_Label_1= ruleLabel | this_Button_2= ruleButton ) )
            // InternalMyDsl.g:247:1: (this_LabeledText_0= ruleLabeledText | this_Label_1= ruleLabel | this_Button_2= ruleButton )
            {
            // InternalMyDsl.g:247:1: (this_LabeledText_0= ruleLabeledText | this_Label_1= ruleLabel | this_Button_2= ruleButton )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt6=1;
                }
                break;
            case 22:
                {
                alt6=2;
                }
                break;
            case 23:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:248:5: this_LabeledText_0= ruleLabeledText
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getLabeledTextParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_LabeledText_0=ruleLabeledText();

                    state._fsp--;

                     
                            current = this_LabeledText_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:258:5: this_Label_1= ruleLabel
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getLabelParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Label_1=ruleLabel();

                    state._fsp--;

                     
                            current = this_Label_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:268:5: this_Button_2= ruleButton
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getButtonParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Button_2=ruleButton();

                    state._fsp--;

                     
                            current = this_Button_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleLabeledText"
    // InternalMyDsl.g:284:1: entryRuleLabeledText returns [EObject current=null] : iv_ruleLabeledText= ruleLabeledText EOF ;
    public final EObject entryRuleLabeledText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabeledText = null;


        try {
            // InternalMyDsl.g:285:2: (iv_ruleLabeledText= ruleLabeledText EOF )
            // InternalMyDsl.g:286:2: iv_ruleLabeledText= ruleLabeledText EOF
            {
             newCompositeNode(grammarAccess.getLabeledTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabeledText=ruleLabeledText();

            state._fsp--;

             current =iv_ruleLabeledText; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLabeledText"


    // $ANTLR start "ruleLabeledText"
    // InternalMyDsl.g:293:1: ruleLabeledText returns [EObject current=null] : (otherlv_0= 'LabeledText' ( (lv_id_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) )? ( (lv_validator_3_0= ruleValidator ) )? ) ;
    public final EObject ruleLabeledText() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token lv_text_2_0=null;
        EObject lv_validator_3_0 = null;


         enterRule(); 
            
        try {
            // InternalMyDsl.g:296:28: ( (otherlv_0= 'LabeledText' ( (lv_id_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) )? ( (lv_validator_3_0= ruleValidator ) )? ) )
            // InternalMyDsl.g:297:1: (otherlv_0= 'LabeledText' ( (lv_id_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) )? ( (lv_validator_3_0= ruleValidator ) )? )
            {
            // InternalMyDsl.g:297:1: (otherlv_0= 'LabeledText' ( (lv_id_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) )? ( (lv_validator_3_0= ruleValidator ) )? )
            // InternalMyDsl.g:297:3: otherlv_0= 'LabeledText' ( (lv_id_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) )? ( (lv_validator_3_0= ruleValidator ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getLabeledTextAccess().getLabeledTextKeyword_0());
                
            // InternalMyDsl.g:301:1: ( (lv_id_1_0= RULE_ID ) )
            // InternalMyDsl.g:302:1: (lv_id_1_0= RULE_ID )
            {
            // InternalMyDsl.g:302:1: (lv_id_1_0= RULE_ID )
            // InternalMyDsl.g:303:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            			newLeafNode(lv_id_1_0, grammarAccess.getLabeledTextAccess().getIdIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLabeledTextRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalMyDsl.g:319:2: ( (lv_text_2_0= RULE_STRING ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:320:1: (lv_text_2_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:320:1: (lv_text_2_0= RULE_STRING )
                    // InternalMyDsl.g:321:3: lv_text_2_0= RULE_STRING
                    {
                    lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

                    			newLeafNode(lv_text_2_0, grammarAccess.getLabeledTextAccess().getTextSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLabeledTextRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"text",
                            		lv_text_2_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:337:3: ( (lv_validator_3_0= ruleValidator ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:338:1: (lv_validator_3_0= ruleValidator )
                    {
                    // InternalMyDsl.g:338:1: (lv_validator_3_0= ruleValidator )
                    // InternalMyDsl.g:339:3: lv_validator_3_0= ruleValidator
                    {
                     
                    	        newCompositeNode(grammarAccess.getLabeledTextAccess().getValidatorValidatorParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_validator_3_0=ruleValidator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLabeledTextRule());
                    	        }
                           		set(
                           			current, 
                           			"validator",
                            		lv_validator_3_0, 
                            		"org.xtext.example.mydsl.MyDsl.Validator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLabeledText"


    // $ANTLR start "entryRuleValidator"
    // InternalMyDsl.g:363:1: entryRuleValidator returns [EObject current=null] : iv_ruleValidator= ruleValidator EOF ;
    public final EObject entryRuleValidator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidator = null;


        try {
            // InternalMyDsl.g:364:2: (iv_ruleValidator= ruleValidator EOF )
            // InternalMyDsl.g:365:2: iv_ruleValidator= ruleValidator EOF
            {
             newCompositeNode(grammarAccess.getValidatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValidator=ruleValidator();

            state._fsp--;

             current =iv_ruleValidator; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidator"


    // $ANTLR start "ruleValidator"
    // InternalMyDsl.g:372:1: ruleValidator returns [EObject current=null] : (otherlv_0= 'Validator' ( ( (lv_restriction_1_0= 'numeric' ) ) | ( (lv_restriction_2_0= 'letters' ) ) | ( (lv_restriction_3_0= 'date' ) ) ) ) ;
    public final EObject ruleValidator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_restriction_1_0=null;
        Token lv_restriction_2_0=null;
        Token lv_restriction_3_0=null;

         enterRule(); 
            
        try {
            // InternalMyDsl.g:375:28: ( (otherlv_0= 'Validator' ( ( (lv_restriction_1_0= 'numeric' ) ) | ( (lv_restriction_2_0= 'letters' ) ) | ( (lv_restriction_3_0= 'date' ) ) ) ) )
            // InternalMyDsl.g:376:1: (otherlv_0= 'Validator' ( ( (lv_restriction_1_0= 'numeric' ) ) | ( (lv_restriction_2_0= 'letters' ) ) | ( (lv_restriction_3_0= 'date' ) ) ) )
            {
            // InternalMyDsl.g:376:1: (otherlv_0= 'Validator' ( ( (lv_restriction_1_0= 'numeric' ) ) | ( (lv_restriction_2_0= 'letters' ) ) | ( (lv_restriction_3_0= 'date' ) ) ) )
            // InternalMyDsl.g:376:3: otherlv_0= 'Validator' ( ( (lv_restriction_1_0= 'numeric' ) ) | ( (lv_restriction_2_0= 'letters' ) ) | ( (lv_restriction_3_0= 'date' ) ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_14); 

                	newLeafNode(otherlv_0, grammarAccess.getValidatorAccess().getValidatorKeyword_0());
                
            // InternalMyDsl.g:380:1: ( ( (lv_restriction_1_0= 'numeric' ) ) | ( (lv_restriction_2_0= 'letters' ) ) | ( (lv_restriction_3_0= 'date' ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt9=1;
                }
                break;
            case 20:
                {
                alt9=2;
                }
                break;
            case 21:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:380:2: ( (lv_restriction_1_0= 'numeric' ) )
                    {
                    // InternalMyDsl.g:380:2: ( (lv_restriction_1_0= 'numeric' ) )
                    // InternalMyDsl.g:381:1: (lv_restriction_1_0= 'numeric' )
                    {
                    // InternalMyDsl.g:381:1: (lv_restriction_1_0= 'numeric' )
                    // InternalMyDsl.g:382:3: lv_restriction_1_0= 'numeric'
                    {
                    lv_restriction_1_0=(Token)match(input,19,FOLLOW_2); 

                            newLeafNode(lv_restriction_1_0, grammarAccess.getValidatorAccess().getRestrictionNumericKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getValidatorRule());
                    	        }
                           		setWithLastConsumed(current, "restriction", lv_restriction_1_0, "numeric");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:396:6: ( (lv_restriction_2_0= 'letters' ) )
                    {
                    // InternalMyDsl.g:396:6: ( (lv_restriction_2_0= 'letters' ) )
                    // InternalMyDsl.g:397:1: (lv_restriction_2_0= 'letters' )
                    {
                    // InternalMyDsl.g:397:1: (lv_restriction_2_0= 'letters' )
                    // InternalMyDsl.g:398:3: lv_restriction_2_0= 'letters'
                    {
                    lv_restriction_2_0=(Token)match(input,20,FOLLOW_2); 

                            newLeafNode(lv_restriction_2_0, grammarAccess.getValidatorAccess().getRestrictionLettersKeyword_1_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getValidatorRule());
                    	        }
                           		setWithLastConsumed(current, "restriction", lv_restriction_2_0, "letters");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:412:6: ( (lv_restriction_3_0= 'date' ) )
                    {
                    // InternalMyDsl.g:412:6: ( (lv_restriction_3_0= 'date' ) )
                    // InternalMyDsl.g:413:1: (lv_restriction_3_0= 'date' )
                    {
                    // InternalMyDsl.g:413:1: (lv_restriction_3_0= 'date' )
                    // InternalMyDsl.g:414:3: lv_restriction_3_0= 'date'
                    {
                    lv_restriction_3_0=(Token)match(input,21,FOLLOW_2); 

                            newLeafNode(lv_restriction_3_0, grammarAccess.getValidatorAccess().getRestrictionDateKeyword_1_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getValidatorRule());
                    	        }
                           		setWithLastConsumed(current, "restriction", lv_restriction_3_0, "date");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidator"


    // $ANTLR start "entryRuleLabel"
    // InternalMyDsl.g:435:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // InternalMyDsl.g:436:2: (iv_ruleLabel= ruleLabel EOF )
            // InternalMyDsl.g:437:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalMyDsl.g:444:1: ruleLabel returns [EObject current=null] : (otherlv_0= 'Label' ( (lv_text_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;

         enterRule(); 
            
        try {
            // InternalMyDsl.g:447:28: ( (otherlv_0= 'Label' ( (lv_text_1_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:448:1: (otherlv_0= 'Label' ( (lv_text_1_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:448:1: (otherlv_0= 'Label' ( (lv_text_1_0= RULE_STRING ) ) )
            // InternalMyDsl.g:448:3: otherlv_0= 'Label' ( (lv_text_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_7); 

                	newLeafNode(otherlv_0, grammarAccess.getLabelAccess().getLabelKeyword_0());
                
            // InternalMyDsl.g:452:1: ( (lv_text_1_0= RULE_STRING ) )
            // InternalMyDsl.g:453:1: (lv_text_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:453:1: (lv_text_1_0= RULE_STRING )
            // InternalMyDsl.g:454:3: lv_text_1_0= RULE_STRING
            {
            lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(lv_text_1_0, grammarAccess.getLabelAccess().getTextSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLabelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"text",
                    		lv_text_1_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleButton"
    // InternalMyDsl.g:478:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // InternalMyDsl.g:479:2: (iv_ruleButton= ruleButton EOF )
            // InternalMyDsl.g:480:2: iv_ruleButton= ruleButton EOF
            {
             newCompositeNode(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleButton=ruleButton();

            state._fsp--;

             current =iv_ruleButton; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // InternalMyDsl.g:487:1: ruleButton returns [EObject current=null] : (otherlv_0= 'Button' ( (lv_id_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) )? ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token lv_text_2_0=null;

         enterRule(); 
            
        try {
            // InternalMyDsl.g:490:28: ( (otherlv_0= 'Button' ( (lv_id_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) )? ) )
            // InternalMyDsl.g:491:1: (otherlv_0= 'Button' ( (lv_id_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) )? )
            {
            // InternalMyDsl.g:491:1: (otherlv_0= 'Button' ( (lv_id_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) )? )
            // InternalMyDsl.g:491:3: otherlv_0= 'Button' ( (lv_id_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getButtonAccess().getButtonKeyword_0());
                
            // InternalMyDsl.g:495:1: ( (lv_id_1_0= RULE_ID ) )
            // InternalMyDsl.g:496:1: (lv_id_1_0= RULE_ID )
            {
            // InternalMyDsl.g:496:1: (lv_id_1_0= RULE_ID )
            // InternalMyDsl.g:497:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            			newLeafNode(lv_id_1_0, grammarAccess.getButtonAccess().getIdIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getButtonRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalMyDsl.g:513:2: ( (lv_text_2_0= RULE_STRING ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:514:1: (lv_text_2_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:514:1: (lv_text_2_0= RULE_STRING )
                    // InternalMyDsl.g:515:3: lv_text_2_0= RULE_STRING
                    {
                    lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			newLeafNode(lv_text_2_0, grammarAccess.getButtonAccess().getTextSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getButtonRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"text",
                            		lv_text_2_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleButton"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000C3E000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000C3C000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000C38000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000C30000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040022L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000022L});

}