package com.cg.hsm.test;

import java.util.Date;
import java.util.Scanner;
import com.cg.hsm.daoimpl.DoctorDAOImpl;
import com.cg.hsm.daoimpl.RoleDAOImpl;
import com.cg.hsm.domain.Doctor;
import com.cg.hsm.domain.Role;
import com.cg.hsm.exception.FeeNotFoundException;
import com.cg.hsm.exception.InsufficientContactException;
import com.cg.hsm.exception.InsufficientExperienceException;
import com.cg.hsm.exception.InsufficientHoursOfAvailabilityException;
import com.cg.hsm.exception.NameNotFoundException;

/**
 * This class tests the functionalities of DoctorDaoImpl Class It checks whether
 * all CRUD operations are performed correctly and ensures data is stored in
 * database
 * 
 * @author Pranjali Chaudhari
 *
 */

public class DoctorDAOImplTest {
	static Scanner sc = new Scanner(System.in);

	private static void registerDoctor(){

		System.out.println("-------Please Provide below details---------");
		Doctor doctor = new Doctor();
		System.out.println("Enter Doctor's Name : ");
		String doctorName = sc.nextLine();
		try {
			if(doctorName.isBlank())
				throw new NameNotFoundException("no name is provided");
			else
				doctor.setDoctorName(doctorName);
		}catch(NameNotFoundException exception) {
			exception.printStackTrace();
		}
		System.out.println("Enter doctor's username");
		String username = sc.next();
		doctor.setUsername(username);
		
		System.out.println("Enter doctor's password");
		String password = sc.next();
		doctor.setPassword(password);
		
		System.out.println("Enter Doctor's Contact Number : ");
		long doctorContact = sc.nextLong();
		int temp = String.valueOf(doctorContact).length();
		try {
			if(temp<10 || temp>10)
				throw new InsufficientContactException("contact is provided is insufficient");
			else
				doctor.setContactNumber(doctorContact);
		}catch(InsufficientContactException exception) {
			exception.printStackTrace();

		}
		
		
		sc.nextLine();
		
		System.out.println("Enter Number Of Hours Doctor is Available : ");
		int hours = sc.nextInt();
		try {
		if (hours < 4)
			throw new InsufficientHoursOfAvailabilityException("Your Hours of Availability is Insufficient");
		else
			doctor.setHoursOfAvailability(hours);
		}catch(InsufficientHoursOfAvailabilityException  exception) {
			exception.printStackTrace();
		}
		sc.nextLine();
		System.out.println("Enter Doctor's Specializaion : ");
		doctor.setSpecialization(sc.nextLine());
		System.out.println("Enter Doctor's Degree Name : ");
		doctor.setDegree(sc.nextLine());
		System.out.println("Enter Doctor's Total Years of Experience : ");
		int years = sc.nextInt();
		try {
		if (hours < 4)
			throw new InsufficientExperienceException("Your Years of Experience is Insufficient");
		else
			doctor.setYearsOfExperience(years);
		}catch(InsufficientExperienceException exception) {
			exception.printStackTrace();
		}
		sc.nextLine();
		System.out.println("Enter Doctor's Fees: ");
		float doctorFee=sc.nextFloat();
		try {
			if(doctorFee==0) {
				throw new FeeNotFoundException("Doctor fee is not provided");
			}
			else
				doctor.setDoctorFee(doctorFee);
		}
		catch(FeeNotFoundException excepion) {
			excepion.printStackTrace();
		}
		sc.nextLine();
		
		Role role = new Role();
		role.setRoleName("Doctor");
		role.setUsername(username);
		role.setPassword(password);
		role.setUpdatedDate(new Date(System.currentTimeMillis()));
		RoleDAOImpl roleImpl = new RoleDAOImpl();
		roleImpl.registerRole(role);
		
		
		DoctorDAOImpl impl = new DoctorDAOImpl();
		impl.addDoctor(doctor);
		System.out.println("Doctor Registered Successfully!");
	}

