package de.fuberlin.wiwiss.r2r.functions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Helper {
	public static List<List<String>> getArgumentLists(String... args) {
		List<List<String>> argumentLists = new ArrayList<List<String>>();
		for (String arg : args) {
			if (arg != null) {
				List<String> a1 = new ArrayList<String>();
				a1.add(arg);
				argumentLists.add(a1);
			} else {
				argumentLists.add(Collections.EMPTY_LIST);
			}
		}

		return argumentLists;
	}
}
