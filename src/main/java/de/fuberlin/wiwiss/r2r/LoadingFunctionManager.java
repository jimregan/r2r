package de.fuberlin.wiwiss.r2r;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * a FunctionManager that tries to load Functions from the class path or from a URL.
 * The load informations are taken from a Source repository.
 * @author andreas
 *
 */
public class LoadingFunctionManager implements FunctionManager {
	private static Log log = LogFactory.getLog(LoadingFunctionManager.class);
	private Map<String, FunctionFactory> functions = new HashMap<String, FunctionFactory>();
	private FunctionFactoryLoader ffLoader;
	private static FunctionManager basicFunctions = new BasicFunctionManager();
	
	public LoadingFunctionManager(Source functionInfoRepository) {
		ffLoader = new FunctionFactoryLoader(functionInfoRepository);
	}
	
	public synchronized boolean containsFunctionByUri(String URI) {
		return functions.containsKey(URI) || basicFunctions.containsFunctionByUri(URI);
	}

	public Function getFunctionByUri(String URI) {
		if(basicFunctions.containsFunctionByUri(URI))
			return basicFunctions.getFunctionByUri(URI);
		
		// Try to load function if not present in this manager
		if(!functions.containsKey(URI)) {
			if(ffLoader==null)
				throw new IllegalArgumentException("No function found with URI/ID: " + URI);
			else {
				try {
					FunctionFactory ff = ffLoader.getFunctionFactory(URI);
					if(ff!=null) {
						synchronized (functions) {
							if(functions.containsKey(URI))
								functions.put(URI, ff);
						}
					}
					else 
						return null;// Could not load Function
				} catch(MalformedURLException e) {
					if(log.isDebugEnabled())
						log.debug("TransformationFunction <" + URI + "> could not be loaded: " + e.toString());
					if(Config.rethrowActivated())
						throw new R2RException("TransformationFunction <" + URI + "> could not be loaded: " + e.toString(), e);
					return null;
				}
			}
		}
		FunctionFactory factory = functions.get(URI);
		if (factory instanceof MultiFunctionFactory) {
			return ((MultiFunctionFactory) factory).getInstance(URI);
		}
		return functions.get(URI).getInstance();
	}

	public synchronized boolean registerFunctionFactory(String uri, FunctionFactory functionFactory) {
		synchronized (functions) {
			if(functions.containsKey(uri))
				return false;
			functions.put(uri, functionFactory);
		}
		return true;
	}

}
