package de.fuberlin.wiwiss.r2r.functions;

import java.util.ArrayList;
import java.util.List;

import java.math.BigInteger;
import java.math.BigDecimal;
import java.math.RoundingMode;

import de.fuberlin.wiwiss.r2r.Function;
import de.fuberlin.wiwiss.r2r.FunctionFactory;
import de.fuberlin.wiwiss.r2r.functions.HelperFunctions.DataType;

public class DivideFunctionFactory implements FunctionFactory {
private DivideFunction function = null;
	
	public Function getInstance() {
		if(function==null)
			function = new DivideFunction();
		
		return function;
	}

	private class DivideFunction implements Function {

		public String getURI() {
			return "divide";
		}
		
		public List<String> execute(List<List<String>> arguments, String hint) {
			if(arguments.size()<1)
				throw new IllegalArgumentException("Divide: No arguments supplied!");
			
			List<String> result = new ArrayList<String>();
			DataType type = HelperFunctions.getDataTypeInformationOfAllArguments(arguments);
			type = HelperFunctions.takeMostAppropriateDataTypeForDivideLikeCalculations(type, hint);
			
			boolean first = true; // Check for first argument
			// returned type is either String for fail, Decimal or Double (conversion happens later in the process)
			if(type==DataType.String)
				throw new IllegalArgumentException("Non-numerical argument for divide-function");
			else if(type==DataType.Decimal) {
				BigDecimal decimalResult = null;
				int scale = 0;
				for(List<String> argument: arguments)
					if(first) {
						decimalResult = new BigDecimal(argument.get(0));
						scale = Math.max(decimalResult.scale(), 6);// This is used for integral types
						first = false;
					}
					else
						decimalResult = decimalResult.divide(new BigDecimal(argument.get(0)), scale, RoundingMode.HALF_DOWN);
				result.add(decimalResult.toString());
			} else if(type==DataType.Double) {
				Double doubleResult = 0.0;
				for(List<String> argument: arguments)
					if(first) {
						first = false;
						doubleResult = Double.parseDouble(argument.get(0));
					}
					else
						doubleResult /= Double.parseDouble(argument.get(0));
				result.add(doubleResult.toString());
			}

			return result;
		}
	}
}
