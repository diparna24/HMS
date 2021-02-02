package com.cg.hsm.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This class will store finance details of patients and gets all bills
 * @author kethu_greeshma
 *
 */

@Entity
@Table(name="finance")
public class Finance {
	/**
	 * Id attribute stores the id of a patient
	 */
	@Id
	private int patientId;
	/**
	 * patientName attribute stores name of a patient
	 */
	private String patientName;
	/**
	 * doctorFee attribute stores the fee of a doctor
	 */
	private double doctorFee;
	/**
	 * registrationFee attribute stores the registrationFee of a patient
	 */
	private double registrationFee;
	/**
	 * medicinesAmount attribute stores the medicines amount of a patient
	 */
	private double 	medicinesAmount;
	/**
	 * totalFee attribute stores the total fee of a patient
	 */
	private double totalFee;
	/**
	 * createdBy attribute will store the name of the person who's storing the details  in database
	 */
	
	//default constructor
	public Finance() {
		
	}
	//parameterised constructor
	public Finance(int patientId,String patientName, double registrationFee, double doctorFee, double medicinesAmount, double totalFee) {
		this.patientId = patientId;
		this.patientName = patientName;
		this.registrationFee = registrationFee;
		this.doctorFee = doctorFee;
		this.medicinesAmount = medicinesAmount;
		this.totalFee = totalFee;
	}
	//Getters Setters
	
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
	public double getRegistrationFee() {
		return registrationFee;
	}
	public void setRegistrationFee(double registrationFee) {
		this.registrationFee = registrationFee;
	}
	public double getDoctorFee() {
		return doctorFee;
	}
	public void setDoctorFee(double doctorFee) {
		this.doctorFee = doctorFee;
	}
	public double getMedicinesAmount() {
		return medicinesAmount;
	}
	public void setMedicinesAmount(double medicinesAmount) {
		this.medicinesAmount = medicinesAmount;
	}
	public double getTotalFee() {
		return totalFee;
	}
	public void setTotalFee(double totalFee) {
		this.totalFee = totalFee;
	}
	
	
	

	@Override
	public String toString() {
		return "Finance [patientId=" + patientId + ", patientName=" + patientName + ", doctorFee=" + doctorFee
				+ ", registrationFee=" + registrationFee + ", medicinesAmount=" + medicinesAmount + ", totalFee="
				+ totalFee + "]";
	}
	
}