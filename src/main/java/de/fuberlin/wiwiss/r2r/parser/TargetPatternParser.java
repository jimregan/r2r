// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g 2010-07-14 20:55:40

  package de.fuberlin.wiwiss.r2r.parser;
  
  import de.fuberlin.wiwiss.r2r.*;
  import java.util.List;
  import java.util.ArrayList;
  import java.util.Map;
  import java.util.HashMap;
  import java.util.Set;
  import java.util.HashSet;
  import com.hp.hpl.jena.util.PrintUtil;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class TargetPatternParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "VARIABLEURI", "VAR1", "VAR2", "VARIABLETERM", "LANGTAG", "INTEGER", "DECIMAL", "DOUBLE", "INTEGER_POSITIVE", "DECIMAL_POSITIVE", "DOUBLE_POSITIVE", "INTEGER_NEGATIVE", "DECIMAL_NEGATIVE", "DOUBLE_NEGATIVE", "TRUE", "FALSE", "STRING_LITERAL1", "STRING_LITERAL_LONG1", "IRI_REF", "PNAME_LN", "T", "R", "U", "E", "F", "A", "L", "S", "WS", "PN_PREFIX", "PNAME_NS", "PN_LOCAL", "BLANK_NODE_LABEL", "VARNAME", "EXPONENT", "ECHAR", "ANON", "PN_CHARS_U", "PN_CHARS_BASE", "PN_CHARS", "HEX", "COMMENT", "'.'", "'a'", "'^^'"
    };
    public static final int VARIABLEURI=4;
    public static final int IRI_REF=22;
    public static final int EXPONENT=38;
    public static final int PNAME_LN=23;
    public static final int EOF=-1;
    public static final int VARNAME=37;
    public static final int HEX=44;
    public static final int VARIABLETERM=7;
    public static final int DECIMAL_POSITIVE=13;
    public static final int DOUBLE=11;
    public static final int PN_CHARS_U=41;
    public static final int COMMENT=45;
    public static final int DOUBLE_POSITIVE=14;
    public static final int INTEGER=9;
    public static final int E=27;
    public static final int F=28;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int A=29;
    public static final int L=30;
    public static final int T__48=48;
    public static final int INTEGER_NEGATIVE=15;
    public static final int BLANK_NODE_LABEL=36;
    public static final int U=26;
    public static final int PN_LOCAL=35;
    public static final int T=24;
    public static final int PNAME_NS=34;
    public static final int S=31;
    public static final int R=25;
    public static final int TRUE=18;
    public static final int ECHAR=39;
    public static final int ANON=40;
    public static final int WS=32;
    public static final int PN_CHARS_BASE=42;
    public static final int DECIMAL=10;
    public static final int VAR1=5;
    public static final int VAR2=6;
    public static final int STRING_LITERAL_LONG1=21;
    public static final int DECIMAL_NEGATIVE=16;
    public static final int INTEGER_POSITIVE=12;
    public static final int PN_PREFIX=33;
    public static final int STRING_LITERAL1=20;
    public static final int PN_CHARS=43;
    public static final int DOUBLE_NEGATIVE=17;
    public static final int FALSE=19;
    public static final int LANGTAG=8;

    // delegates
    // delegators


        public TargetPatternParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public TargetPatternParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return TargetPatternParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g"; }


      PrefixMapper prefixMapper;
      Set<String> variables = new HashSet<String>();
      Set<String> props = new HashSet<String>();
      Set<String> cls = new HashSet<String>();
      Map<String, String> datatypeHints = new HashMap<String, String>();
      
      public void setPrefixMapper(PrefixMapper pm) {
        prefixMapper = pm;
      }
      
      public void recover(IntStream input, RecognitionException re) {
        String hdr = getErrorHeader(re);
        String msg = getErrorMessage(re, this.getTokenNames());
        
        throw new ParseException(hdr + " " + msg);
      }
      
      public void reportError(RecognitionException re) {
        String hdr = getErrorHeader(re);
        String msg = getErrorMessage(re, this.getTokenNames());
        
        throw new ParseException(hdr + " " + msg);
      }


    public static class targetPattern_return extends ParserRuleReturnScope {
        public Set<String> variableDependencies;
        public TargetPattern pattern;
        public Set<String> classes;
        public Set<String> properties;
        public Map<String, String> hints;
    };

    // $ANTLR start "targetPattern"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:68:1: targetPattern returns [Set<String> variableDependencies, TargetPattern pattern, Set<String> classes, Set<String> properties, Map<String, String> hints] : first= tripleOrPath ( '.' more= tripleOrPath )* EOF ;
    public final TargetPatternParser.targetPattern_return targetPattern() throws RecognitionException {
        TargetPatternParser.targetPattern_return retval = new TargetPatternParser.targetPattern_return();
        retval.start = input.LT(1);

        List<Triple> first = null;

        List<Triple> more = null;


        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:69:3: (first= tripleOrPath ( '.' more= tripleOrPath )* EOF )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:69:5: first= tripleOrPath ( '.' more= tripleOrPath )* EOF
            {
            pushFollow(FOLLOW_tripleOrPath_in_targetPattern64);
            first=tripleOrPath();

            state._fsp--;

             List<Triple> triples = first; 
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:70:5: ( '.' more= tripleOrPath )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==46) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:71:7: '.' more= tripleOrPath
            	    {
            	    match(input,46,FOLLOW_46_in_targetPattern81); 
            	    pushFollow(FOLLOW_tripleOrPath_in_targetPattern85);
            	    more=tripleOrPath();

            	    state._fsp--;

            	     triples.addAll(more); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match(input,EOF,FOLLOW_EOF_in_targetPattern114); 
             retval.pattern = new TargetPattern(triples);
                                   retval.variableDependencies = variables;
                                   retval.classes = cls;
                                   retval.properties = props;
                                   retval.hints = datatypeHints;
                                 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "targetPattern"


    // $ANTLR start "tripleOrPath"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:83:1: tripleOrPath returns [List<Triple> value] : ( | s= subject v= verb (s= subject v= verb )* o= object );
    public final List<Triple> tripleOrPath() throws RecognitionException {
        List<Triple> value = null;

        TripleElement s = null;

        TripleElement v = null;

        TripleElement o = null;


        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:84:3: ( | s= subject v= verb (s= subject v= verb )* o= object )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EOF||LA3_0==46) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=VARIABLEURI && LA3_0<=VAR2)||(LA3_0>=IRI_REF && LA3_0<=PNAME_LN)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:85:5: 
                    {
                    }
                    break;
                case 2 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:85:7: s= subject v= verb (s= subject v= verb )* o= object
                    {
                     List<Triple> triples = null;
                    pushFollow(FOLLOW_subject_in_tripleOrPath153);
                    s=subject();

                    state._fsp--;

                    pushFollow(FOLLOW_verb_in_tripleOrPath157);
                    v=verb();

                    state._fsp--;

                      triples = new ArrayList<Triple>();
                                              TripleElement sElement = s;
                                              TripleElement vElement = v;
                                              props.add(vElement.getValue(0));
                                           
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:91:7: (s= subject v= verb )*
                    loop2:
                    do {
                        int alt2=2;
                        switch ( input.LA(1) ) {
                        case VAR1:
                            {
                            int LA2_1 = input.LA(2);

                            if ( ((LA2_1>=IRI_REF && LA2_1<=PNAME_LN)||LA2_1==47) ) {
                                alt2=1;
                            }


                            }
                            break;
                        case VAR2:
                            {
                            int LA2_2 = input.LA(2);

                            if ( ((LA2_2>=IRI_REF && LA2_2<=PNAME_LN)||LA2_2==47) ) {
                                alt2=1;
                            }


                            }
                            break;
                        case IRI_REF:
                            {
                            int LA2_3 = input.LA(2);

                            if ( ((LA2_3>=IRI_REF && LA2_3<=PNAME_LN)||LA2_3==47) ) {
                                alt2=1;
                            }


                            }
                            break;
                        case PNAME_LN:
                            {
                            int LA2_4 = input.LA(2);

                            if ( ((LA2_4>=IRI_REF && LA2_4<=PNAME_LN)||LA2_4==47) ) {
                                alt2=1;
                            }


                            }
                            break;
                        case VARIABLEURI:
                            {
                            int LA2_6 = input.LA(2);

                            if ( ((LA2_6>=IRI_REF && LA2_6<=PNAME_LN)||LA2_6==47) ) {
                                alt2=1;
                            }


                            }
                            break;

                        }

                        switch (alt2) {
                    	case 1 :
                    	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:91:8: s= subject v= verb
                    	    {
                    	    pushFollow(FOLLOW_subject_in_tripleOrPath170);
                    	    s=subject();

                    	    state._fsp--;

                    	    pushFollow(FOLLOW_verb_in_tripleOrPath174);
                    	    v=verb();

                    	    state._fsp--;


                    	                              TripleElement oElement = s;
                    	                              triples.add(new Triple(sElement, vElement, oElement, vElement.getValue(0), null));
                    	                              sElement = oElement;
                    	                              vElement = v;
                    	                              props.add(vElement.getValue(0));
                    	                            

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    pushFollow(FOLLOW_object_in_tripleOrPath195);
                    o=object();

                    state._fsp--;


                                     String property = vElement.getValue(0);
                                     String classURI = null; 
                                     if(property.equals("http://www.w3.org/1999/02/22-rdf-syntax-ns#type")) {
                                       cls.add(o.getValue(0));
                                       classURI = o.getValue(0);
                                     }

                                     triples.add(new Triple(sElement, vElement, o, property, classURI));
                                     value = triples;
                                   

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "tripleOrPath"


    // $ANTLR start "subject"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:124:1: subject returns [TripleElement value] : ( varOrIriRef | VARIABLEURI );
    public final TripleElement subject() throws RecognitionException {
        TripleElement value = null;

        Token VARIABLEURI2=null;
        TripleElement varOrIriRef1 = null;


        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:125:3: ( varOrIriRef | VARIABLEURI )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=VAR1 && LA4_0<=VAR2)||(LA4_0>=IRI_REF && LA4_0<=PNAME_LN)) ) {
                alt4=1;
            }
            else if ( (LA4_0==VARIABLEURI) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:125:5: varOrIriRef
                    {
                    pushFollow(FOLLOW_varOrIriRef_in_subject231);
                    varOrIriRef1=varOrIriRef();

                    state._fsp--;

                    value = varOrIriRef1;

                    }
                    break;
                case 2 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:126:5: VARIABLEURI
                    {
                    VARIABLEURI2=(Token)match(input,VARIABLEURI,FOLLOW_VARIABLEURI_in_subject239); 

                          String v = (VARIABLEURI2!=null?VARIABLEURI2.getText():null);
                          v = v.substring(2, v.length()-1); 
                          value = new TripleElement(TripleElement.Type.IRIVARIABLE, v); 
                          variables.add(v);
                        

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "subject"


    // $ANTLR start "verb"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:135:1: verb returns [TripleElement value] : ( iriRef | 'a' );
    public final TripleElement verb() throws RecognitionException {
        TripleElement value = null;

        String iriRef3 = null;


        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:136:3: ( iriRef | 'a' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=IRI_REF && LA5_0<=PNAME_LN)) ) {
                alt5=1;
            }
            else if ( (LA5_0==47) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:136:5: iriRef
                    {
                    pushFollow(FOLLOW_iriRef_in_verb264);
                    iriRef3=iriRef();

                    state._fsp--;

                     value = new TripleElement(TripleElement.Type.IRI, iriRef3); 

                    }
                    break;
                case 2 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:137:5: 'a'
                    {
                    match(input,47,FOLLOW_47_in_verb272); 
                     value = new TripleElement(TripleElement.Type.IRI, PrintUtil.expandQname("rdf:type")); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "verb"


    // $ANTLR start "object"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:140:1: object returns [TripleElement value] : ( varOrTerm | VARIABLEURI );
    public final TripleElement object() throws RecognitionException {
        TripleElement value = null;

        Token VARIABLEURI5=null;
        TripleElement varOrTerm4 = null;


        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:141:3: ( varOrTerm | VARIABLEURI )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=VAR1 && LA6_0<=VARIABLETERM)||(LA6_0>=INTEGER && LA6_0<=PNAME_LN)) ) {
                alt6=1;
            }
            else if ( (LA6_0==VARIABLEURI) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:141:5: varOrTerm
                    {
                    pushFollow(FOLLOW_varOrTerm_in_object293);
                    varOrTerm4=varOrTerm();

                    state._fsp--;

                     value = varOrTerm4; 

                    }
                    break;
                case 2 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:142:5: VARIABLEURI
                    {
                    VARIABLEURI5=(Token)match(input,VARIABLEURI,FOLLOW_VARIABLEURI_in_object301); 
                     String v = (VARIABLEURI5!=null?VARIABLEURI5.getText():null);
                          v = v.substring(2, v.length()-1); 
                          value = new TripleElement(TripleElement.Type.IRIVARIABLE, v);
                          variables.add(v);
                        

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "object"


    // $ANTLR start "varOrTerm"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:150:1: varOrTerm returns [TripleElement value] : ( var | graphTerm );
    public final TripleElement varOrTerm() throws RecognitionException {
        TripleElement value = null;

        TripleElement var6 = null;

        TripleElement graphTerm7 = null;


        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:151:3: ( var | graphTerm )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=VAR1 && LA7_0<=VAR2)) ) {
                alt7=1;
            }
            else if ( (LA7_0==VARIABLETERM||(LA7_0>=INTEGER && LA7_0<=PNAME_LN)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:151:5: var
                    {
                    pushFollow(FOLLOW_var_in_varOrTerm326);
                    var6=var();

                    state._fsp--;

                     value = var6; 

                    }
                    break;
                case 2 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:152:5: graphTerm
                    {
                    pushFollow(FOLLOW_graphTerm_in_varOrTerm334);
                    graphTerm7=graphTerm();

                    state._fsp--;

                     value = graphTerm7; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "varOrTerm"


    // $ANTLR start "varOrIriRef"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:155:1: varOrIriRef returns [TripleElement value] : ( var | iriRef );
    public final TripleElement varOrIriRef() throws RecognitionException {
        TripleElement value = null;

        TripleElement var8 = null;

        String iriRef9 = null;


        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:156:3: ( var | iriRef )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=VAR1 && LA8_0<=VAR2)) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=IRI_REF && LA8_0<=PNAME_LN)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:156:5: var
                    {
                    pushFollow(FOLLOW_var_in_varOrIriRef355);
                    var8=var();

                    state._fsp--;

                     value = var8; 

                    }
                    break;
                case 2 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:157:5: iriRef
                    {
                    pushFollow(FOLLOW_iriRef_in_varOrIriRef363);
                    iriRef9=iriRef();

                    state._fsp--;

                     value = new TripleElement(TripleElement.Type.IRI, iriRef9); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "varOrIriRef"


    // $ANTLR start "var"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:160:1: var returns [TripleElement value] : ( VAR1 | VAR2 );
    public final TripleElement var() throws RecognitionException {
        TripleElement value = null;

        Token VAR110=null;
        Token VAR211=null;

        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:161:3: ( VAR1 | VAR2 )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==VAR1) ) {
                alt9=1;
            }
            else if ( (LA9_0==VAR2) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:161:5: VAR1
                    {
                    VAR110=(Token)match(input,VAR1,FOLLOW_VAR1_in_var384); 
                     value = new TripleElement(TripleElement.Type.VARIABLE, (VAR110!=null?VAR110.getText():null).substring(1)); variables.add((VAR110!=null?VAR110.getText():null).substring(1));

                    }
                    break;
                case 2 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:162:5: VAR2
                    {
                    VAR211=(Token)match(input,VAR2,FOLLOW_VAR2_in_var392); 
                     value = new TripleElement(TripleElement.Type.VARIABLE, (VAR211!=null?VAR211.getText():null).substring(1)); variables.add((VAR211!=null?VAR211.getText():null).substring(1));

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "var"


    // $ANTLR start "graphTerm"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:165:1: graphTerm returns [TripleElement value] : ( iriRef | rdfLiteral | numericLiteral | booleanLiteral );
    public final TripleElement graphTerm() throws RecognitionException {
        TripleElement value = null;

        String iriRef12 = null;

        TripleElement rdfLiteral13 = null;

        TripleElement numericLiteral14 = null;

        TripleElement booleanLiteral15 = null;


        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:166:3: ( iriRef | rdfLiteral | numericLiteral | booleanLiteral )
            int alt10=4;
            switch ( input.LA(1) ) {
            case IRI_REF:
            case PNAME_LN:
                {
                alt10=1;
                }
                break;
            case VARIABLETERM:
            case STRING_LITERAL1:
            case STRING_LITERAL_LONG1:
                {
                alt10=2;
                }
                break;
            case INTEGER:
            case DECIMAL:
            case DOUBLE:
            case INTEGER_POSITIVE:
            case DECIMAL_POSITIVE:
            case DOUBLE_POSITIVE:
            case INTEGER_NEGATIVE:
            case DECIMAL_NEGATIVE:
            case DOUBLE_NEGATIVE:
                {
                alt10=3;
                }
                break;
            case TRUE:
            case FALSE:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:166:5: iriRef
                    {
                    pushFollow(FOLLOW_iriRef_in_graphTerm412);
                    iriRef12=iriRef();

                    state._fsp--;

                     value = new TripleElement(TripleElement.Type.IRI, iriRef12); 

                    }
                    break;
                case 2 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:167:5: rdfLiteral
                    {
                    pushFollow(FOLLOW_rdfLiteral_in_graphTerm420);
                    rdfLiteral13=rdfLiteral();

                    state._fsp--;

                     value = rdfLiteral13; 

                    }
                    break;
                case 3 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:168:5: numericLiteral
                    {
                    pushFollow(FOLLOW_numericLiteral_in_graphTerm428);
                    numericLiteral14=numericLiteral();

                    state._fsp--;

                     value = numericLiteral14; 

                    }
                    break;
                case 4 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:169:5: booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_graphTerm436);
                    booleanLiteral15=booleanLiteral();

                    state._fsp--;

                     value = booleanLiteral15; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "graphTerm"


    // $ANTLR start "rdfLiteral"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:172:2: rdfLiteral returns [TripleElement value] : (s= string | VARIABLETERM ) (l= LANGTAG | ( '^^' i= iriRef ) )? ;
    public final TripleElement rdfLiteral() throws RecognitionException {
        TripleElement value = null;

        Token l=null;
        Token VARIABLETERM16=null;
        String s = null;

        String i = null;


        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:173:4: ( (s= string | VARIABLETERM ) (l= LANGTAG | ( '^^' i= iriRef ) )? )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:173:6: (s= string | VARIABLETERM ) (l= LANGTAG | ( '^^' i= iriRef ) )?
            {
             String v=null; TripleElement.Type vType = null; 
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:174:8: (s= string | VARIABLETERM )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=STRING_LITERAL1 && LA11_0<=STRING_LITERAL_LONG1)) ) {
                alt11=1;
            }
            else if ( (LA11_0==VARIABLETERM) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:174:9: s= string
                    {
                    pushFollow(FOLLOW_string_in_rdfLiteral472);
                    s=string();

                    state._fsp--;

                     v = s; vType = TripleElement.Type.STRING; 

                    }
                    break;
                case 2 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:176:8: VARIABLETERM
                    {
                    VARIABLETERM16=(Token)match(input,VARIABLETERM,FOLLOW_VARIABLETERM_in_rdfLiteral492); 
                     v = (VARIABLETERM16!=null?VARIABLETERM16.getText():null); v = v.substring(2, v.length()-1); variables.add(v); vType = TripleElement.Type.STRINGVARIABLE; 

                    }
                    break;

            }

            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:179:6: (l= LANGTAG | ( '^^' i= iriRef ) )?
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==LANGTAG) ) {
                alt12=1;
            }
            else if ( (LA12_0==48) ) {
                alt12=2;
            }
            switch (alt12) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:179:7: l= LANGTAG
                    {
                    l=(Token)match(input,LANGTAG,FOLLOW_LANGTAG_in_rdfLiteral521); 
                     
                             if(vType==TripleElement.Type.STRING)
                               value = new TripleElement(TripleElement.Type.LANGTAGSTRING, v, (l!=null?l.getText():null).substring(1));
                             else
                               value = new TripleElement(TripleElement.Type.LANGTAGVARIABLE, v, (l!=null?l.getText():null).substring(1));
                           

                    }
                    break;
                case 2 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:187:8: ( '^^' i= iriRef )
                    {
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:187:8: ( '^^' i= iriRef )
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:187:9: '^^' i= iriRef
                    {
                    match(input,48,FOLLOW_48_in_rdfLiteral547); 
                    pushFollow(FOLLOW_iriRef_in_rdfLiteral551);
                    i=iriRef();

                    state._fsp--;

                     
                             if(vType==TripleElement.Type.STRING)
                               value = new TripleElement(TripleElement.Type.DATATYPESTRING, v, i);
                             else {
                               value = new TripleElement(TripleElement.Type.DATATYPEVARIABLE, v, i);
                               datatypeHints.put(v, i);
                             }
                           

                    }


                    }
                    break;

            }


                     if(value==null)
                         value = new TripleElement(vType, v);
                   

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "rdfLiteral"


    // $ANTLR start "numericLiteral"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:203:2: numericLiteral returns [TripleElement value] : (v= numericLiteralUnsigned | v= numericLiteralPositive | v= numericLiteralNegative );
    public final TripleElement numericLiteral() throws RecognitionException {
        TripleElement value = null;

        TripleElement v = null;


        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:204:4: (v= numericLiteralUnsigned | v= numericLiteralPositive | v= numericLiteralNegative )
            int alt13=3;
            switch ( input.LA(1) ) {
            case INTEGER:
            case DECIMAL:
            case DOUBLE:
                {
                alt13=1;
                }
                break;
            case INTEGER_POSITIVE:
            case DECIMAL_POSITIVE:
            case DOUBLE_POSITIVE:
                {
                alt13=2;
                }
                break;
            case INTEGER_NEGATIVE:
            case DECIMAL_NEGATIVE:
            case DOUBLE_NEGATIVE:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:204:6: v= numericLiteralUnsigned
                    {
                    pushFollow(FOLLOW_numericLiteralUnsigned_in_numericLiteral606);
                    v=numericLiteralUnsigned();

                    state._fsp--;

                    value =v;

                    }
                    break;
                case 2 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:205:6: v= numericLiteralPositive
                    {
                    pushFollow(FOLLOW_numericLiteralPositive_in_numericLiteral617);
                    v=numericLiteralPositive();

                    state._fsp--;

                    value =v;

                    }
                    break;
                case 3 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:206:6: v= numericLiteralNegative
                    {
                    pushFollow(FOLLOW_numericLiteralNegative_in_numericLiteral628);
                    v=numericLiteralNegative();

                    state._fsp--;

                    value =v;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "numericLiteral"


    // $ANTLR start "numericLiteralUnsigned"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:209:2: numericLiteralUnsigned returns [TripleElement value] : (v= INTEGER | v= DECIMAL | v= DOUBLE );
    public final TripleElement numericLiteralUnsigned() throws RecognitionException {
        TripleElement value = null;

        Token v=null;

        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:210:4: (v= INTEGER | v= DECIMAL | v= DOUBLE )
            int alt14=3;
            switch ( input.LA(1) ) {
            case INTEGER:
                {
                alt14=1;
                }
                break;
            case DECIMAL:
                {
                alt14=2;
                }
                break;
            case DOUBLE:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:210:6: v= INTEGER
                    {
                    v=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_numericLiteralUnsigned655); 
                    value = new TripleElement(TripleElement.Type.INTEGER, (v!=null?v.getText():null)); 

                    }
                    break;
                case 2 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:211:6: v= DECIMAL
                    {
                    v=(Token)match(input,DECIMAL,FOLLOW_DECIMAL_in_numericLiteralUnsigned666); 
                    value = new TripleElement(TripleElement.Type.DECIMAL, (v!=null?v.getText():null)); 

                    }
                    break;
                case 3 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:212:6: v= DOUBLE
                    {
                    v=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_numericLiteralUnsigned677); 
                    value = new TripleElement(TripleElement.Type.DOUBLE, (v!=null?v.getText():null)); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "numericLiteralUnsigned"


    // $ANTLR start "numericLiteralPositive"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:215:2: numericLiteralPositive returns [TripleElement value] : (v= INTEGER_POSITIVE | v= DECIMAL_POSITIVE | v= DOUBLE_POSITIVE );
    public final TripleElement numericLiteralPositive() throws RecognitionException {
        TripleElement value = null;

        Token v=null;

        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:216:4: (v= INTEGER_POSITIVE | v= DECIMAL_POSITIVE | v= DOUBLE_POSITIVE )
            int alt15=3;
            switch ( input.LA(1) ) {
            case INTEGER_POSITIVE:
                {
                alt15=1;
                }
                break;
            case DECIMAL_POSITIVE:
                {
                alt15=2;
                }
                break;
            case DOUBLE_POSITIVE:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:216:6: v= INTEGER_POSITIVE
                    {
                    v=(Token)match(input,INTEGER_POSITIVE,FOLLOW_INTEGER_POSITIVE_in_numericLiteralPositive704); 
                    value = new TripleElement(TripleElement.Type.INTEGER, (v!=null?v.getText():null)); 

                    }
                    break;
                case 2 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:217:6: v= DECIMAL_POSITIVE
                    {
                    v=(Token)match(input,DECIMAL_POSITIVE,FOLLOW_DECIMAL_POSITIVE_in_numericLiteralPositive715); 
                    value = new TripleElement(TripleElement.Type.DECIMAL, (v!=null?v.getText():null)); 

                    }
                    break;
                case 3 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:218:6: v= DOUBLE_POSITIVE
                    {
                    v=(Token)match(input,DOUBLE_POSITIVE,FOLLOW_DOUBLE_POSITIVE_in_numericLiteralPositive726); 
                    value = new TripleElement(TripleElement.Type.DOUBLE, (v!=null?v.getText():null)); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "numericLiteralPositive"


    // $ANTLR start "numericLiteralNegative"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:221:2: numericLiteralNegative returns [TripleElement value] : (v= INTEGER_NEGATIVE | v= DECIMAL_NEGATIVE | v= DOUBLE_NEGATIVE );
    public final TripleElement numericLiteralNegative() throws RecognitionException {
        TripleElement value = null;

        Token v=null;

        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:222:4: (v= INTEGER_NEGATIVE | v= DECIMAL_NEGATIVE | v= DOUBLE_NEGATIVE )
            int alt16=3;
            switch ( input.LA(1) ) {
            case INTEGER_NEGATIVE:
                {
                alt16=1;
                }
                break;
            case DECIMAL_NEGATIVE:
                {
                alt16=2;
                }
                break;
            case DOUBLE_NEGATIVE:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:222:6: v= INTEGER_NEGATIVE
                    {
                    v=(Token)match(input,INTEGER_NEGATIVE,FOLLOW_INTEGER_NEGATIVE_in_numericLiteralNegative753); 
                    value = new TripleElement(TripleElement.Type.INTEGER, (v!=null?v.getText():null)); 

                    }
                    break;
                case 2 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:223:6: v= DECIMAL_NEGATIVE
                    {
                    v=(Token)match(input,DECIMAL_NEGATIVE,FOLLOW_DECIMAL_NEGATIVE_in_numericLiteralNegative764); 
                    value = new TripleElement(TripleElement.Type.DECIMAL, (v!=null?v.getText():null)); 

                    }
                    break;
                case 3 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:224:6: v= DOUBLE_NEGATIVE
                    {
                    v=(Token)match(input,DOUBLE_NEGATIVE,FOLLOW_DOUBLE_NEGATIVE_in_numericLiteralNegative775); 
                    value = new TripleElement(TripleElement.Type.DOUBLE, (v!=null?v.getText():null)); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "numericLiteralNegative"


    // $ANTLR start "booleanLiteral"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:227:2: booleanLiteral returns [TripleElement value] : ( TRUE | FALSE );
    public final TripleElement booleanLiteral() throws RecognitionException {
        TripleElement value = null;

        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:228:4: ( TRUE | FALSE )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==TRUE) ) {
                alt17=1;
            }
            else if ( (LA17_0==FALSE) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:228:6: TRUE
                    {
                    match(input,TRUE,FOLLOW_TRUE_in_booleanLiteral800); 
                    value = new TripleElement(TripleElement.Type.BOOLEAN, "true"); 

                    }
                    break;
                case 2 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:229:6: FALSE
                    {
                    match(input,FALSE,FOLLOW_FALSE_in_booleanLiteral809); 
                    value = new TripleElement(TripleElement.Type.BOOLEAN, "false"); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "booleanLiteral"


    // $ANTLR start "string"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:232:2: string returns [String value] : (s= STRING_LITERAL1 | s= STRING_LITERAL_LONG1 );
    public final String string() throws RecognitionException {
        String value = null;

        Token s=null;

        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:233:4: (s= STRING_LITERAL1 | s= STRING_LITERAL_LONG1 )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==STRING_LITERAL1) ) {
                alt18=1;
            }
            else if ( (LA18_0==STRING_LITERAL_LONG1) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:233:6: s= STRING_LITERAL1
                    {
                    s=(Token)match(input,STRING_LITERAL1,FOLLOW_STRING_LITERAL1_in_string836); 
                     String temp = (s!=null?s.getText():null); value = temp.substring(1, temp.length() - 1); 

                    }
                    break;
                case 2 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:234:6: s= STRING_LITERAL_LONG1
                    {
                    s=(Token)match(input,STRING_LITERAL_LONG1,FOLLOW_STRING_LITERAL_LONG1_in_string847); 
                     String temp = (s!=null?s.getText():null); value = temp.substring(3, temp.length() - 3); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "string"


    // $ANTLR start "iriRef"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:237:2: iriRef returns [String value] : ( IRI_REF | prefixedName );
    public final String iriRef() throws RecognitionException {
        String value = null;

        Token IRI_REF17=null;
        TargetPatternParser.prefixedName_return prefixedName18 = null;


        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:238:4: ( IRI_REF | prefixedName )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==IRI_REF) ) {
                alt19=1;
            }
            else if ( (LA19_0==PNAME_LN) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:238:6: IRI_REF
                    {
                    IRI_REF17=(Token)match(input,IRI_REF,FOLLOW_IRI_REF_in_iriRef870); 
                     
                           String iri = (IRI_REF17!=null?IRI_REF17.getText():null);
                           value = iri.substring(1, iri.length()-1);
                         

                    }
                    break;
                case 2 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:243:6: prefixedName
                    {
                    pushFollow(FOLLOW_prefixedName_in_iriRef885);
                    prefixedName18=prefixedName();

                    state._fsp--;

                     
                         String qName = (prefixedName18!=null?input.toString(prefixedName18.start,prefixedName18.stop):null);
                         String iri = PrintUtil.expandQname(qName);
                         if(qName.equals(iri))
                         {
                           String[] prefixAndName = (qName.split(":"));
                           iri = prefixMapper.resolvePrefix(prefixAndName[0]);
                           if(iri==null)
                            throw new IllegalArgumentException("Uknown namespace prefix: " + prefixAndName[0]);
                           else {
                             if(prefixAndName.length < 2)
                               value = iri;
                             else
                               value = iri + prefixAndName[1];
                           }  
                         }
                         else {
                           value = iri;
                         }
                       

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "iriRef"

    public static class prefixedName_return extends ParserRuleReturnScope {
        public String value;
    };

    // $ANTLR start "prefixedName"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:266:2: prefixedName returns [String value] : PNAME_LN ;
    public final TargetPatternParser.prefixedName_return prefixedName() throws RecognitionException {
        TargetPatternParser.prefixedName_return retval = new TargetPatternParser.prefixedName_return();
        retval.start = input.LT(1);

        Token PNAME_LN19=null;

        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:267:4: ( PNAME_LN )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:267:6: PNAME_LN
            {
            PNAME_LN19=(Token)match(input,PNAME_LN,FOLLOW_PNAME_LN_in_prefixedName913); 
             retval.value = (PNAME_LN19!=null?PNAME_LN19.getText():null); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "prefixedName"

    // Delegated rules


 

    public static final BitSet FOLLOW_tripleOrPath_in_targetPattern64 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_targetPattern81 = new BitSet(new long[]{0x0000400000C00070L});
    public static final BitSet FOLLOW_tripleOrPath_in_targetPattern85 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_EOF_in_targetPattern114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subject_in_tripleOrPath153 = new BitSet(new long[]{0x0000800000C00060L});
    public static final BitSet FOLLOW_verb_in_tripleOrPath157 = new BitSet(new long[]{0x0000800000FFFEF0L});
    public static final BitSet FOLLOW_subject_in_tripleOrPath170 = new BitSet(new long[]{0x0000800000C00060L});
    public static final BitSet FOLLOW_verb_in_tripleOrPath174 = new BitSet(new long[]{0x0000800000FFFEF0L});
    public static final BitSet FOLLOW_object_in_tripleOrPath195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrIriRef_in_subject231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLEURI_in_subject239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRef_in_verb264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_verb272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrTerm_in_object293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLEURI_in_object301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_varOrTerm326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphTerm_in_varOrTerm334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_varOrIriRef355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRef_in_varOrIriRef363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR1_in_var384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR2_in_var392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRef_in_graphTerm412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rdfLiteral_in_graphTerm420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_graphTerm428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_graphTerm436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_rdfLiteral472 = new BitSet(new long[]{0x0001000000000102L});
    public static final BitSet FOLLOW_VARIABLETERM_in_rdfLiteral492 = new BitSet(new long[]{0x0001000000000102L});
    public static final BitSet FOLLOW_LANGTAG_in_rdfLiteral521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rdfLiteral547 = new BitSet(new long[]{0x0000000000C00060L});
    public static final BitSet FOLLOW_iriRef_in_rdfLiteral551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralUnsigned_in_numericLiteral606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralPositive_in_numericLiteral617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralNegative_in_numericLiteral628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_numericLiteralUnsigned655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECIMAL_in_numericLiteralUnsigned666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_numericLiteralUnsigned677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_POSITIVE_in_numericLiteralPositive704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECIMAL_POSITIVE_in_numericLiteralPositive715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_POSITIVE_in_numericLiteralPositive726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_NEGATIVE_in_numericLiteralNegative753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECIMAL_NEGATIVE_in_numericLiteralNegative764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_NEGATIVE_in_numericLiteralNegative775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_booleanLiteral800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_booleanLiteral809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL1_in_string836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_LONG1_in_string847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IRI_REF_in_iriRef870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prefixedName_in_iriRef885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PNAME_LN_in_prefixedName913 = new BitSet(new long[]{0x0000000000000002L});

}