	private static void updateDoctorFee() {

		System.out.println("-------Updating details-------- ");
		System.out.println("Enter Doctor id : ");
		int doctorId = sc.nextInt();
		System.out.println("Enter Doctor's updated Fee : ");
		int updatedDoctorFee = sc.nextInt();
		DoctorDAOImpl doctorDaoImpl = new DoctorDAOImpl();
		doctorDaoImpl.updateDoctorFee(doctorId, updatedDoctorFee);
		System.out.println("-------Updated Doctor Fees-------- ");

	}

	private static void updateDoctor() {

		System.out.println("-------Updating details-------- ");
		Doctor doctor1 = new Doctor();
		System.out.println("Enter Doctor id : ");
		int doctorId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Doctor's Name : ");
		String doctorName = sc.nextLine();
		try {
			if(doctorName.isBlank())
				throw new NameNotFoundException("no name is provied");
			else
				doctor1.setDoctorName(doctorName);
		}catch(NameNotFoundException exception) {
			exception.printStackTrace();
		}
		System.out.println("Enter Doctor's Contact Number : ");
		long doctorContact = sc.nextLong();
		int temp = String.valueOf(doctorContact).length();
		try {
			if(temp<10 || temp>10)
				throw new InsufficientContactException("contact is provided is insufficient");
			else
				doctor1.setContactNumber(doctorContact);
		}catch(InsufficientContactException exception) {
			exception.printStackTrace();

		}
		
		
		sc.nextLine();
		System.out.println("Enter Number Of Hours Doctor is Available : ");
		doctor1.setHoursOfAvailability(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Doctor's Specializaion : ");
		doctor1.setSpecialization(sc.nextLine());
		System.out.println("Enter Doctor's Degree Name : ");
		doctor1.setDegree(sc.nextLine());
		System.out.println("Enter Doctor's Total Number of Experience : ");
		doctor1.setYearsOfExperience(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Doctor's Fees: ");
		float doctorFee=sc.nextFloat();
		try {
			if(doctorFee==0) {
				throw new FeeNotFoundException("Doctor fee is not provided");
			}
			else
				doctor1.setDoctorFee(doctorFee);
		}
		catch(FeeNotFoundException excepion) {
			excepion.printStackTrace();
		}

		DoctorDAOImpl doctorDaoImpl = new DoctorDAOImpl();
		doctorDaoImpl.updateDoctor(doctor1, doctorId);
		System.out.println("-------Updated Doctor Details-------- ");

	}

	private static void removeDoctor() {

		System.out.println("-------Deleting details-------- ");
		System.out.println("Enter Doctor id : ");
		int doctorId = sc.nextInt();

		DoctorDAOImpl doctorDaoImpl = new DoctorDAOImpl();
		doctorDaoImpl.deleteDoctor(doctorId);
		System.out.println("-------Deleted Doctor Details-------- ");

	}

	public static void main(String args[])
			throws InsufficientHoursOfAvailabilityException, InsufficientExperienceException {

		System.out.println("Menu");
		System.out.println("1. Test AddDoctor method");
		System.out.println("2. Test UpdateDoctorFee method");
		System.out.println("3. Test FindAll method");
		System.out.println("4. Test UpdateDoctor methd");
		System.out.println("5. Test RemoveDoctor method");
		System.out.println("Choice");
		int choice = sc.nextInt();
		sc.nextLine();
		switch (choice) {
		case 1:
			registerDoctor();
			break;
		case 2:
			updateDoctorFee();
			break;
		case 3:
			DoctorDAOImpl doctorDaoImpl = new DoctorDAOImpl();
			doctorDaoImpl.listAllDoctors();
			break;
		case 4:
			updateDoctor();
			break;
		case 5:
			removeDoctor();
		default:
			break;

		}

		sc.close();
	}

}
