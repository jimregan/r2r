package de.fuberlin.wiwiss.r2r;

/**
 * An interface that specifies a generator for URIs. This is used to assign converted mappings a URI. 
 * @author andreas
 *
 */
public interface StringGenerator {
	public String nextString(); 
}
