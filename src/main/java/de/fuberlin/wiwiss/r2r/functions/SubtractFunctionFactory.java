/*
 *  R2R
 *
 *  Copyright 2010-2011 Freie Universität Berlin
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package de.fuberlin.wiwiss.r2r.functions;

import java.util.ArrayList;
import java.util.List;

import java.math.BigInteger;
import java.math.BigDecimal;

import de.fuberlin.wiwiss.r2r.Function;
import de.fuberlin.wiwiss.r2r.FunctionFactory;
import de.fuberlin.wiwiss.r2r.functions.HelperFunctions.DataType;

public class SubtractFunctionFactory implements FunctionFactory {
private SubtractFunction function = null;
	
	public Function getInstance() {
		if(function==null)
			function = new SubtractFunction();
		
		return function;
	}

	private static class SubtractFunction implements Function {

		public String getURI() {
			return "subtract";
		}
		
		public List<String> execute(List<List<String>> arguments, String hint) {
			if(arguments.size()<1)
				throw new IllegalArgumentException("Not enough arguments!");
			
			List<String> result = new ArrayList<String>();
			DataType type = HelperFunctions.getDataTypeInformationOfAllArguments(arguments);
			type = HelperFunctions.takeMostAppropriateDataTypeForAddLikeCalculations(type, hint);
			
			boolean first = true;// check for the first argument
			if(type==DataType.String)
				throw new IllegalArgumentException("Non-numerical argument for subtract-function");
			if(type==DataType.Integer) {
				BigInteger intResult = null;
				for(List<String> argument: arguments)
					if(first) {
						intResult = new BigInteger(argument.get(0));
						first = false;
					}
					else
						intResult = intResult.subtract(new BigInteger(argument.get(0)));
				result.add(intResult.toString());
			} else if(type==DataType.Int) {
				Integer intResult = null;
				for(List<String> argument: arguments)
					if(first) {
						intResult = Integer.parseInt(argument.get(0));
						first = false;
					} else
						intResult -= Integer.parseInt(argument.get(0));
				result.add(intResult.toString());
			} else if(type==DataType.Long) {
				Long longResult = null;
				for(List<String> argument: arguments)
					if(first) {
						longResult = Long.parseLong(argument.get(0));
						first = false;
					}
					else
						longResult -= Long.parseLong(argument.get(0));
				result.add(longResult.toString());
			} else if(type==DataType.Decimal) {
				BigDecimal decimalResult = null;
				for(List<String> argument: arguments)
					if(first) {
						first = false;
						decimalResult = new BigDecimal(argument.get(0));
					}
					else
						decimalResult = decimalResult.subtract(new BigDecimal(argument.get(0)));
				result.add(decimalResult.toString());
			} else if(type==DataType.Double) {
				Double doubleResult = 0.0;
				for(List<String> argument: arguments)
					if(first) {
						doubleResult = Double.parseDouble(argument.get(0));
						first = false;
					}
					else
						doubleResult -= Double.parseDouble(argument.get(0));
				result.add(doubleResult.toString());
			}
			
			return result;
		}
	}
}
