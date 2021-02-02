package com.cg.hsm.dao;

import java.util.List;

import com.cg.hsm.domain.InsurancePolicy;
import com.cg.hsm.domain.Patient;
import com.cg.hsm.domain.PatientHistory;
/**
 * This PatientDAO class perform CRUD operations on patient class
 * @author  Jyothi
 *
 */

public interface PatientDAO {
	
	/**
	 * This addPatient method will add new patient to database
	 * @param patient
	 */
	public void addPatient(Patient patient);
	/**
	 * This updatePatient will update doctor details in database
	 * @param patient
	 */
	public void updatePatient(Patient patient,int patientId);
	/**
	 * This deletePatient method will delete record of patient from database
	 * @param patient
	 */
	public void deletePatient(int patientId);
	/**
	 * This will return the list of all the patients from database
	 * @return
	 */
	List<Patient> getAllPatientDetails();
	/**
	 * This updatePatientHistory will update details about patient's history
	 * @param patientHistory
	 * @param patientId
	 */
	public void updatePatientHistory( PatientHistory patientHistory, int patientId);
	/**
	 * This updateInsurance will update details about patient's insurance policy
	 * @param insurancePolicy1
	 * @param policyId
	 */
	public void updateInsurancePolicy(int patientId);
	/**
	 * This deleteInsurancePolicy will delete details about patient's insurance policy
	 * @param policyId
	 */
	public void deleteInsurancePolicy(String policyId);
}