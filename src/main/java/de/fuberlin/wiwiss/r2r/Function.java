package de.fuberlin.wiwiss.r2r;

import java.util.List;

/**
 * Interface of functions that can be used in R2R transformation expressions.
 * @author andreas
 *
 */
public interface Function {
	/**
	 * Executes the function on a list of arguments, each represented by a list of Strings. 
	 * @param arguments
	 * @param datatypeHint
	 * @return The result list. If the function only returns one value, this will be a one element list.
	 * @throws IllegalArgumentException
	 */
	public List<String> execute(List<List<String>> arguments, String datatypeHint) throws IllegalArgumentException;
	
	/**
	 * get the URI of the function
	 * @return The URI of the function
	 */
	public String getURI();
}
