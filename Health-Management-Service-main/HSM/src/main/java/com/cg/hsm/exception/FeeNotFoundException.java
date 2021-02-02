package com.cg.hsm.exception;
/**
 * This class is an custom exception class to throw exception when any fee is not null in patient and doctor table
 * @author Samyuktha Sirangapu

 *
 */
public class FeeNotFoundException extends Exception{
	private static final long serialVersionUID = 1L;
	/**
	 * Create InsufficientExperienceException object without error message
	 */
	public FeeNotFoundException() {
		super();
	}
	/**
	 * Create InsufficientExperienceException object with error message
	 */
	public FeeNotFoundException(String errMsg){
		super(errMsg);
	}


}