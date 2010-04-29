package de.fuberlin.wiwiss.r2r;

import java.math.BigInteger;

public class EnumeratingURIGenerator implements StringGenerator {
	private BigInteger nr;
	private String baseuri;
	
	public BigInteger getNr() {
		return nr;
	}

	public String getBaseuri() {
		return baseuri;
	}

	/**
	 * 
	 * @param uri a String/URI which is used as the prefix
	 * @param start the integer to start with. This will be increased by one every time nextURI() is called.
	 */
	public EnumeratingURIGenerator(String uri, BigInteger start) {
		this.baseuri = uri;
		this.nr = start;
	}
	
	/**
	 * Generate URIs by using uri as prefix and appending numbers starting with 1
	 * @param uri a String/URI which is used as the prefix
	 */
	public EnumeratingURIGenerator(String uri) {
		this.baseuri = uri;
		this.nr = BigInteger.ONE;
	}
	
	/**
	 * return the next generated URI
	 */
	public String nextString() {
		BigInteger old = null;
		synchronized(this) {
			old = nr;
			nr = old.add(BigInteger.ONE);
		}
		
		return baseuri + old.toString();
	}

}
