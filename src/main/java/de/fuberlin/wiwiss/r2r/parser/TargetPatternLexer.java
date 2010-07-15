// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g 2010-07-14 20:55:40

  package de.fuberlin.wiwiss.r2r.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class TargetPatternLexer extends Lexer {
    public static final int VARIABLEURI=4;
    public static final int IRI_REF=22;
    public static final int EXPONENT=38;
    public static final int PNAME_LN=23;
    public static final int EOF=-1;
    public static final int VARNAME=37;
    public static final int VARIABLETERM=7;
    public static final int HEX=44;
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

      public void recover(RecognitionException re) {
        String hdr = getErrorHeader(re);
        String msg = getErrorMessage(re, this.getTokenNames());
        
        throw new ParseException(hdr + " " + msg);
      }
      
      public void reportError(RecognitionException re) {
        String hdr = getErrorHeader(re);
        String msg = getErrorMessage(re, this.getTokenNames());
        
        throw new ParseException(hdr + " " + msg);
      }


    // delegates
    // delegators

    public TargetPatternLexer() {;} 
    public TargetPatternLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public TargetPatternLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g"; }

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:26:7: ( '.' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:26:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:27:7: ( 'a' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:27:9: 'a'
            {
            match('a'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:28:7: ( '^^' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:28:9: '^^'
            {
            match("^^"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:274:6: ( T R U E )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:274:8: T R U E
            {
            mT(); 
            mR(); 
            mU(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:275:7: ( F A L S E )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:275:9: F A L S E
            {
            mF(); 
            mA(); 
            mL(); 
            mS(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "A"
    public final void mA() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:277:11: ( ( 'a' | 'A' ) )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:277:13: ( 'a' | 'A' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "A"

    // $ANTLR start "E"
    public final void mE() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:278:11: ( ( 'e' | 'E' ) )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:278:13: ( 'e' | 'E' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "E"

    // $ANTLR start "F"
    public final void mF() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:279:11: ( ( 'f' | 'F' ) )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:279:13: ( 'f' | 'F' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "F"

    // $ANTLR start "L"
    public final void mL() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:280:11: ( ( 'l' | 'L' ) )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:280:13: ( 'l' | 'L' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "L"

    // $ANTLR start "R"
    public final void mR() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:281:11: ( ( 'r' | 'R' ) )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:281:13: ( 'r' | 'R' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "R"

    // $ANTLR start "S"
    public final void mS() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:282:11: ( ( 's' | 'S' ) )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:282:13: ( 's' | 'S' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "S"

    // $ANTLR start "T"
    public final void mT() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:283:11: ( ( 't' | 'T' ) )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:283:13: ( 't' | 'T' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "T"

    // $ANTLR start "U"
    public final void mU() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:284:11: ( ( 'u' | 'U' ) )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:284:13: ( 'u' | 'U' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "U"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:289:3: ( ( '\\u0020' | '\\u0009' | '\\u000D' | '\\u000A' ) )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:289:5: ( '\\u0020' | '\\u0009' | '\\u000D' | '\\u000A' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "IRI_REF"
    public final void mIRI_REF() throws RecognitionException {
        try {
            int _type = IRI_REF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:293:3: ( '<' (~ ( '<' | '>' | '\"' | '{' | '}' | '|' | '^' | '`' | '\\\\' | '\\u0000' .. '\\u0020' ) )* '>' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:293:5: '<' (~ ( '<' | '>' | '\"' | '{' | '}' | '|' | '^' | '`' | '\\\\' | '\\u0000' .. '\\u0020' ) )* '>'
            {
            match('<'); 
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:293:9: (~ ( '<' | '>' | '\"' | '{' | '}' | '|' | '^' | '`' | '\\\\' | '\\u0000' .. '\\u0020' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='!'||(LA1_0>='#' && LA1_0<=';')||LA1_0=='='||(LA1_0>='?' && LA1_0<='[')||LA1_0==']'||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')||(LA1_0>='~' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:293:10: ~ ( '<' | '>' | '\"' | '{' | '}' | '|' | '^' | '`' | '\\\\' | '\\u0000' .. '\\u0020' )
            	    {
            	    if ( input.LA(1)=='!'||(input.LA(1)>='#' && input.LA(1)<=';')||input.LA(1)=='='||(input.LA(1)>='?' && input.LA(1)<='[')||input.LA(1)==']'||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='~' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IRI_REF"

    // $ANTLR start "PNAME_NS"
    public final void mPNAME_NS() throws RecognitionException {
        try {
            int _type = PNAME_NS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:297:3: ( ( PN_PREFIX )? ':' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:297:5: ( PN_PREFIX )? ':'
            {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:297:5: ( PN_PREFIX )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')||(LA2_0>='\u00C0' && LA2_0<='\u00D6')||(LA2_0>='\u00D8' && LA2_0<='\u00F6')||(LA2_0>='\u00F8' && LA2_0<='\u02FF')||(LA2_0>='\u0370' && LA2_0<='\u037D')||(LA2_0>='\u037F' && LA2_0<='\u1FFF')||(LA2_0>='\u200C' && LA2_0<='\u200D')||(LA2_0>='\u2070' && LA2_0<='\u218F')||(LA2_0>='\u2C00' && LA2_0<='\u2FEF')||(LA2_0>='\u3001' && LA2_0<='\uD7FF')||(LA2_0>='\uF900' && LA2_0<='\uFDCF')||(LA2_0>='\uFDF0' && LA2_0<='\uFFFD')) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:297:5: PN_PREFIX
                    {
                    mPN_PREFIX(); 

                    }
                    break;

            }

            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PNAME_NS"

    // $ANTLR start "PNAME_LN"
    public final void mPNAME_LN() throws RecognitionException {
        try {
            int _type = PNAME_LN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:301:3: ( PNAME_NS PN_LOCAL )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:301:5: PNAME_NS PN_LOCAL
            {
            mPNAME_NS(); 
            mPN_LOCAL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PNAME_LN"

    // $ANTLR start "BLANK_NODE_LABEL"
    public final void mBLANK_NODE_LABEL() throws RecognitionException {
        try {
            int _type = BLANK_NODE_LABEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:305:3: ( '_:' PN_LOCAL )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:305:5: '_:' PN_LOCAL
            {
            match("_:"); 

            mPN_LOCAL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BLANK_NODE_LABEL"

    // $ANTLR start "VAR1"
    public final void mVAR1() throws RecognitionException {
        try {
            int _type = VAR1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:309:3: ( '?' VARNAME )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:309:5: '?' VARNAME
            {
            match('?'); 
            mVARNAME(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VAR1"

    // $ANTLR start "VAR2"
    public final void mVAR2() throws RecognitionException {
        try {
            int _type = VAR2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:313:3: ( '$' VARNAME )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:313:5: '$' VARNAME
            {
            match('$'); 
            mVARNAME(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VAR2"

    // $ANTLR start "VARIABLETERM"
    public final void mVARIABLETERM() throws RecognitionException {
        try {
            int _type = VARIABLETERM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:317:4: ( '?\\'' VARNAME '\\'' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:317:6: '?\\'' VARNAME '\\''
            {
            match("?'"); 

            mVARNAME(); 
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VARIABLETERM"

    // $ANTLR start "VARIABLEURI"
    public final void mVARIABLEURI() throws RecognitionException {
        try {
            int _type = VARIABLEURI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:321:4: ( '?<' VARNAME '>' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:321:6: '?<' VARNAME '>'
            {
            match("?<"); 

            mVARNAME(); 
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VARIABLEURI"

    // $ANTLR start "LANGTAG"
    public final void mLANGTAG() throws RecognitionException {
        try {
            int _type = LANGTAG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:325:3: ( '@' ( 'a' .. 'z' | 'A' .. 'Z' )+ ( '-' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+ )* )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:325:5: '@' ( 'a' .. 'z' | 'A' .. 'Z' )+ ( '-' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+ )*
            {
            match('@'); 
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:325:9: ( 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='A' && LA3_0<='Z')||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:
            	    {
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:325:32: ( '-' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+ )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='-') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:325:33: '-' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
            	    {
            	    match('-'); 
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:325:37: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
            	    int cnt4=0;
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||(LA4_0>='a' && LA4_0<='z')) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:
            	    	    {
            	    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;}


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt4 >= 1 ) break loop4;
            	                EarlyExitException eee =
            	                    new EarlyExitException(4, input);
            	                throw eee;
            	        }
            	        cnt4++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LANGTAG"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:329:3: ( ( '0' .. '9' )+ )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:329:5: ( '0' .. '9' )+
            {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:329:5: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:329:6: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "DECIMAL"
    public final void mDECIMAL() throws RecognitionException {
        try {
            int _type = DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:333:3: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                alt10=1;
            }
            else if ( (LA10_0=='.') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:333:5: ( '0' .. '9' )+ '.' ( '0' .. '9' )*
                    {
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:333:5: ( '0' .. '9' )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:333:6: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    match('.'); 
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:333:21: ( '0' .. '9' )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:333:22: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:333:35: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:333:39: ( '0' .. '9' )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:333:40: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DECIMAL"

    // $ANTLR start "DOUBLE"
    public final void mDOUBLE() throws RecognitionException {
        try {
            int _type = DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:337:3: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* EXPONENT | '.' ( '0' .. '9' )+ EXPONENT | ( '0' .. '9' )+ EXPONENT )
            int alt15=3;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:337:5: ( '0' .. '9' )+ '.' ( '0' .. '9' )* EXPONENT
                    {
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:337:5: ( '0' .. '9' )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:337:6: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);

                    match('.'); 
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:337:21: ( '0' .. '9' )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:337:22: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    mEXPONENT(); 

                    }
                    break;
                case 2 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:338:5: '.' ( '0' .. '9' )+ EXPONENT
                    {
                    match('.'); 
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:338:9: ( '0' .. '9' )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:338:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);

                    mEXPONENT(); 

                    }
                    break;
                case 3 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:339:5: ( '0' .. '9' )+ EXPONENT
                    {
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:339:5: ( '0' .. '9' )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:339:6: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);

                    mEXPONENT(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLE"

    // $ANTLR start "INTEGER_POSITIVE"
    public final void mINTEGER_POSITIVE() throws RecognitionException {
        try {
            int _type = INTEGER_POSITIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:343:3: ( '+' INTEGER )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:343:5: '+' INTEGER
            {
            match('+'); 
            mINTEGER(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER_POSITIVE"

    // $ANTLR start "DECIMAL_POSITIVE"
    public final void mDECIMAL_POSITIVE() throws RecognitionException {
        try {
            int _type = DECIMAL_POSITIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:347:3: ( '+' DECIMAL )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:347:5: '+' DECIMAL
            {
            match('+'); 
            mDECIMAL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DECIMAL_POSITIVE"

    // $ANTLR start "DOUBLE_POSITIVE"
    public final void mDOUBLE_POSITIVE() throws RecognitionException {
        try {
            int _type = DOUBLE_POSITIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:351:3: ( '+' DOUBLE )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:351:5: '+' DOUBLE
            {
            match('+'); 
            mDOUBLE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLE_POSITIVE"

    // $ANTLR start "INTEGER_NEGATIVE"
    public final void mINTEGER_NEGATIVE() throws RecognitionException {
        try {
            int _type = INTEGER_NEGATIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:355:3: ( '-' INTEGER )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:355:5: '-' INTEGER
            {
            match('-'); 
            mINTEGER(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER_NEGATIVE"

    // $ANTLR start "DECIMAL_NEGATIVE"
    public final void mDECIMAL_NEGATIVE() throws RecognitionException {
        try {
            int _type = DECIMAL_NEGATIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:359:3: ( '-' DECIMAL )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:359:5: '-' DECIMAL
            {
            match('-'); 
            mDECIMAL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DECIMAL_NEGATIVE"

    // $ANTLR start "DOUBLE_NEGATIVE"
    public final void mDOUBLE_NEGATIVE() throws RecognitionException {
        try {
            int _type = DOUBLE_NEGATIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:363:3: ( '-' DOUBLE )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:363:5: '-' DOUBLE
            {
            match('-'); 
            mDOUBLE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLE_NEGATIVE"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            int _type = EXPONENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:367:3: ( E ( '+' | '-' )? ( '0' .. '9' )+ )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:367:5: E ( '+' | '-' )? ( '0' .. '9' )+
            {
            mE(); 
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:367:7: ( '+' | '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='+'||LA16_0=='-') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:367:20: ( '0' .. '9' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='0' && LA17_0<='9')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:367:21: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "STRING_LITERAL1"
    public final void mSTRING_LITERAL1() throws RecognitionException {
        try {
            int _type = STRING_LITERAL1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:371:3: ( '\\'' (~ ( '\\u0027' | '\\u005c' | '\\u000A' | '\\u000D' ) | ECHAR )* '\\'' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:371:5: '\\'' (~ ( '\\u0027' | '\\u005c' | '\\u000A' | '\\u000D' ) | ECHAR )* '\\''
            {
            match('\''); 
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:371:10: (~ ( '\\u0027' | '\\u005c' | '\\u000A' | '\\u000D' ) | ECHAR )*
            loop18:
            do {
                int alt18=3;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\u0000' && LA18_0<='\t')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='&')||(LA18_0>='(' && LA18_0<='[')||(LA18_0>=']' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }
                else if ( (LA18_0=='\\') ) {
                    alt18=2;
                }


                switch (alt18) {
            	case 1 :
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:371:11: ~ ( '\\u0027' | '\\u005c' | '\\u000A' | '\\u000D' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:371:58: ECHAR
            	    {
            	    mECHAR(); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING_LITERAL1"

    // $ANTLR start "STRING_LITERAL_LONG1"
    public final void mSTRING_LITERAL_LONG1() throws RecognitionException {
        try {
            int _type = STRING_LITERAL_LONG1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:375:3: ( '\\'\\'\\'' ( ( '\\'' | '\\'\\'' )? (~ ( '\\'' | '\\\\' ) | ECHAR ) )* '\\'\\'\\'' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:375:5: '\\'\\'\\'' ( ( '\\'' | '\\'\\'' )? (~ ( '\\'' | '\\\\' ) | ECHAR ) )* '\\'\\'\\''
            {
            match("'''"); 

            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:375:14: ( ( '\\'' | '\\'\\'' )? (~ ( '\\'' | '\\\\' ) | ECHAR ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0=='\'') ) {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1=='\'') ) {
                        int LA21_3 = input.LA(3);

                        if ( ((LA21_3>='\u0000' && LA21_3<='&')||(LA21_3>='(' && LA21_3<='\uFFFF')) ) {
                            alt21=1;
                        }


                    }
                    else if ( ((LA21_1>='\u0000' && LA21_1<='&')||(LA21_1>='(' && LA21_1<='\uFFFF')) ) {
                        alt21=1;
                    }


                }
                else if ( ((LA21_0>='\u0000' && LA21_0<='&')||(LA21_0>='(' && LA21_0<='\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:375:15: ( '\\'' | '\\'\\'' )? (~ ( '\\'' | '\\\\' ) | ECHAR )
            	    {
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:375:15: ( '\\'' | '\\'\\'' )?
            	    int alt19=3;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0=='\'') ) {
            	        int LA19_1 = input.LA(2);

            	        if ( (LA19_1=='\'') ) {
            	            alt19=2;
            	        }
            	        else if ( ((LA19_1>='\u0000' && LA19_1<='&')||(LA19_1>='(' && LA19_1<='\uFFFF')) ) {
            	            alt19=1;
            	        }
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:375:17: '\\''
            	            {
            	            match('\''); 

            	            }
            	            break;
            	        case 2 :
            	            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:375:24: '\\'\\''
            	            {
            	            match("''"); 


            	            }
            	            break;

            	    }

            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:375:33: (~ ( '\\'' | '\\\\' ) | ECHAR )
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( ((LA20_0>='\u0000' && LA20_0<='&')||(LA20_0>='(' && LA20_0<='[')||(LA20_0>=']' && LA20_0<='\uFFFF')) ) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0=='\\') ) {
            	        alt20=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:375:34: ~ ( '\\'' | '\\\\' )
            	            {
            	            if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	                input.consume();

            	            }
            	            else {
            	                MismatchedSetException mse = new MismatchedSetException(null,input);
            	                recover(mse);
            	                throw mse;}


            	            }
            	            break;
            	        case 2 :
            	            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:375:51: ECHAR
            	            {
            	            mECHAR(); 

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            match("'''"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING_LITERAL_LONG1"

    // $ANTLR start "ECHAR"
    public final void mECHAR() throws RecognitionException {
        try {
            int _type = ECHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:379:3: ( '\\\\' ( 't' | 'b' | 'n' | 'r' | 'f' | '\\\\' | '\"' | '\\'' ) )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:379:5: '\\\\' ( 't' | 'b' | 'n' | 'r' | 'f' | '\\\\' | '\"' | '\\'' )
            {
            match('\\'); 
            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ECHAR"

    // $ANTLR start "ANON"
    public final void mANON() throws RecognitionException {
        try {
            int _type = ANON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:385:3: ( '[' ( WS )* ']' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:385:5: '[' ( WS )* ']'
            {
            match('['); 
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:385:9: ( WS )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='\t' && LA22_0<='\n')||LA22_0=='\r'||LA22_0==' ') ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:385:9: WS
            	    {
            	    mWS(); 

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ANON"

    // $ANTLR start "VARNAME"
    public final void mVARNAME() throws RecognitionException {
        try {
            int _type = VARNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:389:3: ( ( PN_CHARS_U | '0' .. '9' ) ( PN_CHARS_U | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' )* )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:389:5: ( PN_CHARS_U | '0' .. '9' ) ( PN_CHARS_U | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' )*
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u02FF')||(input.LA(1)>='\u0370' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:389:29: ( PN_CHARS_U | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='0' && LA23_0<='9')||(LA23_0>='A' && LA23_0<='Z')||LA23_0=='_'||(LA23_0>='a' && LA23_0<='z')||LA23_0=='\u00B7'||(LA23_0>='\u00C0' && LA23_0<='\u00D6')||(LA23_0>='\u00D8' && LA23_0<='\u00F6')||(LA23_0>='\u00F8' && LA23_0<='\u037D')||(LA23_0>='\u037F' && LA23_0<='\u1FFF')||(LA23_0>='\u200C' && LA23_0<='\u200D')||(LA23_0>='\u203F' && LA23_0<='\u2040')||(LA23_0>='\u2070' && LA23_0<='\u218F')||(LA23_0>='\u2C00' && LA23_0<='\u2FEF')||(LA23_0>='\u3001' && LA23_0<='\uD7FF')||(LA23_0>='\uF900' && LA23_0<='\uFDCF')||(LA23_0>='\uFDF0' && LA23_0<='\uFFFD')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00B7'||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u203F' && input.LA(1)<='\u2040')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VARNAME"

    // $ANTLR start "PN_CHARS_BASE"
    public final void mPN_CHARS_BASE() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:393:3: ( 'a' .. 'z' | 'A' .. 'Z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u02FF')||(input.LA(1)>='\u0370' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "PN_CHARS_BASE"

    // $ANTLR start "PN_CHARS_U"
    public final void mPN_CHARS_U() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:409:3: ( PN_CHARS_BASE | '_' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u02FF')||(input.LA(1)>='\u0370' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "PN_CHARS_U"

    // $ANTLR start "PN_PREFIX"
    public final void mPN_PREFIX() throws RecognitionException {
        try {
            int _type = PN_PREFIX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:413:3: ( PN_CHARS_BASE ( ( PN_CHARS | '.' )* PN_CHARS )? )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:413:5: PN_CHARS_BASE ( ( PN_CHARS | '.' )* PN_CHARS )?
            {
            mPN_CHARS_BASE(); 
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:413:19: ( ( PN_CHARS | '.' )* PN_CHARS )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>='-' && LA25_0<='.')||(LA25_0>='0' && LA25_0<='9')||(LA25_0>='A' && LA25_0<='Z')||LA25_0=='_'||(LA25_0>='a' && LA25_0<='z')||LA25_0=='\u00B7'||(LA25_0>='\u00C0' && LA25_0<='\u00D6')||(LA25_0>='\u00D8' && LA25_0<='\u00F6')||(LA25_0>='\u00F8' && LA25_0<='\u037D')||(LA25_0>='\u037F' && LA25_0<='\u1FFF')||(LA25_0>='\u200C' && LA25_0<='\u200D')||(LA25_0>='\u203F' && LA25_0<='\u2040')||(LA25_0>='\u2070' && LA25_0<='\u218F')||(LA25_0>='\u2C00' && LA25_0<='\u2FEF')||(LA25_0>='\u3001' && LA25_0<='\uD7FF')||(LA25_0>='\uF900' && LA25_0<='\uFDCF')||(LA25_0>='\uFDF0' && LA25_0<='\uFFFD')) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:413:20: ( PN_CHARS | '.' )* PN_CHARS
                    {
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:413:20: ( PN_CHARS | '.' )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0=='-'||(LA24_0>='0' && LA24_0<='9')||(LA24_0>='A' && LA24_0<='Z')||LA24_0=='_'||(LA24_0>='a' && LA24_0<='z')||LA24_0=='\u00B7'||(LA24_0>='\u00C0' && LA24_0<='\u00D6')||(LA24_0>='\u00D8' && LA24_0<='\u00F6')||(LA24_0>='\u00F8' && LA24_0<='\u037D')||(LA24_0>='\u037F' && LA24_0<='\u1FFF')||(LA24_0>='\u200C' && LA24_0<='\u200D')||(LA24_0>='\u203F' && LA24_0<='\u2040')||(LA24_0>='\u2070' && LA24_0<='\u218F')||(LA24_0>='\u2C00' && LA24_0<='\u2FEF')||(LA24_0>='\u3001' && LA24_0<='\uD7FF')||(LA24_0>='\uF900' && LA24_0<='\uFDCF')||(LA24_0>='\uFDF0' && LA24_0<='\uFFFD')) ) {
                            int LA24_1 = input.LA(2);

                            if ( ((LA24_1>='-' && LA24_1<='.')||(LA24_1>='0' && LA24_1<='9')||(LA24_1>='A' && LA24_1<='Z')||LA24_1=='_'||(LA24_1>='a' && LA24_1<='z')||LA24_1=='\u00B7'||(LA24_1>='\u00C0' && LA24_1<='\u00D6')||(LA24_1>='\u00D8' && LA24_1<='\u00F6')||(LA24_1>='\u00F8' && LA24_1<='\u037D')||(LA24_1>='\u037F' && LA24_1<='\u1FFF')||(LA24_1>='\u200C' && LA24_1<='\u200D')||(LA24_1>='\u203F' && LA24_1<='\u2040')||(LA24_1>='\u2070' && LA24_1<='\u218F')||(LA24_1>='\u2C00' && LA24_1<='\u2FEF')||(LA24_1>='\u3001' && LA24_1<='\uD7FF')||(LA24_1>='\uF900' && LA24_1<='\uFDCF')||(LA24_1>='\uFDF0' && LA24_1<='\uFFFD')) ) {
                                alt24=1;
                            }


                        }
                        else if ( (LA24_0=='.') ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:
                    	    {
                    	    if ( (input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00B7'||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u203F' && input.LA(1)<='\u2040')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    mPN_CHARS(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PN_PREFIX"

    // $ANTLR start "PN_CHARS"
    public final void mPN_CHARS() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:417:3: ( PN_CHARS_U | '-' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:
            {
            if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00B7'||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u203F' && input.LA(1)<='\u2040')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "PN_CHARS"

    // $ANTLR start "PN_LOCAL"
    public final void mPN_LOCAL() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:426:3: ( ( PN_CHARS_U | '0' .. '9' ) ( ( PN_CHARS | '.' )* PN_CHARS )? )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:426:5: ( PN_CHARS_U | '0' .. '9' ) ( ( PN_CHARS | '.' )* PN_CHARS )?
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u02FF')||(input.LA(1)>='\u0370' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:426:29: ( ( PN_CHARS | '.' )* PN_CHARS )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>='-' && LA27_0<='.')||(LA27_0>='0' && LA27_0<='9')||(LA27_0>='A' && LA27_0<='Z')||LA27_0=='_'||(LA27_0>='a' && LA27_0<='z')||LA27_0=='\u00B7'||(LA27_0>='\u00C0' && LA27_0<='\u00D6')||(LA27_0>='\u00D8' && LA27_0<='\u00F6')||(LA27_0>='\u00F8' && LA27_0<='\u037D')||(LA27_0>='\u037F' && LA27_0<='\u1FFF')||(LA27_0>='\u200C' && LA27_0<='\u200D')||(LA27_0>='\u203F' && LA27_0<='\u2040')||(LA27_0>='\u2070' && LA27_0<='\u218F')||(LA27_0>='\u2C00' && LA27_0<='\u2FEF')||(LA27_0>='\u3001' && LA27_0<='\uD7FF')||(LA27_0>='\uF900' && LA27_0<='\uFDCF')||(LA27_0>='\uFDF0' && LA27_0<='\uFFFD')) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:426:30: ( PN_CHARS | '.' )* PN_CHARS
                    {
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:426:30: ( PN_CHARS | '.' )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0=='-'||(LA26_0>='0' && LA26_0<='9')||(LA26_0>='A' && LA26_0<='Z')||LA26_0=='_'||(LA26_0>='a' && LA26_0<='z')||LA26_0=='\u00B7'||(LA26_0>='\u00C0' && LA26_0<='\u00D6')||(LA26_0>='\u00D8' && LA26_0<='\u00F6')||(LA26_0>='\u00F8' && LA26_0<='\u037D')||(LA26_0>='\u037F' && LA26_0<='\u1FFF')||(LA26_0>='\u200C' && LA26_0<='\u200D')||(LA26_0>='\u203F' && LA26_0<='\u2040')||(LA26_0>='\u2070' && LA26_0<='\u218F')||(LA26_0>='\u2C00' && LA26_0<='\u2FEF')||(LA26_0>='\u3001' && LA26_0<='\uD7FF')||(LA26_0>='\uF900' && LA26_0<='\uFDCF')||(LA26_0>='\uFDF0' && LA26_0<='\uFFFD')) ) {
                            int LA26_1 = input.LA(2);

                            if ( ((LA26_1>='-' && LA26_1<='.')||(LA26_1>='0' && LA26_1<='9')||(LA26_1>='A' && LA26_1<='Z')||LA26_1=='_'||(LA26_1>='a' && LA26_1<='z')||LA26_1=='\u00B7'||(LA26_1>='\u00C0' && LA26_1<='\u00D6')||(LA26_1>='\u00D8' && LA26_1<='\u00F6')||(LA26_1>='\u00F8' && LA26_1<='\u037D')||(LA26_1>='\u037F' && LA26_1<='\u1FFF')||(LA26_1>='\u200C' && LA26_1<='\u200D')||(LA26_1>='\u203F' && LA26_1<='\u2040')||(LA26_1>='\u2070' && LA26_1<='\u218F')||(LA26_1>='\u2C00' && LA26_1<='\u2FEF')||(LA26_1>='\u3001' && LA26_1<='\uD7FF')||(LA26_1>='\uF900' && LA26_1<='\uFDCF')||(LA26_1>='\uFDF0' && LA26_1<='\uFFFD')) ) {
                                alt26=1;
                            }


                        }
                        else if ( (LA26_0=='.') ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:
                    	    {
                    	    if ( (input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00B7'||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u203F' && input.LA(1)<='\u2040')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    mPN_CHARS(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "PN_LOCAL"

    // $ANTLR start "HEX"
    public final void mHEX() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:429:14: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:429:16: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:430:9: ( '#' ( . )* ( '\\n' | '\\r' ) )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:430:11: '#' ( . )* ( '\\n' | '\\r' )
            {
            match('#'); 
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:430:15: ( . )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0=='\n'||LA28_0=='\r') ) {
                    alt28=2;
                }
                else if ( ((LA28_0>='\u0000' && LA28_0<='\t')||(LA28_0>='\u000B' && LA28_0<='\f')||(LA28_0>='\u000E' && LA28_0<='\uFFFF')) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:430:15: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    public void mTokens() throws RecognitionException {
        // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:1:8: ( T__46 | T__47 | T__48 | TRUE | FALSE | WS | IRI_REF | PNAME_NS | PNAME_LN | BLANK_NODE_LABEL | VAR1 | VAR2 | VARIABLETERM | VARIABLEURI | LANGTAG | INTEGER | DECIMAL | DOUBLE | INTEGER_POSITIVE | DECIMAL_POSITIVE | DOUBLE_POSITIVE | INTEGER_NEGATIVE | DECIMAL_NEGATIVE | DOUBLE_NEGATIVE | EXPONENT | STRING_LITERAL1 | STRING_LITERAL_LONG1 | ECHAR | ANON | VARNAME | PN_PREFIX | COMMENT )
        int alt29=32;
        alt29 = dfa29.predict(input);
        switch (alt29) {
            case 1 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:1:10: T__46
                {
                mT__46(); 

                }
                break;
            case 2 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:1:16: T__47
                {
                mT__47(); 

                }
                break;
            case 3 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:1:22: T__48
                {
                mT__48(); 

                }
                break;
            case 4 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:1:28: TRUE
                {
                mTRUE(); 

                }
                break;
            case 5 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:1:33: FALSE
                {
                mFALSE(); 

                }
                break;
            case 6 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:1:39: WS
                {
                mWS(); 

                }
                break;
            case 7 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:1:42: IRI_REF
                {
                mIRI_REF(); 

                }
                break;
            case 8 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:1:50: PNAME_NS
                {
                mPNAME_NS(); 

                }
                break;
            case 9 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:1:59: PNAME_LN
                {
                mPNAME_LN(); 

                }
                break;
            case 10 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:1:68: BLANK_NODE_LABEL
                {
                mBLANK_NODE_LABEL(); 

                }
                break;
            case 11 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:1:85: VAR1
                {
                mVAR1(); 

                }
                break;
            case 12 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:1:90: VAR2
                {
                mVAR2(); 

                }
                break;
            case 13 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:1:95: VARIABLETERM
                {
                mVARIABLETERM(); 

                }
                break;
            case 14 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:1:108: VARIABLEURI
                {
                mVARIABLEURI(); 

                }
                break;
            case 15 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:1:120: LANGTAG
                {
                mLANGTAG(); 

                }
                break;
            case 16 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:1:128: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 17 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:1:136: DECIMAL
                {
                mDECIMAL(); 

                }
                break;
            case 18 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:1:144: DOUBLE
                {
                mDOUBLE(); 

                }
                break;
            case 19 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:1:151: INTEGER_POSITIVE
                {
                mINTEGER_POSITIVE(); 

                }
                break;
            case 20 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:1:168: DECIMAL_POSITIVE
                {
                mDECIMAL_POSITIVE(); 

                }
                break;
            case 21 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:1:185: DOUBLE_POSITIVE
                {
                mDOUBLE_POSITIVE(); 

                }
                break;
            case 22 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:1:201: INTEGER_NEGATIVE
                {
                mINTEGER_NEGATIVE(); 

                }
                break;
            case 23 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:1:218: DECIMAL_NEGATIVE
                {
                mDECIMAL_NEGATIVE(); 

                }
                break;
            case 24 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:1:235: DOUBLE_NEGATIVE
                {
                mDOUBLE_NEGATIVE(); 

                }
                break;
            case 25 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:1:251: EXPONENT
                {
                mEXPONENT(); 

                }
                break;
            case 26 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:1:260: STRING_LITERAL1
                {
                mSTRING_LITERAL1(); 

                }
                break;
            case 27 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:1:276: STRING_LITERAL_LONG1
                {
                mSTRING_LITERAL_LONG1(); 

                }
                break;
            case 28 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:1:297: ECHAR
                {
                mECHAR(); 

                }
                break;
            case 29 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:1:303: ANON
                {
                mANON(); 

                }
                break;
            case 30 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:1:308: VARNAME
                {
                mVARNAME(); 

                }
                break;
            case 31 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:1:316: PN_PREFIX
                {
                mPN_PREFIX(); 

                }
                break;
            case 32 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\TargetPattern.g:1:326: COMMENT
                {
                mCOMMENT(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    protected DFA29 dfa29 = new DFA29(this);
    static final String DFA15_eotS =
        "\5\uffff";
    static final String DFA15_eofS =
        "\5\uffff";
    static final String DFA15_minS =
        "\2\56\3\uffff";
    static final String DFA15_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA15_specialS =
        "\5\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
            "",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "336:1: DOUBLE : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* EXPONENT | '.' ( '0' .. '9' )+ EXPONENT | ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA29_eotS =
        "\1\uffff\1\27\1\30\1\uffff\2\34\2\uffff\1\34\1\42\1\34\3\uffff"+
        "\1\52\2\uffff\1\34\4\uffff\1\62\2\uffff\1\34\1\uffff\1\64\1\uffff"+
        "\2\34\1\64\1\41\7\uffff\1\62\1\52\1\uffff\1\34\1\73\1\uffff\1\77"+
        "\1\uffff\1\61\4\uffff\2\34\1\41\1\62\1\63\1\106\2\uffff\1\106\2"+
        "\uffff\2\110\1\uffff\1\111\1\34\1\106\1\uffff\1\110\2\uffff\1\113"+
        "\1\uffff";
    static final String DFA29_eofS =
        "\114\uffff";
    static final String DFA29_minS =
        "\1\11\1\60\1\55\1\uffff\2\55\2\uffff\1\53\1\60\1\72\1\47\2\uffff"+
        "\3\56\1\55\1\0\3\uffff\1\60\2\uffff\3\55\1\uffff\4\55\7\uffff\1"+
        "\60\1\56\1\uffff\1\53\1\56\1\60\1\56\1\60\1\47\4\uffff\3\55\3\60"+
        "\2\uffff\1\60\2\uffff\2\60\1\uffff\2\55\1\60\1\uffff\1\60\2\uffff"+
        "\1\55\1\uffff";
    static final String DFA29_maxS =
        "\1\ufffd\1\71\1\ufffd\1\uffff\2\ufffd\2\uffff\2\ufffd\1\72\1\ufffd"+
        "\2\uffff\1\ufffd\2\71\1\ufffd\1\uffff\3\uffff\1\145\2\uffff\3\ufffd"+
        "\1\uffff\4\ufffd\7\uffff\1\145\1\ufffd\1\uffff\1\71\1\145\1\71\1"+
        "\145\1\71\1\47\4\uffff\3\ufffd\1\145\1\ufffd\1\145\2\uffff\1\145"+
        "\2\uffff\2\145\1\uffff\2\ufffd\1\145\1\uffff\1\145\2\uffff\1\ufffd"+
        "\1\uffff";
    static final String DFA29_acceptS =
        "\3\uffff\1\3\2\uffff\1\6\1\7\4\uffff\1\14\1\17\5\uffff\1\34\1\35"+
        "\1\40\1\uffff\1\1\1\2\3\uffff\1\36\4\uffff\1\31\1\10\1\11\1\12\1"+
        "\15\1\16\1\13\2\uffff\1\20\6\uffff\1\32\1\21\1\22\1\37\6\uffff\1"+
        "\23\1\25\1\uffff\1\30\1\26\2\uffff\1\33\3\uffff\1\24\1\uffff\1\27"+
        "\1\4\1\uffff\1\5";
    static final String DFA29_specialS =
        "\22\uffff\1\0\71\uffff}>";
    static final String[] DFA29_transitionS = {
            "\2\6\2\uffff\1\6\22\uffff\1\6\2\uffff\1\25\1\14\2\uffff\1\22"+
            "\3\uffff\1\17\1\uffff\1\20\1\1\1\uffff\12\16\1\11\1\uffff\1"+
            "\7\2\uffff\1\13\1\15\4\21\1\10\1\5\15\21\1\4\6\21\1\24\1\23"+
            "\1\uffff\1\3\1\12\1\uffff\1\2\3\21\1\10\1\5\15\21\1\4\6\21\105"+
            "\uffff\27\21\1\uffff\37\21\1\uffff\u0208\21\160\uffff\16\21"+
            "\1\uffff\u1c81\21\14\uffff\2\21\142\uffff\u0120\21\u0a70\uffff"+
            "\u03f0\21\21\uffff\ua7ff\21\u2100\uffff\u04d0\21\40\uffff\u020e"+
            "\21",
            "\12\26",
            "\1\33\1\32\1\uffff\12\31\1\11\6\uffff\32\31\4\uffff\1\31\1"+
            "\uffff\32\31\74\uffff\1\31\10\uffff\27\31\1\uffff\37\31\1\uffff"+
            "\u0286\31\1\uffff\u1c81\31\14\uffff\2\31\61\uffff\2\31\57\uffff"+
            "\u0120\31\u0a70\uffff\u03f0\31\21\uffff\ua7ff\31\u2100\uffff"+
            "\u04d0\31\40\uffff\u020e\31",
            "",
            "\1\33\1\32\1\uffff\12\31\1\11\6\uffff\21\31\1\35\10\31\4\uffff"+
            "\1\31\1\uffff\21\31\1\35\10\31\74\uffff\1\31\10\uffff\27\31"+
            "\1\uffff\37\31\1\uffff\u0286\31\1\uffff\u1c81\31\14\uffff\2"+
            "\31\61\uffff\2\31\57\uffff\u0120\31\u0a70\uffff\u03f0\31\21"+
            "\uffff\ua7ff\31\u2100\uffff\u04d0\31\40\uffff\u020e\31",
            "\1\33\1\32\1\uffff\12\31\1\11\6\uffff\1\36\31\31\4\uffff\1"+
            "\31\1\uffff\1\36\31\31\74\uffff\1\31\10\uffff\27\31\1\uffff"+
            "\37\31\1\uffff\u0286\31\1\uffff\u1c81\31\14\uffff\2\31\61\uffff"+
            "\2\31\57\uffff\u0120\31\u0a70\uffff\u03f0\31\21\uffff\ua7ff"+
            "\31\u2100\uffff\u04d0\31\40\uffff\u020e\31",
            "",
            "",
            "\1\41\1\uffff\1\37\1\32\1\uffff\12\40\1\11\6\uffff\32\31\4"+
            "\uffff\1\31\1\uffff\32\31\74\uffff\1\31\10\uffff\27\31\1\uffff"+
            "\37\31\1\uffff\u0286\31\1\uffff\u1c81\31\14\uffff\2\31\61\uffff"+
            "\2\31\57\uffff\u0120\31\u0a70\uffff\u03f0\31\21\uffff\ua7ff"+
            "\31\u2100\uffff\u04d0\31\40\uffff\u020e\31",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43\105\uffff"+
            "\27\43\1\uffff\37\43\1\uffff\u0208\43\160\uffff\16\43\1\uffff"+
            "\u1c81\43\14\uffff\2\43\142\uffff\u0120\43\u0a70\uffff\u03f0"+
            "\43\21\uffff\ua7ff\43\u2100\uffff\u04d0\43\40\uffff\u020e\43",
            "\1\44",
            "\1\45\10\uffff\12\47\2\uffff\1\46\4\uffff\32\47\4\uffff\1"+
            "\47\1\uffff\32\47\105\uffff\27\47\1\uffff\37\47\1\uffff\u0208"+
            "\47\160\uffff\16\47\1\uffff\u1c81\47\14\uffff\2\47\142\uffff"+
            "\u0120\47\u0a70\uffff\u03f0\47\21\uffff\ua7ff\47\u2100\uffff"+
            "\u04d0\47\40\uffff\u020e\47",
            "",
            "",
            "\1\50\1\uffff\12\51\7\uffff\4\34\1\53\25\34\4\uffff\1\34\1"+
            "\uffff\4\34\1\53\25\34\74\uffff\1\34\10\uffff\27\34\1\uffff"+
            "\37\34\1\uffff\u0286\34\1\uffff\u1c81\34\14\uffff\2\34\61\uffff"+
            "\2\34\57\uffff\u0120\34\u0a70\uffff\u03f0\34\21\uffff\ua7ff"+
            "\34\u2100\uffff\u04d0\34\40\uffff\u020e\34",
            "\1\55\1\uffff\12\54",
            "\1\57\1\uffff\12\56",
            "\1\33\1\32\1\uffff\12\31\1\11\6\uffff\32\31\4\uffff\1\31\1"+
            "\uffff\32\31\74\uffff\1\31\10\uffff\27\31\1\uffff\37\31\1\uffff"+
            "\u0286\31\1\uffff\u1c81\31\14\uffff\2\31\61\uffff\2\31\57\uffff"+
            "\u0120\31\u0a70\uffff\u03f0\31\21\uffff\ua7ff\31\u2100\uffff"+
            "\u04d0\31\40\uffff\u020e\31",
            "\12\61\1\uffff\2\61\1\uffff\31\61\1\60\uffd8\61",
            "",
            "",
            "",
            "\12\26\13\uffff\1\63\37\uffff\1\63",
            "",
            "",
            "\1\33\1\32\1\uffff\12\31\1\11\6\uffff\32\31\4\uffff\1\31\1"+
            "\uffff\32\31\74\uffff\1\31\10\uffff\27\31\1\uffff\37\31\1\uffff"+
            "\u0286\31\1\uffff\u1c81\31\14\uffff\2\31\61\uffff\2\31\57\uffff"+
            "\u0120\31\u0a70\uffff\u03f0\31\21\uffff\ua7ff\31\u2100\uffff"+
            "\u04d0\31\40\uffff\u020e\31",
            "\1\33\1\32\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff"+
            "\32\33\74\uffff\1\33\10\uffff\27\33\1\uffff\37\33\1\uffff\u0286"+
            "\33\1\uffff\u1c81\33\14\uffff\2\33\61\uffff\2\33\57\uffff\u0120"+
            "\33\u0a70\uffff\u03f0\33\21\uffff\ua7ff\33\u2100\uffff\u04d0"+
            "\33\40\uffff\u020e\33",
            "\1\33\1\32\1\uffff\12\33\1\11\6\uffff\32\33\4\uffff\1\33\1"+
            "\uffff\32\33\74\uffff\1\33\10\uffff\27\33\1\uffff\37\33\1\uffff"+
            "\u0286\33\1\uffff\u1c81\33\14\uffff\2\33\61\uffff\2\33\57\uffff"+
            "\u0120\33\u0a70\uffff\u03f0\33\21\uffff\ua7ff\33\u2100\uffff"+
            "\u04d0\33\40\uffff\u020e\33",
            "",
            "\1\33\1\32\1\uffff\12\31\1\11\6\uffff\24\31\1\65\5\31\4\uffff"+
            "\1\31\1\uffff\24\31\1\65\5\31\74\uffff\1\31\10\uffff\27\31\1"+
            "\uffff\37\31\1\uffff\u0286\31\1\uffff\u1c81\31\14\uffff\2\31"+
            "\61\uffff\2\31\57\uffff\u0120\31\u0a70\uffff\u03f0\31\21\uffff"+
            "\ua7ff\31\u2100\uffff\u04d0\31\40\uffff\u020e\31",
            "\1\33\1\32\1\uffff\12\31\1\11\6\uffff\13\31\1\66\16\31\4\uffff"+
            "\1\31\1\uffff\13\31\1\66\16\31\74\uffff\1\31\10\uffff\27\31"+
            "\1\uffff\37\31\1\uffff\u0286\31\1\uffff\u1c81\31\14\uffff\2"+
            "\31\61\uffff\2\31\57\uffff\u0120\31\u0a70\uffff\u03f0\31\21"+
            "\uffff\ua7ff\31\u2100\uffff\u04d0\31\40\uffff\u020e\31",
            "\1\33\1\32\1\uffff\12\67\1\11\6\uffff\32\33\4\uffff\1\33\1"+
            "\uffff\32\33\74\uffff\1\33\10\uffff\27\33\1\uffff\37\33\1\uffff"+
            "\u0286\33\1\uffff\u1c81\33\14\uffff\2\33\61\uffff\2\33\57\uffff"+
            "\u0120\33\u0a70\uffff\u03f0\33\21\uffff\ua7ff\33\u2100\uffff"+
            "\u04d0\33\40\uffff\u020e\33",
            "\1\33\1\32\1\uffff\12\40\1\11\6\uffff\32\31\4\uffff\1\31\1"+
            "\uffff\32\31\74\uffff\1\31\10\uffff\27\31\1\uffff\37\31\1\uffff"+
            "\u0286\31\1\uffff\u1c81\31\14\uffff\2\31\61\uffff\2\31\57\uffff"+
            "\u0120\31\u0a70\uffff\u03f0\31\21\uffff\ua7ff\31\u2100\uffff"+
            "\u04d0\31\40\uffff\u020e\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\70\13\uffff\1\63\37\uffff\1\63",
            "\1\50\1\uffff\12\51\7\uffff\4\34\1\53\25\34\4\uffff\1\34\1"+
            "\uffff\4\34\1\53\25\34\74\uffff\1\34\10\uffff\27\34\1\uffff"+
            "\37\34\1\uffff\u0286\34\1\uffff\u1c81\34\14\uffff\2\34\61\uffff"+
            "\2\34\57\uffff\u0120\34\u0a70\uffff\u03f0\34\21\uffff\ua7ff"+
            "\34\u2100\uffff\u04d0\34\40\uffff\u020e\34",
            "",
            "\1\63\1\uffff\1\63\2\uffff\12\71",
            "\1\72\1\uffff\12\54\13\uffff\1\74\37\uffff\1\74",
            "\12\75",
            "\1\100\1\uffff\12\56\13\uffff\1\76\37\uffff\1\76",
            "\12\101",
            "\1\102",
            "",
            "",
            "",
            "",
            "\1\33\1\32\1\uffff\12\31\1\11\6\uffff\4\31\1\103\25\31\4\uffff"+
            "\1\31\1\uffff\4\31\1\103\25\31\74\uffff\1\31\10\uffff\27\31"+
            "\1\uffff\37\31\1\uffff\u0286\31\1\uffff\u1c81\31\14\uffff\2"+
            "\31\61\uffff\2\31\57\uffff\u0120\31\u0a70\uffff\u03f0\31\21"+
            "\uffff\ua7ff\31\u2100\uffff\u04d0\31\40\uffff\u020e\31",
            "\1\33\1\32\1\uffff\12\31\1\11\6\uffff\22\31\1\104\7\31\4\uffff"+
            "\1\31\1\uffff\22\31\1\104\7\31\74\uffff\1\31\10\uffff\27\31"+
            "\1\uffff\37\31\1\uffff\u0286\31\1\uffff\u1c81\31\14\uffff\2"+
            "\31\61\uffff\2\31\57\uffff\u0120\31\u0a70\uffff\u03f0\31\21"+
            "\uffff\ua7ff\31\u2100\uffff\u04d0\31\40\uffff\u020e\31",
            "\1\33\1\32\1\uffff\12\67\1\11\6\uffff\32\33\4\uffff\1\33\1"+
            "\uffff\32\33\74\uffff\1\33\10\uffff\27\33\1\uffff\37\33\1\uffff"+
            "\u0286\33\1\uffff\u1c81\33\14\uffff\2\33\61\uffff\2\33\57\uffff"+
            "\u0120\33\u0a70\uffff\u03f0\33\21\uffff\ua7ff\33\u2100\uffff"+
            "\u04d0\33\40\uffff\u020e\33",
            "\12\70\13\uffff\1\63\37\uffff\1\63",
            "\12\71\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34\74\uffff\1"+
            "\34\10\uffff\27\34\1\uffff\37\34\1\uffff\u0286\34\1\uffff\u1c81"+
            "\34\14\uffff\2\34\61\uffff\2\34\57\uffff\u0120\34\u0a70\uffff"+
            "\u03f0\34\21\uffff\ua7ff\34\u2100\uffff\u04d0\34\40\uffff\u020e"+
            "\34",
            "\12\105\13\uffff\1\74\37\uffff\1\74",
            "",
            "",
            "\12\75\13\uffff\1\74\37\uffff\1\74",
            "",
            "",
            "\12\107\13\uffff\1\76\37\uffff\1\76",
            "\12\101\13\uffff\1\76\37\uffff\1\76",
            "",
            "\1\33\1\32\1\uffff\12\31\1\11\6\uffff\32\31\4\uffff\1\31\1"+
            "\uffff\32\31\74\uffff\1\31\10\uffff\27\31\1\uffff\37\31\1\uffff"+
            "\u0286\31\1\uffff\u1c81\31\14\uffff\2\31\61\uffff\2\31\57\uffff"+
            "\u0120\31\u0a70\uffff\u03f0\31\21\uffff\ua7ff\31\u2100\uffff"+
            "\u04d0\31\40\uffff\u020e\31",
            "\1\33\1\32\1\uffff\12\31\1\11\6\uffff\4\31\1\112\25\31\4\uffff"+
            "\1\31\1\uffff\4\31\1\112\25\31\74\uffff\1\31\10\uffff\27\31"+
            "\1\uffff\37\31\1\uffff\u0286\31\1\uffff\u1c81\31\14\uffff\2"+
            "\31\61\uffff\2\31\57\uffff\u0120\31\u0a70\uffff\u03f0\31\21"+
            "\uffff\ua7ff\31\u2100\uffff\u04d0\31\40\uffff\u020e\31",
            "\12\105\13\uffff\1\74\37\uffff\1\74",
            "",
            "\12\107\13\uffff\1\76\37\uffff\1\76",
            "",
            "",
            "\1\33\1\32\1\uffff\12\31\1\11\6\uffff\32\31\4\uffff\1\31\1"+
            "\uffff\32\31\74\uffff\1\31\10\uffff\27\31\1\uffff\37\31\1\uffff"+
            "\u0286\31\1\uffff\u1c81\31\14\uffff\2\31\61\uffff\2\31\57\uffff"+
            "\u0120\31\u0a70\uffff\u03f0\31\21\uffff\ua7ff\31\u2100\uffff"+
            "\u04d0\31\40\uffff\u020e\31",
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__46 | T__47 | T__48 | TRUE | FALSE | WS | IRI_REF | PNAME_NS | PNAME_LN | BLANK_NODE_LABEL | VAR1 | VAR2 | VARIABLETERM | VARIABLEURI | LANGTAG | INTEGER | DECIMAL | DOUBLE | INTEGER_POSITIVE | DECIMAL_POSITIVE | DOUBLE_POSITIVE | INTEGER_NEGATIVE | DECIMAL_NEGATIVE | DOUBLE_NEGATIVE | EXPONENT | STRING_LITERAL1 | STRING_LITERAL_LONG1 | ECHAR | ANON | VARNAME | PN_PREFIX | COMMENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_18 = input.LA(1);

                        s = -1;
                        if ( (LA29_18=='\'') ) {s = 48;}

                        else if ( ((LA29_18>='\u0000' && LA29_18<='\t')||(LA29_18>='\u000B' && LA29_18<='\f')||(LA29_18>='\u000E' && LA29_18<='&')||(LA29_18>='(' && LA29_18<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}