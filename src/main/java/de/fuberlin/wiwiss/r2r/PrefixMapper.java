package de.fuberlin.wiwiss.r2r;

import java.util.HashMap;
import java.util.Map;

public class PrefixMapper {
	private Map<String, String> map;
	
	public PrefixMapper() {
		map = new HashMap<String, String>();
	}
	
	public synchronized void registerPrefix(String prefix, String namespace) {
		map.put(prefix, namespace);
	}
	
	public synchronized String resolvePrefix(String prefix) {
		return map.get(prefix);
	}
}
