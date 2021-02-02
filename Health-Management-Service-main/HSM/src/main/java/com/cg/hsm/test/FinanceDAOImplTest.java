package com.cg.hsm.test;

import java.util.List;
import java.util.Scanner;

import com.cg.hsm.dao.DoctorDAO;
import com.cg.hsm.dao.FinanceDAO;
import com.cg.hsm.dao.PatientDAO;
import com.cg.hsm.daoimpl.DoctorDAOImpl;
import com.cg.hsm.daoimpl.FinanceDAOImpl;
import com.cg.hsm.daoimpl.PatientDAOImpl;
import com.cg.hsm.domain.Doctor;
import com.cg.hsm.domain.Finance;
import com.cg.hsm.domain.Patient;
import com.cg.hsm.domain.PatientCase;
import com.cg.hsm.exception.FinanceFeeColumnEmptyException;
import com.cg.hsm.exception.PatientFinanceDetailsNotFoundException;
import com.cg.hsm.service.FinanceService;
import com.cg.hsm.serviceimpl.FinanceServiceImpl;
/**
 *This class tests the functionalities of FinanceDAOImpl Class 
 *It checks whether all CRUD operations are performed correctly and ensures data is stored in database 
 * @author Greeshma
 *
 */
public class FinanceDAOImplTest {

	public static void main(String[] args) {
		FinanceDAO financeDAO = new FinanceDAOImpl();
		PatientDAO patientDAO = new PatientDAOImpl();
		DoctorDAO doctorDAO = new DoctorDAOImpl();
		FinanceService fService = new FinanceServiceImpl();
		
		Scanner sca = new Scanner(System.in);
		String response = "";
		do {
			response = "";
			displayOptions();
			System.out.println("Enter your choice");
			int choice = sca.nextInt();
			sca.nextLine();
			switch(choice) {
				case 1:
					System.out.println("Enter the patient name");
					String name = sca.nextLine();
					Patient patient = new Patient();
					List<Patient> patients = patientDAO.getAllPatientDetails();
					for(Patient pat:patients) {
						if(pat.getPatientName().equalsIgnoreCase(name)) {
							 patient = pat;
							 break;
					} 
					}
					double regFee = patient.getAdmissionFee();
					double docFee = 0;
					PatientCase patCase = patient.getPatientCase();
					String docName = patCase.getAssociatedDoctorName();
					List<Doctor> doctors = doctorDAO.listAllDoctors();
					for(Doctor doc:doctors) {
						if(doc.getDoctorName().equalsIgnoreCase(docName)) {
							docFee = doc.getDoctorFee();
					} 
					}
					double medicineCost = patCase.getMedicineFee();
					Finance finance = new Finance(patient.getPatientId(),name, regFee, docFee, medicineCost,(regFee+docFee+medicineCost));
					financeDAO.add(finance);
					System.out.println("******************Finance Details Successfully******************8");
					break;
					
			case 2:
				System.out.println("Enter the patient name");
				String name1 = sca.nextLine();
				Finance finance1 = new Finance();
				try {
					finance1 = fService.getPatientReport(name1);
					System.out.println("**********************************Patient report is***************************");
					System.out.println("Patient id is "+finance1.getPatientId());
					System.out.println("Patient name is "+finance1.getPatientName());
					System.out.println("Patient admission fee is "+finance1.getRegistrationFee());
					System.out.println("Patient doctor fee is "+finance1.getDoctorFee());
					System.out.println("Patient medicines amount is "+finance1.getMedicinesAmount());
					System.out.println("Patient total fee is "+finance1.getTotalFee());
					} catch (PatientFinanceDetailsNotFoundException e) {
						System.out.println("*********Please enter valid name**********");
					}
					break;
				
				
			case 3:
				System.out.println("Enter Patient Name");
				String name2 = sca.nextLine();
				System.out.println("Enter the updated amount");
				double amount = sca.nextDouble();
				sca.nextLine();
				Patient patient1 = new Patient();
				List<Patient> patients1 = patientDAO.getAllPatientDetails();
				for(Patient pat:patients1) {
					if(pat.getPatientName().equalsIgnoreCase(name2)) {
						 patient1 = pat;
						 break;
				} 
				}
				try {
					financeDAO.updateFee(patient1.getPatientId(),amount);
				} catch (PatientFinanceDetailsNotFoundException e) {
					System.out.println("Enter correct patient name");
				} catch (FinanceFeeColumnEmptyException e) {
					System.out.println("Null value present in feeColumn");
				}
				System.out.println("***********************Finance details successfully updated!*********************");
				break;
				
				
			case 4:
					System.out.println("Enter Patient Name");
					String name3 = sca.nextLine();
					int id = 0;
					List<Patient> patients3 = patientDAO.getAllPatientDetails();
					for(Patient pat:patients3) {
						if(pat.getPatientName().equalsIgnoreCase(name3)) {
							 id = pat.getPatientId();
							 break;
					} 
					}
				try {
					financeDAO.delete(id);
				} catch (PatientFinanceDetailsNotFoundException e) {
					System.out.println("Enter correct patient name");
				}
					System.out.println("********************Finance details successfully removed!**************************");
					break;
			
			case 5:
					System.out.println("***********Finance Details****************");
					List<Finance> finances = financeDAO.findAll();
					for(Finance fin:finances) {
						System.out.println(fin);
					}
					break;
			case 6:
				System.out.println("Thank you for using the application");
				System.exit(0);
				
			default:
					
			}
			System.out.println("Do you want to continue(Yes/No)");
			response = sca.nextLine();
		}while(response.equalsIgnoreCase("yes"));
		sca.close();
	}

	private static void displayOptions() {
		System.out.println("1. Add Finance Details");
		System.out.println("2. Get report of a patient");
		System.out.println("3. Update Finance Details");
		System.out.println("4. Remove patient finance details");
		System.out.println("5. Get all finance details");
		System.out.println("6. Exit");
		
	}

}
