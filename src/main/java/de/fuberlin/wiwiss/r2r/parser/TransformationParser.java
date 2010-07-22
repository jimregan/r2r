// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g 2010-07-22 03:15:25

  package de.fuberlin.wiwiss.r2r.parser;
  
  import de.fuberlin.wiwiss.r2r.*;
  import java.util.List;
  import java.util.ArrayList;
  import java.util.Set;
  import java.util.HashSet;
  import java.util.Collections;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class TransformationParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PLUS", "MINUS", "MULT", "DIV", "VAR1", "VAR2", "FUNCTIONNAME", "INTEGER", "DECIMAL", "DOUBLE", "STRING_LITERAL1", "STRING_LITERAL2", "STRING_LITERAL_LONG1", "STRING_LITERAL_LONG2", "VARNAME", "EXPONENT", "ECHAR", "PN_CHARS_U", "WS", "PN_CHARS_BASE", "PN_CHARS", "PN_PREFIX", "PN_LOCAL", "'='", "'('", "')'", "','"
    };
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
    public static final int STRING_LITERAL_LONG1=16;
    public static final int VAR2=9;
    public static final int PN_PREFIX=25;
    public static final int STRING_LITERAL2=15;
    public static final int STRING_LITERAL1=14;
    public static final int PN_CHARS=24;
    public static final int DOUBLE=13;
    public static final int PN_CHARS_U=21;
    public static final int PLUS=4;
    public static final int DIV=7;

    // delegates
    // delegators


        public TransformationParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public TransformationParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return TransformationParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g"; }


      FunctionManager funcManager;
      FunctionMapper funcMapper=new FunctionMapper();
      Set<String> variables = new HashSet<String>();
      boolean targetVariableParsed = false;
      
      public void setFunctionManager(FunctionManager fm) {
        funcManager = fm;
      }
      
      public void setFunctionMapping(FunctionMapper fm) {
        funcMapper = fm;
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
      
      private FunctionExecution createFunctionExecution(String functionName, Argument... args) {
        List<Argument> arguments = new ArrayList<Argument>();
        for(Argument arg: args)
          arguments.add(arg);
        String uri = funcMapper.getFunctionUri(functionName);
        Function function = funcManager.getFunctionByUri(uri);
        if(function==null)
          throw new ParseException("Function Manager could not find/load Function <" + uri + ">");
        return new FunctionExecution(function, Collections.unmodifiableList(arguments));
      }


    public static class transform_return extends ParserRuleReturnScope {
        public String variable;
        public FunctionExecution funcExec;
        public Set<String> variableDependencies;
    };

    // $ANTLR start "transform"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:78:1: transform returns [String variable, FunctionExecution funcExec, Set<String> variableDependencies] : v= variable '=' expression EOF ;
    public final TransformationParser.transform_return transform() throws RecognitionException {
        TransformationParser.transform_return retval = new TransformationParser.transform_return();
        retval.start = input.LT(1);

        TransformationParser.variable_return v = null;

        Argument expression1 = null;


        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:79:3: (v= variable '=' expression EOF )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:79:5: v= variable '=' expression EOF
            {
            pushFollow(FOLLOW_variable_in_transform62);
            v=variable();

            state._fsp--;

            match(input,27,FOLLOW_27_in_transform64); 
            pushFollow(FOLLOW_expression_in_transform66);
            expression1=expression();

            state._fsp--;

            match(input,EOF,FOLLOW_EOF_in_transform68); 

                  String var = (v!=null?input.toString(v.start,v.stop):null);
                  retval.variable = var.substring(1);
                  Argument argument = expression1;
                  if(argument instanceof FunctionExecution)
                    retval.funcExec = (FunctionExecution) argument;
                  else {
                    retval.funcExec = createFunctionExecution("identityFunction", argument);
                  }
                  retval.variableDependencies = variables;
                

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
    // $ANTLR end "transform"


    // $ANTLR start "expression"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:94:1: expression returns [Argument value] : m= mult ( ( PLUS | MINUS ) m= mult )* ;
    public final Argument expression() throws RecognitionException {
        Argument value = null;

        Argument m = null;


        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:95:3: (m= mult ( ( PLUS | MINUS ) m= mult )* )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:95:5: m= mult ( ( PLUS | MINUS ) m= mult )*
            {
            pushFollow(FOLLOW_mult_in_expression94);
            m=mult();

            state._fsp--;

             value = m; String operation = null;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:96:4: ( ( PLUS | MINUS ) m= mult )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=PLUS && LA2_0<=MINUS)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:96:5: ( PLUS | MINUS ) m= mult
            	    {
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:96:5: ( PLUS | MINUS )
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==PLUS) ) {
            	        alt1=1;
            	    }
            	    else if ( (LA1_0==MINUS) ) {
            	        alt1=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:96:7: PLUS
            	            {
            	            match(input,PLUS,FOLLOW_PLUS_in_expression104); 
            	            operation = "add"; 

            	            }
            	            break;
            	        case 2 :
            	            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:97:7: MINUS
            	            {
            	            match(input,MINUS,FOLLOW_MINUS_in_expression114); 
            	            operation = "subtract"; 

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_mult_in_expression126);
            	    m=mult();

            	    state._fsp--;

            	     
            	                      value = createFunctionExecution(operation, value, m);
            	                    

            	    }
            	    break;

            	default :
            	    break loop2;
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
        return value;
    }
    // $ANTLR end "expression"


    // $ANTLR start "mult"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:104:1: mult returns [Argument value] : u= unary ( ( MULT | DIV ) u= unary )* ;
    public final Argument mult() throws RecognitionException {
        Argument value = null;

        Argument u = null;


        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:105:3: (u= unary ( ( MULT | DIV ) u= unary )* )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:105:5: u= unary ( ( MULT | DIV ) u= unary )*
            {
            pushFollow(FOLLOW_unary_in_mult159);
            u=unary();

            state._fsp--;

             value = u; String operation = null;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:106:4: ( ( MULT | DIV ) u= unary )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=MULT && LA4_0<=DIV)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:106:5: ( MULT | DIV ) u= unary
            	    {
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:106:5: ( MULT | DIV )
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==MULT) ) {
            	        alt3=1;
            	    }
            	    else if ( (LA3_0==DIV) ) {
            	        alt3=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:106:7: MULT
            	            {
            	            match(input,MULT,FOLLOW_MULT_in_mult169); 
            	             operation = "multiply"; 

            	            }
            	            break;
            	        case 2 :
            	            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:107:7: DIV
            	            {
            	            match(input,DIV,FOLLOW_DIV_in_mult181); 
            	             operation = "divide"; 

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_unary_in_mult193);
            	    u=unary();

            	    state._fsp--;


            	                    value = createFunctionExecution(operation, value, u);
            	                  

            	    }
            	    break;

            	default :
            	    break loop4;
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
        return value;
    }
    // $ANTLR end "mult"


    // $ANTLR start "unary"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:114:1: unary returns [Argument value] : ( ( MINUS | PLUS ) )* term ;
    public final Argument unary() throws RecognitionException {
        Argument value = null;

        Argument term2 = null;


        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:115:3: ( ( ( MINUS | PLUS ) )* term )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:115:5: ( ( MINUS | PLUS ) )* term
            {
            boolean negative = false;
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:116:3: ( ( MINUS | PLUS ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=PLUS && LA6_0<=MINUS)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:116:5: ( MINUS | PLUS )
            	    {
            	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:116:5: ( MINUS | PLUS )
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==MINUS) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==PLUS) ) {
            	        alt5=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:116:6: MINUS
            	            {
            	            match(input,MINUS,FOLLOW_MINUS_in_unary228); 
            	             negative = !negative; 

            	            }
            	            break;
            	        case 2 :
            	            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:117:5: PLUS
            	            {
            	            match(input,PLUS,FOLLOW_PLUS_in_unary236); 

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            pushFollow(FOLLOW_term_in_unary244);
            term2=term();

            state._fsp--;

             if(negative)
                          value = createFunctionExecution("negate", term2);
                        else
                          value = term2;
                      

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
    // $ANTLR end "unary"


    // $ANTLR start "term"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:125:1: term returns [Argument value] : ( function | variable | integer | decimal | doubleVal | string | '(' expression ')' );
    public final Argument term() throws RecognitionException {
        Argument value = null;

        FunctionExecution function3 = null;

        TransformationParser.variable_return variable4 = null;

        TransformationParser.integer_return integer5 = null;

        TransformationParser.decimal_return decimal6 = null;

        TransformationParser.doubleVal_return doubleVal7 = null;

        String string8 = null;

        Argument expression9 = null;


        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:126:3: ( function | variable | integer | decimal | doubleVal | string | '(' expression ')' )
            int alt7=7;
            switch ( input.LA(1) ) {
            case FUNCTIONNAME:
                {
                alt7=1;
                }
                break;
            case VAR1:
            case VAR2:
                {
                alt7=2;
                }
                break;
            case INTEGER:
                {
                alt7=3;
                }
                break;
            case DECIMAL:
                {
                alt7=4;
                }
                break;
            case DOUBLE:
                {
                alt7=5;
                }
                break;
            case STRING_LITERAL1:
            case STRING_LITERAL2:
            case STRING_LITERAL_LONG1:
            case STRING_LITERAL_LONG2:
                {
                alt7=6;
                }
                break;
            case 28:
                {
                alt7=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:126:5: function
                    {
                    pushFollow(FOLLOW_function_in_term265);
                    function3=function();

                    state._fsp--;

                     value = function3; 

                    }
                    break;
                case 2 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:127:5: variable
                    {
                    pushFollow(FOLLOW_variable_in_term273);
                    variable4=variable();

                    state._fsp--;

                     
                          String varName = (variable4!=null?input.toString(variable4.start,variable4.stop):null);
                          value = new VariableArgument(varName.substring(1));
                        

                    }
                    break;
                case 3 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:132:5: integer
                    {
                    pushFollow(FOLLOW_integer_in_term285);
                    integer5=integer();

                    state._fsp--;

                     value = new ConstantArgument(ConstantType.INTEGER, (integer5!=null?input.toString(integer5.start,integer5.stop):null)); 

                    }
                    break;
                case 4 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:133:5: decimal
                    {
                    pushFollow(FOLLOW_decimal_in_term293);
                    decimal6=decimal();

                    state._fsp--;

                     value = new ConstantArgument(ConstantType.DECIMAL, (decimal6!=null?input.toString(decimal6.start,decimal6.stop):null)); 

                    }
                    break;
                case 5 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:134:5: doubleVal
                    {
                    pushFollow(FOLLOW_doubleVal_in_term301);
                    doubleVal7=doubleVal();

                    state._fsp--;

                     value = new ConstantArgument(ConstantType.DOUBLE, (doubleVal7!=null?input.toString(doubleVal7.start,doubleVal7.stop):null)); 

                    }
                    break;
                case 6 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:135:5: string
                    {
                    pushFollow(FOLLOW_string_in_term309);
                    string8=string();

                    state._fsp--;


                          value = new ConstantArgument(ConstantType.STRING, string8);
                        

                    }
                    break;
                case 7 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:139:5: '(' expression ')'
                    {
                    match(input,28,FOLLOW_28_in_term321); 
                    pushFollow(FOLLOW_expression_in_term323);
                    expression9=expression();

                    state._fsp--;

                    match(input,29,FOLLOW_29_in_term325); 
                     value = expression9; 

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
    // $ANTLR end "term"

    public static class variable_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "variable"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:143:1: variable : (v= VAR1 | v= VAR2 );
    public final TransformationParser.variable_return variable() throws RecognitionException {
        TransformationParser.variable_return retval = new TransformationParser.variable_return();
        retval.start = input.LT(1);

        Token v=null;

        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:144:3: (v= VAR1 | v= VAR2 )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==VAR1) ) {
                alt8=1;
            }
            else if ( (LA8_0==VAR2) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:144:5: v= VAR1
                    {
                    v=(Token)match(input,VAR1,FOLLOW_VAR1_in_variable347); 

                          if(targetVariableParsed) {
                            String varName = (v!=null?v.getText():null);
                            variables.add(varName.substring(1));
                          }
                          else
                            targetVariableParsed = true; 
                        

                    }
                    break;
                case 2 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:153:5: v= VAR2
                    {
                    v=(Token)match(input,VAR2,FOLLOW_VAR2_in_variable361); 

                          if(targetVariableParsed) {
                            String varName = (v!=null?v.getText():null);
                            variables.add(varName.substring(1));
                          }
                          else
                            targetVariableParsed = true; 
                        

                    }
                    break;

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
    // $ANTLR end "variable"


    // $ANTLR start "function"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:164:1: function returns [FunctionExecution funcExec] : FUNCTIONNAME '(' (a= expression ( ',' a= expression )* )? ')' ;
    public final FunctionExecution function() throws RecognitionException {
        FunctionExecution funcExec = null;

        Token FUNCTIONNAME10=null;
        Argument a = null;


        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:165:3: ( FUNCTIONNAME '(' (a= expression ( ',' a= expression )* )? ')' )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:165:5: FUNCTIONNAME '(' (a= expression ( ',' a= expression )* )? ')'
            {
            FUNCTIONNAME10=(Token)match(input,FUNCTIONNAME,FOLLOW_FUNCTIONNAME_in_function386); 
             
                  List<Argument> arguments = new ArrayList<Argument>();
                  String fname = (FUNCTIONNAME10!=null?FUNCTIONNAME10.getText():null);
                  String uri = funcMapper.getFunctionUri(fname);
                  Function function = funcManager.getFunctionByUri(uri);
                  if(function==null)
                    throw new ParseException("Function Manager could not find/load Function <" + uri + ">");
                
            match(input,28,FOLLOW_28_in_function398); 
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:175:8: (a= expression ( ',' a= expression )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=PLUS && LA10_0<=MINUS)||(LA10_0>=VAR1 && LA10_0<=STRING_LITERAL_LONG2)||LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:175:9: a= expression ( ',' a= expression )*
                    {
                    pushFollow(FOLLOW_expression_in_function411);
                    a=expression();

                    state._fsp--;

                     arguments.add(a); 
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:176:11: ( ',' a= expression )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==30) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:176:12: ',' a= expression
                    	    {
                    	    match(input,30,FOLLOW_30_in_function426); 
                    	    pushFollow(FOLLOW_expression_in_function430);
                    	    a=expression();

                    	    state._fsp--;

                    	     arguments.add(a);

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,29,FOLLOW_29_in_function450); 
             funcExec = new FunctionExecution(function, Collections.unmodifiableList(arguments));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return funcExec;
    }
    // $ANTLR end "function"

    public static class integer_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "integer"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:193:1: integer : INTEGER ;
    public final TransformationParser.integer_return integer() throws RecognitionException {
        TransformationParser.integer_return retval = new TransformationParser.integer_return();
        retval.start = input.LT(1);

        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:194:3: ( INTEGER )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:194:5: INTEGER
            {
            match(input,INTEGER,FOLLOW_INTEGER_in_integer479); 

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
    // $ANTLR end "integer"

    public static class decimal_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "decimal"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:197:1: decimal : DECIMAL ;
    public final TransformationParser.decimal_return decimal() throws RecognitionException {
        TransformationParser.decimal_return retval = new TransformationParser.decimal_return();
        retval.start = input.LT(1);

        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:198:3: ( DECIMAL )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:198:5: DECIMAL
            {
            match(input,DECIMAL,FOLLOW_DECIMAL_in_decimal493); 

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
    // $ANTLR end "decimal"

    public static class doubleVal_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "doubleVal"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:201:1: doubleVal : DOUBLE ;
    public final TransformationParser.doubleVal_return doubleVal() throws RecognitionException {
        TransformationParser.doubleVal_return retval = new TransformationParser.doubleVal_return();
        retval.start = input.LT(1);

        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:202:3: ( DOUBLE )
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:202:5: DOUBLE
            {
            match(input,DOUBLE,FOLLOW_DOUBLE_in_doubleVal508); 

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
    // $ANTLR end "doubleVal"


    // $ANTLR start "string"
    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:205:2: string returns [String value] : (s= STRING_LITERAL1 | s= STRING_LITERAL2 | s= STRING_LITERAL_LONG1 | s= STRING_LITERAL_LONG2 );
    public final String string() throws RecognitionException {
        String value = null;

        Token s=null;

        try {
            // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:206:4: (s= STRING_LITERAL1 | s= STRING_LITERAL2 | s= STRING_LITERAL_LONG1 | s= STRING_LITERAL_LONG2 )
            int alt11=4;
            switch ( input.LA(1) ) {
            case STRING_LITERAL1:
                {
                alt11=1;
                }
                break;
            case STRING_LITERAL2:
                {
                alt11=2;
                }
                break;
            case STRING_LITERAL_LONG1:
                {
                alt11=3;
                }
                break;
            case STRING_LITERAL_LONG2:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:206:6: s= STRING_LITERAL1
                    {
                    s=(Token)match(input,STRING_LITERAL1,FOLLOW_STRING_LITERAL1_in_string529); 
                     String temp = (s!=null?s.getText():null); value = temp.substring(1, temp.length() - 1); 

                    }
                    break;
                case 2 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:207:6: s= STRING_LITERAL2
                    {
                    s=(Token)match(input,STRING_LITERAL2,FOLLOW_STRING_LITERAL2_in_string540); 
                     String temp = (s!=null?s.getText():null); value = temp.substring(1, temp.length() - 1); 

                    }
                    break;
                case 3 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:208:6: s= STRING_LITERAL_LONG1
                    {
                    s=(Token)match(input,STRING_LITERAL_LONG1,FOLLOW_STRING_LITERAL_LONG1_in_string551); 
                     String temp = (s!=null?s.getText():null); value = temp.substring(3, temp.length() - 3); 

                    }
                    break;
                case 4 :
                    // D:\\code\\DA\\dev\\mapping\\trunk\\r2rApi\\antlr-files\\Transformation.g:209:6: s= STRING_LITERAL_LONG2
                    {
                    s=(Token)match(input,STRING_LITERAL_LONG2,FOLLOW_STRING_LITERAL_LONG2_in_string562); 
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

    // Delegated rules


 

    public static final BitSet FOLLOW_variable_in_transform62 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_transform64 = new BitSet(new long[]{0x000000001003FF30L});
    public static final BitSet FOLLOW_expression_in_transform66 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_transform68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mult_in_expression94 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_PLUS_in_expression104 = new BitSet(new long[]{0x000000001003FF30L});
    public static final BitSet FOLLOW_MINUS_in_expression114 = new BitSet(new long[]{0x000000001003FF30L});
    public static final BitSet FOLLOW_mult_in_expression126 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_unary_in_mult159 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_MULT_in_mult169 = new BitSet(new long[]{0x000000001003FF30L});
    public static final BitSet FOLLOW_DIV_in_mult181 = new BitSet(new long[]{0x000000001003FF30L});
    public static final BitSet FOLLOW_unary_in_mult193 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_MINUS_in_unary228 = new BitSet(new long[]{0x000000001003FF30L});
    public static final BitSet FOLLOW_PLUS_in_unary236 = new BitSet(new long[]{0x000000001003FF30L});
    public static final BitSet FOLLOW_term_in_unary244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_term265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_term273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_in_term285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decimal_in_term293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleVal_in_term301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_term309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_term321 = new BitSet(new long[]{0x000000001003FF30L});
    public static final BitSet FOLLOW_expression_in_term323 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_term325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR1_in_variable347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR2_in_variable361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTIONNAME_in_function386 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_function398 = new BitSet(new long[]{0x000000003003FF30L});
    public static final BitSet FOLLOW_expression_in_function411 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_30_in_function426 = new BitSet(new long[]{0x000000001003FF30L});
    public static final BitSet FOLLOW_expression_in_function430 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_29_in_function450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_integer479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECIMAL_in_decimal493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_doubleVal508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL1_in_string529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL2_in_string540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_LONG1_in_string551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_LONG2_in_string562 = new BitSet(new long[]{0x0000000000000002L});

}