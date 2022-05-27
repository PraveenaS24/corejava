package com.chainsys.miniproject.entry;

import com.chainsys.miniproject.ui.AppointmentUI;
import com.chainsys.miniproject.ui.DoctorUI;
import com.chainsys.miniproject.ui.EmployeesUi;

public class Startup {
	public static void main(String args[]) {
		loadMenu();
		//EmployeesUi.updateEmployee();
        //DoctorUI.addNewDoctorInformation();
		//AppointmentUI.deleteAppointment();
	}

	private static void loadMenu() {
		System.out.println("Enter Menu : 1 is EmployeeMenu, 2 is Doctor Menu, 3 is Appointment Menu ");
		java.util.Scanner sc = new java.util.Scanner(System.in);
      try {
		int call = sc.nextInt();
		switch (call) {
		case 1:
			loadEmployeeMenu();
			break;
		case 2:
			loadDoctorMenu();
			break;
		case 3:
			loadAppointmentMenu();
			break;
		}
      }finally {
    	  sc.close();
      }
	}

	private static void loadEmployeeMenu() {
		System.out.println(
				"Enter Employee Method : 1=addNewEmployee, 2=updateEmployee ,3=updateFirstnameOfEmployee ,4=updateSalaryOfEmployee, 5=deleteEmployee, 6=fetchEmployeeById, 7=fetchAllEmployee");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
		int call = sc.nextInt();
		
		switch (call) {
		case 1:
			EmployeesUi.addNewEmployee();
			break;
		case 2:
			EmployeesUi.UpdateEmployee();
			break;
		case 3:
			EmployeesUi.updateFirstnameOfEmployee();
			break;
		case 4:
			EmployeesUi.updateSalaryOfEmployee();
			break;
		case 5:
			EmployeesUi.deleteEmployee();
			break;
		case 6:
			EmployeesUi.fetchEmployeeById();
			break;
		case 7:
			EmployeesUi.fetchAllEmployee();
			break;
		}
		}finally {
			sc.close();
		}
	}

	private static void loadDoctorMenu() {
		System.out.println(
				"Enter Doctor Method : 1=doctorOption ,2=addNewDoctorInformation ,3=updateDoctorDetails ,4=deleteDoctorDetails, 5=viewDoctorsDetailsById, 6=viewAllDoctorsDetails ");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
		int call = sc.nextInt();
		switch (call) {
		case 1:
			DoctorUI.addNewDoctor();
			break;
		case 2:
			DoctorUI.updateDoctor();
			break;
		case 3:
			DoctorUI.updateDoctorFirstName();
			break;
		case 4:
			DoctorUI.deleteDoctor();
			break;
		case 5:
			DoctorUI.getDoctorById();
			break;
		case 6:
			DoctorUI.getAllDoctorDetails();
			break;
		}
		}finally {
			sc.close();
		}
	}

	private static void loadAppointmentMenu() {
		System.out.println(
				"Enter Method : 1=appointmentOption ,2=addNewAppointments ,3=updateAppointment ,4=updateAppointmentFirstName ,5=deleteAppointment ,6=getAppointmentById ,7=getAllAppointment ");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
		int call = sc.nextInt();
		switch (call) {
		case 1:
			AppointmentUI.appointmentOption();
			break;
		case 2:
			AppointmentUI.addNewAppointment();
			break;
		case 3:
			AppointmentUI.updateAppointment();
			break;
		case 4:
			AppointmentUI.updateAppointment();
			break;
		case 5:
			AppointmentUI.deleteAppointment();
			break;
		case 6:
			AppointmentUI.getPatientById();
			break;
		case 7:
			AppointmentUI.getAllAppointmentDetails();
		
		}
		}finally {
			sc.close();
		}
	}
}
