// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g 2010-07-24 23:51:52

  package de.fuberlin.wiwiss.r2r.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class TransformationLexer extends Lexer {
    public static final int INTEGER=11;
    public static final int EXPONENT=19;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int PN_LOCAL=26;
    public static final int MINUS=5;
    public static final int MULT=6;
    public static final int EOF=-1;
    public static final int ECHAR=20;
    public static final int FUNCTIONNAME=10;
    public static final int VARNAME=18;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int WS=22;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int STRING_LITERAL_LONG2=17;
    public static final int PN_CHARS_BASE=23;
    public static final int T__36=36;
    public static final int DECIMAL=12;
    public static final int T__37=37;
    public static final int VAR1=8;
    public static final int T__38=38;
    public static final int VAR2=9;
    public static final int STRING_LITERAL_LONG1=16;
    public static final int T__39=39;
    public static final int PN_PREFIX=25;
    public static final int STRING_LITERAL2=15;
    public static final int STRING_LITERAL1=14;
    public static final int PN_CHARS=24;
    public static final int DOUBLE=13;
    public static final int PN_CHARS_U=21;
    public static final int PLUS=4;
    public static final int DIV=7;

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

    public TransformationLexer() {;} 
    public TransformationLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public TransformationLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g"; }

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:26:7: ( '=' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:26:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:27:7: ( '(' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:27:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:28:7: ( ')' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:28:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:29:7: ( '[' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:29:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:30:7: ( '?' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:30:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:31:7: ( ':' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:31:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:32:7: ( ']' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:32:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:33:7: ( '>' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:33:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:34:7: ( '>=' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:34:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:35:7: ( '<' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:35:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:36:7: ( '<=' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:36:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:37:7: ( '!=' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:37:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:38:7: ( ',' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:38:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "VAR1"
    public final void mVAR1() throws RecognitionException {
        try {
            int _type = VAR1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:237:3: ( '?' VARNAME )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:237:5: '?' VARNAME
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
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:241:3: ( '$' VARNAME )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:241:5: '$' VARNAME
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

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:245:3: ( ( '0' .. '9' )+ )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:245:5: ( '0' .. '9' )+
            {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:245:5: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:245:6: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "FUNCTIONNAME"
    public final void mFUNCTIONNAME() throws RecognitionException {
        try {
            int _type = FUNCTIONNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:249:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )+ )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:249:5: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )+
            {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:249:5: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCTIONNAME"

    // $ANTLR start "DECIMAL"
    public final void mDECIMAL() throws RecognitionException {
        try {
            int _type = DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:253:3: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                alt6=1;
            }
            else if ( (LA6_0=='.') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:253:5: ( '0' .. '9' )+ '.' ( '0' .. '9' )*
                    {
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:253:5: ( '0' .. '9' )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:253:6: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

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

                    match('.'); 
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:253:21: ( '0' .. '9' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:253:22: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:253:35: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:253:39: ( '0' .. '9' )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:253:40: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
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
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:257:3: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* EXPONENT | '.' ( '0' .. '9' )+ EXPONENT | ( '0' .. '9' )+ EXPONENT )
            int alt11=3;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:257:5: ( '0' .. '9' )+ '.' ( '0' .. '9' )* EXPONENT
                    {
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:257:5: ( '0' .. '9' )+
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
                    	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:257:6: '0' .. '9'
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
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:257:21: ( '0' .. '9' )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:257:22: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    mEXPONENT(); 

                    }
                    break;
                case 2 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:258:5: '.' ( '0' .. '9' )+ EXPONENT
                    {
                    match('.'); 
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:258:9: ( '0' .. '9' )+
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
                    	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:258:10: '0' .. '9'
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

                    mEXPONENT(); 

                    }
                    break;
                case 3 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:259:5: ( '0' .. '9' )+ EXPONENT
                    {
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:259:5: ( '0' .. '9' )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:259:6: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
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

    // $ANTLR start "MULT"
    public final void mMULT() throws RecognitionException {
        try {
            int _type = MULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:263:3: ( '*' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:263:5: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MULT"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:267:3: ( '/' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:267:5: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            int _type = EXPONENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:295:3: ( ( 'e' | 'E' ) ( PLUS | MINUS )? ( '0' .. '9' )+ )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:295:5: ( 'e' | 'E' ) ( PLUS | MINUS )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:295:17: ( PLUS | MINUS )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='+'||LA12_0=='-') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:
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

            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:295:33: ( '0' .. '9' )+
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
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:295:34: '0' .. '9'
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
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:299:3: ( '\\'' (~ ( '\\u0027' | '\\u005c' | '\\u000A' | '\\u000D' ) | ECHAR )* '\\'' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:299:5: '\\'' (~ ( '\\u0027' | '\\u005c' | '\\u000A' | '\\u000D' ) | ECHAR )* '\\''
            {
            match('\''); 
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:299:10: (~ ( '\\u0027' | '\\u005c' | '\\u000A' | '\\u000D' ) | ECHAR )*
            loop14:
            do {
                int alt14=3;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }
                else if ( (LA14_0=='\\') ) {
                    alt14=2;
                }


                switch (alt14) {
            	case 1 :
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:299:11: ~ ( '\\u0027' | '\\u005c' | '\\u000A' | '\\u000D' )
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
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:299:58: ECHAR
            	    {
            	    mECHAR(); 

            	    }
            	    break;

            	default :
            	    break loop14;
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

    // $ANTLR start "STRING_LITERAL2"
    public final void mSTRING_LITERAL2() throws RecognitionException {
        try {
            int _type = STRING_LITERAL2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:303:3: ( '\"' (~ ( '\\u0022' | '\\u005c' | '\\u000A' | '\\u000D' ) | ECHAR )* '\"' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:303:5: '\"' (~ ( '\\u0022' | '\\u005c' | '\\u000A' | '\\u000D' ) | ECHAR )* '\"'
            {
            match('\"'); 
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:303:9: (~ ( '\\u0022' | '\\u005c' | '\\u000A' | '\\u000D' ) | ECHAR )*
            loop15:
            do {
                int alt15=3;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='!')||(LA15_0>='#' && LA15_0<='[')||(LA15_0>=']' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }
                else if ( (LA15_0=='\\') ) {
                    alt15=2;
                }


                switch (alt15) {
            	case 1 :
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:303:10: ~ ( '\\u0022' | '\\u005c' | '\\u000A' | '\\u000D' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:303:57: ECHAR
            	    {
            	    mECHAR(); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING_LITERAL2"

    // $ANTLR start "STRING_LITERAL_LONG1"
    public final void mSTRING_LITERAL_LONG1() throws RecognitionException {
        try {
            int _type = STRING_LITERAL_LONG1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:307:3: ( '\\'\\'\\'' ( ( '\\'' | '\\'\\'' )? (~ ( '\\'' | '\\\\' ) | ECHAR ) )* '\\'\\'\\'' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:307:5: '\\'\\'\\'' ( ( '\\'' | '\\'\\'' )? (~ ( '\\'' | '\\\\' ) | ECHAR ) )* '\\'\\'\\''
            {
            match("'''"); 

            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:307:14: ( ( '\\'' | '\\'\\'' )? (~ ( '\\'' | '\\\\' ) | ECHAR ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0=='\'') ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1=='\'') ) {
                        int LA18_3 = input.LA(3);

                        if ( ((LA18_3>='\u0000' && LA18_3<='&')||(LA18_3>='(' && LA18_3<='\uFFFF')) ) {
                            alt18=1;
                        }


                    }
                    else if ( ((LA18_1>='\u0000' && LA18_1<='&')||(LA18_1>='(' && LA18_1<='\uFFFF')) ) {
                        alt18=1;
                    }


                }
                else if ( ((LA18_0>='\u0000' && LA18_0<='&')||(LA18_0>='(' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:307:15: ( '\\'' | '\\'\\'' )? (~ ( '\\'' | '\\\\' ) | ECHAR )
            	    {
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:307:15: ( '\\'' | '\\'\\'' )?
            	    int alt16=3;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0=='\'') ) {
            	        int LA16_1 = input.LA(2);

            	        if ( (LA16_1=='\'') ) {
            	            alt16=2;
            	        }
            	        else if ( ((LA16_1>='\u0000' && LA16_1<='&')||(LA16_1>='(' && LA16_1<='\uFFFF')) ) {
            	            alt16=1;
            	        }
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:307:17: '\\''
            	            {
            	            match('\''); 

            	            }
            	            break;
            	        case 2 :
            	            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:307:24: '\\'\\''
            	            {
            	            match("''"); 


            	            }
            	            break;

            	    }

            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:307:33: (~ ( '\\'' | '\\\\' ) | ECHAR )
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( ((LA17_0>='\u0000' && LA17_0<='&')||(LA17_0>='(' && LA17_0<='[')||(LA17_0>=']' && LA17_0<='\uFFFF')) ) {
            	        alt17=1;
            	    }
            	    else if ( (LA17_0=='\\') ) {
            	        alt17=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:307:34: ~ ( '\\'' | '\\\\' )
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
            	            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:307:51: ECHAR
            	            {
            	            mECHAR(); 

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
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

    // $ANTLR start "STRING_LITERAL_LONG2"
    public final void mSTRING_LITERAL_LONG2() throws RecognitionException {
        try {
            int _type = STRING_LITERAL_LONG2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:311:3: ( '\"\"\"' ( ( '\"' | '\"\"' )? (~ ( '\"' | '\\\\' ) | ECHAR ) )* '\"\"\"' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:311:5: '\"\"\"' ( ( '\"' | '\"\"' )? (~ ( '\"' | '\\\\' ) | ECHAR ) )* '\"\"\"'
            {
            match("\"\"\""); 

            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:311:11: ( ( '\"' | '\"\"' )? (~ ( '\"' | '\\\\' ) | ECHAR ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0=='\"') ) {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1=='\"') ) {
                        int LA21_3 = input.LA(3);

                        if ( ((LA21_3>='\u0000' && LA21_3<='!')||(LA21_3>='#' && LA21_3<='\uFFFF')) ) {
                            alt21=1;
                        }


                    }
                    else if ( ((LA21_1>='\u0000' && LA21_1<='!')||(LA21_1>='#' && LA21_1<='\uFFFF')) ) {
                        alt21=1;
                    }


                }
                else if ( ((LA21_0>='\u0000' && LA21_0<='!')||(LA21_0>='#' && LA21_0<='\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:311:12: ( '\"' | '\"\"' )? (~ ( '\"' | '\\\\' ) | ECHAR )
            	    {
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:311:12: ( '\"' | '\"\"' )?
            	    int alt19=3;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0=='\"') ) {
            	        int LA19_1 = input.LA(2);

            	        if ( (LA19_1=='\"') ) {
            	            alt19=2;
            	        }
            	        else if ( ((LA19_1>='\u0000' && LA19_1<='!')||(LA19_1>='#' && LA19_1<='\uFFFF')) ) {
            	            alt19=1;
            	        }
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:311:14: '\"'
            	            {
            	            match('\"'); 

            	            }
            	            break;
            	        case 2 :
            	            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:311:20: '\"\"'
            	            {
            	            match("\"\""); 


            	            }
            	            break;

            	    }

            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:311:27: (~ ( '\"' | '\\\\' ) | ECHAR )
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( ((LA20_0>='\u0000' && LA20_0<='!')||(LA20_0>='#' && LA20_0<='[')||(LA20_0>=']' && LA20_0<='\uFFFF')) ) {
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
            	            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:311:28: ~ ( '\"' | '\\\\' )
            	            {
            	            if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	                input.consume();

            	            }
            	            else {
            	                MismatchedSetException mse = new MismatchedSetException(null,input);
            	                recover(mse);
            	                throw mse;}


            	            }
            	            break;
            	        case 2 :
            	            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:311:44: ECHAR
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

            match("\"\"\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING_LITERAL_LONG2"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:315:3: ( '-' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:315:5: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:319:3: ( '+' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:319:5: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "ECHAR"
    public final void mECHAR() throws RecognitionException {
        try {
            int _type = ECHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:323:3: ( '\\\\' ( 't' | 'b' | 'n' | 'r' | 'f' | '\\\\' | '\"' | '\\'' ) )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:323:5: '\\\\' ( 't' | 'b' | 'n' | 'r' | 'f' | '\\\\' | '\"' | '\\'' )
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

    // $ANTLR start "VARNAME"
    public final void mVARNAME() throws RecognitionException {
        try {
            int _type = VARNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:327:3: ( ( PN_CHARS_U | '0' .. '9' ) ( PN_CHARS_U | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' )* )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:327:5: ( PN_CHARS_U | '0' .. '9' ) ( PN_CHARS_U | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' )*
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u02FF')||(input.LA(1)>='\u0370' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:327:29: ( PN_CHARS_U | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='0' && LA22_0<='9')||(LA22_0>='A' && LA22_0<='Z')||LA22_0=='_'||(LA22_0>='a' && LA22_0<='z')||LA22_0=='\u00B7'||(LA22_0>='\u00C0' && LA22_0<='\u00D6')||(LA22_0>='\u00D8' && LA22_0<='\u00F6')||(LA22_0>='\u00F8' && LA22_0<='\u037D')||(LA22_0>='\u037F' && LA22_0<='\u1FFF')||(LA22_0>='\u200C' && LA22_0<='\u200D')||(LA22_0>='\u203F' && LA22_0<='\u2040')||(LA22_0>='\u2070' && LA22_0<='\u218F')||(LA22_0>='\u2C00' && LA22_0<='\u2FEF')||(LA22_0>='\u3001' && LA22_0<='\uD7FF')||(LA22_0>='\uF900' && LA22_0<='\uFDCF')||(LA22_0>='\uFDF0' && LA22_0<='\uFFFD')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:
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
            	    break loop22;
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

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:331:3: ( ( '\\u0020' | '\\u0009' | '\\u000D' | '\\u000A' ) )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:331:5: ( '\\u0020' | '\\u0009' | '\\u000D' | '\\u000A' )
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

    // $ANTLR start "PN_PREFIX"
    public final void mPN_PREFIX() throws RecognitionException {
        try {
            int _type = PN_PREFIX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:335:3: ( PN_CHARS_BASE ( ( PN_CHARS | '.' )* PN_CHARS )? )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:335:5: PN_CHARS_BASE ( ( PN_CHARS | '.' )* PN_CHARS )?
            {
            mPN_CHARS_BASE(); 
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:335:19: ( ( PN_CHARS | '.' )* PN_CHARS )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>='-' && LA24_0<='.')||(LA24_0>='0' && LA24_0<='9')||(LA24_0>='A' && LA24_0<='Z')||LA24_0=='_'||(LA24_0>='a' && LA24_0<='z')||LA24_0=='\u00B7'||(LA24_0>='\u00C0' && LA24_0<='\u00D6')||(LA24_0>='\u00D8' && LA24_0<='\u00F6')||(LA24_0>='\u00F8' && LA24_0<='\u037D')||(LA24_0>='\u037F' && LA24_0<='\u1FFF')||(LA24_0>='\u200C' && LA24_0<='\u200D')||(LA24_0>='\u203F' && LA24_0<='\u2040')||(LA24_0>='\u2070' && LA24_0<='\u218F')||(LA24_0>='\u2C00' && LA24_0<='\u2FEF')||(LA24_0>='\u3001' && LA24_0<='\uD7FF')||(LA24_0>='\uF900' && LA24_0<='\uFDCF')||(LA24_0>='\uFDF0' && LA24_0<='\uFFFD')) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:335:20: ( PN_CHARS | '.' )* PN_CHARS
                    {
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:335:20: ( PN_CHARS | '.' )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0=='-'||(LA23_0>='0' && LA23_0<='9')||(LA23_0>='A' && LA23_0<='Z')||LA23_0=='_'||(LA23_0>='a' && LA23_0<='z')||LA23_0=='\u00B7'||(LA23_0>='\u00C0' && LA23_0<='\u00D6')||(LA23_0>='\u00D8' && LA23_0<='\u00F6')||(LA23_0>='\u00F8' && LA23_0<='\u037D')||(LA23_0>='\u037F' && LA23_0<='\u1FFF')||(LA23_0>='\u200C' && LA23_0<='\u200D')||(LA23_0>='\u203F' && LA23_0<='\u2040')||(LA23_0>='\u2070' && LA23_0<='\u218F')||(LA23_0>='\u2C00' && LA23_0<='\u2FEF')||(LA23_0>='\u3001' && LA23_0<='\uD7FF')||(LA23_0>='\uF900' && LA23_0<='\uFDCF')||(LA23_0>='\uFDF0' && LA23_0<='\uFFFD')) ) {
                            int LA23_1 = input.LA(2);

                            if ( ((LA23_1>='-' && LA23_1<='.')||(LA23_1>='0' && LA23_1<='9')||(LA23_1>='A' && LA23_1<='Z')||LA23_1=='_'||(LA23_1>='a' && LA23_1<='z')||LA23_1=='\u00B7'||(LA23_1>='\u00C0' && LA23_1<='\u00D6')||(LA23_1>='\u00D8' && LA23_1<='\u00F6')||(LA23_1>='\u00F8' && LA23_1<='\u037D')||(LA23_1>='\u037F' && LA23_1<='\u1FFF')||(LA23_1>='\u200C' && LA23_1<='\u200D')||(LA23_1>='\u203F' && LA23_1<='\u2040')||(LA23_1>='\u2070' && LA23_1<='\u218F')||(LA23_1>='\u2C00' && LA23_1<='\u2FEF')||(LA23_1>='\u3001' && LA23_1<='\uD7FF')||(LA23_1>='\uF900' && LA23_1<='\uFDCF')||(LA23_1>='\uFDF0' && LA23_1<='\uFFFD')) ) {
                                alt23=1;
                            }


                        }
                        else if ( (LA23_0=='.') ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:
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
                    	    break loop23;
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

    // $ANTLR start "PN_CHARS_BASE"
    public final void mPN_CHARS_BASE() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:339:3: ( 'a' .. 'z' | 'A' .. 'Z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:
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
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:355:3: ( PN_CHARS_BASE | '_' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:
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

    // $ANTLR start "PN_CHARS"
    public final void mPN_CHARS() throws RecognitionException {
        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:359:3: ( PN_CHARS_U | '-' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:
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
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:368:3: ( ( PN_CHARS_U | '0' .. '9' ) ( ( PN_CHARS | '.' )* PN_CHARS )? )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:368:5: ( PN_CHARS_U | '0' .. '9' ) ( ( PN_CHARS | '.' )* PN_CHARS )?
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u02FF')||(input.LA(1)>='\u0370' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:368:29: ( ( PN_CHARS | '.' )* PN_CHARS )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>='-' && LA26_0<='.')||(LA26_0>='0' && LA26_0<='9')||(LA26_0>='A' && LA26_0<='Z')||LA26_0=='_'||(LA26_0>='a' && LA26_0<='z')||LA26_0=='\u00B7'||(LA26_0>='\u00C0' && LA26_0<='\u00D6')||(LA26_0>='\u00D8' && LA26_0<='\u00F6')||(LA26_0>='\u00F8' && LA26_0<='\u037D')||(LA26_0>='\u037F' && LA26_0<='\u1FFF')||(LA26_0>='\u200C' && LA26_0<='\u200D')||(LA26_0>='\u203F' && LA26_0<='\u2040')||(LA26_0>='\u2070' && LA26_0<='\u218F')||(LA26_0>='\u2C00' && LA26_0<='\u2FEF')||(LA26_0>='\u3001' && LA26_0<='\uD7FF')||(LA26_0>='\uF900' && LA26_0<='\uFDCF')||(LA26_0>='\uFDF0' && LA26_0<='\uFFFD')) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:368:30: ( PN_CHARS | '.' )* PN_CHARS
                    {
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:368:30: ( PN_CHARS | '.' )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0=='-'||(LA25_0>='0' && LA25_0<='9')||(LA25_0>='A' && LA25_0<='Z')||LA25_0=='_'||(LA25_0>='a' && LA25_0<='z')||LA25_0=='\u00B7'||(LA25_0>='\u00C0' && LA25_0<='\u00D6')||(LA25_0>='\u00D8' && LA25_0<='\u00F6')||(LA25_0>='\u00F8' && LA25_0<='\u037D')||(LA25_0>='\u037F' && LA25_0<='\u1FFF')||(LA25_0>='\u200C' && LA25_0<='\u200D')||(LA25_0>='\u203F' && LA25_0<='\u2040')||(LA25_0>='\u2070' && LA25_0<='\u218F')||(LA25_0>='\u2C00' && LA25_0<='\u2FEF')||(LA25_0>='\u3001' && LA25_0<='\uD7FF')||(LA25_0>='\uF900' && LA25_0<='\uFDCF')||(LA25_0>='\uFDF0' && LA25_0<='\uFFFD')) ) {
                            int LA25_1 = input.LA(2);

                            if ( ((LA25_1>='-' && LA25_1<='.')||(LA25_1>='0' && LA25_1<='9')||(LA25_1>='A' && LA25_1<='Z')||LA25_1=='_'||(LA25_1>='a' && LA25_1<='z')||LA25_1=='\u00B7'||(LA25_1>='\u00C0' && LA25_1<='\u00D6')||(LA25_1>='\u00D8' && LA25_1<='\u00F6')||(LA25_1>='\u00F8' && LA25_1<='\u037D')||(LA25_1>='\u037F' && LA25_1<='\u1FFF')||(LA25_1>='\u200C' && LA25_1<='\u200D')||(LA25_1>='\u203F' && LA25_1<='\u2040')||(LA25_1>='\u2070' && LA25_1<='\u218F')||(LA25_1>='\u2C00' && LA25_1<='\u2FEF')||(LA25_1>='\u3001' && LA25_1<='\uD7FF')||(LA25_1>='\uF900' && LA25_1<='\uFDCF')||(LA25_1>='\uFDF0' && LA25_1<='\uFFFD')) ) {
                                alt25=1;
                            }


                        }
                        else if ( (LA25_0=='.') ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:
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
                    	    break loop25;
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

    public void mTokens() throws RecognitionException {
        // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:8: ( T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | VAR1 | VAR2 | INTEGER | FUNCTIONNAME | DECIMAL | DOUBLE | MULT | DIV | EXPONENT | STRING_LITERAL1 | STRING_LITERAL2 | STRING_LITERAL_LONG1 | STRING_LITERAL_LONG2 | MINUS | PLUS | ECHAR | VARNAME | WS | PN_PREFIX )
        int alt27=32;
        alt27 = dfa27.predict(input);
        switch (alt27) {
            case 1 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:10: T__27
                {
                mT__27(); 

                }
                break;
            case 2 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:16: T__28
                {
                mT__28(); 

                }
                break;
            case 3 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:22: T__29
                {
                mT__29(); 

                }
                break;
            case 4 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:28: T__30
                {
                mT__30(); 

                }
                break;
            case 5 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:34: T__31
                {
                mT__31(); 

                }
                break;
            case 6 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:40: T__32
                {
                mT__32(); 

                }
                break;
            case 7 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:46: T__33
                {
                mT__33(); 

                }
                break;
            case 8 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:52: T__34
                {
                mT__34(); 

                }
                break;
            case 9 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:58: T__35
                {
                mT__35(); 

                }
                break;
            case 10 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:64: T__36
                {
                mT__36(); 

                }
                break;
            case 11 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:70: T__37
                {
                mT__37(); 

                }
                break;
            case 12 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:76: T__38
                {
                mT__38(); 

                }
                break;
            case 13 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:82: T__39
                {
                mT__39(); 

                }
                break;
            case 14 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:88: VAR1
                {
                mVAR1(); 

                }
                break;
            case 15 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:93: VAR2
                {
                mVAR2(); 

                }
                break;
            case 16 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:98: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 17 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:106: FUNCTIONNAME
                {
                mFUNCTIONNAME(); 

                }
                break;
            case 18 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:119: DECIMAL
                {
                mDECIMAL(); 

                }
                break;
            case 19 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:127: DOUBLE
                {
                mDOUBLE(); 

                }
                break;
            case 20 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:134: MULT
                {
                mMULT(); 

                }
                break;
            case 21 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:139: DIV
                {
                mDIV(); 

                }
                break;
            case 22 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:143: EXPONENT
                {
                mEXPONENT(); 

                }
                break;
            case 23 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:152: STRING_LITERAL1
                {
                mSTRING_LITERAL1(); 

                }
                break;
            case 24 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:168: STRING_LITERAL2
                {
                mSTRING_LITERAL2(); 

                }
                break;
            case 25 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:184: STRING_LITERAL_LONG1
                {
                mSTRING_LITERAL_LONG1(); 

                }
                break;
            case 26 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:205: STRING_LITERAL_LONG2
                {
                mSTRING_LITERAL_LONG2(); 

                }
                break;
            case 27 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:226: MINUS
                {
                mMINUS(); 

                }
                break;
            case 28 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:232: PLUS
                {
                mPLUS(); 

                }
                break;
            case 29 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:237: ECHAR
                {
                mECHAR(); 

                }
                break;
            case 30 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:243: VARNAME
                {
                mVARNAME(); 

                }
                break;
            case 31 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:251: WS
                {
                mWS(); 

                }
                break;
            case 32 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:254: PN_PREFIX
                {
                mPN_PREFIX(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    protected DFA27 dfa27 = new DFA27(this);
    static final String DFA11_eotS =
        "\5\uffff";
    static final String DFA11_eofS =
        "\5\uffff";
    static final String DFA11_minS =
        "\2\56\3\uffff";
    static final String DFA11_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA11_acceptS =
        "\2\uffff\1\2\1\3\1\1";
    static final String DFA11_specialS =
        "\5\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\4\1\uffff\12\1\13\uffff\1\3\37\uffff\1\3",
            "",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "256:1: DOUBLE : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* EXPONENT | '.' ( '0' .. '9' )+ EXPONENT | ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA27_eotS =
        "\5\uffff\1\34\2\uffff\1\36\1\40\3\uffff\1\44\1\47\3\uffff\1\47"+
        "\5\uffff\1\46\1\uffff\1\47\6\uffff\1\65\1\44\1\47\1\uffff\1\47\2"+
        "\uffff\1\47\1\uffff\1\51\1\uffff\1\47\1\46\1\65\1\60\1\uffff\1\62"+
        "\1\uffff\1\65\2\uffff\1\47\1\53\2\uffff";
    static final String DFA27_eofS =
        "\72\uffff";
    static final String DFA27_minS =
        "\1\11\4\uffff\1\60\2\uffff\2\75\3\uffff\1\56\1\53\1\60\2\uffff"+
        "\1\55\2\0\3\uffff\1\55\1\uffff\1\60\6\uffff\1\60\1\56\1\53\1\uffff"+
        "\1\60\2\uffff\1\55\1\uffff\1\60\1\uffff\2\55\1\60\1\47\1\uffff\1"+
        "\42\1\uffff\1\60\2\uffff\1\60\1\55\2\uffff";
    static final String DFA27_maxS =
        "\1\ufffd\4\uffff\1\ufffd\2\uffff\2\75\3\uffff\2\ufffd\1\71\2\uffff"+
        "\1\ufffd\2\uffff\3\uffff\1\ufffd\1\uffff\1\ufffd\6\uffff\1\145\2"+
        "\ufffd\1\uffff\1\ufffd\2\uffff\1\ufffd\1\uffff\1\71\1\uffff\2\ufffd"+
        "\1\145\1\47\1\uffff\1\42\1\uffff\1\145\2\uffff\2\ufffd\2\uffff";
    static final String DFA27_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\1\7\2\uffff\1\14\1\15\1\17"+
        "\3\uffff\1\24\1\25\3\uffff\1\33\1\34\1\35\1\uffff\1\37\1\uffff\1"+
        "\16\1\5\1\11\1\10\1\13\1\12\3\uffff\1\20\1\uffff\1\36\1\21\1\uffff"+
        "\1\40\1\uffff\1\26\4\uffff\1\27\1\uffff\1\30\1\uffff\1\23\1\22\2"+
        "\uffff\1\31\1\32";
    static final String DFA27_specialS =
        "\23\uffff\1\1\1\0\45\uffff}>";
    static final String[] DFA27_transitionS = {
            "\2\31\2\uffff\1\31\22\uffff\1\31\1\12\1\24\1\uffff\1\14\2\uffff"+
            "\1\23\1\2\1\3\1\20\1\26\1\13\1\25\1\17\1\21\12\15\1\6\1\uffff"+
            "\1\11\1\1\1\10\1\5\1\uffff\4\22\1\16\25\22\1\4\1\27\1\7\1\uffff"+
            "\1\32\1\uffff\4\22\1\16\25\22\105\uffff\27\30\1\uffff\37\30"+
            "\1\uffff\u0208\30\160\uffff\16\30\1\uffff\u1c81\30\14\uffff"+
            "\2\30\142\uffff\u0120\30\u0a70\uffff\u03f0\30\21\uffff\ua7ff"+
            "\30\u2100\uffff\u04d0\30\40\uffff\u020e\30",
            "",
            "",
            "",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33\105\uffff"+
            "\27\33\1\uffff\37\33\1\uffff\u0208\33\160\uffff\16\33\1\uffff"+
            "\u1c81\33\14\uffff\2\33\142\uffff\u0120\33\u0a70\uffff\u03f0"+
            "\33\21\uffff\ua7ff\33\u2100\uffff\u04d0\33\40\uffff\u020e\33",
            "",
            "",
            "\1\35",
            "\1\37",
            "",
            "",
            "",
            "\1\41\1\uffff\12\42\7\uffff\4\45\1\43\25\45\4\uffff\1\45\1"+
            "\uffff\4\45\1\43\25\45\74\uffff\1\46\10\uffff\27\46\1\uffff"+
            "\37\46\1\uffff\u0286\46\1\uffff\u1c81\46\14\uffff\2\46\61\uffff"+
            "\2\46\57\uffff\u0120\46\u0a70\uffff\u03f0\46\21\uffff\ua7ff"+
            "\46\u2100\uffff\u04d0\46\40\uffff\u020e\46",
            "\1\53\1\uffff\1\52\1\51\1\uffff\12\50\7\uffff\32\54\4\uffff"+
            "\1\54\1\uffff\32\54\74\uffff\1\55\10\uffff\27\55\1\uffff\37"+
            "\55\1\uffff\u0286\55\1\uffff\u1c81\55\14\uffff\2\55\61\uffff"+
            "\2\55\57\uffff\u0120\55\u0a70\uffff\u03f0\55\21\uffff\ua7ff"+
            "\55\u2100\uffff\u04d0\55\40\uffff\u020e\55",
            "\12\56",
            "",
            "",
            "\2\51\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54\74\uffff\1\55\10\uffff\27\55\1\uffff\37\55\1\uffff\u0286"+
            "\55\1\uffff\u1c81\55\14\uffff\2\55\61\uffff\2\55\57\uffff\u0120"+
            "\55\u0a70\uffff\u03f0\55\21\uffff\ua7ff\55\u2100\uffff\u04d0"+
            "\55\40\uffff\u020e\55",
            "\12\60\1\uffff\2\60\1\uffff\31\60\1\57\uffd8\60",
            "\12\62\1\uffff\2\62\1\uffff\24\62\1\61\uffdd\62",
            "",
            "",
            "",
            "\2\51\1\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55\74\uffff\1\55\10\uffff\27\55\1\uffff\37\55\1\uffff\u0286"+
            "\55\1\uffff\u1c81\55\14\uffff\2\55\61\uffff\2\55\57\uffff\u0120"+
            "\55\u0a70\uffff\u03f0\55\21\uffff\ua7ff\55\u2100\uffff\u04d0"+
            "\55\40\uffff\u020e\55",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45\74\uffff\1"+
            "\46\10\uffff\27\46\1\uffff\37\46\1\uffff\u0286\46\1\uffff\u1c81"+
            "\46\14\uffff\2\46\61\uffff\2\46\57\uffff\u0120\46\u0a70\uffff"+
            "\u03f0\46\21\uffff\ua7ff\46\u2100\uffff\u04d0\46\40\uffff\u020e"+
            "\46",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\63\13\uffff\1\64\37\uffff\1\64",
            "\1\41\1\uffff\12\42\7\uffff\4\45\1\43\25\45\4\uffff\1\45\1"+
            "\uffff\4\45\1\43\25\45\74\uffff\1\46\10\uffff\27\46\1\uffff"+
            "\37\46\1\uffff\u0286\46\1\uffff\u1c81\46\14\uffff\2\46\61\uffff"+
            "\2\46\57\uffff\u0120\46\u0a70\uffff\u03f0\46\21\uffff\ua7ff"+
            "\46\u2100\uffff\u04d0\46\40\uffff\u020e\46",
            "\1\64\1\uffff\1\64\2\uffff\12\66\7\uffff\32\45\4\uffff\1\45"+
            "\1\uffff\32\45\74\uffff\1\46\10\uffff\27\46\1\uffff\37\46\1"+
            "\uffff\u0286\46\1\uffff\u1c81\46\14\uffff\2\46\61\uffff\2\46"+
            "\57\uffff\u0120\46\u0a70\uffff\u03f0\46\21\uffff\ua7ff\46\u2100"+
            "\uffff\u04d0\46\40\uffff\u020e\46",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45\74\uffff\1"+
            "\46\10\uffff\27\46\1\uffff\37\46\1\uffff\u0286\46\1\uffff\u1c81"+
            "\46\14\uffff\2\46\61\uffff\2\46\57\uffff\u0120\46\u0a70\uffff"+
            "\u03f0\46\21\uffff\ua7ff\46\u2100\uffff\u04d0\46\40\uffff\u020e"+
            "\46",
            "",
            "",
            "\2\51\1\uffff\12\50\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54\74\uffff\1\55\10\uffff\27\55\1\uffff\37\55\1\uffff\u0286"+
            "\55\1\uffff\u1c81\55\14\uffff\2\55\61\uffff\2\55\57\uffff\u0120"+
            "\55\u0a70\uffff\u03f0\55\21\uffff\ua7ff\55\u2100\uffff\u04d0"+
            "\55\40\uffff\u020e\55",
            "",
            "\12\67",
            "",
            "\2\51\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54\74\uffff\1\55\10\uffff\27\55\1\uffff\37\55\1\uffff\u0286"+
            "\55\1\uffff\u1c81\55\14\uffff\2\55\61\uffff\2\55\57\uffff\u0120"+
            "\55\u0a70\uffff\u03f0\55\21\uffff\ua7ff\55\u2100\uffff\u04d0"+
            "\55\40\uffff\u020e\55",
            "\2\51\1\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55\74\uffff\1\55\10\uffff\27\55\1\uffff\37\55\1\uffff\u0286"+
            "\55\1\uffff\u1c81\55\14\uffff\2\55\61\uffff\2\55\57\uffff\u0120"+
            "\55\u0a70\uffff\u03f0\55\21\uffff\ua7ff\55\u2100\uffff\u04d0"+
            "\55\40\uffff\u020e\55",
            "\12\56\13\uffff\1\64\37\uffff\1\64",
            "\1\70",
            "",
            "\1\71",
            "",
            "\12\63\13\uffff\1\64\37\uffff\1\64",
            "",
            "",
            "\12\66\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45\74\uffff\1"+
            "\46\10\uffff\27\46\1\uffff\37\46\1\uffff\u0286\46\1\uffff\u1c81"+
            "\46\14\uffff\2\46\61\uffff\2\46\57\uffff\u0120\46\u0a70\uffff"+
            "\u03f0\46\21\uffff\ua7ff\46\u2100\uffff\u04d0\46\40\uffff\u020e"+
            "\46",
            "\2\51\1\uffff\12\67\7\uffff\32\51\4\uffff\1\51\1\uffff\32"+
            "\51\74\uffff\1\51\10\uffff\27\51\1\uffff\37\51\1\uffff\u0286"+
            "\51\1\uffff\u1c81\51\14\uffff\2\51\61\uffff\2\51\57\uffff\u0120"+
            "\51\u0a70\uffff\u03f0\51\21\uffff\ua7ff\51\u2100\uffff\u04d0"+
            "\51\40\uffff\u020e\51",
            "",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | VAR1 | VAR2 | INTEGER | FUNCTIONNAME | DECIMAL | DOUBLE | MULT | DIV | EXPONENT | STRING_LITERAL1 | STRING_LITERAL2 | STRING_LITERAL_LONG1 | STRING_LITERAL_LONG2 | MINUS | PLUS | ECHAR | VARNAME | WS | PN_PREFIX );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_20 = input.LA(1);

                        s = -1;
                        if ( (LA27_20=='\"') ) {s = 49;}

                        else if ( ((LA27_20>='\u0000' && LA27_20<='\t')||(LA27_20>='\u000B' && LA27_20<='\f')||(LA27_20>='\u000E' && LA27_20<='!')||(LA27_20>='#' && LA27_20<='\uFFFF')) ) {s = 50;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA27_19 = input.LA(1);

                        s = -1;
                        if ( (LA27_19=='\'') ) {s = 47;}

                        else if ( ((LA27_19>='\u0000' && LA27_19<='\t')||(LA27_19>='\u000B' && LA27_19<='\f')||(LA27_19>='\u000E' && LA27_19<='&')||(LA27_19>='(' && LA27_19<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}