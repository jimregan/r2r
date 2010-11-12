package de.fuberlin.wiwiss.r2r.functions;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import de.fuberlin.wiwiss.r2r.Function;

public class IterativeRegexToListFunctionTest {
	private Function itRegexToList;
	
	@Before
	public void init() {
		itRegexToList = (new IterateRegexToListFunctionFactory()).getInstance();
	}
	
	@Test
	public void regex1() {
		List<List<String>> argumentList = Helper.getArgumentLists("(\\d+)", "1, 2, 3, 4, 5");
		List<String> result = itRegexToList.execute(argumentList, null);
		assertEquals(5, result.size());
		assertEquals("1", result.get(0));
	}
}
