package com.cg.hsm.exception;
/**
 * This class is an custom exception class to throw exception when available hours of a doctor does not match criteria
 * @author Pranjali Chaudhari
 *
 */

public class InsufficientHoursOfAvailabilityException extends Exception {
	
	private static final long serialVersionUID = 1L;
	/**
	 * Create InsufficientHoursOfAvailabilityException object without error message
	 */
	public InsufficientHoursOfAvailabilityException() {
		super();
	}
	/**
	 * Create InsufficientHoursOfAvailabilityException object with error message
	 */
	public InsufficientHoursOfAvailabilityException(String errMsg){
		super(errMsg);

}
}