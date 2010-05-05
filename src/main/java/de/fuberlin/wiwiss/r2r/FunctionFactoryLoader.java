package de.fuberlin.wiwiss.r2r;

import java.net.MalformedURLException;
import java.net.URLClassLoader;
import java.net.URL;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.hp.hpl.jena.rdf.model.*;
/**
 * Component to instantiate FunctionFactory-objects of not-yet registered Functions, which are referenced from a used mapping.
 * @author andreas
 *
 */
public class FunctionFactoryLoader {
	private Source repository;
	private static Log log = LogFactory.getLog(FunctionFactoryLoader.class);
	
	public FunctionFactoryLoader(Source functionRepository) {
		repository = functionRepository;
	}
	
	/**
	 * tries to instantiate an FunctionFactory object.
	 * It tries to load the class referenced by the TransformationFunction URI from the class path first.
	 * The it tries to load it from the code location.
	 * @param URI The URI of the TransformationFunction
	 * @return the FunctionFactory object described by the information found at the given URI or null.
	 * @throws MalformedURLException
	 */
	public FunctionFactory getFunctionFactory(String URI) throws MalformedURLException {
		FunctionFactory functionFactory = null;
		String codeLocation = null;
		String qualifiedClassName = null;
		String error = null;
		String query = "DESCRIBE <" + URI + ">";
		Model model = repository.executeDescribeQuery(query);
		if(model.isEmpty()) {
			if(log.isDebugEnabled())
				log.debug("External Function <" + URI + "> not found in repository.");
			return null;
		}
		Resource funcRes = model.getResource(URI);
		StmtIterator it = funcRes.listProperties(model.getProperty(R2R.qualifiedClassName));
		if(it.hasNext())
			qualifiedClassName = it.next().getString();
		else {
			if(log.isDebugEnabled())
				log.debug("External Function <" + URI +"> did not specify a qualified class name for loading!");
			return null;
		}
		try {	
			// First try to load from class path
			functionFactory = loadFunctionFactory(qualifiedClassName, ClassLoader.getSystemClassLoader());
			// If FunctionFactory has been loaded, return it
			if(functionFactory!=null)
				return functionFactory;
			
			// Now try the original code location
			it = funcRes.listProperties(model.getProperty(R2R.codeLocation));
			if(it.hasNext())
				codeLocation = it.next().getString();
			else {
				if(log.isDebugEnabled())
					log.debug("External Function <" + URI +"> could not be loaded from class path and did not specify any further code location!");
				return null;
			}
			
			URLClassLoader loader = new URLClassLoader(new URL[] { new URL(codeLocation) });
			functionFactory = loadFunctionFactory(qualifiedClassName, loader);
			if(functionFactory!=null)
				return functionFactory;
			else {
				if(log.isDebugEnabled())
					log.debug("External Function <" + URI + "> could not be loaded: class " + qualifiedClassName + " could not be loaded from " + codeLocation + ".");
				return null;
			}
		} catch(InstantiationException e) {
			error = e.toString();
		} catch(IllegalAccessException e) {
			error = e.toString();
		} catch(ClassCastException e) {
			error = e.toString();
		}
		if(error!=null && log.isDebugEnabled())
			log.debug("External Function <" + URI + "> could not be loaded: " + error);
		return functionFactory;
	}

	private FunctionFactory loadFunctionFactory(String functionFactoryClass, ClassLoader classLoader) throws InstantiationException, IllegalAccessException {
		try {
			return (FunctionFactory) classLoader.loadClass(functionFactoryClass).newInstance();
		} catch (ClassNotFoundException e) {
			// Not found, return null
			return null;
		}
	}
}
