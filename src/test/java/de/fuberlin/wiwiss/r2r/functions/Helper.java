package de.fuberlin.wiwiss.r2r.functions;

import java.util.ArrayList;
import java.util.List;

public class Helper {
	protected static List<List<String>> getArgumentLists(String... args) {
		List<List<String>> argumentLists = new ArrayList<List<String>>();
		for(String arg: args) {
			List<String> a1 = new ArrayList<String>();
			a1.add(arg);
			argumentLists.add(a1);
		}

		return argumentLists;
	}
}
