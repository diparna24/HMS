package com.cg.hsm.exception;
/**
 * This class is an custom exception class to throw exception when particular disease description is not provided
 * @author Samyuktha Sirangapu
 *
 */
public class InsufficientDiseaseDescriptionException extends Exception {
	
	private static final long serialVersionUID = 1L;
	/**
	 * Create InsufficientExperienceException object without error message
	 */
	public InsufficientDiseaseDescriptionException() {
		super();
	}
	/**
	 * Create InsufficientExperienceException object with error message
	 */
	public InsufficientDiseaseDescriptionException(String errMsg){
		super(errMsg);
	}

}