package de.fuberlin.wiwiss.r2r;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * A factory which is able to create multiple functions.
 * 
 * @author maggi
 * 
 */
public abstract class MultiFunctionFactory implements FunctionFactory {

	protected Map<String, Function> functions;

	public Function getInstance() {
		return null;
	}

	public MultiFunctionFactory() {
		this.functions = new HashMap<String, Function>();
	}

	/**
	 * Returns a function instance by name.
	 * 
	 * @param name
	 * @return the function of <code>null</code> if there is no function for
	 *         this name.
	 */
	public Function getInstance(String name) {
		return functions.get(name);
	}

	/**
	 * Lists all functions this factory provides.
	 */
	public Collection<Function> listFunctions() {
		return Collections.unmodifiableCollection(functions.values());
	}
}
