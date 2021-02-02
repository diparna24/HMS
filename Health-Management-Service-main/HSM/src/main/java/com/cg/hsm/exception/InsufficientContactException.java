package com.cg.hsm.exception;
/**
 * This class is an custom exception class to throw exception when particular contact does not match the conditions
 * @author jyothi
 *
 */
public class InsufficientContactException extends Exception {
	private static final long serialVersionUID = 1L;
	/**
	 * Create InsufficientExperienceException object without error message
	 */
	public InsufficientContactException() {
		super();
		}
		/**
		 * Create InsufficientExperienceException object with error message
		 */
		public InsufficientContactException(String errMsg){
			super(errMsg);
		}
	

}