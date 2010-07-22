// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g 2010-07-22 03:15:26

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
    public static final int WS=22;
    public static final int PN_CHARS_BASE=23;
    public static final int STRING_LITERAL_LONG2=17;
    public static final int DECIMAL=12;
    public static final int VAR1=8;
    public static final int VAR2=9;
    public static final int STRING_LITERAL_LONG1=16;
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
    // $ANTLR end "T__30"

    // $ANTLR start "VAR1"
    public final void mVAR1() throws RecognitionException {
        try {
            int _type = VAR1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:217:3: ( '?' VARNAME )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:217:5: '?' VARNAME
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
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:221:3: ( '$' VARNAME )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:221:5: '$' VARNAME
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
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:225:3: ( ( '0' .. '9' )+ )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:225:5: ( '0' .. '9' )+
            {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:225:5: ( '0' .. '9' )+
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
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:225:6: '0' .. '9'
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
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:229:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )+ )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:229:5: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )+
            {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:229:5: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )+
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
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:233:3: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ )
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
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:233:5: ( '0' .. '9' )+ '.' ( '0' .. '9' )*
                    {
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:233:5: ( '0' .. '9' )+
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
                    	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:233:6: '0' .. '9'
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
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:233:21: ( '0' .. '9' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:233:22: '0' .. '9'
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
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:233:35: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:233:39: ( '0' .. '9' )+
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
                    	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:233:40: '0' .. '9'
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
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:237:3: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* EXPONENT | '.' ( '0' .. '9' )+ EXPONENT | ( '0' .. '9' )+ EXPONENT )
            int alt11=3;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:237:5: ( '0' .. '9' )+ '.' ( '0' .. '9' )* EXPONENT
                    {
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:237:5: ( '0' .. '9' )+
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
                    	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:237:6: '0' .. '9'
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
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:237:21: ( '0' .. '9' )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:237:22: '0' .. '9'
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
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:238:5: '.' ( '0' .. '9' )+ EXPONENT
                    {
                    match('.'); 
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:238:9: ( '0' .. '9' )+
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
                    	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:238:10: '0' .. '9'
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
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:239:5: ( '0' .. '9' )+ EXPONENT
                    {
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:239:5: ( '0' .. '9' )+
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
                    	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:239:6: '0' .. '9'
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
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:243:3: ( '*' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:243:5: '*'
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
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:247:3: ( '/' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:247:5: '/'
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
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:275:3: ( ( 'e' | 'E' ) ( PLUS | MINUS )? ( '0' .. '9' )+ )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:275:5: ( 'e' | 'E' ) ( PLUS | MINUS )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:275:17: ( PLUS | MINUS )?
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

            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:275:33: ( '0' .. '9' )+
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
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:275:34: '0' .. '9'
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
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:279:3: ( '\\'' (~ ( '\\u0027' | '\\u005c' | '\\u000A' | '\\u000D' ) | ECHAR )* '\\'' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:279:5: '\\'' (~ ( '\\u0027' | '\\u005c' | '\\u000A' | '\\u000D' ) | ECHAR )* '\\''
            {
            match('\''); 
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:279:10: (~ ( '\\u0027' | '\\u005c' | '\\u000A' | '\\u000D' ) | ECHAR )*
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
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:279:11: ~ ( '\\u0027' | '\\u005c' | '\\u000A' | '\\u000D' )
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
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:279:58: ECHAR
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
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:283:3: ( '\"' (~ ( '\\u0022' | '\\u005c' | '\\u000A' | '\\u000D' ) | ECHAR )* '\"' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:283:5: '\"' (~ ( '\\u0022' | '\\u005c' | '\\u000A' | '\\u000D' ) | ECHAR )* '\"'
            {
            match('\"'); 
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:283:9: (~ ( '\\u0022' | '\\u005c' | '\\u000A' | '\\u000D' ) | ECHAR )*
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
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:283:10: ~ ( '\\u0022' | '\\u005c' | '\\u000A' | '\\u000D' )
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
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:283:57: ECHAR
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
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:287:3: ( '\\'\\'\\'' ( ( '\\'' | '\\'\\'' )? (~ ( '\\'' | '\\\\' ) | ECHAR ) )* '\\'\\'\\'' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:287:5: '\\'\\'\\'' ( ( '\\'' | '\\'\\'' )? (~ ( '\\'' | '\\\\' ) | ECHAR ) )* '\\'\\'\\''
            {
            match("'''"); 

            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:287:14: ( ( '\\'' | '\\'\\'' )? (~ ( '\\'' | '\\\\' ) | ECHAR ) )*
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
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:287:15: ( '\\'' | '\\'\\'' )? (~ ( '\\'' | '\\\\' ) | ECHAR )
            	    {
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:287:15: ( '\\'' | '\\'\\'' )?
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
            	            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:287:17: '\\''
            	            {
            	            match('\''); 

            	            }
            	            break;
            	        case 2 :
            	            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:287:24: '\\'\\''
            	            {
            	            match("''"); 


            	            }
            	            break;

            	    }

            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:287:33: (~ ( '\\'' | '\\\\' ) | ECHAR )
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
            	            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:287:34: ~ ( '\\'' | '\\\\' )
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
            	            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:287:51: ECHAR
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
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:291:3: ( '\"\"\"' ( ( '\"' | '\"\"' )? (~ ( '\"' | '\\\\' ) | ECHAR ) )* '\"\"\"' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:291:5: '\"\"\"' ( ( '\"' | '\"\"' )? (~ ( '\"' | '\\\\' ) | ECHAR ) )* '\"\"\"'
            {
            match("\"\"\""); 

            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:291:11: ( ( '\"' | '\"\"' )? (~ ( '\"' | '\\\\' ) | ECHAR ) )*
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
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:291:12: ( '\"' | '\"\"' )? (~ ( '\"' | '\\\\' ) | ECHAR )
            	    {
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:291:12: ( '\"' | '\"\"' )?
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
            	            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:291:14: '\"'
            	            {
            	            match('\"'); 

            	            }
            	            break;
            	        case 2 :
            	            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:291:20: '\"\"'
            	            {
            	            match("\"\""); 


            	            }
            	            break;

            	    }

            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:291:27: (~ ( '\"' | '\\\\' ) | ECHAR )
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
            	            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:291:28: ~ ( '\"' | '\\\\' )
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
            	            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:291:44: ECHAR
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
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:295:3: ( '-' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:295:5: '-'
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
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:299:3: ( '+' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:299:5: '+'
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
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:303:3: ( '\\\\' ( 't' | 'b' | 'n' | 'r' | 'f' | '\\\\' | '\"' | '\\'' ) )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:303:5: '\\\\' ( 't' | 'b' | 'n' | 'r' | 'f' | '\\\\' | '\"' | '\\'' )
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
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:307:3: ( ( PN_CHARS_U | '0' .. '9' ) ( PN_CHARS_U | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' )* )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:307:5: ( PN_CHARS_U | '0' .. '9' ) ( PN_CHARS_U | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' )*
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u02FF')||(input.LA(1)>='\u0370' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:307:29: ( PN_CHARS_U | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' )*
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
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:311:3: ( ( '\\u0020' | '\\u0009' | '\\u000D' | '\\u000A' ) )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:311:5: ( '\\u0020' | '\\u0009' | '\\u000D' | '\\u000A' )
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
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:315:3: ( PN_CHARS_BASE ( ( PN_CHARS | '.' )* PN_CHARS )? )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:315:5: PN_CHARS_BASE ( ( PN_CHARS | '.' )* PN_CHARS )?
            {
            mPN_CHARS_BASE(); 
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:315:19: ( ( PN_CHARS | '.' )* PN_CHARS )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>='-' && LA24_0<='.')||(LA24_0>='0' && LA24_0<='9')||(LA24_0>='A' && LA24_0<='Z')||LA24_0=='_'||(LA24_0>='a' && LA24_0<='z')||LA24_0=='\u00B7'||(LA24_0>='\u00C0' && LA24_0<='\u00D6')||(LA24_0>='\u00D8' && LA24_0<='\u00F6')||(LA24_0>='\u00F8' && LA24_0<='\u037D')||(LA24_0>='\u037F' && LA24_0<='\u1FFF')||(LA24_0>='\u200C' && LA24_0<='\u200D')||(LA24_0>='\u203F' && LA24_0<='\u2040')||(LA24_0>='\u2070' && LA24_0<='\u218F')||(LA24_0>='\u2C00' && LA24_0<='\u2FEF')||(LA24_0>='\u3001' && LA24_0<='\uD7FF')||(LA24_0>='\uF900' && LA24_0<='\uFDCF')||(LA24_0>='\uFDF0' && LA24_0<='\uFFFD')) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:315:20: ( PN_CHARS | '.' )* PN_CHARS
                    {
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:315:20: ( PN_CHARS | '.' )*
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
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:319:3: ( 'a' .. 'z' | 'A' .. 'Z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' )
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
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:335:3: ( PN_CHARS_BASE | '_' )
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
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:339:3: ( PN_CHARS_U | '-' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' )
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
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:348:3: ( ( PN_CHARS_U | '0' .. '9' ) ( ( PN_CHARS | '.' )* PN_CHARS )? )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:348:5: ( PN_CHARS_U | '0' .. '9' ) ( ( PN_CHARS | '.' )* PN_CHARS )?
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u02FF')||(input.LA(1)>='\u0370' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:348:29: ( ( PN_CHARS | '.' )* PN_CHARS )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>='-' && LA26_0<='.')||(LA26_0>='0' && LA26_0<='9')||(LA26_0>='A' && LA26_0<='Z')||LA26_0=='_'||(LA26_0>='a' && LA26_0<='z')||LA26_0=='\u00B7'||(LA26_0>='\u00C0' && LA26_0<='\u00D6')||(LA26_0>='\u00D8' && LA26_0<='\u00F6')||(LA26_0>='\u00F8' && LA26_0<='\u037D')||(LA26_0>='\u037F' && LA26_0<='\u1FFF')||(LA26_0>='\u200C' && LA26_0<='\u200D')||(LA26_0>='\u203F' && LA26_0<='\u2040')||(LA26_0>='\u2070' && LA26_0<='\u218F')||(LA26_0>='\u2C00' && LA26_0<='\u2FEF')||(LA26_0>='\u3001' && LA26_0<='\uD7FF')||(LA26_0>='\uF900' && LA26_0<='\uFDCF')||(LA26_0>='\uFDF0' && LA26_0<='\uFFFD')) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:348:30: ( PN_CHARS | '.' )* PN_CHARS
                    {
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:348:30: ( PN_CHARS | '.' )*
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
        // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:8: ( T__27 | T__28 | T__29 | T__30 | VAR1 | VAR2 | INTEGER | FUNCTIONNAME | DECIMAL | DOUBLE | MULT | DIV | EXPONENT | STRING_LITERAL1 | STRING_LITERAL2 | STRING_LITERAL_LONG1 | STRING_LITERAL_LONG2 | MINUS | PLUS | ECHAR | VARNAME | WS | PN_PREFIX )
        int alt27=23;
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
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:114: STRING_LITERAL2
                {
                mSTRING_LITERAL2(); 

                }
                break;
            case 16 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:130: STRING_LITERAL_LONG1
                {
                mSTRING_LITERAL_LONG1(); 

                }
                break;
            case 17 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:151: STRING_LITERAL_LONG2
                {
                mSTRING_LITERAL_LONG2(); 

                }
                break;
            case 18 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:172: MINUS
                {
                mMINUS(); 

                }
                break;
            case 19 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:178: PLUS
                {
                mPLUS(); 

                }
                break;
            case 20 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:183: ECHAR
                {
                mECHAR(); 

                }
                break;
            case 21 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:189: VARNAME
                {
                mVARNAME(); 

                }
                break;
            case 22 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:197: WS
                {
                mWS(); 

                }
                break;
            case 23 :
                // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:1:200: PN_PREFIX
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
            return "236:1: DOUBLE : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* EXPONENT | '.' ( '0' .. '9' )+ EXPONENT | ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA27_eotS =
        "\7\uffff\1\30\1\35\3\uffff\1\35\5\uffff\1\32\1\uffff\1\35\1\51"+
        "\1\30\1\35\1\uffff\1\35\1\uffff\1\41\1\35\1\uffff\1\35\1\32\2\uffff"+
        "\1\51\1\44\1\uffff\1\46\1\uffff\1\51\2\uffff\1\35\1\40\2\uffff";
    static final String DFA27_eofS =
        "\56\uffff";
    static final String DFA27_minS =
        "\1\11\6\uffff\1\56\1\53\1\60\2\uffff\1\55\2\0\3\uffff\1\55\1\uffff"+
        "\2\60\1\56\1\53\1\uffff\1\60\1\uffff\1\60\1\55\1\uffff\2\55\2\uffff"+
        "\1\60\1\47\1\uffff\1\42\1\uffff\1\60\2\uffff\1\60\1\55\2\uffff";
    static final String DFA27_maxS =
        "\1\ufffd\6\uffff\2\ufffd\1\71\2\uffff\1\ufffd\2\uffff\3\uffff\1"+
        "\ufffd\1\uffff\1\ufffd\1\145\2\ufffd\1\uffff\1\ufffd\1\uffff\1\71"+
        "\1\ufffd\1\uffff\2\ufffd\2\uffff\1\145\1\47\1\uffff\1\42\1\uffff"+
        "\1\145\2\uffff\2\ufffd\2\uffff";
    static final String DFA27_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\3\uffff\1\13\1\14\3\uffff\1\22"+
        "\1\23\1\24\1\uffff\1\26\4\uffff\1\7\1\uffff\1\25\2\uffff\1\10\2"+
        "\uffff\1\15\1\27\2\uffff\1\16\1\uffff\1\17\1\uffff\1\12\1\11\2\uffff"+
        "\1\20\1\21";
    static final String DFA27_specialS =
        "\15\uffff\1\1\1\0\37\uffff}>";
    static final String[] DFA27_transitionS = {
            "\2\23\2\uffff\1\23\22\uffff\1\23\1\uffff\1\16\1\uffff\1\6\2"+
            "\uffff\1\15\1\2\1\3\1\12\1\20\1\4\1\17\1\11\1\13\12\7\3\uffff"+
            "\1\1\1\uffff\1\5\1\uffff\4\14\1\10\25\14\1\uffff\1\21\2\uffff"+
            "\1\24\1\uffff\4\14\1\10\25\14\105\uffff\27\22\1\uffff\37\22"+
            "\1\uffff\u0208\22\160\uffff\16\22\1\uffff\u1c81\22\14\uffff"+
            "\2\22\142\uffff\u0120\22\u0a70\uffff\u03f0\22\21\uffff\ua7ff"+
            "\22\u2100\uffff\u04d0\22\40\uffff\u020e\22",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\25\1\uffff\12\26\7\uffff\4\31\1\27\25\31\4\uffff\1\31\1"+
            "\uffff\4\31\1\27\25\31\74\uffff\1\32\10\uffff\27\32\1\uffff"+
            "\37\32\1\uffff\u0286\32\1\uffff\u1c81\32\14\uffff\2\32\61\uffff"+
            "\2\32\57\uffff\u0120\32\u0a70\uffff\u03f0\32\21\uffff\ua7ff"+
            "\32\u2100\uffff\u04d0\32\40\uffff\u020e\32",
            "\1\40\1\uffff\1\33\1\41\1\uffff\12\34\7\uffff\32\36\4\uffff"+
            "\1\36\1\uffff\32\36\74\uffff\1\37\10\uffff\27\37\1\uffff\37"+
            "\37\1\uffff\u0286\37\1\uffff\u1c81\37\14\uffff\2\37\61\uffff"+
            "\2\37\57\uffff\u0120\37\u0a70\uffff\u03f0\37\21\uffff\ua7ff"+
            "\37\u2100\uffff\u04d0\37\40\uffff\u020e\37",
            "\12\42",
            "",
            "",
            "\2\41\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\37\10\uffff\27\37\1\uffff\37\37\1\uffff\u0286"+
            "\37\1\uffff\u1c81\37\14\uffff\2\37\61\uffff\2\37\57\uffff\u0120"+
            "\37\u0a70\uffff\u03f0\37\21\uffff\ua7ff\37\u2100\uffff\u04d0"+
            "\37\40\uffff\u020e\37",
            "\12\44\1\uffff\2\44\1\uffff\31\44\1\43\uffd8\44",
            "\12\46\1\uffff\2\46\1\uffff\24\46\1\45\uffdd\46",
            "",
            "",
            "",
            "\2\41\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37\74\uffff\1\37\10\uffff\27\37\1\uffff\37\37\1\uffff\u0286"+
            "\37\1\uffff\u1c81\37\14\uffff\2\37\61\uffff\2\37\57\uffff\u0120"+
            "\37\u0a70\uffff\u03f0\37\21\uffff\ua7ff\37\u2100\uffff\u04d0"+
            "\37\40\uffff\u020e\37",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31\74\uffff\1"+
            "\32\10\uffff\27\32\1\uffff\37\32\1\uffff\u0286\32\1\uffff\u1c81"+
            "\32\14\uffff\2\32\61\uffff\2\32\57\uffff\u0120\32\u0a70\uffff"+
            "\u03f0\32\21\uffff\ua7ff\32\u2100\uffff\u04d0\32\40\uffff\u020e"+
            "\32",
            "\12\47\13\uffff\1\50\37\uffff\1\50",
            "\1\25\1\uffff\12\26\7\uffff\4\31\1\27\25\31\4\uffff\1\31\1"+
            "\uffff\4\31\1\27\25\31\74\uffff\1\32\10\uffff\27\32\1\uffff"+
            "\37\32\1\uffff\u0286\32\1\uffff\u1c81\32\14\uffff\2\32\61\uffff"+
            "\2\32\57\uffff\u0120\32\u0a70\uffff\u03f0\32\21\uffff\ua7ff"+
            "\32\u2100\uffff\u04d0\32\40\uffff\u020e\32",
            "\1\50\1\uffff\1\50\2\uffff\12\52\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31\74\uffff\1\32\10\uffff\27\32\1\uffff\37\32\1"+
            "\uffff\u0286\32\1\uffff\u1c81\32\14\uffff\2\32\61\uffff\2\32"+
            "\57\uffff\u0120\32\u0a70\uffff\u03f0\32\21\uffff\ua7ff\32\u2100"+
            "\uffff\u04d0\32\40\uffff\u020e\32",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31\74\uffff\1"+
            "\32\10\uffff\27\32\1\uffff\37\32\1\uffff\u0286\32\1\uffff\u1c81"+
            "\32\14\uffff\2\32\61\uffff\2\32\57\uffff\u0120\32\u0a70\uffff"+
            "\u03f0\32\21\uffff\ua7ff\32\u2100\uffff\u04d0\32\40\uffff\u020e"+
            "\32",
            "",
            "\12\53",
            "\2\41\1\uffff\12\34\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\37\10\uffff\27\37\1\uffff\37\37\1\uffff\u0286"+
            "\37\1\uffff\u1c81\37\14\uffff\2\37\61\uffff\2\37\57\uffff\u0120"+
            "\37\u0a70\uffff\u03f0\37\21\uffff\ua7ff\37\u2100\uffff\u04d0"+
            "\37\40\uffff\u020e\37",
            "",
            "\2\41\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\37\10\uffff\27\37\1\uffff\37\37\1\uffff\u0286"+
            "\37\1\uffff\u1c81\37\14\uffff\2\37\61\uffff\2\37\57\uffff\u0120"+
            "\37\u0a70\uffff\u03f0\37\21\uffff\ua7ff\37\u2100\uffff\u04d0"+
            "\37\40\uffff\u020e\37",
            "\2\41\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37\74\uffff\1\37\10\uffff\27\37\1\uffff\37\37\1\uffff\u0286"+
            "\37\1\uffff\u1c81\37\14\uffff\2\37\61\uffff\2\37\57\uffff\u0120"+
            "\37\u0a70\uffff\u03f0\37\21\uffff\ua7ff\37\u2100\uffff\u04d0"+
            "\37\40\uffff\u020e\37",
            "",
            "",
            "\12\42\13\uffff\1\50\37\uffff\1\50",
            "\1\54",
            "",
            "\1\55",
            "",
            "\12\47\13\uffff\1\50\37\uffff\1\50",
            "",
            "",
            "\12\52\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31\74\uffff\1"+
            "\32\10\uffff\27\32\1\uffff\37\32\1\uffff\u0286\32\1\uffff\u1c81"+
            "\32\14\uffff\2\32\61\uffff\2\32\57\uffff\u0120\32\u0a70\uffff"+
            "\u03f0\32\21\uffff\ua7ff\32\u2100\uffff\u04d0\32\40\uffff\u020e"+
            "\32",
            "\2\41\1\uffff\12\53\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41\74\uffff\1\41\10\uffff\27\41\1\uffff\37\41\1\uffff\u0286"+
            "\41\1\uffff\u1c81\41\14\uffff\2\41\61\uffff\2\41\57\uffff\u0120"+
            "\41\u0a70\uffff\u03f0\41\21\uffff\ua7ff\41\u2100\uffff\u04d0"+
            "\41\40\uffff\u020e\41",
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
            return "1:1: Tokens : ( T__27 | T__28 | T__29 | T__30 | VAR1 | VAR2 | INTEGER | FUNCTIONNAME | DECIMAL | DOUBLE | MULT | DIV | EXPONENT | STRING_LITERAL1 | STRING_LITERAL2 | STRING_LITERAL_LONG1 | STRING_LITERAL_LONG2 | MINUS | PLUS | ECHAR | VARNAME | WS | PN_PREFIX );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_14 = input.LA(1);

                        s = -1;
                        if ( (LA27_14=='\"') ) {s = 37;}

                        else if ( ((LA27_14>='\u0000' && LA27_14<='\t')||(LA27_14>='\u000B' && LA27_14<='\f')||(LA27_14>='\u000E' && LA27_14<='!')||(LA27_14>='#' && LA27_14<='\uFFFF')) ) {s = 38;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA27_13 = input.LA(1);

                        s = -1;
                        if ( (LA27_13=='\'') ) {s = 35;}

                        else if ( ((LA27_13>='\u0000' && LA27_13<='\t')||(LA27_13>='\u000B' && LA27_13<='\f')||(LA27_13>='\u000E' && LA27_13<='&')||(LA27_13>='(' && LA27_13<='\uFFFF')) ) {s = 36;}

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