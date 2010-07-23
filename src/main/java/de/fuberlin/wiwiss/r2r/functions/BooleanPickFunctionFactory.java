package de.fuberlin.wiwiss.r2r.functions;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import de.fuberlin.wiwiss.r2r.Function;
import de.fuberlin.wiwiss.r2r.FunctionFactory;
import de.fuberlin.wiwiss.r2r.functions.HelperFunctions.DataType;

public class BooleanPickFunctionFactory implements FunctionFactory {
private BooleanPickFunction function = null;
	
	public Function getInstance() {
		if(function==null)
			function = new BooleanPickFunction();
		
		return function;
	}

	private static class BooleanPickFunction implements Function {

		public String getURI() {
			return "booleanPick";
		}
		
		public List<String> execute(List<List<String>> arguments, String hint) {
			if(arguments.size()<3)
				throw new IllegalArgumentException("booleanPick(): No arguments supplied!");
			
			boolean boolValue = arguments.get(0).get(0).equalsIgnoreCase("true");
			
			List<String> result = new ArrayList<String>();

			if(boolValue)
				result = arguments.get(1);
			else
				result = arguments.get(2);
			
			return result;
		}
	}
}
