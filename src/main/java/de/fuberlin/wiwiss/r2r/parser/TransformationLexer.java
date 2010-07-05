// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g 2010-05-21 23:47:16

  package de.fuberlin.wiwiss.r2r.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class TransformationLexer extends Lexer {
    public static final int INTEGER=11;
    public static final int EXPONENT=17;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int PN_LOCAL=24;
    public static final int MINUS=5;
    public static final int MULT=6;
    public static final int EOF=-1;
    public static final int ECHAR=18;
    public static final int FUNCTIONNAME=10;
    public static final int VARNAME=16;
    public static final int WS=20;
    public static final int PN_CHARS_BASE=21;
    public static final int DECIMAL=12;
    public static final int VAR1=8;
    public static final int STRING_LITERAL_LONG1=15;
    public static final int VAR2=9;
    public static final int PN_PREFIX=23;
    public static final int STRING_LITERAL1=14;
    public static final int PN_CHARS=22;
    public static final int DOUBLE=13;
    public static final int PN_CHARS_U=19;
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

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
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
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
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
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
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
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:29:7: ( ',' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:29:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "VAR1"
    public final void mVAR1() throws RecognitionException {
        try {
            int _type = VAR1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:215:3: ( '?' VARNAME )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:215:5: '?' VARNAME
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
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:219:3: ( '$' VARNAME )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:219:5: '$' VARNAME
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
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:223:3: ( ( '0' .. '9' )+ )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:223:5: ( '0' .. '9' )+
            {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:223:5: ( '0' .. '9' )+
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
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:223:6: '0' .. '9'
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
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:227:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )+ )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:227:5: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )+
            {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:227:5: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )+
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
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:231:3: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ )
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
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:231:5: ( '0' .. '9' )+ '.' ( '0' .. '9' )*
                    {
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:231:5: ( '0' .. '9' )+
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
                    	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:231:6: '0' .. '9'
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
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:231:21: ( '0' .. '9' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:231:22: '0' .. '9'
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
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:231:35: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:231:39: ( '0' .. '9' )+
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
                    	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:231:40: '0' .. '9'
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
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:235:3: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* EXPONENT | '.' ( '0' .. '9' )+ EXPONENT | ( '0' .. '9' )+ EXPONENT )
            int alt11=3;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:235:5: ( '0' .. '9' )+ '.' ( '0' .. '9' )* EXPONENT
                    {
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:235:5: ( '0' .. '9' )+
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
                    	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:235:6: '0' .. '9'
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
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:235:21: ( '0' .. '9' )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:235:22: '0' .. '9'
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
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:236:5: '.' ( '0' .. '9' )+ EXPONENT
                    {
                    match('.'); 
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:236:9: ( '0' .. '9' )+
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
                    	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:236:10: '0' .. '9'
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
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:237:5: ( '0' .. '9' )+ EXPONENT
                    {
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:237:5: ( '0' .. '9' )+
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
                    	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:237:6: '0' .. '9'
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
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:241:3: ( '*' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:241:5: '*'
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
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:245:3: ( '/' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:245:5: '/'
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
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:273:3: ( ( 'e' | 'E' ) ( PLUS | MINUS )? ( '0' .. '9' )+ )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:273:5: ( 'e' | 'E' ) ( PLUS | MINUS )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:273:17: ( PLUS | MINUS )?
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

            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:273:33: ( '0' .. '9' )+
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
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:273:34: '0' .. '9'
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
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:277:3: ( '\\'' (~ ( '\\u0027' | '\\u005c' | '\\u000A' | '\\u000D' ) | ECHAR )* '\\'' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:277:5: '\\'' (~ ( '\\u0027' | '\\u005c' | '\\u000A' | '\\u000D' ) | ECHAR )* '\\''
            {
            match('\''); 
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:277:10: (~ ( '\\u0027' | '\\u005c' | '\\u000A' | '\\u000D' ) | ECHAR )*
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
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:277:11: ~ ( '\\u0027' | '\\u005c' | '\\u000A' | '\\u000D' )
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
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:277:58: ECHAR
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

    // $ANTLR start "STRING_LITERAL_LONG1"
    public final void mSTRING_LITERAL_LONG1() throws RecognitionException {
        try {
            int _type = STRING_LITERAL_LONG1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:281:3: ( '\\'\\'\\'' ( ( '\\'' | '\\'\\'' )? (~ ( '\\'' | '\\\\' ) | ECHAR ) )* '\\'\\'\\'' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:281:5: '\\'\\'\\'' ( ( '\\'' | '\\'\\'' )? (~ ( '\\'' | '\\\\' ) | ECHAR ) )* '\\'\\'\\''
            {
            match("'''"); 

            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:281:14: ( ( '\\'' | '\\'\\'' )? (~ ( '\\'' | '\\\\' ) | ECHAR ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='\'') ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1=='\'') ) {
                        int LA17_3 = input.LA(3);

                        if ( ((LA17_3>='\u0000' && LA17_3<='&')||(LA17_3>='(' && LA17_3<='\uFFFF')) ) {
                            alt17=1;
                        }


                    }
                    else if ( ((LA17_1>='\u0000' && LA17_1<='&')||(LA17_1>='(' && LA17_1<='\uFFFF')) ) {
                        alt17=1;
                    }


                }
                else if ( ((LA17_0>='\u0000' && LA17_0<='&')||(LA17_0>='(' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:281:15: ( '\\'' | '\\'\\'' )? (~ ( '\\'' | '\\\\' ) | ECHAR )
            	    {
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:281:15: ( '\\'' | '\\'\\'' )?
            	    int alt15=3;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0=='\'') ) {
            	        int LA15_1 = input.LA(2);

            	        if ( (LA15_1=='\'') ) {
            	            alt15=2;
            	        }
            	        else if ( ((LA15_1>='\u0000' && LA15_1<='&')||(LA15_1>='(' && LA15_1<='\uFFFF')) ) {
            	            alt15=1;
            	        }
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:281:17: '\\''
            	            {
            	            match('\''); 

            	            }
            	            break;
            	        case 2 :
            	            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:281:24: '\\'\\''
            	            {
            	            match("''"); 


            	            }
            	            break;

            	    }

            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:281:33: (~ ( '\\'' | '\\\\' ) | ECHAR )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( ((LA16_0>='\u0000' && LA16_0<='&')||(LA16_0>='(' && LA16_0<='[')||(LA16_0>=']' && LA16_0<='\uFFFF')) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0=='\\') ) {
            	        alt16=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:281:34: ~ ( '\\'' | '\\\\' )
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
            	            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:281:51: ECHAR
            	            {
            	            mECHAR(); 

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
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

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:285:3: ( '-' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:285:5: '-'
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
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:289:3: ( '+' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:289:5: '+'
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
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:293:3: ( '\\\\' ( 't' | 'b' | 'n' | 'r' | 'f' | '\\\\' | '\"' | '\\'' ) )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:293:5: '\\\\' ( 't' | 'b' | 'n' | 'r' | 'f' | '\\\\' | '\"' | '\\'' )
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
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:297:3: ( ( PN_CHARS_U | '0' .. '9' ) ( PN_CHARS_U | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' )* )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:297:5: ( PN_CHARS_U | '0' .. '9' ) ( PN_CHARS_U | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' )*
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u02FF')||(input.LA(1)>='\u0370' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:297:29: ( PN_CHARS_U | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='0' && LA18_0<='9')||(LA18_0>='A' && LA18_0<='Z')||LA18_0=='_'||(LA18_0>='a' && LA18_0<='z')||LA18_0=='\u00B7'||(LA18_0>='\u00C0' && LA18_0<='\u00D6')||(LA18_0>='\u00D8' && LA18_0<='\u00F6')||(LA18_0>='\u00F8' && LA18_0<='\u037D')||(LA18_0>='\u037F' && LA18_0<='\u1FFF')||(LA18_0>='\u200C' && LA18_0<='\u200D')||(LA18_0>='\u203F' && LA18_0<='\u2040')||(LA18_0>='\u2070' && LA18_0<='\u218F')||(LA18_0>='\u2C00' && LA18_0<='\u2FEF')||(LA18_0>='\u3001' && LA18_0<='\uD7FF')||(LA18_0>='\uF900' && LA18_0<='\uFDCF')||(LA18_0>='\uFDF0' && LA18_0<='\uFFFD')) ) {
                    alt18=1;
                }


                switch (alt18) {
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
            	    break loop18;
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
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:301:3: ( ( '\\u0020' | '\\u0009' | '\\u000D' | '\\u000A' ) )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:301:5: ( '\\u0020' | '\\u0009' | '\\u000D' | '\\u000A' )
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
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:305:3: ( PN_CHARS_BASE ( ( PN_CHARS | '.' )* PN_CHARS )? )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:305:5: PN_CHARS_BASE ( ( PN_CHARS | '.' )* PN_CHARS )?
            {
            mPN_CHARS_BASE(); 
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:305:19: ( ( PN_CHARS | '.' )* PN_CHARS )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>='-' && LA20_0<='.')||(LA20_0>='0' && LA20_0<='9')||(LA20_0>='A' && LA20_0<='Z')||LA20_0=='_'||(LA20_0>='a' && LA20_0<='z')||LA20_0=='\u00B7'||(LA20_0>='\u00C0' && LA20_0<='\u00D6')||(LA20_0>='\u00D8' && LA20_0<='\u00F6')||(LA20_0>='\u00F8' && LA20_0<='\u037D')||(LA20_0>='\u037F' && LA20_0<='\u1FFF')||(LA20_0>='\u200C' && LA20_0<='\u200D')||(LA20_0>='\u203F' && LA20_0<='\u2040')||(LA20_0>='\u2070' && LA20_0<='\u218F')||(LA20_0>='\u2C00' && LA20_0<='\u2FEF')||(LA20_0>='\u3001' && LA20_0<='\uD7FF')||(LA20_0>='\uF900' && LA20_0<='\uFDCF')||(LA20_0>='\uFDF0' && LA20_0<='\uFFFD')) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:305:20: ( PN_CHARS | '.' )* PN_CHARS
                    {
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:305:20: ( PN_CHARS | '.' )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0=='-'||(LA19_0>='0' && LA19_0<='9')||(LA19_0>='A' && LA19_0<='Z')||LA19_0=='_'||(LA19_0>='a' && LA19_0<='z')||LA19_0=='\u00B7'||(LA19_0>='\u00C0' && LA19_0<='\u00D6')||(LA19_0>='\u00D8' && LA19_0<='\u00F6')||(LA19_0>='\u00F8' && LA19_0<='\u037D')||(LA19_0>='\u037F' && LA19_0<='\u1FFF')||(LA19_0>='\u200C' && LA19_0<='\u200D')||(LA19_0>='\u203F' && LA19_0<='\u2040')||(LA19_0>='\u2070' && LA19_0<='\u218F')||(LA19_0>='\u2C00' && LA19_0<='\u2FEF')||(LA19_0>='\u3001' && LA19_0<='\uD7FF')||(LA19_0>='\uF900' && LA19_0<='\uFDCF')||(LA19_0>='\uFDF0' && LA19_0<='\uFFFD')) ) {
                            int LA19_1 = input.LA(2);

                            if ( ((LA19_1>='-' && LA19_1<='.')||(LA19_1>='0' && LA19_1<='9')||(LA19_1>='A' && LA19_1<='Z')||LA19_1=='_'||(LA19_1>='a' && LA19_1<='z')||LA19_1=='\u00B7'||(LA19_1>='\u00C0' && LA19_1<='\u00D6')||(LA19_1>='\u00D8' && LA19_1<='\u00F6')||(LA19_1>='\u00F8' && LA19_1<='\u037D')||(LA19_1>='\u037F' && LA19_1<='\u1FFF')||(LA19_1>='\u200C' && LA19_1<='\u200D')||(LA19_1>='\u203F' && LA19_1<='\u2040')||(LA19_1>='\u2070' && LA19_1<='\u218F')||(LA19_1>='\u2C00' && LA19_1<='\u2FEF')||(LA19_1>='\u3001' && LA19_1<='\uD7FF')||(LA19_1>='\uF900' && LA19_1<='\uFDCF')||(LA19_1>='\uFDF0' && LA19_1<='\uFFFD')) ) {
                                alt19=1;
                            }


                        }
                        else if ( (LA19_0=='.') ) {
                            alt19=1;
                        }


                        switch (alt19) {
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
                    	    break loop19;
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
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:309:3: ( 'a' .. 'z' | 'A' .. 'Z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' )
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
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:325:3: ( PN_CHARS_BASE | '_' )
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
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:329:3: ( PN_CHARS_U | '-' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' )
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
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:338:3: ( ( PN_CHARS_U | '0' .. '9' ) ( ( PN_CHARS | '.' )* PN_CHARS )? )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:338:5: ( PN_CHARS_U | '0' .. '9' ) ( ( PN_CHARS | '.' )* PN_CHARS )?
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u02FF')||(input.LA(1)>='\u0370' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:338:29: ( ( PN_CHARS | '.' )* PN_CHARS )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>='-' && LA22_0<='.')||(LA22_0>='0' && LA22_0<='9')||(LA22_0>='A' && LA22_0<='Z')||LA22_0=='_'||(LA22_0>='a' && LA22_0<='z')||LA22_0=='\u00B7'||(LA22_0>='\u00C0' && LA22_0<='\u00D6')||(LA22_0>='\u00D8' && LA22_0<='\u00F6')||(LA22_0>='\u00F8' && LA22_0<='\u037D')||(LA22_0>='\u037F' && LA22_0<='\u1FFF')||(LA22_0>='\u200C' && LA22_0<='\u200D')||(LA22_0>='\u203F' && LA22_0<='\u2040')||(LA22_0>='\u2070' && LA22_0<='\u218F')||(LA22_0>='\u2C00' && LA22_0<='\u2FEF')||(LA22_0>='\u3001' && LA22_0<='\uD7FF')||(LA22_0>='\uF900' && LA22_0<='\uFDCF')||(LA22_0>='\uFDF0' && LA22_0<='\uFFFD')) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:338:30: ( PN_CHARS | '.' )* PN_CHARS
                    {
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:338:30: ( PN_CHARS | '.' )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0=='-'||(LA21_0>='0' && LA21_0<='9')||(LA21_0>='A' && LA21_0<='Z')||LA21_0=='_'||(LA21_0>='a' && LA21_0<='z')||LA21_0=='\u00B7'||(LA21_0>='\u00C0' && LA21_0<='\u00D6')||(LA21_0>='\u00D8' && LA21_0<='\u00F6')||(LA21_0>='\u00F8' && LA21_0<='\u037D')||(LA21_0>='\u037F' && LA21_0<='\u1FFF')||(LA21_0>='\u200C' && LA21_0<='\u200D')||(LA21_0>='\u203F' && LA21_0<='\u2040')||(LA21_0>='\u2070' && LA21_0<='\u218F')||(LA21_0>='\u2C00' && LA21_0<='\u2FEF')||(LA21_0>='\u3001' && LA21_0<='\uD7FF')||(LA21_0>='\uF900' && LA21_0<='\uFDCF')||(LA21_0>='\uFDF0' && LA21_0<='\uFFFD')) ) {
                            int LA21_1 = input.LA(2);

                            if ( ((LA21_1>='-' && LA21_1<='.')||(LA21_1>='0' && LA21_1<='9')||(LA21_1>='A' && LA21_1<='Z')||LA21_1=='_'||(LA21_1>='a' && LA21_1<='z')||LA21_1=='\u00B7'||(LA21_1>='\u00C0' && LA21_1<='\u00D6')||(LA21_1>='\u00D8' && LA21_1<='\u00F6')||(LA21_1>='\u00F8' && LA21_1<='\u037D')||(LA21_1>='\u037F' && LA21_1<='\u1FFF')||(LA21_1>='\u200C' && LA21_1<='\u200D')||(LA21_1>='\u203F' && LA21_1<='\u2040')||(LA21_1>='\u2070' && LA21_1<='\u218F')||(LA21_1>='\u2C00' && LA21_1<='\u2FEF')||(LA21_1>='\u3001' && LA21_1<='\uD7FF')||(LA21_1>='\uF900' && LA21_1<='\uFDCF')||(LA21_1>='\uFDF0' && LA21_1<='\uFFFD')) ) {
                                alt21=1;
                            }


                        }
                        else if ( (LA21_0=='.') ) {
                            alt21=1;
                        }


                        switch (alt21) {
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
                    	    break loop21;
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
        // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:8: ( T__25 | T__26 | T__27 | T__28 | VAR1 | VAR2 | INTEGER | FUNCTIONNAME | DECIMAL | DOUBLE | MULT | DIV | EXPONENT | STRING_LITERAL1 | STRING_LITERAL_LONG1 | MINUS | PLUS | ECHAR | VARNAME | WS | PN_PREFIX )
        int alt23=21;
        alt23 = dfa23.predict(input);
        switch (alt23) {
            case 1 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:10: T__25
                {
                mT__25(); 

                }
                break;
            case 2 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:16: T__26
                {
                mT__26(); 

                }
                break;
            case 3 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:22: T__27
                {
                mT__27(); 

                }
                break;
            case 4 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:28: T__28
                {
                mT__28(); 

                }
                break;
            case 5 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:34: VAR1
                {
                mVAR1(); 

                }
                break;
            case 6 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:39: VAR2
                {
                mVAR2(); 

                }
                break;
            case 7 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:44: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 8 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:52: FUNCTIONNAME
                {
                mFUNCTIONNAME(); 

                }
                break;
            case 9 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:65: DECIMAL
                {
                mDECIMAL(); 

                }
                break;
            case 10 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:73: DOUBLE
                {
                mDOUBLE(); 

                }
                break;
            case 11 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:80: MULT
                {
                mMULT(); 

                }
                break;
            case 12 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:85: DIV
                {
                mDIV(); 

                }
                break;
            case 13 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:89: EXPONENT
                {
                mEXPONENT(); 

                }
                break;
            case 14 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:98: STRING_LITERAL1
                {
                mSTRING_LITERAL1(); 

                }
                break;
            case 15 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:114: STRING_LITERAL_LONG1
                {
                mSTRING_LITERAL_LONG1(); 

                }
                break;
            case 16 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:135: MINUS
                {
                mMINUS(); 

                }
                break;
            case 17 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:141: PLUS
                {
                mPLUS(); 

                }
                break;
            case 18 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:146: ECHAR
                {
                mECHAR(); 

                }
                break;
            case 19 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:152: VARNAME
                {
                mVARNAME(); 

                }
                break;
            case 20 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:160: WS
                {
                mWS(); 

                }
                break;
            case 21 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:163: PN_PREFIX
                {
                mPN_PREFIX(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    protected DFA23 dfa23 = new DFA23(this);
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
            return "234:1: DOUBLE : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* EXPONENT | '.' ( '0' .. '9' )+ EXPONENT | ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA23_eotS =
        "\7\uffff\1\25\1\32\3\uffff\1\32\4\uffff\1\31\1\uffff\1\32\1\25"+
        "\1\uffff\1\46\2\32\2\uffff\1\32\1\uffff\1\34\1\uffff\1\32\1\31\1"+
        "\46\1\43\1\uffff\1\46\2\uffff\1\32\1\36\1\uffff";
    static final String DFA23_eofS =
        "\52\uffff";
    static final String DFA23_minS =
        "\1\11\6\uffff\1\56\1\53\1\60\2\uffff\1\55\1\0\3\uffff\1\55\1\uffff"+
        "\1\60\1\56\1\uffff\1\60\1\53\1\60\2\uffff\1\55\1\uffff\1\60\1\uffff"+
        "\2\55\1\60\1\47\1\uffff\1\60\2\uffff\1\60\1\55\1\uffff";
    static final String DFA23_maxS =
        "\1\ufffd\6\uffff\2\ufffd\1\71\2\uffff\1\ufffd\1\uffff\3\uffff\1"+
        "\ufffd\1\uffff\2\ufffd\1\uffff\1\145\2\ufffd\2\uffff\1\ufffd\1\uffff"+
        "\1\71\1\uffff\2\ufffd\1\145\1\47\1\uffff\1\145\2\uffff\2\ufffd\1"+
        "\uffff";
    static final String DFA23_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\3\uffff\1\13\1\14\2\uffff\1\20"+
        "\1\21\1\22\1\uffff\1\24\2\uffff\1\7\3\uffff\1\23\1\10\1\uffff\1"+
        "\25\1\uffff\1\15\4\uffff\1\16\1\uffff\1\12\1\11\2\uffff\1\17";
    static final String DFA23_specialS =
        "\15\uffff\1\0\34\uffff}>";
    static final String[] DFA23_transitionS = {
            "\2\22\2\uffff\1\22\22\uffff\1\22\3\uffff\1\6\2\uffff\1\15\1"+
            "\2\1\3\1\12\1\17\1\4\1\16\1\11\1\13\12\7\3\uffff\1\1\1\uffff"+
            "\1\5\1\uffff\4\14\1\10\25\14\1\uffff\1\20\2\uffff\1\23\1\uffff"+
            "\4\14\1\10\25\14\105\uffff\27\21\1\uffff\37\21\1\uffff\u0208"+
            "\21\160\uffff\16\21\1\uffff\u1c81\21\14\uffff\2\21\142\uffff"+
            "\u0120\21\u0a70\uffff\u03f0\21\21\uffff\ua7ff\21\u2100\uffff"+
            "\u04d0\21\40\uffff\u020e\21",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\26\1\uffff\12\24\7\uffff\4\30\1\27\25\30\4\uffff\1\30\1"+
            "\uffff\4\30\1\27\25\30\74\uffff\1\31\10\uffff\27\31\1\uffff"+
            "\37\31\1\uffff\u0286\31\1\uffff\u1c81\31\14\uffff\2\31\61\uffff"+
            "\2\31\57\uffff\u0120\31\u0a70\uffff\u03f0\31\21\uffff\ua7ff"+
            "\31\u2100\uffff\u04d0\31\40\uffff\u020e\31",
            "\1\36\1\uffff\1\35\1\34\1\uffff\12\33\7\uffff\32\37\4\uffff"+
            "\1\37\1\uffff\32\37\74\uffff\1\40\10\uffff\27\40\1\uffff\37"+
            "\40\1\uffff\u0286\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff"+
            "\2\40\57\uffff\u0120\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff"+
            "\40\u2100\uffff\u04d0\40\40\uffff\u020e\40",
            "\12\41",
            "",
            "",
            "\2\34\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\12\43\1\uffff\2\43\1\uffff\31\43\1\42\uffd8\43",
            "",
            "",
            "",
            "\2\34\1\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30\74\uffff\1"+
            "\31\10\uffff\27\31\1\uffff\37\31\1\uffff\u0286\31\1\uffff\u1c81"+
            "\31\14\uffff\2\31\61\uffff\2\31\57\uffff\u0120\31\u0a70\uffff"+
            "\u03f0\31\21\uffff\ua7ff\31\u2100\uffff\u04d0\31\40\uffff\u020e"+
            "\31",
            "\1\26\1\uffff\12\24\7\uffff\4\30\1\27\25\30\4\uffff\1\30\1"+
            "\uffff\4\30\1\27\25\30\74\uffff\1\31\10\uffff\27\31\1\uffff"+
            "\37\31\1\uffff\u0286\31\1\uffff\u1c81\31\14\uffff\2\31\61\uffff"+
            "\2\31\57\uffff\u0120\31\u0a70\uffff\u03f0\31\21\uffff\ua7ff"+
            "\31\u2100\uffff\u04d0\31\40\uffff\u020e\31",
            "",
            "\12\44\13\uffff\1\45\37\uffff\1\45",
            "\1\45\1\uffff\1\45\2\uffff\12\47\7\uffff\32\30\4\uffff\1\30"+
            "\1\uffff\32\30\74\uffff\1\31\10\uffff\27\31\1\uffff\37\31\1"+
            "\uffff\u0286\31\1\uffff\u1c81\31\14\uffff\2\31\61\uffff\2\31"+
            "\57\uffff\u0120\31\u0a70\uffff\u03f0\31\21\uffff\ua7ff\31\u2100"+
            "\uffff\u04d0\31\40\uffff\u020e\31",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30\74\uffff\1"+
            "\31\10\uffff\27\31\1\uffff\37\31\1\uffff\u0286\31\1\uffff\u1c81"+
            "\31\14\uffff\2\31\61\uffff\2\31\57\uffff\u0120\31\u0a70\uffff"+
            "\u03f0\31\21\uffff\ua7ff\31\u2100\uffff\u04d0\31\40\uffff\u020e"+
            "\31",
            "",
            "",
            "\2\34\1\uffff\12\33\7\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "",
            "\12\50",
            "",
            "\2\34\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\2\34\1\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\12\41\13\uffff\1\45\37\uffff\1\45",
            "\1\51",
            "",
            "\12\44\13\uffff\1\45\37\uffff\1\45",
            "",
            "",
            "\12\47\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30\74\uffff\1"+
            "\31\10\uffff\27\31\1\uffff\37\31\1\uffff\u0286\31\1\uffff\u1c81"+
            "\31\14\uffff\2\31\61\uffff\2\31\57\uffff\u0120\31\u0a70\uffff"+
            "\u03f0\31\21\uffff\ua7ff\31\u2100\uffff\u04d0\31\40\uffff\u020e"+
            "\31",
            "\2\34\1\uffff\12\50\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34\74\uffff\1\34\10\uffff\27\34\1\uffff\37\34\1\uffff\u0286"+
            "\34\1\uffff\u1c81\34\14\uffff\2\34\61\uffff\2\34\57\uffff\u0120"+
            "\34\u0a70\uffff\u03f0\34\21\uffff\ua7ff\34\u2100\uffff\u04d0"+
            "\34\40\uffff\u020e\34",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__25 | T__26 | T__27 | T__28 | VAR1 | VAR2 | INTEGER | FUNCTIONNAME | DECIMAL | DOUBLE | MULT | DIV | EXPONENT | STRING_LITERAL1 | STRING_LITERAL_LONG1 | MINUS | PLUS | ECHAR | VARNAME | WS | PN_PREFIX );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_13 = input.LA(1);

                        s = -1;
                        if ( (LA23_13=='\'') ) {s = 34;}

                        else if ( ((LA23_13>='\u0000' && LA23_13<='\t')||(LA23_13>='\u000B' && LA23_13<='\f')||(LA23_13>='\u000E' && LA23_13<='&')||(LA23_13>='(' && LA23_13<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}