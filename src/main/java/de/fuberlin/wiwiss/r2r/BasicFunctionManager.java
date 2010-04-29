package de.fuberlin.wiwiss.r2r;

import de.fuberlin.wiwiss.r2r.functions.*;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URLClassLoader;
import java.net.URL;

/**
 * An implementation of FunctionManager that has all built-in functions registered.
 * @author andreas
 *
 */
public class BasicFunctionManager implements FunctionManager {
	private Map<String, FunctionFactory> functions = new HashMap<String, FunctionFactory>();
	
	public BasicFunctionManager() {
		functions.put("infixConcat", new InfixConcatFunctionFactory());
		functions.put("concat", new ConcatFunctionFactory());
		functions.put("split", new SplitFunctionFactory());
		functions.put("infixListConcat", new InfixListConcatFunctionFactory());
		functions.put("list", new ListFunctionFactory());
		functions.put("subListByIndex", new SubListByIndexFunctionFactory());
		functions.put("regexToList", new RegExToListFunctionFactory());
		functions.put("identityFunction", new IdentityFunctionFactory());
		functions.put("add", new AddFunctionFactory());
		functions.put("subtract", new SubtractFunctionFactory());
		functions.put("divide", new DivideFunctionFactory());
		functions.put("multiply", new MultiplyFunctionFactory());
		functions.put("negate", new NegateFunctionFactory());
		functions.put("listConcat", new ListConcatFunctionFactory());
		functions.put("subList", new SubListFunctionFactory());
		functions.put("getByIndex", new GetByIndexFunctionFactory());
		functions.put("modulo", new ModuloFunctionFactory());
		functions.put("integer", new IntegerFunctionFactory());
	}
	
	public synchronized boolean containsFunctionByUri(String URI) {
		return functions.containsKey(URI);
	}

	public synchronized Function getFunctionByName(String name) {
		// not used
		return null;
	}

	public synchronized Function getFunctionByUri(String URI) {
		if(!functions.containsKey(URI))
			throw new IllegalArgumentException("No function found with URI/ID: " + URI);
		return functions.get(URI).getInstance();
	}

	public synchronized boolean registerFunctionFactory(String uri, FunctionFactory functionFactory) {
		if(functions.containsKey(uri))
			return false;
		functions.put(uri, functionFactory);
		return true;
	}
	
//	private FunctionFactory getFunctionFactory(String URI) throws MalformedURLException {
//		Catch 
//		URLClassLoader cl = new URLClassLoader(new URL[] {new URL(URI)} );
//		cl
//	}TODO
	
	private FunctionFactory loadFunctionFactory(String functionFactoryClass) throws IllegalAccessException, InstantiationException {
		try {
			return (FunctionFactory)Class.forName(functionFactoryClass).newInstance();
		} catch (InstantiationException e) {
			// No problem we can recover from => rethrow
			throw e;
		} catch (IllegalAccessException e) {
			// Class found, but can't be accessed => rethrow
			throw e;
		} catch (ClassNotFoundException e) {
			//Not found on class path, return null to signalize that FunctionFactory must be loaded from elsewhere
			return null;
		}
	}
}
