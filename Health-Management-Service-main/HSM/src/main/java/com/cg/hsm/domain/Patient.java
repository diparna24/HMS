package com.cg.hsm.domain;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * This class will create patient table in database and get all doctor details
 * @author Jyothi
 *
 */
@Entity
@Table(name="patients")
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	/**
	 * id of the patient
	 */
	private int patientId;
	/**
	 * name of the patient
	 */
	private String patientName;	
	/**
	 * age of the patient
	 */
	private int patientAge;
	/**
	 * contact of the patient
	 */
	private long patientContact;
	/**
	 * address of the patient
	 */
	private String address;
	/**
	 *  symptoms of the patient
	 */
	private String symptoms;
	/**
	 * fee for the patient admission fee
	 */
	private float admissionFee;
	
	@Embedded
	//@OneToMany
	/**
	 * patient's history details
	 */
	private PatientHistory patientHistory;
	@Embedded
	/**
	 * patient's current case details
	 */
	private PatientCase patientCase;
	@Embedded
	/**
	 * patient's insurance policy details
	 */
	private InsurancePolicy insurancePolicy;
	
	//getters and setters
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getPatientAge() {
		return patientAge;
	}
	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}
	public long getPatientContact() {
		return patientContact;
	}
	public void setPatientContact(long patientContact) {
		this.patientContact = patientContact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	public float getAdmissionFee() {
		return admissionFee;
	}
	public void setAdmissionFee(float admissionFee2) {
		this.admissionFee = admissionFee2;
	}
	

	public PatientHistory getPatientHistory() {
		return patientHistory;
	}

	public void setPatientHistory(PatientHistory patientHistory) {
		this.patientHistory = patientHistory;
	}
	

	public PatientCase getPatientCase() {
		return patientCase;
	}
	public void setPatientCase(PatientCase patientCase) {
		this.patientCase = patientCase;
	}

	public InsurancePolicy getInsurancePolicy() {
		return insurancePolicy;
	}

	public void setInsurancePolicy(InsurancePolicy insurancePolicy) {
		this.insurancePolicy = insurancePolicy;
	}
	
	//Parameterized Constructor
	
		
	public Patient(int patientId, PatientHistory patientHistory, PatientCase patientCase,
			InsurancePolicy insurancePolicy, String patientName, int patientAge, long patientContact, String address,
			String symptoms, int admissionFee) {
		super();
		this.patientId = patientId;
		this.patientHistory = patientHistory;
		this.patientCase = patientCase;
		this.insurancePolicy = insurancePolicy;
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.patientContact = patientContact;
		this.address = address;
		this.symptoms = symptoms;
		this.admissionFee = admissionFee;
	}	
	//Default Constructor
		public Patient() {
			super();
			
		}
		
		@Override
		public String toString() {
			return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", patientAge=" + patientAge
					+ ", patientContact=" + patientContact + ", address=" + address + ", symptoms=" + symptoms
					+ ", admissionFee=" + admissionFee + "]";
		}
			
		
	
	

	
	

}