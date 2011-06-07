package de.fuberlin.wiwiss.r2r.functions;

import de.fuberlin.wiwiss.r2r.Function;
import de.fuberlin.wiwiss.r2r.FunctionFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: andreas
 * Date: 07.06.11
 * Time: 18:11
 * To change this template use File | Settings | File Templates.
 */
public class StringLengthFunctionFactory implements FunctionFactory {
    private Function function = null;

		public Function getInstance() {
			if(function==null)
				function = new LengthFunction();

			return function;
		}

		private static class LengthFunction implements Function {

			public String getURI() {
				return "strlen";
			}

			public List<String> execute(List<List<String>> arguments, String hint) {
				if(arguments.size()<1 || arguments.get(0).size()<1)
					throw new IllegalArgumentException("strlen(): No argument supplied!");

				String arg = arguments.get(0).get(0);
				List<String> result = new ArrayList<String>();
				result.add("" + arg.length());

				return result;
			}
		}

}
