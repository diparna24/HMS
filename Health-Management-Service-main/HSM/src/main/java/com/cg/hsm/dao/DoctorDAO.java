package com.cg.hsm.dao;

import java.util.List;

import com.cg.hsm.domain.Doctor;
/**
 * This DoctorDAO class perform CRUD operations on doctor class
 * @author Pranjali Chaudhari
 *
 */

public interface DoctorDAO {
	
	/**
	 * This addDoctor method will add new doctor to database
	 * @param doctor
	 */
	public void addDoctor(Doctor doctor);
	/**
	 * This updateDoctor method will update doctor fees in database;
	 * @param fees
	 */
	public void updateDoctorFee(int doctorId,int updatedDoctorFee);
	/**
	 * This updateDoctor will update doctor details in database
	 * @param doctor
	 */
	public void updateDoctor(Doctor doctor, int doctorId);
	/**
	 * This deleteDoctor method will delete record of doctor from database
	 * @param doctor
	 */
	public void deleteDoctor(int doctorId);
	/**
	 * This will return the list of all the doctors from database
	 * @return Doctors
	 */
	List<Doctor> listAllDoctors();
	

}
