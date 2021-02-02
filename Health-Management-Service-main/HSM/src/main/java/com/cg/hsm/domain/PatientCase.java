package com.cg.hsm.domain;


/**
 * This class will create patientCase table in database and get all patient  details
 * @author samyuktha
 *
 */
import javax.persistence.Embeddable;

@Embeddable
public class PatientCase {
	/**
	 * DoctorName how to assigned to that patient
	 */
	private String associatedDoctorName;
	/**
	 * medicine for patient
	 */
	private String medicines;
	/**
	 * cost of medicines
	 */
	private float medicineFee;
	
	/**
	 * Reports of patients
	 */
	private String reports;
	/**
	 * current treatment given to patient
	 */
	private String currentTreatment;
	@Override
	public String toString() {
		return "PatientCase [associatedDoctorName=" + associatedDoctorName + ", medicines=" + medicines + ", reports="
				+ reports + ", currentTreatment=" + currentTreatment + ", diseaseDescription=" + diseaseDescription
				+ "]";
	}
	/**
	 * Detail description of disease
	 */
	private String diseaseDescription;
	
	//getters and setters
	public String getMedicines() {
		return  medicines;
		
		}
				
		
	public void setMedicines(String medicines) {
		this.medicines = medicines;
	}
	
	public String getDiseaseDescription() {
		return diseaseDescription;
	}
	public void setDiseaseDescription(String diseaseDescription) {
		this.diseaseDescription = diseaseDescription;
	}
	public String getReports() {
		return reports;
	}
	public void setReports(String reports) {
		this.reports = reports;
	}
	public String getCurrentTreatment() {
		return currentTreatment;
	}
	public void setCurrentTreatment(String currentTreatment) {
		this.currentTreatment = currentTreatment;
	}
	
	
	
	public String getAssociatedDoctorName() {
		return associatedDoctorName;
	}


	public void setAssociatedDoctorName(String associatedDoctorName) {
		this.associatedDoctorName = associatedDoctorName;
	}


	public float getMedicineFee() {
		return medicineFee;
	}


	public void setMedicineFee(float medicineFee) {
		this.medicineFee = medicineFee;
	}


		//Parameterized Constructor
		
		public PatientCase(String associatedDoctorName, String medicines, float medicineFee, String reports,
			String currentTreatment, String diseaseDescription) {
		super();
		this.associatedDoctorName = associatedDoctorName;
		this.medicines = medicines;
		this.medicineFee = medicineFee;
		this.reports = reports;
		this.currentTreatment = currentTreatment;
		this.diseaseDescription = diseaseDescription;
	}

		//Default Constructor
				public PatientCase() {
					super();
					
				}
				
				
				

}