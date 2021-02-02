package com.cg.hsm.service;

import com.cg.hsm.domain.Finance;
import com.cg.hsm.exception.PatientFinanceDetailsNotFoundException;

/**
 * This FinanceService interface provides services to Admin
 * @author kethu_greeshma
 *
 */
public interface FinanceService {
	
	/**
	 * This method will return report of a patient
	 * @param name
	 * @return String if found else null
	 */
	Finance getPatientReport(String name) throws PatientFinanceDetailsNotFoundException;
	
}