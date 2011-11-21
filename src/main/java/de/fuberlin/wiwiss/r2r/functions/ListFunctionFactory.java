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

import de.fuberlin.wiwiss.r2r.Function;
import de.fuberlin.wiwiss.r2r.FunctionFactory;

public class ListFunctionFactory implements FunctionFactory {
	private ListFunction function = null;
	
	public Function getInstance() {
		if(function==null)
			function = new ListFunction();
		
		return function;
	}

	private class ListFunction implements Function {

		public String getURI() {
			return "list";
		}
		
		public List<String> execute(List<List<String>> arguments, String hint) {
			List<String> list = new ArrayList<String>();
			
			for(List<String> argumentlist: arguments) {
				for(String argument: argumentlist) {
					list.add(argument);
				}
			}
			return list;
		}	
	}
}
