package com.cg.hsm.daoimpl;

import java.util.List;

import javax.persistence.Query;

import com.cg.hsm.dao.DoctorDAO;
import com.cg.hsm.domain.Doctor;
import com.cg.hsm.util.DBUtil;

/**
 * This DoctorDAOImpl class implements classes of DoctorDAO Class
 * @author Pranjali Chaudhari
 *
 */
public class DoctorDAOImpl extends DBUtil implements DoctorDAO {
	
	/**
	 * This addDoctor method will add doctor details in doctors table in database
	 */
	@Override
	public void addDoctor(Doctor doctor) {
		entityManager.getTransaction().begin();
		entityManager.persist(doctor);
		entityManager.getTransaction().commit();
		
	}

	/**
	 * This updateDoctor method will update doctor fees in doctors table in database 
	 */
	@Override
	public void updateDoctorFee(int doctorId,int updatedDoctorFee) {
		entityManager.getTransaction().begin();
		
		Doctor doctor = entityManager.find(Doctor.class, doctorId);
		doctor.setDoctorFee(updatedDoctorFee);
		
		entityManager.getTransaction().commit();
		entityManager.close();
		
	}

	/**
	 * This updateDoctor method will update doctor details in doctors table in database
	 */
	@Override
	public void updateDoctor(Doctor doctor1,int doctorId) {
		entityManager.getTransaction().begin();
		
		Doctor doctor = entityManager.find(Doctor.class, doctorId);
		doctor.setDoctorName(doctor1.getDoctorName());
		doctor.setContactNumber(doctor1.getContactNumber());
		doctor.setSpecialization(doctor1.getSpecialization());
		doctor.setHoursOfAvailability(doctor1.getHoursOfAvailability());
		doctor.setDegree(doctor1.getDegree());
		doctor.setYearsOfExperience(doctor1.getYearsOfExperience());
		doctor.setDoctorFee(doctor1.getDoctorFee());
		
		entityManager.getTransaction().commit();
		entityManager.close();
  
		
	}

	/**
	 * This deleteDoctor method will delete doctor details from doctors table in database
	 */
	@Override
	public void deleteDoctor(int doctorId) {
		entityManager.getTransaction().begin();
		
		Doctor doctor = entityManager.find(Doctor.class, doctorId);
		entityManager.remove(doctor);
		
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	/**
	 * This findAll method will list all doctor details 
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Doctor> listAllDoctors() {
		Query query =entityManager.createQuery("from Doctor");	
		List<Doctor> doctors =  query.getResultList();
		for(Doctor doctor:doctors)
		{
			System.out.println("ID : " + doctor.getDoctorId());
			System.out.println("Name : " + doctor.getDoctorName());
			System.out.println("Contact Number : " + doctor.getContactNumber());
			System.out.println("Specialization : " + doctor.getSpecialization());
			System.out.println("Hours of Availability : " + doctor.getHoursOfAvailability());
			System.out.println("Years of Experience : " + doctor.getYearsOfExperience());
			System.out.println("Degree : " + doctor.getDegree());
			System.out.println("Fees : " + doctor.getDoctorFee());
			System.out.println("-----------------------------");
		}
		return doctors;
	}

}
