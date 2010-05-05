package de.fuberlin.wiwiss.r2r;

import de.fuberlin.wiwiss.r2r.functions.*;

import java.net.MalformedURLException;
import java.util.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * An implementation of FunctionManager that has all built-in functions registered.
 * @author andreas
 *
 */
public class BasicFunctionManager implements FunctionManager {
	private static Log log = LogFactory.getLog(BasicFunctionManager.class);
	private Map<String, FunctionFactory> functions = new HashMap<String, FunctionFactory>();
	private FunctionFactoryLoader ffLoader = null;
	
	/**
	 * Only register built-in functions, not able to load external functions
	 */
	public BasicFunctionManager() {
		functions.put("join", new JoinFunctionFactory());
		functions.put("concat", new ConcatFunctionFactory());
		functions.put("split", new SplitFunctionFactory());
		functions.put("listJoin", new ListJoinFunctionFactory());
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
		functions.put("mod", new ModuloFunctionFactory());
		functions.put("integer", new IntegerFunctionFactory());
		
		// deprecated
		functions.put("infixConcat", new JoinFunctionFactory());
		functions.put("infixListConcat", new ListJoinFunctionFactory());
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
			return null;
		return functions.get(URI).getInstance();
	}

	public boolean registerFunctionFactory(String uri, FunctionFactory functionFactory) {
		// Cannot register new functions in this FunctionManager
		return false;
	}

}
