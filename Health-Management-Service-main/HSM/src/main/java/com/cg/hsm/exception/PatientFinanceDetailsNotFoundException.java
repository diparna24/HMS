package com.cg.hsm.exception;
/**
 * This class is an exception class to throw exception when particular patient totalFee column is empty in finance table
 * @author kethu_greeshma
 *
 */
public class PatientFinanceDetailsNotFoundException extends Exception{
		
	private static final long serialVersionUID = 1L;
	/**
	 * Create PatientFinanceDetailsNotFound object without error message
	 */
	public PatientFinanceDetailsNotFoundException() {
		super();
	}
	
	/**
	 * Create PatientFinanceDetailsNotFound object with error message
	 */
	public PatientFinanceDetailsNotFoundException(String errMsg) {
		super(errMsg);
	}
}