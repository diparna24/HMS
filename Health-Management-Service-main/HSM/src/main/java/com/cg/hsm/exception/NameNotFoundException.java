package com.cg.hsm.exception;
/**
 * This class is an custom exception class to throw exception when particular name is not found 
 * @author jyothi
 *
 */
public class NameNotFoundException extends Exception{
	private static final long serialVersionUID = 1L;
	/**
	 * Create NameNotFoundException object without error message
	 */
	public NameNotFoundException() {
		super();
	}
	
	/**
	 * Create NameNotFoundException object with error message
	 */
	public NameNotFoundException(String errMsg) {
		super(errMsg);
	}
}