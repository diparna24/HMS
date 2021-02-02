package com.cg.hsm.exception;
/**
 * This class is an custom exception class to throw exception when experience of a doctor does not match criteria
 * @author Pranjali Chaudhari
 *
 */

public class InsufficientExperienceException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Create InsufficientExperienceException object without error message
	 */
	public InsufficientExperienceException() {
		super();
	}
	/**
	 * Create InsufficientExperienceException object with error message
	 */
	public InsufficientExperienceException(String errMsg){
		super(errMsg);
	}
}
