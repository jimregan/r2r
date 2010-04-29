package de.fuberlin.wiwiss.r2r.functions;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import de.fuberlin.wiwiss.r2r.Function;
import de.fuberlin.wiwiss.r2r.FunctionFactory;
import de.fuberlin.wiwiss.r2r.functions.HelperFunctions.DataType;

public class IntegerFunctionFactory implements FunctionFactory {
private IntegerFunction function = null;
	
	public Function getInstance() {
		if(function==null)
			function = new IntegerFunction();
		
		return function;
	}

	private class IntegerFunction implements Function {

		public String getURI() {
			return "integer";
		}
		
		public List<String> execute(List<List<String>> arguments, String hint) {
			if(arguments.size()<1)
				throw new IllegalArgumentException("integer(): No arguments supplied!");
			
			List<String> arg = arguments.get(0);
			List<String> result = new ArrayList<String>();
			DataType type = HelperFunctions.getDataTypeInformationOfArgument(arg);
			
			if(type==DataType.String)
				throw new IllegalArgumentException("Non-numerical argument for integer-function");
			else {
				BigInteger integerResult = new BigDecimal(arg.get(0)).toBigInteger();
				result.add(integerResult.toString());
			}
			
			return result;
		}
	}
}
