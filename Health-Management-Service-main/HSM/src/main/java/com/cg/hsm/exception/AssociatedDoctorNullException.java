package com.cg.hsm.exception;
/**
 *This class is an custom exception class to throw exception when associated doctor for patient case is not found in patient table
 * @author Samyuktha Sirangapu

 *
 */
public class AssociatedDoctorNullException extends Exception  {
	private static final long serialVersionUID = 1L;
	public AssociatedDoctorNullException() {
		super();
	}
	/**
	 * Create InsufficientExperienceException object with error message
	 */
	public AssociatedDoctorNullException(String errMsg){
		super(errMsg);
	}

}