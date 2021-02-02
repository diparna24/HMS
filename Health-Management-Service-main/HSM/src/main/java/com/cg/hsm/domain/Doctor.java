package com.cg.hsm.domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * This class will create doctors table in database and get all doctor details
 * @author Pranjali Chaudhari
 *
 */

@Entity
@Table(name="doctors")
public class Doctor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	/**
	 * Id of the doctor.
	 */
	private int doctorId;
	/**
	 * Name of the doctor.
	 */
	private String doctorName;
	
	/**
	 * Email of the doctor
	 */
	private String username;
	
	/**
	 * Passkey of the doctor
	 */
	private String password;
	
	/**
	 * Contact of the doctor.
	 */
	private long contactNumber;
	/**
	 * No of hours the doctor is available.
	 */
	private int hoursOfAvailability;
	/**
	 * Specialization details of the doctor.
	 */
	private String specialization;
	/**
	 * Degree details of the doctor.
	 */
	private String degree;
	/**
	 * Years of experience of the doctor.
	 */
	private int yearsOfExperience;
	/**
	 * Fees of the doctor.
	 */
	private float doctorFee;
	
	//Getters and Setters
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public int getHoursOfAvailability() {
		return hoursOfAvailability;
	}
	public void setHoursOfAvailability(int hoursOfAvailability) {
		this.hoursOfAvailability = hoursOfAvailability;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	public float getDoctorFee() {
		return doctorFee;
	}
	public void setDoctorFee(float fees) {
		this.doctorFee = fees;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	//Parameterized Constructor
	public Doctor(int doctorId, String doctorName, long contactNumber, int hoursOfAvailability, String specialization,
			String degree, int yearsOfExperience, float doctorFee, String username, String password) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.contactNumber = contactNumber;
		this.hoursOfAvailability = hoursOfAvailability;
		this.specialization = specialization;
		this.degree = degree;
		this.yearsOfExperience = yearsOfExperience;
		this.doctorFee = doctorFee;
		this.username = username;
		this.password = password;
	}
	
	//Default Constructor
	public Doctor() {
		super();
		
	}
	
	//Overridden toString method
	@Override
	public String toString() {
		return "Patient [doctorId=" + doctorId + ", doctorName=" + doctorName + ", contactNumber=" + contactNumber
				+ ", hoursOfAvailability=" + hoursOfAvailability + ", specialization=" + specialization + ", degree="
				+ degree + ", yearsOfExperience=" + yearsOfExperience + ", doctorFees=" + doctorFee + "]";
	}
	
	
	

}
