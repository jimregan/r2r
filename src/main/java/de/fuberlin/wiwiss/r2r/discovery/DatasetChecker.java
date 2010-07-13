package de.fuberlin.wiwiss.r2r.discovery;

public interface DatasetChecker {
	public boolean containsProperty(String uri);
	
	public boolean containsClass(String uri);
	
	public boolean containsTargetElement(String uri);
}
