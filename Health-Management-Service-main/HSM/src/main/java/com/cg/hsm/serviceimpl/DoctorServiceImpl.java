package com.cg.hsm.serviceimpl;
import com.cg.hsm.domain.Patient;
import com.cg.hsm.service.DoctorService;
import com.cg.hsm.util.DBUtil;
/**
 * This DoctorServiceImpl class implements services of DoctorService 
 *  * @author Pranjali Chaudhari
 *
 */

public class DoctorServiceImpl extends DBUtil implements DoctorService {

	/**
	 * This viewPatientCase method shows patient's current case
	 */
	
	@Override
	public void viewPatientCase(int patientId) {
		
		Patient patient = entityManager.find(Patient.class, patientId);
		System.out.println("Patient id : "+patient.getPatientId());
		System.out.println("Patient Name : "+patient.getPatientName());
		System.out.println("Patient Case : "+patient.getPatientCase());
	}

	/**
	 * this viewPatientHistory method shows patient's history of treatments
	 */
	@Override
	public void viewPatientHistory(int patientId) {
		//49714
		Patient patient = entityManager.find(Patient.class, patientId);
		System.out.println("Patient id : "+patient.getPatientId());
		System.out.println("Patient Name : "+patient.getPatientName());
		System.out.println("Patient History : "+patient.getPatientHistory());
		
	}

}
