// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g 2010-06-06 01:46:35

  package de.fuberlin.wiwiss.r2r.parser;
  
  import java.util.Set;
  import java.util.HashSet;
  import java.util.Map;
  import java.util.HashMap;
  import de.fuberlin.wiwiss.r2r.PrefixMapper;
  import com.hp.hpl.jena.util.PrintUtil;
  import de.fuberlin.wiwiss.r2r.parser.ParseException;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class SourcePatternParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "OPTIONAL", "GRAPH", "UNION", "FILTER", "NIL", "VAR1", "VAR2", "STR", "LANG", "LANGMATCHES", "DATATYPE", "BOUND", "SAMETERM", "ISIRI", "ISURI", "ISBLANK", "ISLITERAL", "REGEX", "LANGTAG", "INTEGER", "DECIMAL", "DOUBLE", "INTEGER_POSITIVE", "DECIMAL_POSITIVE", "DOUBLE_POSITIVE", "INTEGER_NEGATIVE", "DECIMAL_NEGATIVE", "DOUBLE_NEGATIVE", "TRUE", "FALSE", "STRING_LITERAL1", "STRING_LITERAL2", "STRING_LITERAL_LONG1", "STRING_LITERAL_LONG2", "IRI_REF", "PNAME_LN", "BLANK_NODE_LABEL", "ANON", "G", "R", "A", "P", "H", "S", "T", "I", "U", "O", "N", "L", "M", "C", "E", "B", "K", "D", "F", "Y", "X", "J", "Q", "V", "W", "Z", "PN_PREFIX", "PNAME_NS", "PN_LOCAL", "VARNAME", "EXPONENT", "ECHAR", "WS", "PN_CHARS_U", "PN_CHARS_BASE", "PN_CHARS", "HEX", "COMMENT", "'.'", "'{'", "'}'", "'('", "','", "')'", "';'", "'a'", "'['", "']'", "'||'", "'&&'", "'='", "'!='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'!'", "'^^'"
    };
    public static final int EXPONENT=72;
    public static final int GRAPH=5;
    public static final int REGEX=21;
    public static final int PNAME_LN=39;
    public static final int EOF=-1;
    public static final int VARNAME=71;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int ISLITERAL=20;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int LANGMATCHES=13;
    public static final int DOUBLE=25;
    public static final int PN_CHARS_U=75;
    public static final int COMMENT=79;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int DOUBLE_POSITIVE=28;
    public static final int BOUND=15;
    public static final int T__97=97;
    public static final int ISIRI=17;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int D=59;
    public static final int E=56;
    public static final int F=60;
    public static final int G=42;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int A=44;
    public static final int T__82=82;
    public static final int B=57;
    public static final int T__83=83;
    public static final int C=55;
    public static final int L=53;
    public static final int M=54;
    public static final int N=52;
    public static final int O=51;
    public static final int H=46;
    public static final int I=49;
    public static final int J=63;
    public static final int BLANK_NODE_LABEL=40;
    public static final int K=58;
    public static final int U=50;
    public static final int T=48;
    public static final int W=66;
    public static final int V=65;
    public static final int Q=64;
    public static final int P=45;
    public static final int S=47;
    public static final int R=43;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int Y=61;
    public static final int ISBLANK=19;
    public static final int T__88=88;
    public static final int X=62;
    public static final int Z=67;
    public static final int WS=74;
    public static final int NIL=8;
    public static final int INTEGER_POSITIVE=26;
    public static final int STRING_LITERAL2=35;
    public static final int FILTER=7;
    public static final int STRING_LITERAL1=34;
    public static final int PN_CHARS=77;
    public static final int DATATYPE=14;
    public static final int DOUBLE_NEGATIVE=31;
    public static final int FALSE=33;
    public static final int LANG=12;
    public static final int IRI_REF=38;
    public static final int ISURI=18;
    public static final int STR=11;
    public static final int SAMETERM=16;
    public static final int HEX=78;
    public static final int T__103=103;
    public static final int DECIMAL_POSITIVE=27;
    public static final int INTEGER=23;
    public static final int INTEGER_NEGATIVE=29;
    public static final int PN_LOCAL=70;
    public static final int PNAME_NS=69;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int TRUE=32;
    public static final int UNION=6;
    public static final int ECHAR=73;
    public static final int OPTIONAL=4;
    public static final int ANON=41;
    public static final int PN_CHARS_BASE=76;
    public static final int STRING_LITERAL_LONG2=37;
    public static final int DECIMAL=24;
    public static final int VAR1=9;
    public static final int VAR2=10;
    public static final int STRING_LITERAL_LONG1=36;
    public static final int DECIMAL_NEGATIVE=30;
    public static final int PN_PREFIX=68;
    public static final int LANGTAG=22;

    // delegates
    // delegators


        public SourcePatternParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public SourcePatternParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return SourcePatternParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g"; }


      Set<String> variables = new HashSet<String>();
      int inOptional = 0;
      Set<String> prefixes = new HashSet<String>();
      Set<String> propertyDependencies = new HashSet<String>();
      Set<String> classDependencies = new HashSet<String>();
      
      PrefixMapper prefixMapper;
      
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


    public static class sourcePattern_return extends ParserRuleReturnScope {
        public Set<String> usedPrefixes;
        public Set<String> classes;
        public Set<String> properties;
        public int maxVarLength;
        public Set<String> vars;
    };

    // $ANTLR start "sourcePattern"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:67:1: sourcePattern returns [Set<String> usedPrefixes, Set<String> classes, Set<String> properties, int maxVarLength, Set<String> vars] : ( triplesBlock )? ( ( graphPatternNotTriples | filter ) ( '.' )? ( triplesBlock )? )* EOF ;
    public final SourcePatternParser.sourcePattern_return sourcePattern() throws RecognitionException {
        SourcePatternParser.sourcePattern_return retval = new SourcePatternParser.sourcePattern_return();
        retval.start = input.LT(1);

        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:68:3: ( ( triplesBlock )? ( ( graphPatternNotTriples | filter ) ( '.' )? ( triplesBlock )? )* EOF )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:68:5: ( triplesBlock )? ( ( graphPatternNotTriples | filter ) ( '.' )? ( triplesBlock )? )* EOF
            {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:68:5: ( triplesBlock )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=NIL && LA1_0<=VAR2)||(LA1_0>=INTEGER && LA1_0<=ANON)||LA1_0==83||LA1_0==88) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:68:5: triplesBlock
                    {
                    pushFollow(FOLLOW_triplesBlock_in_sourcePattern60);
                    triplesBlock();

                    state._fsp--;


                    }
                    break;

            }

            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:68:19: ( ( graphPatternNotTriples | filter ) ( '.' )? ( triplesBlock )? )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=OPTIONAL && LA5_0<=GRAPH)||LA5_0==FILTER||LA5_0==81) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:68:20: ( graphPatternNotTriples | filter ) ( '.' )? ( triplesBlock )?
            	    {
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:68:20: ( graphPatternNotTriples | filter )
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( ((LA2_0>=OPTIONAL && LA2_0<=GRAPH)||LA2_0==81) ) {
            	        alt2=1;
            	    }
            	    else if ( (LA2_0==FILTER) ) {
            	        alt2=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 2, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:68:21: graphPatternNotTriples
            	            {
            	            pushFollow(FOLLOW_graphPatternNotTriples_in_sourcePattern65);
            	            graphPatternNotTriples();

            	            state._fsp--;


            	            }
            	            break;
            	        case 2 :
            	            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:68:46: filter
            	            {
            	            pushFollow(FOLLOW_filter_in_sourcePattern69);
            	            filter();

            	            state._fsp--;


            	            }
            	            break;

            	    }

            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:68:54: ( '.' )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==80) ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:68:54: '.'
            	            {
            	            match(input,80,FOLLOW_80_in_sourcePattern72); 

            	            }
            	            break;

            	    }

            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:68:59: ( triplesBlock )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( ((LA4_0>=NIL && LA4_0<=VAR2)||(LA4_0>=INTEGER && LA4_0<=ANON)||LA4_0==83||LA4_0==88) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:68:59: triplesBlock
            	            {
            	            pushFollow(FOLLOW_triplesBlock_in_sourcePattern75);
            	            triplesBlock();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match(input,EOF,FOLLOW_EOF_in_sourcePattern81); 
             
                  retval.usedPrefixes = prefixes;
                  retval.classes = classDependencies;
                  retval.properties = propertyDependencies;
                  retval.maxVarLength = 0;
                  for(String var: variables)
                    if(var.length()>retval.maxVarLength)
                      retval.maxVarLength = var.length();
                  if(!variables.contains("SUBJ"))
                    throw new ParseException("No SUBJ variable present in source pattern!");
                  retval.vars = variables;
                

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
    // $ANTLR end "sourcePattern"


    // $ANTLR start "wherePattern"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:83:1: wherePattern : '{' ( triplesBlock )? ( ( graphPatternNotTriples | filter ) ( '.' )? ( triplesBlock )? )* '}' ;
    public final void wherePattern() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:84:3: ( '{' ( triplesBlock )? ( ( graphPatternNotTriples | filter ) ( '.' )? ( triplesBlock )? )* '}' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:84:5: '{' ( triplesBlock )? ( ( graphPatternNotTriples | filter ) ( '.' )? ( triplesBlock )? )* '}'
            {
            match(input,81,FOLLOW_81_in_wherePattern100); 
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:84:9: ( triplesBlock )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=NIL && LA6_0<=VAR2)||(LA6_0>=INTEGER && LA6_0<=ANON)||LA6_0==83||LA6_0==88) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:84:9: triplesBlock
                    {
                    pushFollow(FOLLOW_triplesBlock_in_wherePattern102);
                    triplesBlock();

                    state._fsp--;


                    }
                    break;

            }

            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:84:23: ( ( graphPatternNotTriples | filter ) ( '.' )? ( triplesBlock )? )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=OPTIONAL && LA10_0<=GRAPH)||LA10_0==FILTER||LA10_0==81) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:84:24: ( graphPatternNotTriples | filter ) ( '.' )? ( triplesBlock )?
            	    {
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:84:24: ( graphPatternNotTriples | filter )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( ((LA7_0>=OPTIONAL && LA7_0<=GRAPH)||LA7_0==81) ) {
            	        alt7=1;
            	    }
            	    else if ( (LA7_0==FILTER) ) {
            	        alt7=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:84:25: graphPatternNotTriples
            	            {
            	            pushFollow(FOLLOW_graphPatternNotTriples_in_wherePattern107);
            	            graphPatternNotTriples();

            	            state._fsp--;


            	            }
            	            break;
            	        case 2 :
            	            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:84:50: filter
            	            {
            	            pushFollow(FOLLOW_filter_in_wherePattern111);
            	            filter();

            	            state._fsp--;


            	            }
            	            break;

            	    }

            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:84:58: ( '.' )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==80) ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:84:58: '.'
            	            {
            	            match(input,80,FOLLOW_80_in_wherePattern114); 

            	            }
            	            break;

            	    }

            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:84:63: ( triplesBlock )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( ((LA9_0>=NIL && LA9_0<=VAR2)||(LA9_0>=INTEGER && LA9_0<=ANON)||LA9_0==83||LA9_0==88) ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:84:63: triplesBlock
            	            {
            	            pushFollow(FOLLOW_triplesBlock_in_wherePattern117);
            	            triplesBlock();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match(input,82,FOLLOW_82_in_wherePattern123); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "wherePattern"


    // $ANTLR start "groupGraphPattern"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:87:1: groupGraphPattern : '{' ( triplesBlock )? ( ( graphPatternNotTriples | filter ) ( '.' )? ( triplesBlock )? )* '}' ;
    public final void groupGraphPattern() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:88:3: ( '{' ( triplesBlock )? ( ( graphPatternNotTriples | filter ) ( '.' )? ( triplesBlock )? )* '}' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:88:5: '{' ( triplesBlock )? ( ( graphPatternNotTriples | filter ) ( '.' )? ( triplesBlock )? )* '}'
            {
            match(input,81,FOLLOW_81_in_groupGraphPattern136); 
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:88:9: ( triplesBlock )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=NIL && LA11_0<=VAR2)||(LA11_0>=INTEGER && LA11_0<=ANON)||LA11_0==83||LA11_0==88) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:88:9: triplesBlock
                    {
                    pushFollow(FOLLOW_triplesBlock_in_groupGraphPattern138);
                    triplesBlock();

                    state._fsp--;


                    }
                    break;

            }

            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:88:23: ( ( graphPatternNotTriples | filter ) ( '.' )? ( triplesBlock )? )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=OPTIONAL && LA15_0<=GRAPH)||LA15_0==FILTER||LA15_0==81) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:88:24: ( graphPatternNotTriples | filter ) ( '.' )? ( triplesBlock )?
            	    {
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:88:24: ( graphPatternNotTriples | filter )
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( ((LA12_0>=OPTIONAL && LA12_0<=GRAPH)||LA12_0==81) ) {
            	        alt12=1;
            	    }
            	    else if ( (LA12_0==FILTER) ) {
            	        alt12=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:88:25: graphPatternNotTriples
            	            {
            	            pushFollow(FOLLOW_graphPatternNotTriples_in_groupGraphPattern143);
            	            graphPatternNotTriples();

            	            state._fsp--;


            	            }
            	            break;
            	        case 2 :
            	            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:88:50: filter
            	            {
            	            pushFollow(FOLLOW_filter_in_groupGraphPattern147);
            	            filter();

            	            state._fsp--;


            	            }
            	            break;

            	    }

            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:88:58: ( '.' )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==80) ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:88:58: '.'
            	            {
            	            match(input,80,FOLLOW_80_in_groupGraphPattern150); 

            	            }
            	            break;

            	    }

            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:88:63: ( triplesBlock )?
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( ((LA14_0>=NIL && LA14_0<=VAR2)||(LA14_0>=INTEGER && LA14_0<=ANON)||LA14_0==83||LA14_0==88) ) {
            	        alt14=1;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:88:63: triplesBlock
            	            {
            	            pushFollow(FOLLOW_triplesBlock_in_groupGraphPattern153);
            	            triplesBlock();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            match(input,82,FOLLOW_82_in_groupGraphPattern159); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "groupGraphPattern"


    // $ANTLR start "triplesBlock"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:91:1: triplesBlock : triplesSameSubject ( '.' ( triplesBlock )? )? ;
    public final void triplesBlock() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:92:3: ( triplesSameSubject ( '.' ( triplesBlock )? )? )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:92:5: triplesSameSubject ( '.' ( triplesBlock )? )?
            {
            pushFollow(FOLLOW_triplesSameSubject_in_triplesBlock174);
            triplesSameSubject();

            state._fsp--;

            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:92:24: ( '.' ( triplesBlock )? )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==80) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:92:26: '.' ( triplesBlock )?
                    {
                    match(input,80,FOLLOW_80_in_triplesBlock178); 
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:92:30: ( triplesBlock )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0>=NIL && LA16_0<=VAR2)||(LA16_0>=INTEGER && LA16_0<=ANON)||LA16_0==83||LA16_0==88) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:92:30: triplesBlock
                            {
                            pushFollow(FOLLOW_triplesBlock_in_triplesBlock180);
                            triplesBlock();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "triplesBlock"


    // $ANTLR start "graphPatternNotTriples"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:95:1: graphPatternNotTriples : ( optionalGraphPattern | groupOrUnionGraphPattern | graphGraphPattern );
    public final void graphPatternNotTriples() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:96:3: ( optionalGraphPattern | groupOrUnionGraphPattern | graphGraphPattern )
            int alt18=3;
            switch ( input.LA(1) ) {
            case OPTIONAL:
                {
                alt18=1;
                }
                break;
            case 81:
                {
                alt18=2;
                }
                break;
            case GRAPH:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:96:5: optionalGraphPattern
                    {
                    pushFollow(FOLLOW_optionalGraphPattern_in_graphPatternNotTriples198);
                    optionalGraphPattern();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:96:28: groupOrUnionGraphPattern
                    {
                    pushFollow(FOLLOW_groupOrUnionGraphPattern_in_graphPatternNotTriples202);
                    groupOrUnionGraphPattern();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:96:55: graphGraphPattern
                    {
                    pushFollow(FOLLOW_graphGraphPattern_in_graphPatternNotTriples206);
                    graphGraphPattern();

                    state._fsp--;


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
        return ;
    }
    // $ANTLR end "graphPatternNotTriples"


    // $ANTLR start "optionalGraphPattern"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:99:1: optionalGraphPattern : OPTIONAL groupGraphPattern ;
    public final void optionalGraphPattern() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:100:3: ( OPTIONAL groupGraphPattern )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:100:5: OPTIONAL groupGraphPattern
            {
             inOptional++; 
            match(input,OPTIONAL,FOLLOW_OPTIONAL_in_optionalGraphPattern222); 
            pushFollow(FOLLOW_groupGraphPattern_in_optionalGraphPattern224);
            groupGraphPattern();

            state._fsp--;

            inOptional--;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "optionalGraphPattern"


    // $ANTLR start "graphGraphPattern"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:103:1: graphGraphPattern : GRAPH varOrIriRef groupGraphPattern ;
    public final void graphGraphPattern() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:104:3: ( GRAPH varOrIriRef groupGraphPattern )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:104:5: GRAPH varOrIriRef groupGraphPattern
            {
            match(input,GRAPH,FOLLOW_GRAPH_in_graphGraphPattern241); 
            pushFollow(FOLLOW_varOrIriRef_in_graphGraphPattern243);
            varOrIriRef();

            state._fsp--;

            pushFollow(FOLLOW_groupGraphPattern_in_graphGraphPattern245);
            groupGraphPattern();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "graphGraphPattern"


    // $ANTLR start "groupOrUnionGraphPattern"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:107:1: groupOrUnionGraphPattern : groupGraphPattern ( UNION groupGraphPattern )* ;
    public final void groupOrUnionGraphPattern() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:108:3: ( groupGraphPattern ( UNION groupGraphPattern )* )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:108:5: groupGraphPattern ( UNION groupGraphPattern )*
            {
            pushFollow(FOLLOW_groupGraphPattern_in_groupOrUnionGraphPattern260);
            groupGraphPattern();

            state._fsp--;

            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:108:23: ( UNION groupGraphPattern )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==UNION) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:108:25: UNION groupGraphPattern
            	    {
            	    match(input,UNION,FOLLOW_UNION_in_groupOrUnionGraphPattern264); 
            	    pushFollow(FOLLOW_groupGraphPattern_in_groupOrUnionGraphPattern266);
            	    groupGraphPattern();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "groupOrUnionGraphPattern"


    // $ANTLR start "filter"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:111:1: filter : FILTER constraint ;
    public final void filter() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:112:3: ( FILTER constraint )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:112:5: FILTER constraint
            {
            match(input,FILTER,FOLLOW_FILTER_in_filter282); 
            pushFollow(FOLLOW_constraint_in_filter284);
            constraint();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "filter"


    // $ANTLR start "constraint"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:115:1: constraint : ( brackettedExpression | builtInCall | functionCall );
    public final void constraint() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:116:3: ( brackettedExpression | builtInCall | functionCall )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt20=1;
                }
                break;
            case STR:
            case LANG:
            case LANGMATCHES:
            case DATATYPE:
            case BOUND:
            case SAMETERM:
            case ISIRI:
            case ISURI:
            case ISBLANK:
            case ISLITERAL:
            case REGEX:
                {
                alt20=2;
                }
                break;
            case IRI_REF:
            case PNAME_LN:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:116:5: brackettedExpression
                    {
                    pushFollow(FOLLOW_brackettedExpression_in_constraint299);
                    brackettedExpression();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:116:28: builtInCall
                    {
                    pushFollow(FOLLOW_builtInCall_in_constraint303);
                    builtInCall();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:116:42: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_constraint307);
                    functionCall();

                    state._fsp--;


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
        return ;
    }
    // $ANTLR end "constraint"


    // $ANTLR start "functionCall"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:119:1: functionCall : iriRef argList ;
    public final void functionCall() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:120:3: ( iriRef argList )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:120:5: iriRef argList
            {
            pushFollow(FOLLOW_iriRef_in_functionCall322);
            iriRef();

            state._fsp--;

            pushFollow(FOLLOW_argList_in_functionCall324);
            argList();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "functionCall"


    // $ANTLR start "argList"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:123:1: argList : ( NIL | '(' expression ( ',' expression )* ')' );
    public final void argList() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:124:3: ( NIL | '(' expression ( ',' expression )* ')' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==NIL) ) {
                alt22=1;
            }
            else if ( (LA22_0==83) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:124:5: NIL
                    {
                    match(input,NIL,FOLLOW_NIL_in_argList337); 

                    }
                    break;
                case 2 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:124:11: '(' expression ( ',' expression )* ')'
                    {
                    match(input,83,FOLLOW_83_in_argList341); 
                    pushFollow(FOLLOW_expression_in_argList343);
                    expression();

                    state._fsp--;

                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:124:26: ( ',' expression )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==84) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:124:28: ',' expression
                    	    {
                    	    match(input,84,FOLLOW_84_in_argList347); 
                    	    pushFollow(FOLLOW_expression_in_argList349);
                    	    expression();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    match(input,85,FOLLOW_85_in_argList354); 

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
        return ;
    }
    // $ANTLR end "argList"


    // $ANTLR start "triplesSameSubject"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:127:1: triplesSameSubject : ( varOrTerm propertyListNotEmpty | triplesNode propertyList );
    public final void triplesSameSubject() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:128:3: ( varOrTerm propertyListNotEmpty | triplesNode propertyList )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=NIL && LA23_0<=VAR2)||(LA23_0>=INTEGER && LA23_0<=ANON)) ) {
                alt23=1;
            }
            else if ( (LA23_0==83||LA23_0==88) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:128:5: varOrTerm propertyListNotEmpty
                    {
                    pushFollow(FOLLOW_varOrTerm_in_triplesSameSubject369);
                    varOrTerm();

                    state._fsp--;

                    pushFollow(FOLLOW_propertyListNotEmpty_in_triplesSameSubject371);
                    propertyListNotEmpty();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:128:38: triplesNode propertyList
                    {
                    pushFollow(FOLLOW_triplesNode_in_triplesSameSubject375);
                    triplesNode();

                    state._fsp--;

                    pushFollow(FOLLOW_propertyList_in_triplesSameSubject377);
                    propertyList();

                    state._fsp--;


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
        return ;
    }
    // $ANTLR end "triplesSameSubject"


    // $ANTLR start "propertyListNotEmpty"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:131:1: propertyListNotEmpty : v= verb oList= objectList ( ';' ( verb objectList )? )* ;
    public final void propertyListNotEmpty() throws RecognitionException {
        String v = null;

        List<String> oList = null;


        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:132:3: (v= verb oList= objectList ( ';' ( verb objectList )? )* )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:132:5: v= verb oList= objectList ( ';' ( verb objectList )? )*
            {
            pushFollow(FOLLOW_verb_in_propertyListNotEmpty394);
            v=verb();

            state._fsp--;

            pushFollow(FOLLOW_objectList_in_propertyListNotEmpty398);
            oList=objectList();

            state._fsp--;


                  if(v!=null && v.equals("http://www.w3.org/1999/02/22-rdf-syntax-ns#type")) {
                    List<String> objects = oList;
                    for(String object: objects) {
                      if(object!=null)
                        classDependencies.add(object);
                    }
                  }
                
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:142:4: ( ';' ( verb objectList )? )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==86) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:142:6: ';' ( verb objectList )?
            	    {
            	    match(input,86,FOLLOW_86_in_propertyListNotEmpty411); 
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:142:10: ( verb objectList )?
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( ((LA24_0>=IRI_REF && LA24_0<=PNAME_LN)||LA24_0==87) ) {
            	        alt24=1;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:142:11: verb objectList
            	            {
            	            pushFollow(FOLLOW_verb_in_propertyListNotEmpty414);
            	            verb();

            	            state._fsp--;

            	            pushFollow(FOLLOW_objectList_in_propertyListNotEmpty416);
            	            objectList();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "propertyListNotEmpty"


    // $ANTLR start "propertyList"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:145:1: propertyList : ( propertyListNotEmpty )? ;
    public final void propertyList() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:146:3: ( ( propertyListNotEmpty )? )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:146:5: ( propertyListNotEmpty )?
            {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:146:5: ( propertyListNotEmpty )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=IRI_REF && LA26_0<=PNAME_LN)||LA26_0==87) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:146:5: propertyListNotEmpty
                    {
                    pushFollow(FOLLOW_propertyListNotEmpty_in_propertyList435);
                    propertyListNotEmpty();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "propertyList"


    // $ANTLR start "objectList"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:149:1: objectList returns [List<String> values] : o= object ( ',' o= object )* ;
    public final List<String> objectList() throws RecognitionException {
        List<String> values = null;

        String o = null;


        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:150:3: (o= object ( ',' o= object )* )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:150:5: o= object ( ',' o= object )*
            {
            pushFollow(FOLLOW_object_in_objectList457);
            o=object();

            state._fsp--;

             values = new ArrayList<String>(); values.add(o);
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:151:5: ( ',' o= object )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==84) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:151:7: ',' o= object
            	    {
            	    match(input,84,FOLLOW_84_in_objectList467); 
            	    pushFollow(FOLLOW_object_in_objectList471);
            	    o=object();

            	    state._fsp--;

            	     values.add(o);

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return values;
    }
    // $ANTLR end "objectList"


    // $ANTLR start "object"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:155:1: object returns [String value] : graphNode ;
    public final String object() throws RecognitionException {
        String value = null;

        String graphNode1 = null;


        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:156:3: ( graphNode )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:156:5: graphNode
            {
            pushFollow(FOLLOW_graphNode_in_object499);
            graphNode1=graphNode();

            state._fsp--;

            value = graphNode1;

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


    // $ANTLR start "verb"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:159:1: verb returns [String value] : ( iriRef | 'a' );
    public final String verb() throws RecognitionException {
        String value = null;

        String iriRef2 = null;


        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:160:3: ( iriRef | 'a' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=IRI_REF && LA28_0<=PNAME_LN)) ) {
                alt28=1;
            }
            else if ( (LA28_0==87) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:160:5: iriRef
                    {
                    pushFollow(FOLLOW_iriRef_in_verb520);
                    iriRef2=iriRef();

                    state._fsp--;


                          value = null;
                          if(iriRef2!=null && inOptional==0) {
                            propertyDependencies.add(iriRef2);
                            value = iriRef2;
                          }
                        

                    }
                    break;
                case 2 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:168:5: 'a'
                    {
                    match(input,87,FOLLOW_87_in_verb533); 

                          if(inOptional==0)
                            propertyDependencies.add("http://www.w3.org/1999/02/22-rdf-syntax-ns#type");
                        

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


    // $ANTLR start "triplesNode"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:175:1: triplesNode : ( collection | blankNodePropertyList );
    public final void triplesNode() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:176:3: ( collection | blankNodePropertyList )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==83) ) {
                alt29=1;
            }
            else if ( (LA29_0==88) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:176:5: collection
                    {
                    pushFollow(FOLLOW_collection_in_triplesNode554);
                    collection();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:176:18: blankNodePropertyList
                    {
                    pushFollow(FOLLOW_blankNodePropertyList_in_triplesNode558);
                    blankNodePropertyList();

                    state._fsp--;


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
        return ;
    }
    // $ANTLR end "triplesNode"


    // $ANTLR start "blankNodePropertyList"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:179:1: blankNodePropertyList : '[' propertyListNotEmpty ']' ;
    public final void blankNodePropertyList() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:180:3: ( '[' propertyListNotEmpty ']' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:180:5: '[' propertyListNotEmpty ']'
            {
            match(input,88,FOLLOW_88_in_blankNodePropertyList571); 
            pushFollow(FOLLOW_propertyListNotEmpty_in_blankNodePropertyList573);
            propertyListNotEmpty();

            state._fsp--;

            match(input,89,FOLLOW_89_in_blankNodePropertyList575); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "blankNodePropertyList"


    // $ANTLR start "collection"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:183:1: collection : '(' ( graphNode )+ ')' ;
    public final void collection() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:184:3: ( '(' ( graphNode )+ ')' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:184:5: '(' ( graphNode )+ ')'
            {
            match(input,83,FOLLOW_83_in_collection590); 
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:184:9: ( graphNode )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=NIL && LA30_0<=VAR2)||(LA30_0>=INTEGER && LA30_0<=ANON)||LA30_0==83||LA30_0==88) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:184:9: graphNode
            	    {
            	    pushFollow(FOLLOW_graphNode_in_collection592);
            	    graphNode();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);

            match(input,85,FOLLOW_85_in_collection595); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "collection"


    // $ANTLR start "graphNode"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:187:1: graphNode returns [String value] : ( varOrTerm | triplesNode );
    public final String graphNode() throws RecognitionException {
        String value = null;

        String varOrTerm3 = null;


        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:188:3: ( varOrTerm | triplesNode )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=NIL && LA31_0<=VAR2)||(LA31_0>=INTEGER && LA31_0<=ANON)) ) {
                alt31=1;
            }
            else if ( (LA31_0==83||LA31_0==88) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:188:5: varOrTerm
                    {
                    pushFollow(FOLLOW_varOrTerm_in_graphNode614);
                    varOrTerm3=varOrTerm();

                    state._fsp--;

                     value = varOrTerm3;

                    }
                    break;
                case 2 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:189:5: triplesNode
                    {
                    pushFollow(FOLLOW_triplesNode_in_graphNode622);
                    triplesNode();

                    state._fsp--;

                     value = null; 

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
    // $ANTLR end "graphNode"


    // $ANTLR start "varOrTerm"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:192:1: varOrTerm returns [String value] : ( var | graphTerm );
    public final String varOrTerm() throws RecognitionException {
        String value = null;

        String graphTerm4 = null;


        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:193:3: ( var | graphTerm )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=VAR1 && LA32_0<=VAR2)) ) {
                alt32=1;
            }
            else if ( (LA32_0==NIL||(LA32_0>=INTEGER && LA32_0<=ANON)) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:193:5: var
                    {
                    pushFollow(FOLLOW_var_in_varOrTerm643);
                    var();

                    state._fsp--;

                     value = null; 

                    }
                    break;
                case 2 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:194:5: graphTerm
                    {
                    pushFollow(FOLLOW_graphTerm_in_varOrTerm651);
                    graphTerm4=graphTerm();

                    state._fsp--;

                     value = graphTerm4; 

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
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:197:1: varOrIriRef returns [String value] : ( var | iriRef );
    public final String varOrIriRef() throws RecognitionException {
        String value = null;

        String iriRef5 = null;


        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:198:3: ( var | iriRef )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=VAR1 && LA33_0<=VAR2)) ) {
                alt33=1;
            }
            else if ( ((LA33_0>=IRI_REF && LA33_0<=PNAME_LN)) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:198:5: var
                    {
                    pushFollow(FOLLOW_var_in_varOrIriRef672);
                    var();

                    state._fsp--;

                    value = null; 

                    }
                    break;
                case 2 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:199:5: iriRef
                    {
                    pushFollow(FOLLOW_iriRef_in_varOrIriRef683);
                    iriRef5=iriRef();

                    state._fsp--;

                    value = iriRef5; 

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
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:202:1: var : ( VAR1 | VAR2 );
    public final void var() throws RecognitionException {
        Token VAR16=null;
        Token VAR27=null;

        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:203:3: ( VAR1 | VAR2 )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==VAR1) ) {
                alt34=1;
            }
            else if ( (LA34_0==VAR2) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:203:5: VAR1
                    {
                    VAR16=(Token)match(input,VAR1,FOLLOW_VAR1_in_var700); 
                     variables.add((VAR16!=null?VAR16.getText():null).substring(1));

                    }
                    break;
                case 2 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:203:55: VAR2
                    {
                    VAR27=(Token)match(input,VAR2,FOLLOW_VAR2_in_var706); 
                     variables.add((VAR27!=null?VAR27.getText():null).substring(1));

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
        return ;
    }
    // $ANTLR end "var"


    // $ANTLR start "graphTerm"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:206:1: graphTerm returns [String value] : ( iriRef | rdfLiteral | numericLiteral | booleanLiteral | blankNode | NIL );
    public final String graphTerm() throws RecognitionException {
        String value = null;

        String iriRef8 = null;


        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:207:3: ( iriRef | rdfLiteral | numericLiteral | booleanLiteral | blankNode | NIL )
            int alt35=6;
            switch ( input.LA(1) ) {
            case IRI_REF:
            case PNAME_LN:
                {
                alt35=1;
                }
                break;
            case STRING_LITERAL1:
            case STRING_LITERAL2:
            case STRING_LITERAL_LONG1:
            case STRING_LITERAL_LONG2:
                {
                alt35=2;
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
                alt35=3;
                }
                break;
            case TRUE:
            case FALSE:
                {
                alt35=4;
                }
                break;
            case BLANK_NODE_LABEL:
            case ANON:
                {
                alt35=5;
                }
                break;
            case NIL:
                {
                alt35=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:207:5: iriRef
                    {
                     value = null; 
                    pushFollow(FOLLOW_iriRef_in_graphTerm732);
                    iriRef8=iriRef();

                    state._fsp--;

                     value = iriRef8; 

                    }
                    break;
                case 2 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:209:7: rdfLiteral
                    {
                    pushFollow(FOLLOW_rdfLiteral_in_graphTerm742);
                    rdfLiteral();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:209:20: numericLiteral
                    {
                    pushFollow(FOLLOW_numericLiteral_in_graphTerm746);
                    numericLiteral();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:209:37: booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_graphTerm750);
                    booleanLiteral();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:209:54: blankNode
                    {
                    pushFollow(FOLLOW_blankNode_in_graphTerm754);
                    blankNode();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:209:66: NIL
                    {
                    match(input,NIL,FOLLOW_NIL_in_graphTerm758); 

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


    // $ANTLR start "expression"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:212:1: expression : conditionalOrExpression ;
    public final void expression() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:213:3: ( conditionalOrExpression )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:213:5: conditionalOrExpression
            {
            pushFollow(FOLLOW_conditionalOrExpression_in_expression773);
            conditionalOrExpression();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "expression"


    // $ANTLR start "conditionalOrExpression"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:216:1: conditionalOrExpression : conditionalAndExpression ( '||' conditionalAndExpression )* ;
    public final void conditionalOrExpression() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:217:3: ( conditionalAndExpression ( '||' conditionalAndExpression )* )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:217:5: conditionalAndExpression ( '||' conditionalAndExpression )*
            {
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression788);
            conditionalAndExpression();

            state._fsp--;

            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:217:30: ( '||' conditionalAndExpression )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==90) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:217:31: '||' conditionalAndExpression
            	    {
            	    match(input,90,FOLLOW_90_in_conditionalOrExpression791); 
            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression793);
            	    conditionalAndExpression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "conditionalOrExpression"


    // $ANTLR start "conditionalAndExpression"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:220:1: conditionalAndExpression : valueLogical ( '&&' valueLogical )* ;
    public final void conditionalAndExpression() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:221:3: ( valueLogical ( '&&' valueLogical )* )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:221:5: valueLogical ( '&&' valueLogical )*
            {
            pushFollow(FOLLOW_valueLogical_in_conditionalAndExpression810);
            valueLogical();

            state._fsp--;

            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:221:18: ( '&&' valueLogical )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==91) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:221:20: '&&' valueLogical
            	    {
            	    match(input,91,FOLLOW_91_in_conditionalAndExpression814); 
            	    pushFollow(FOLLOW_valueLogical_in_conditionalAndExpression816);
            	    valueLogical();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "conditionalAndExpression"


    // $ANTLR start "valueLogical"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:224:1: valueLogical : relationalExpression ;
    public final void valueLogical() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:225:3: ( relationalExpression )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:225:5: relationalExpression
            {
            pushFollow(FOLLOW_relationalExpression_in_valueLogical834);
            relationalExpression();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "valueLogical"


    // $ANTLR start "relationalExpression"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:228:1: relationalExpression : numericExpression ( '=' numericExpression | '!=' numericExpression | '<' numericExpression | '>' numericExpression | '<=' numericExpression | '>=' numericExpression )? ;
    public final void relationalExpression() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:229:3: ( numericExpression ( '=' numericExpression | '!=' numericExpression | '<' numericExpression | '>' numericExpression | '<=' numericExpression | '>=' numericExpression )? )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:229:5: numericExpression ( '=' numericExpression | '!=' numericExpression | '<' numericExpression | '>' numericExpression | '<=' numericExpression | '>=' numericExpression )?
            {
            pushFollow(FOLLOW_numericExpression_in_relationalExpression849);
            numericExpression();

            state._fsp--;

            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:229:23: ( '=' numericExpression | '!=' numericExpression | '<' numericExpression | '>' numericExpression | '<=' numericExpression | '>=' numericExpression )?
            int alt38=7;
            switch ( input.LA(1) ) {
                case 92:
                    {
                    alt38=1;
                    }
                    break;
                case 93:
                    {
                    alt38=2;
                    }
                    break;
                case 94:
                    {
                    alt38=3;
                    }
                    break;
                case 95:
                    {
                    alt38=4;
                    }
                    break;
                case 96:
                    {
                    alt38=5;
                    }
                    break;
                case 97:
                    {
                    alt38=6;
                    }
                    break;
            }

            switch (alt38) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:230:25: '=' numericExpression
                    {
                    match(input,92,FOLLOW_92_in_relationalExpression877); 
                    pushFollow(FOLLOW_numericExpression_in_relationalExpression879);
                    numericExpression();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:231:25: '!=' numericExpression
                    {
                    match(input,93,FOLLOW_93_in_relationalExpression906); 
                    pushFollow(FOLLOW_numericExpression_in_relationalExpression908);
                    numericExpression();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:232:25: '<' numericExpression
                    {
                    match(input,94,FOLLOW_94_in_relationalExpression935); 
                    pushFollow(FOLLOW_numericExpression_in_relationalExpression937);
                    numericExpression();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:233:25: '>' numericExpression
                    {
                    match(input,95,FOLLOW_95_in_relationalExpression964); 
                    pushFollow(FOLLOW_numericExpression_in_relationalExpression966);
                    numericExpression();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:234:25: '<=' numericExpression
                    {
                    match(input,96,FOLLOW_96_in_relationalExpression993); 
                    pushFollow(FOLLOW_numericExpression_in_relationalExpression995);
                    numericExpression();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:235:25: '>=' numericExpression
                    {
                    match(input,97,FOLLOW_97_in_relationalExpression1021); 
                    pushFollow(FOLLOW_numericExpression_in_relationalExpression1023);
                    numericExpression();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "relationalExpression"


    // $ANTLR start "numericExpression"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:239:2: numericExpression : additiveExpression ;
    public final void numericExpression() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:240:4: ( additiveExpression )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:240:6: additiveExpression
            {
            pushFollow(FOLLOW_additiveExpression_in_numericExpression1065);
            additiveExpression();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "numericExpression"


    // $ANTLR start "additiveExpression"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:243:2: additiveExpression : multiplicativeExpression ( '+' multiplicativeExpression | '-' multiplicativeExpression | numericLiteralPositive | numericLiteralNegative )* ;
    public final void additiveExpression() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:244:4: ( multiplicativeExpression ( '+' multiplicativeExpression | '-' multiplicativeExpression | numericLiteralPositive | numericLiteralNegative )* )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:244:6: multiplicativeExpression ( '+' multiplicativeExpression | '-' multiplicativeExpression | numericLiteralPositive | numericLiteralNegative )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1084);
            multiplicativeExpression();

            state._fsp--;

            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:244:31: ( '+' multiplicativeExpression | '-' multiplicativeExpression | numericLiteralPositive | numericLiteralNegative )*
            loop39:
            do {
                int alt39=5;
                switch ( input.LA(1) ) {
                case 98:
                    {
                    alt39=1;
                    }
                    break;
                case 99:
                    {
                    alt39=2;
                    }
                    break;
                case INTEGER_POSITIVE:
                case DECIMAL_POSITIVE:
                case DOUBLE_POSITIVE:
                    {
                    alt39=3;
                    }
                    break;
                case INTEGER_NEGATIVE:
                case DECIMAL_NEGATIVE:
                case DOUBLE_NEGATIVE:
                    {
                    alt39=4;
                    }
                    break;

                }

                switch (alt39) {
            	case 1 :
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:244:33: '+' multiplicativeExpression
            	    {
            	    match(input,98,FOLLOW_98_in_additiveExpression1088); 
            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1090);
            	    multiplicativeExpression();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:245:33: '-' multiplicativeExpression
            	    {
            	    match(input,99,FOLLOW_99_in_additiveExpression1124); 
            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1126);
            	    multiplicativeExpression();

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:246:33: numericLiteralPositive
            	    {
            	    pushFollow(FOLLOW_numericLiteralPositive_in_additiveExpression1160);
            	    numericLiteralPositive();

            	    state._fsp--;


            	    }
            	    break;
            	case 4 :
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:247:33: numericLiteralNegative
            	    {
            	    pushFollow(FOLLOW_numericLiteralNegative_in_additiveExpression1194);
            	    numericLiteralNegative();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "additiveExpression"


    // $ANTLR start "multiplicativeExpression"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:251:2: multiplicativeExpression : unaryExpression ( '*' unaryExpression | '/' unaryExpression )* ;
    public final void multiplicativeExpression() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:252:4: ( unaryExpression ( '*' unaryExpression | '/' unaryExpression )* )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:252:6: unaryExpression ( '*' unaryExpression | '/' unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1246);
            unaryExpression();

            state._fsp--;

            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:252:22: ( '*' unaryExpression | '/' unaryExpression )*
            loop40:
            do {
                int alt40=3;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==100) ) {
                    alt40=1;
                }
                else if ( (LA40_0==101) ) {
                    alt40=2;
                }


                switch (alt40) {
            	case 1 :
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:252:24: '*' unaryExpression
            	    {
            	    match(input,100,FOLLOW_100_in_multiplicativeExpression1250); 
            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1252);
            	    unaryExpression();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:252:46: '/' unaryExpression
            	    {
            	    match(input,101,FOLLOW_101_in_multiplicativeExpression1256); 
            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1259);
            	    unaryExpression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "multiplicativeExpression"


    // $ANTLR start "unaryExpression"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:255:2: unaryExpression : ( '!' primaryExpression | '+' primaryExpression | '-' primaryExpression | primaryExpression );
    public final void unaryExpression() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:256:4: ( '!' primaryExpression | '+' primaryExpression | '-' primaryExpression | primaryExpression )
            int alt41=4;
            switch ( input.LA(1) ) {
            case 102:
                {
                alt41=1;
                }
                break;
            case 98:
                {
                alt41=2;
                }
                break;
            case 99:
                {
                alt41=3;
                }
                break;
            case VAR1:
            case VAR2:
            case STR:
            case LANG:
            case LANGMATCHES:
            case DATATYPE:
            case BOUND:
            case SAMETERM:
            case ISIRI:
            case ISURI:
            case ISBLANK:
            case ISLITERAL:
            case REGEX:
            case INTEGER:
            case DECIMAL:
            case DOUBLE:
            case INTEGER_POSITIVE:
            case DECIMAL_POSITIVE:
            case DOUBLE_POSITIVE:
            case INTEGER_NEGATIVE:
            case DECIMAL_NEGATIVE:
            case DOUBLE_NEGATIVE:
            case TRUE:
            case FALSE:
            case STRING_LITERAL1:
            case STRING_LITERAL2:
            case STRING_LITERAL_LONG1:
            case STRING_LITERAL_LONG2:
            case IRI_REF:
            case PNAME_LN:
            case 83:
                {
                alt41=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:256:6: '!' primaryExpression
                    {
                    match(input,102,FOLLOW_102_in_unaryExpression1280); 
                    pushFollow(FOLLOW_primaryExpression_in_unaryExpression1282);
                    primaryExpression();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:257:6: '+' primaryExpression
                    {
                    match(input,98,FOLLOW_98_in_unaryExpression1289); 
                    pushFollow(FOLLOW_primaryExpression_in_unaryExpression1291);
                    primaryExpression();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:258:6: '-' primaryExpression
                    {
                    match(input,99,FOLLOW_99_in_unaryExpression1298); 
                    pushFollow(FOLLOW_primaryExpression_in_unaryExpression1300);
                    primaryExpression();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:259:6: primaryExpression
                    {
                    pushFollow(FOLLOW_primaryExpression_in_unaryExpression1307);
                    primaryExpression();

                    state._fsp--;


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
        return ;
    }
    // $ANTLR end "unaryExpression"


    // $ANTLR start "primaryExpression"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:262:2: primaryExpression : ( brackettedExpression | builtInCall | iriRefOrFunction | rdfLiteral | numericLiteral | booleanLiteral | var );
    public final void primaryExpression() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:263:4: ( brackettedExpression | builtInCall | iriRefOrFunction | rdfLiteral | numericLiteral | booleanLiteral | var )
            int alt42=7;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt42=1;
                }
                break;
            case STR:
            case LANG:
            case LANGMATCHES:
            case DATATYPE:
            case BOUND:
            case SAMETERM:
            case ISIRI:
            case ISURI:
            case ISBLANK:
            case ISLITERAL:
            case REGEX:
                {
                alt42=2;
                }
                break;
            case IRI_REF:
            case PNAME_LN:
                {
                alt42=3;
                }
                break;
            case STRING_LITERAL1:
            case STRING_LITERAL2:
            case STRING_LITERAL_LONG1:
            case STRING_LITERAL_LONG2:
                {
                alt42=4;
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
                alt42=5;
                }
                break;
            case TRUE:
            case FALSE:
                {
                alt42=6;
                }
                break;
            case VAR1:
            case VAR2:
                {
                alt42=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:263:6: brackettedExpression
                    {
                    pushFollow(FOLLOW_brackettedExpression_in_primaryExpression1324);
                    brackettedExpression();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:264:6: builtInCall
                    {
                    pushFollow(FOLLOW_builtInCall_in_primaryExpression1331);
                    builtInCall();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:265:6: iriRefOrFunction
                    {
                    pushFollow(FOLLOW_iriRefOrFunction_in_primaryExpression1338);
                    iriRefOrFunction();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:266:6: rdfLiteral
                    {
                    pushFollow(FOLLOW_rdfLiteral_in_primaryExpression1345);
                    rdfLiteral();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:267:6: numericLiteral
                    {
                    pushFollow(FOLLOW_numericLiteral_in_primaryExpression1352);
                    numericLiteral();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:268:6: booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_primaryExpression1359);
                    booleanLiteral();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:269:6: var
                    {
                    pushFollow(FOLLOW_var_in_primaryExpression1366);
                    var();

                    state._fsp--;


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
        return ;
    }
    // $ANTLR end "primaryExpression"


    // $ANTLR start "brackettedExpression"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:272:2: brackettedExpression : '(' expression ')' ;
    public final void brackettedExpression() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:273:4: ( '(' expression ')' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:273:6: '(' expression ')'
            {
            match(input,83,FOLLOW_83_in_brackettedExpression1385); 
            pushFollow(FOLLOW_expression_in_brackettedExpression1387);
            expression();

            state._fsp--;

            match(input,85,FOLLOW_85_in_brackettedExpression1389); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "brackettedExpression"


    // $ANTLR start "builtInCall"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:276:2: builtInCall : ( STR '(' expression ')' | LANG '(' expression ')' | LANGMATCHES '(' expression ',' expression ')' | DATATYPE '(' expression ')' | BOUND '(' var ')' | SAMETERM '(' expression ',' expression ')' | ISIRI '(' expression ')' | ISURI '(' expression ')' | ISBLANK '(' expression ')' | ISLITERAL '(' expression ')' | regexExpression );
    public final void builtInCall() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:277:4: ( STR '(' expression ')' | LANG '(' expression ')' | LANGMATCHES '(' expression ',' expression ')' | DATATYPE '(' expression ')' | BOUND '(' var ')' | SAMETERM '(' expression ',' expression ')' | ISIRI '(' expression ')' | ISURI '(' expression ')' | ISBLANK '(' expression ')' | ISLITERAL '(' expression ')' | regexExpression )
            int alt43=11;
            switch ( input.LA(1) ) {
            case STR:
                {
                alt43=1;
                }
                break;
            case LANG:
                {
                alt43=2;
                }
                break;
            case LANGMATCHES:
                {
                alt43=3;
                }
                break;
            case DATATYPE:
                {
                alt43=4;
                }
                break;
            case BOUND:
                {
                alt43=5;
                }
                break;
            case SAMETERM:
                {
                alt43=6;
                }
                break;
            case ISIRI:
                {
                alt43=7;
                }
                break;
            case ISURI:
                {
                alt43=8;
                }
                break;
            case ISBLANK:
                {
                alt43=9;
                }
                break;
            case ISLITERAL:
                {
                alt43=10;
                }
                break;
            case REGEX:
                {
                alt43=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:277:6: STR '(' expression ')'
                    {
                    match(input,STR,FOLLOW_STR_in_builtInCall1408); 
                    match(input,83,FOLLOW_83_in_builtInCall1410); 
                    pushFollow(FOLLOW_expression_in_builtInCall1412);
                    expression();

                    state._fsp--;

                    match(input,85,FOLLOW_85_in_builtInCall1414); 

                    }
                    break;
                case 2 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:278:6: LANG '(' expression ')'
                    {
                    match(input,LANG,FOLLOW_LANG_in_builtInCall1421); 
                    match(input,83,FOLLOW_83_in_builtInCall1423); 
                    pushFollow(FOLLOW_expression_in_builtInCall1425);
                    expression();

                    state._fsp--;

                    match(input,85,FOLLOW_85_in_builtInCall1427); 

                    }
                    break;
                case 3 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:279:6: LANGMATCHES '(' expression ',' expression ')'
                    {
                    match(input,LANGMATCHES,FOLLOW_LANGMATCHES_in_builtInCall1434); 
                    match(input,83,FOLLOW_83_in_builtInCall1436); 
                    pushFollow(FOLLOW_expression_in_builtInCall1438);
                    expression();

                    state._fsp--;

                    match(input,84,FOLLOW_84_in_builtInCall1440); 
                    pushFollow(FOLLOW_expression_in_builtInCall1442);
                    expression();

                    state._fsp--;

                    match(input,85,FOLLOW_85_in_builtInCall1444); 

                    }
                    break;
                case 4 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:280:6: DATATYPE '(' expression ')'
                    {
                    match(input,DATATYPE,FOLLOW_DATATYPE_in_builtInCall1451); 
                    match(input,83,FOLLOW_83_in_builtInCall1453); 
                    pushFollow(FOLLOW_expression_in_builtInCall1455);
                    expression();

                    state._fsp--;

                    match(input,85,FOLLOW_85_in_builtInCall1457); 

                    }
                    break;
                case 5 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:281:6: BOUND '(' var ')'
                    {
                    match(input,BOUND,FOLLOW_BOUND_in_builtInCall1464); 
                    match(input,83,FOLLOW_83_in_builtInCall1466); 
                    pushFollow(FOLLOW_var_in_builtInCall1468);
                    var();

                    state._fsp--;

                    match(input,85,FOLLOW_85_in_builtInCall1470); 

                    }
                    break;
                case 6 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:282:6: SAMETERM '(' expression ',' expression ')'
                    {
                    match(input,SAMETERM,FOLLOW_SAMETERM_in_builtInCall1477); 
                    match(input,83,FOLLOW_83_in_builtInCall1479); 
                    pushFollow(FOLLOW_expression_in_builtInCall1481);
                    expression();

                    state._fsp--;

                    match(input,84,FOLLOW_84_in_builtInCall1483); 
                    pushFollow(FOLLOW_expression_in_builtInCall1485);
                    expression();

                    state._fsp--;

                    match(input,85,FOLLOW_85_in_builtInCall1487); 

                    }
                    break;
                case 7 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:283:6: ISIRI '(' expression ')'
                    {
                    match(input,ISIRI,FOLLOW_ISIRI_in_builtInCall1494); 
                    match(input,83,FOLLOW_83_in_builtInCall1496); 
                    pushFollow(FOLLOW_expression_in_builtInCall1498);
                    expression();

                    state._fsp--;

                    match(input,85,FOLLOW_85_in_builtInCall1500); 

                    }
                    break;
                case 8 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:284:6: ISURI '(' expression ')'
                    {
                    match(input,ISURI,FOLLOW_ISURI_in_builtInCall1507); 
                    match(input,83,FOLLOW_83_in_builtInCall1509); 
                    pushFollow(FOLLOW_expression_in_builtInCall1511);
                    expression();

                    state._fsp--;

                    match(input,85,FOLLOW_85_in_builtInCall1513); 

                    }
                    break;
                case 9 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:285:6: ISBLANK '(' expression ')'
                    {
                    match(input,ISBLANK,FOLLOW_ISBLANK_in_builtInCall1521); 
                    match(input,83,FOLLOW_83_in_builtInCall1523); 
                    pushFollow(FOLLOW_expression_in_builtInCall1525);
                    expression();

                    state._fsp--;

                    match(input,85,FOLLOW_85_in_builtInCall1527); 

                    }
                    break;
                case 10 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:286:6: ISLITERAL '(' expression ')'
                    {
                    match(input,ISLITERAL,FOLLOW_ISLITERAL_in_builtInCall1534); 
                    match(input,83,FOLLOW_83_in_builtInCall1536); 
                    pushFollow(FOLLOW_expression_in_builtInCall1538);
                    expression();

                    state._fsp--;

                    match(input,85,FOLLOW_85_in_builtInCall1540); 

                    }
                    break;
                case 11 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:287:6: regexExpression
                    {
                    pushFollow(FOLLOW_regexExpression_in_builtInCall1547);
                    regexExpression();

                    state._fsp--;


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
        return ;
    }
    // $ANTLR end "builtInCall"


    // $ANTLR start "regexExpression"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:290:2: regexExpression : REGEX '(' expression ',' expression ( ',' expression )? ')' ;
    public final void regexExpression() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:291:4: ( REGEX '(' expression ',' expression ( ',' expression )? ')' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:291:6: REGEX '(' expression ',' expression ( ',' expression )? ')'
            {
            match(input,REGEX,FOLLOW_REGEX_in_regexExpression1567); 
            match(input,83,FOLLOW_83_in_regexExpression1569); 
            pushFollow(FOLLOW_expression_in_regexExpression1571);
            expression();

            state._fsp--;

            match(input,84,FOLLOW_84_in_regexExpression1573); 
            pushFollow(FOLLOW_expression_in_regexExpression1575);
            expression();

            state._fsp--;

            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:291:42: ( ',' expression )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==84) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:291:43: ',' expression
                    {
                    match(input,84,FOLLOW_84_in_regexExpression1578); 
                    pushFollow(FOLLOW_expression_in_regexExpression1580);
                    expression();

                    state._fsp--;


                    }
                    break;

            }

            match(input,85,FOLLOW_85_in_regexExpression1584); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "regexExpression"


    // $ANTLR start "iriRefOrFunction"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:294:2: iriRefOrFunction : iriRef ( argList )? ;
    public final void iriRefOrFunction() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:295:4: ( iriRef ( argList )? )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:295:6: iriRef ( argList )?
            {
            pushFollow(FOLLOW_iriRef_in_iriRefOrFunction1603);
            iriRef();

            state._fsp--;

            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:295:13: ( argList )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==NIL||LA45_0==83) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:295:13: argList
                    {
                    pushFollow(FOLLOW_argList_in_iriRefOrFunction1605);
                    argList();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "iriRefOrFunction"


    // $ANTLR start "rdfLiteral"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:298:2: rdfLiteral : string ( LANGTAG | ( '^^' iriRef ) )? ;
    public final void rdfLiteral() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:299:4: ( string ( LANGTAG | ( '^^' iriRef ) )? )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:299:6: string ( LANGTAG | ( '^^' iriRef ) )?
            {
            pushFollow(FOLLOW_string_in_rdfLiteral1625);
            string();

            state._fsp--;

            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:299:13: ( LANGTAG | ( '^^' iriRef ) )?
            int alt46=3;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==LANGTAG) ) {
                alt46=1;
            }
            else if ( (LA46_0==103) ) {
                alt46=2;
            }
            switch (alt46) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:299:14: LANGTAG
                    {
                    match(input,LANGTAG,FOLLOW_LANGTAG_in_rdfLiteral1628); 

                    }
                    break;
                case 2 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:299:24: ( '^^' iriRef )
                    {
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:299:24: ( '^^' iriRef )
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:299:25: '^^' iriRef
                    {
                    match(input,103,FOLLOW_103_in_rdfLiteral1633); 
                    pushFollow(FOLLOW_iriRef_in_rdfLiteral1635);
                    iriRef();

                    state._fsp--;


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "rdfLiteral"


    // $ANTLR start "numericLiteral"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:302:2: numericLiteral : ( numericLiteralUnsigned | numericLiteralPositive | numericLiteralNegative );
    public final void numericLiteral() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:303:4: ( numericLiteralUnsigned | numericLiteralPositive | numericLiteralNegative )
            int alt47=3;
            switch ( input.LA(1) ) {
            case INTEGER:
            case DECIMAL:
            case DOUBLE:
                {
                alt47=1;
                }
                break;
            case INTEGER_POSITIVE:
            case DECIMAL_POSITIVE:
            case DOUBLE_POSITIVE:
                {
                alt47=2;
                }
                break;
            case INTEGER_NEGATIVE:
            case DECIMAL_NEGATIVE:
            case DOUBLE_NEGATIVE:
                {
                alt47=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:303:6: numericLiteralUnsigned
                    {
                    pushFollow(FOLLOW_numericLiteralUnsigned_in_numericLiteral1658);
                    numericLiteralUnsigned();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:303:31: numericLiteralPositive
                    {
                    pushFollow(FOLLOW_numericLiteralPositive_in_numericLiteral1662);
                    numericLiteralPositive();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:303:56: numericLiteralNegative
                    {
                    pushFollow(FOLLOW_numericLiteralNegative_in_numericLiteral1666);
                    numericLiteralNegative();

                    state._fsp--;


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
        return ;
    }
    // $ANTLR end "numericLiteral"


    // $ANTLR start "numericLiteralUnsigned"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:306:2: numericLiteralUnsigned : ( INTEGER | DECIMAL | DOUBLE );
    public final void numericLiteralUnsigned() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:307:4: ( INTEGER | DECIMAL | DOUBLE )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:
            {
            if ( (input.LA(1)>=INTEGER && input.LA(1)<=DOUBLE) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "numericLiteralUnsigned"


    // $ANTLR start "numericLiteralPositive"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:310:2: numericLiteralPositive : ( INTEGER_POSITIVE | DECIMAL_POSITIVE | DOUBLE_POSITIVE );
    public final void numericLiteralPositive() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:311:4: ( INTEGER_POSITIVE | DECIMAL_POSITIVE | DOUBLE_POSITIVE )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:
            {
            if ( (input.LA(1)>=INTEGER_POSITIVE && input.LA(1)<=DOUBLE_POSITIVE) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "numericLiteralPositive"


    // $ANTLR start "numericLiteralNegative"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:314:2: numericLiteralNegative : ( INTEGER_NEGATIVE | DECIMAL_NEGATIVE | DOUBLE_NEGATIVE );
    public final void numericLiteralNegative() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:315:4: ( INTEGER_NEGATIVE | DECIMAL_NEGATIVE | DOUBLE_NEGATIVE )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:
            {
            if ( (input.LA(1)>=INTEGER_NEGATIVE && input.LA(1)<=DOUBLE_NEGATIVE) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "numericLiteralNegative"


    // $ANTLR start "booleanLiteral"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:318:2: booleanLiteral : ( TRUE | FALSE );
    public final void booleanLiteral() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:319:4: ( TRUE | FALSE )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:
            {
            if ( (input.LA(1)>=TRUE && input.LA(1)<=FALSE) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "booleanLiteral"


    // $ANTLR start "string"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:321:2: string : ( STRING_LITERAL1 | STRING_LITERAL2 | STRING_LITERAL_LONG1 | STRING_LITERAL_LONG2 );
    public final void string() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:322:4: ( STRING_LITERAL1 | STRING_LITERAL2 | STRING_LITERAL_LONG1 | STRING_LITERAL_LONG2 )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:
            {
            if ( (input.LA(1)>=STRING_LITERAL1 && input.LA(1)<=STRING_LITERAL_LONG2) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "string"


    // $ANTLR start "iriRef"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:325:2: iriRef returns [String value] : ( IRI_REF | prefixedName );
    public final String iriRef() throws RecognitionException {
        String value = null;

        Token IRI_REF9=null;
        SourcePatternParser.prefixedName_return prefixedName10 = null;


        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:326:4: ( IRI_REF | prefixedName )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==IRI_REF) ) {
                alt48=1;
            }
            else if ( (LA48_0==PNAME_LN) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:326:6: IRI_REF
                    {
                    IRI_REF9=(Token)match(input,IRI_REF,FOLLOW_IRI_REF_in_iriRef1819); 
                     
                           String iri = (IRI_REF9!=null?IRI_REF9.getText():null);
                           value = iri.substring(1, iri.length()-1);
                         

                    }
                    break;
                case 2 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:331:6: prefixedName
                    {
                    pushFollow(FOLLOW_prefixedName_in_iriRef1834);
                    prefixedName10=prefixedName();

                    state._fsp--;

                     
                         String qName = (prefixedName10!=null?input.toString(prefixedName10.start,prefixedName10.stop):null);
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
    };

    // $ANTLR start "prefixedName"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:354:2: prefixedName : p= PNAME_LN ;
    public final SourcePatternParser.prefixedName_return prefixedName() throws RecognitionException {
        SourcePatternParser.prefixedName_return retval = new SourcePatternParser.prefixedName_return();
        retval.start = input.LT(1);

        Token p=null;

        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:355:4: (p= PNAME_LN )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:355:6: p= PNAME_LN
            {
            p=(Token)match(input,PNAME_LN,FOLLOW_PNAME_LN_in_prefixedName1860); 

                   String qName = (p!=null?p.getText():null);
                   String[] split = qName.split(":");
                   prefixes.add(split[0]);
                 

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


    // $ANTLR start "blankNode"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:364:2: blankNode : ( BLANK_NODE_LABEL | ANON );
    public final void blankNode() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:365:4: ( BLANK_NODE_LABEL | ANON )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\SourcePattern.g:
            {
            if ( (input.LA(1)>=BLANK_NODE_LABEL && input.LA(1)<=ANON) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "blankNode"

    // Delegated rules


 

    public static final BitSet FOLLOW_triplesBlock_in_sourcePattern60 = new BitSet(new long[]{0x00000000000000B0L,0x0000000000020000L});
    public static final BitSet FOLLOW_graphPatternNotTriples_in_sourcePattern65 = new BitSet(new long[]{0x000003FFFF8007B0L,0x00000000010B0000L});
    public static final BitSet FOLLOW_filter_in_sourcePattern69 = new BitSet(new long[]{0x000003FFFF8007B0L,0x00000000010B0000L});
    public static final BitSet FOLLOW_80_in_sourcePattern72 = new BitSet(new long[]{0x000003FFFF8007B0L,0x00000000010A0000L});
    public static final BitSet FOLLOW_triplesBlock_in_sourcePattern75 = new BitSet(new long[]{0x00000000000000B0L,0x0000000000020000L});
    public static final BitSet FOLLOW_EOF_in_sourcePattern81 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_wherePattern100 = new BitSet(new long[]{0x000003FFFF8007B0L,0x00000000010E0000L});
    public static final BitSet FOLLOW_triplesBlock_in_wherePattern102 = new BitSet(new long[]{0x00000000000000B0L,0x0000000000060000L});
    public static final BitSet FOLLOW_graphPatternNotTriples_in_wherePattern107 = new BitSet(new long[]{0x000003FFFF8007B0L,0x00000000010F0000L});
    public static final BitSet FOLLOW_filter_in_wherePattern111 = new BitSet(new long[]{0x000003FFFF8007B0L,0x00000000010F0000L});
    public static final BitSet FOLLOW_80_in_wherePattern114 = new BitSet(new long[]{0x000003FFFF8007B0L,0x00000000010E0000L});
    public static final BitSet FOLLOW_triplesBlock_in_wherePattern117 = new BitSet(new long[]{0x00000000000000B0L,0x0000000000060000L});
    public static final BitSet FOLLOW_82_in_wherePattern123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_groupGraphPattern136 = new BitSet(new long[]{0x000003FFFF8007B0L,0x00000000010E0000L});
    public static final BitSet FOLLOW_triplesBlock_in_groupGraphPattern138 = new BitSet(new long[]{0x00000000000000B0L,0x0000000000060000L});
    public static final BitSet FOLLOW_graphPatternNotTriples_in_groupGraphPattern143 = new BitSet(new long[]{0x000003FFFF8007B0L,0x00000000010F0000L});
    public static final BitSet FOLLOW_filter_in_groupGraphPattern147 = new BitSet(new long[]{0x000003FFFF8007B0L,0x00000000010F0000L});
    public static final BitSet FOLLOW_80_in_groupGraphPattern150 = new BitSet(new long[]{0x000003FFFF8007B0L,0x00000000010E0000L});
    public static final BitSet FOLLOW_triplesBlock_in_groupGraphPattern153 = new BitSet(new long[]{0x00000000000000B0L,0x0000000000060000L});
    public static final BitSet FOLLOW_82_in_groupGraphPattern159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triplesSameSubject_in_triplesBlock174 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_triplesBlock178 = new BitSet(new long[]{0x000003FFFF800702L,0x0000000001080000L});
    public static final BitSet FOLLOW_triplesBlock_in_triplesBlock180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_optionalGraphPattern_in_graphPatternNotTriples198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_groupOrUnionGraphPattern_in_graphPatternNotTriples202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphGraphPattern_in_graphPatternNotTriples206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPTIONAL_in_optionalGraphPattern222 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_groupGraphPattern_in_optionalGraphPattern224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GRAPH_in_graphGraphPattern241 = new BitSet(new long[]{0x000000C000000600L});
    public static final BitSet FOLLOW_varOrIriRef_in_graphGraphPattern243 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_groupGraphPattern_in_graphGraphPattern245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_groupGraphPattern_in_groupOrUnionGraphPattern260 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_UNION_in_groupOrUnionGraphPattern264 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_groupGraphPattern_in_groupOrUnionGraphPattern266 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_FILTER_in_filter282 = new BitSet(new long[]{0x000000C0003FF800L,0x0000000000080000L});
    public static final BitSet FOLLOW_constraint_in_filter284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_brackettedExpression_in_constraint299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtInCall_in_constraint303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_constraint307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRef_in_functionCall322 = new BitSet(new long[]{0x0000000000000100L,0x0000000000080000L});
    public static final BitSet FOLLOW_argList_in_functionCall324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NIL_in_argList337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_argList341 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_expression_in_argList343 = new BitSet(new long[]{0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_84_in_argList347 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_expression_in_argList349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_85_in_argList354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrTerm_in_triplesSameSubject369 = new BitSet(new long[]{0x000000C000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_propertyListNotEmpty_in_triplesSameSubject371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triplesNode_in_triplesSameSubject375 = new BitSet(new long[]{0x000000C000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_propertyList_in_triplesSameSubject377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_verb_in_propertyListNotEmpty394 = new BitSet(new long[]{0x000003FFFF800700L,0x0000000001080000L});
    public static final BitSet FOLLOW_objectList_in_propertyListNotEmpty398 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_propertyListNotEmpty411 = new BitSet(new long[]{0x000000C000000002L,0x0000000000C00000L});
    public static final BitSet FOLLOW_verb_in_propertyListNotEmpty414 = new BitSet(new long[]{0x000003FFFF800700L,0x0000000001080000L});
    public static final BitSet FOLLOW_objectList_in_propertyListNotEmpty416 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_propertyListNotEmpty_in_propertyList435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_in_objectList457 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_objectList467 = new BitSet(new long[]{0x000003FFFF800700L,0x0000000001080000L});
    public static final BitSet FOLLOW_object_in_objectList471 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_graphNode_in_object499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRef_in_verb520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_verb533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collection_in_triplesNode554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blankNodePropertyList_in_triplesNode558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_blankNodePropertyList571 = new BitSet(new long[]{0x000000C000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_propertyListNotEmpty_in_blankNodePropertyList573 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_blankNodePropertyList575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_collection590 = new BitSet(new long[]{0x000003FFFF800700L,0x0000000001080000L});
    public static final BitSet FOLLOW_graphNode_in_collection592 = new BitSet(new long[]{0x000003FFFF800700L,0x0000000001280000L});
    public static final BitSet FOLLOW_85_in_collection595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrTerm_in_graphNode614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triplesNode_in_graphNode622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_varOrTerm643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphTerm_in_varOrTerm651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_varOrIriRef672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRef_in_varOrIriRef683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR1_in_var700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR2_in_var706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRef_in_graphTerm732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rdfLiteral_in_graphTerm742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_graphTerm746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_graphTerm750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blankNode_in_graphTerm754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NIL_in_graphTerm758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_expression773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression788 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_conditionalOrExpression791 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression793 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_valueLogical_in_conditionalAndExpression810 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_conditionalAndExpression814 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_valueLogical_in_conditionalAndExpression816 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_relationalExpression_in_valueLogical834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericExpression_in_relationalExpression849 = new BitSet(new long[]{0x0000000000000002L,0x00000003F0000000L});
    public static final BitSet FOLLOW_92_in_relationalExpression877 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_numericExpression_in_relationalExpression879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_relationalExpression906 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_numericExpression_in_relationalExpression908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_relationalExpression935 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_numericExpression_in_relationalExpression937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_relationalExpression964 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_numericExpression_in_relationalExpression966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_relationalExpression993 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_numericExpression_in_relationalExpression995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_relationalExpression1021 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_numericExpression_in_relationalExpression1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_numericExpression1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1084 = new BitSet(new long[]{0x00000000FF800002L,0x0000000C00000000L});
    public static final BitSet FOLLOW_98_in_additiveExpression1088 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1090 = new BitSet(new long[]{0x00000000FF800002L,0x0000000C00000000L});
    public static final BitSet FOLLOW_99_in_additiveExpression1124 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1126 = new BitSet(new long[]{0x00000000FF800002L,0x0000000C00000000L});
    public static final BitSet FOLLOW_numericLiteralPositive_in_additiveExpression1160 = new BitSet(new long[]{0x00000000FF800002L,0x0000000C00000000L});
    public static final BitSet FOLLOW_numericLiteralNegative_in_additiveExpression1194 = new BitSet(new long[]{0x00000000FF800002L,0x0000000C00000000L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1246 = new BitSet(new long[]{0x0000000000000002L,0x0000003000000000L});
    public static final BitSet FOLLOW_100_in_multiplicativeExpression1250 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1252 = new BitSet(new long[]{0x0000000000000002L,0x0000003000000000L});
    public static final BitSet FOLLOW_101_in_multiplicativeExpression1256 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1259 = new BitSet(new long[]{0x0000000000000002L,0x0000003000000000L});
    public static final BitSet FOLLOW_102_in_unaryExpression1280 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_primaryExpression_in_unaryExpression1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_unaryExpression1289 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_primaryExpression_in_unaryExpression1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_unaryExpression1298 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_primaryExpression_in_unaryExpression1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_unaryExpression1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_brackettedExpression_in_primaryExpression1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtInCall_in_primaryExpression1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRefOrFunction_in_primaryExpression1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rdfLiteral_in_primaryExpression1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_primaryExpression1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_primaryExpression1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_primaryExpression1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_brackettedExpression1385 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_expression_in_brackettedExpression1387 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_brackettedExpression1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_in_builtInCall1408 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_builtInCall1410 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_expression_in_builtInCall1412 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_builtInCall1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LANG_in_builtInCall1421 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_builtInCall1423 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_expression_in_builtInCall1425 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_builtInCall1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LANGMATCHES_in_builtInCall1434 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_builtInCall1436 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_expression_in_builtInCall1438 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_builtInCall1440 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_expression_in_builtInCall1442 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_builtInCall1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATATYPE_in_builtInCall1451 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_builtInCall1453 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_expression_in_builtInCall1455 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_builtInCall1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOUND_in_builtInCall1464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_builtInCall1466 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_var_in_builtInCall1468 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_builtInCall1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAMETERM_in_builtInCall1477 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_builtInCall1479 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_expression_in_builtInCall1481 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_builtInCall1483 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_expression_in_builtInCall1485 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_builtInCall1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ISIRI_in_builtInCall1494 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_builtInCall1496 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_expression_in_builtInCall1498 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_builtInCall1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ISURI_in_builtInCall1507 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_builtInCall1509 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_expression_in_builtInCall1511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_builtInCall1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ISBLANK_in_builtInCall1521 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_builtInCall1523 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_expression_in_builtInCall1525 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_builtInCall1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ISLITERAL_in_builtInCall1534 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_builtInCall1536 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_expression_in_builtInCall1538 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_builtInCall1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_regexExpression_in_builtInCall1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEX_in_regexExpression1567 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_regexExpression1569 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_expression_in_regexExpression1571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexExpression1573 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_expression_in_regexExpression1575 = new BitSet(new long[]{0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_84_in_regexExpression1578 = new BitSet(new long[]{0x000000FFFFBFFE00L,0x0000004C00080000L});
    public static final BitSet FOLLOW_expression_in_regexExpression1580 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_regexExpression1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRef_in_iriRefOrFunction1603 = new BitSet(new long[]{0x0000000000000102L,0x0000000000080000L});
    public static final BitSet FOLLOW_argList_in_iriRefOrFunction1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_rdfLiteral1625 = new BitSet(new long[]{0x0000000000400002L,0x0000008000000000L});
    public static final BitSet FOLLOW_LANGTAG_in_rdfLiteral1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_rdfLiteral1633 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_iriRef_in_rdfLiteral1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralUnsigned_in_numericLiteral1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralPositive_in_numericLiteral1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralNegative_in_numericLiteral1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numericLiteralUnsigned0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numericLiteralPositive0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numericLiteralNegative0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_booleanLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_string0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IRI_REF_in_iriRef1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prefixedName_in_iriRef1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PNAME_LN_in_prefixedName1860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_blankNode0 = new BitSet(new long[]{0x0000000000000002L});

}