
package com.cg.hsm.daoimpl;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;

import javax.persistence.Query;

import com.cg.hsm.dao.PatientDAO;
import com.cg.hsm.domain.InsurancePolicy;
import com.cg.hsm.domain.Patient;
import com.cg.hsm.domain.PatientHistory;
import com.cg.hsm.util.DBUtil;
/**
 * This PatientDAOImpl implements CRUD operations of PatientDAO class
 * @author jyothi
 *
 */
public class PatientDAOImpl extends DBUtil implements PatientDAO {
	/**
	 * This addPatient method will add patient details in patients table in database
	 */
	@Override
	public void addPatient(Patient patient) {
		// TODO Auto-generated method stub
		entityManager.getTransaction().begin();
		entityManager.persist(patient);
		entityManager.getTransaction().commit();
		entityManager.close();
		  
		
	}
	/**
	 * This updatePatient method will update patient details in patients table in database
	 */
	@Override
	public void updatePatient(Patient patient1, int patientId) {
		entityManager.getTransaction().begin();	
		
		Patient patient=entityManager.find(Patient.class, patientId);
		patient.setPatientName(patient1.getPatientName());
	    patient.setPatientAge(patient1.getPatientAge());
		patient.setPatientContact(patient1.getPatientContact());
		patient.setAddress(patient1.getAddress());
		patient.setAdmissionFee(patient1.getAdmissionFee());
		patient.setPatientCase(patient1.getPatientCase());
		patient.setPatientHistory(patient1.getPatientHistory());
		 entityManager.getTransaction().commit();
		 entityManager.close();
		  
	}
	
	/**
	 * This deletePatient method will delete patient details from patients table in database
	 */
	@Override
	public void deletePatient(int patientId) {
		
		entityManager.getTransaction().begin();
		Patient patient=entityManager.find(Patient.class, patientId);
		entityManager.remove(patient);
		entityManager.getTransaction().commit();
		entityManager.close();
		  
	}
	/**
	 * This findAll method will list all patient details 
	 */
	@Override
	public List<Patient> getAllPatientDetails() {
		
		Query query =entityManager.createQuery("from Patient");	
		@SuppressWarnings("unchecked")
		List<Patient> patients =  query.getResultList();
		for(Patient patient:patients) {
			System.out.println("Patient ID : " + patient.getPatientId());
			System.out.println("Patient Name : "+ patient.getPatientName());
			System.out.println("Patient Age : "+patient.getPatientAge());
			System.out.println("Contact Number : "+ patient.getPatientContact());
			System.out.println("Address : " +patient.getAddress());
			System.out.println("Symptoms : "+patient.getSymptoms());
			System.out.println("Admission Fee : "+ patient.getAdmissionFee());
			System.out.println("Patient Case : " + patient.getPatientCase());
			System.out.println("Patient History : "+patient.getPatientHistory());
		}
		return patients;
	}
	@Override
	public void updatePatientHistory( PatientHistory patientHistory, int patientId) {
		
		entityManager.getTransaction().begin();	
		Patient patient=entityManager.find(Patient.class, patientId);
		patientHistory.setDiseaseName(patientHistory.getDiseaseName());
		patientHistory.setBloodGroup(patientHistory.getBloodGroup());
		patientHistory.setTreatmentStatus(patientHistory.getTreatmentStatus());
		patientHistory.setDietAdvised(patientHistory.getDietAdvised());
		patientHistory.setHistoryReports(patientHistory.getHistoryReports());
		patient.setPatientHistory(patientHistory);
		 entityManager.getTransaction().commit();
		 entityManager.close();
		
	}


	
	@Override
	public void updateInsurancePolicy(int patientId){

		entityManager.getTransaction().begin();
		Patient patient = entityManager.find(Patient.class, patientId);
		InsurancePolicy policy = patient.getInsurancePolicy();
		String policyId = patient.getPatientName().substring(0, 2) + 
							new DecimalFormat("##").format(Math.random() * 1000000);
		if(policy.getPolicyId().isBlank()) {
			policy.setPolicyId(policyId);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter new policy Name: ");
		policy.setPolicyName(sc.nextLine());
		patient.setInsurancePolicy(policy);
		entityManager.getTransaction().commit();
		sc.close();
		entityManager.close();
	}
	
	@Override
	public void deleteInsurancePolicy(String policyId) {

		entityManager.getTransaction().begin();
		InsurancePolicy insurancePolicy = entityManager.find(InsurancePolicy.class, policyId);
		entityManager.remove(insurancePolicy);
		entityManager.getTransaction().commit();
		entityManager.close();

	}
	

}