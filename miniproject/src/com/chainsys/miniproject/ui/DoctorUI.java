package com.chainsys.miniproject.ui;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;
import com.chainsys.miniproject.dao.DoctorDao;
import com.chainsys.miniproject.pojo.Doctor;
import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;
public class DoctorUI {
		public static void addNewDoctor() {
			Scanner sc = new Scanner(System.in);
			Doctor newdoc = new Doctor();
			System.out.println("Enter Doctor Id: ");
			String id =sc.nextLine();
			try {
				Validator.checkStringForParse(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			int docId =sc.nextInt();
			newdoc.setDoc_id(Integer.parseInt(id));
			try {
				Validator.CheckNumberForGreaterThanZero(docId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			Doctor doc = DoctorDao.getDoctorById(docId);
			if (doc == null) {
				System.out.println("Doctor Doesn't Exist For Id " + docId);
				return;
			}
			newdoc.setDoc_id(docId);
			System.out.println("Enter Update Name :");
			String name = sc.nextLine();
			try {
				Validator.checkStringForParse(name);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			System.out.println("Enter Doctor Name: ");
			newdoc.setDoc_name(sc.nextLine());
			
			Calendar c1 = Calendar.getInstance();
			java.util.Date newDate =c1.getTime();
			newdoc.setDOB(newDate);
			System.out.println("Enter Specilyst: ");
			String sp = sc.nextLine();
			try {
				Validator.checkStringForParse(sp);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			
			newdoc.setSpeciality(sc.nextLine());
			System.out.println("Enter City: ");
			String cy = sc.nextLine();
			try {
				Validator.checkStringForParse(cy);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newdoc.setCity(sc.nextLine());
			System.out.println("Enter Phone_Number: ");
			newdoc.setPhone_no(sc.nextLong());			
			System.out.println("Enter Standard_Fees: ");
			float fees = sc.nextFloat();
			try {
				Validator.checkfee(fees);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newdoc.setFees(fees);
			newdoc.setFees(sc.nextFloat());
			int result = DoctorDao.insertDoctor(newdoc);
			System.out.println(result);
		}

			public static void updateDoctor() {
				java.util.Scanner sc = new java.util.Scanner(System.in);
				try {
					Doctor newdoc = new Doctor();
					System.out.println("Enter Doctor_Id :");
					String id = sc.nextLine();
					try {
						Validator.checkStringForParse(id);
					} catch (InvalidInputDataException err) {
						err.printStackTrace();
						return;
					}
					int docId = Integer.parseInt(id);
					newdoc.setDoc_id(Integer.parseInt(id));
					try {
						Validator.CheckNumberForGreaterThanZero(docId);
					} catch (InvalidInputDataException err) {
						err.printStackTrace();
						return;
					}
					Doctor doc = DoctorDao.getDoctorById(docId);
					if (doc == null) {
						System.out.println("Doctor Doesn't Exist For Id " + docId);
						return;
					}
					newdoc.setDoc_id(docId);
					System.out.println("Enter Update Name :");
					String name = sc.nextLine();
					try {
						Validator.checkStringForParse(name);
					} catch (InvalidInputDataException err) {
						err.printStackTrace();
						return;
					}
					newdoc.setDoc_name(name);
//					newdoc.setDOC_NAME(name);
					Calendar c1 = Calendar.getInstance();
					java.util.Date newDate = new java.util.Date();
					newdoc.setDOB(newDate);
					System.out.println("Enter Update Speciality :");
					String sp = sc.nextLine();
					try {
						Validator.checkStringForParse(sp);
					} catch (InvalidInputDataException err) {
						err.printStackTrace();
						return;
					}
					newdoc.setSpeciality(sp);
					// newdoc.setSpeciality(sc.nextLine());
					System.out.println("Enter Update City :");
					String cy = sc.nextLine();
					try {
						Validator.checkStringForParse(cy);
					} catch (InvalidInputDataException err) {
						err.printStackTrace();
						return;
					}
					newdoc.setCity(cy);
					System.out.println("Enter Update Phone_Number");
					newdoc.setPhone_no(sc.nextLong());
					System.out.println("Enter Update Standard_Fees :");
					float fees = sc.nextFloat();
					try {
						Validator.checkfee(fees);
					} catch (InvalidInputDataException err) {
						err.printStackTrace();
						return;
					}
					newdoc.setFees(fees);
					int result = DoctorDao.updateDoctor(newdoc);
					System.out.println(result);
				} finally {
					sc.close();
				}
			}

			public static void updateDoctorFirstName() {
				java.util.Scanner sc = new java.util.Scanner(System.in);
				try {
					Doctor newdoc = new Doctor();
					System.out.println("Enter Doctor_Id :");
					String id = sc.nextLine();
					try {
						Validator.checkStringForParse(id);
					} catch (InvalidInputDataException err) {
						err.printStackTrace();
						return;
					}
					int docId = Integer.parseInt(id);
					newdoc.setDoc_id(Integer.parseInt(id));
					try {
						Validator.CheckNumberForGreaterThanZero(docId);
					} catch (InvalidInputDataException err) {
						err.printStackTrace();
						return;
					}
					Doctor doc = DoctorDao.getDoctorById(docId);
					if (doc == null) {
						System.out.println("Doctor Doesn't Exist For Id " + docId);
						return;
					}
					newdoc.setDoc_id(docId);
					System.out.println("Enter Update Name :");
					String name = sc.nextLine();
					try {
						Validator.checkStringForParse(name);
					} catch (InvalidInputDataException err) {
						err.printStackTrace();
						return;
					}
					newdoc.setDoc_name(name);
					int result = DoctorDao.updateDoctorFirstName(Integer.parseInt(id), name);
					System.out.println(result);
				} finally {
					sc.close();
				}
			}
			public static void deleteDoctor() {
				java.util.Scanner sc = new java.util.Scanner(System.in);
				try {
					Doctor newdoc = new Doctor();
					System.out.println("Enter Doctor_Id :");
					String id = sc.nextLine();
					try {
						Validator.checkStringForParse(id);
					} catch (InvalidInputDataException err) {
						err.printStackTrace();
						return;
					}
					int docId = Integer.parseInt(id);
					newdoc.setDoc_id(Integer.parseInt(id));
					try {
						Validator.CheckNumberForGreaterThanZero(docId);
					} catch (InvalidInputDataException err) {
						err.printStackTrace();
						return;
					}
					Doctor doc = DoctorDao.getDoctorById(docId);

					if (doc == null) {
						System.out.println("Doctor Doesn't Exist For Id " + docId);
						return;
					}
					newdoc.setDoc_id(docId);
					int result = DoctorDao.deleteDoctor(Integer.parseInt(id));
					System.out.println(result);
				} finally {
					sc.close();
				}
			}

			public static void getDoctorById() {
				java.util.Scanner sc = new java.util.Scanner(System.in);
				try {
					Doctor newdoc = new Doctor();
					System.out.println("Enter Doctor_Id :");
					String id = sc.nextLine();
					try {
						Validator.checkStringForParse(id);
					} catch (InvalidInputDataException err) {
						err.printStackTrace();
						return;
					}
					int docId = Integer.parseInt(id);
					newdoc.setDoc_id(Integer.parseInt(id));
					try {
						Validator.CheckNumberForGreaterThanZero(docId);
					} catch (InvalidInputDataException err) {
						err.printStackTrace();
						return;
					}
					Doctor doc = DoctorDao.getDoctorById(docId);
					if (doc == null) {
						System.out.println("Doctor Doesn't Exist For Id " + docId);
						return;
					}
					newdoc.setDoc_id(docId);
					Doctor result = DoctorDao.getDoctorById(Integer.parseInt(id));
					System.out.println(result.getDoc_id() + " " + result.getDoc_name() + " " + result.getDOB() + " "
							+ result.getSpeciality() + " " + result.getCity() + " " + result.getPhone_no() + " "
							+ result.getFees());
				} finally {
					sc.close();
				}
			}
			public static void getAllDoctorDetails() {
				List<Doctor> allDoctor = DoctorDao.getAllDoctor();
				Iterator<Doctor> drIterator = allDoctor.iterator();
				while (drIterator.hasNext()) {
					Doctor dr = drIterator.next();
					System.out.println(dr.getDoc_id() + " " + dr.getDoc_name() + " " + dr.getDOB() + " " + dr.getSpeciality()
							+ " " + dr.getCity() + " " + dr.getPhone_no() + " " + dr.getFees());
				}
			}
		}