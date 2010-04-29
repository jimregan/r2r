package de.fuberlin.wiwiss.r2r;

import java.util.ResourceBundle;
import java.util.*;

/**
 * Config handles configuration parameters from the r2r property file from the class path.
 * @author andreas
 *
 */
public class Config {
	static private Properties properties = new Properties();
	
	static {
		try {
			ResourceBundle rb = ResourceBundle.getBundle("r2r"); 
			for(String key: rb.keySet())
				properties.setProperty(key, rb.getString(key));
		} catch(MissingResourceException e) {
			// TODO: log and fill with default values
			
		}
	}
	
	static public String getProperty(String key) {
		return properties.getProperty(key); 
	}
	
	static public String getProperty(String key, String defaultValue) {
		String value = getProperty(key);
		return value!=null ? value : defaultValue; 
	}
}