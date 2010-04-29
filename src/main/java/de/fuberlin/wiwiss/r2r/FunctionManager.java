package de.fuberlin.wiwiss.r2r;

/**
 * An Interface for the function manager component. A FunctionManager handles the built-in and externally loaded functions. 
 * @author andreas
 *
 */
public interface FunctionManager {
	public Function getFunctionByName(String name);

	/*
	 * This method returns a function object of a external function by URI. 
	 */
	public Function getFunctionByUri(String URI);
	
	/*
	 * Checks if a certain function identified by its URI has been registered.
	 */
	public boolean containsFunctionByUri(String URI);
	
	/*
	 * Registers a function factory
	 */
	public boolean registerFunctionFactory(String URI, FunctionFactory functionFactory);
}
