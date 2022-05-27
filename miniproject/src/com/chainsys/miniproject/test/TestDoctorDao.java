package com.chainsys.miniproject.test;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.dao.DoctorDao;
import com.chainsys.miniproject.pojo.Doctor;

public class TestDoctorDao {
	public static void testgetAllDoctors()
	{
		List<Doctor> allDoctors = DoctorDao.getAllDoctor();
		Iterator<Doctor> docIterator = allDoctors.iterator();
		while(docIterator.hasNext()) {
			Doctor doc= docIterator.next();
			System.out.println(doc.getDoc_id()+" "+doc.getDoc_name()+" "+doc.getDOB()+" "+doc.getSpeciality()+" "+doc.getCity()+" "+doc.getPhone_no()+"  "+doc.getFees());
			}
	}
	public static void testGetDoctorById()
	{
		Doctor doc =  DoctorDao.getDoctorById(1);
		System.out.println(doc.getDoc_id()+" "+doc.getDoc_name()+" "+doc.getDOB()+" "+doc.getSpeciality()+" "+doc.getCity()+" "+doc.getPhone_no()+"  "+doc.getFees());
	}
	public static void testInsertDoctor()
	 {
	     Doctor newdoc=new Doctor();
	     newdoc.setDoc_id(18);
	     newdoc.setDoc_name("Sanjay");
	     Calendar c1=Calendar.getInstance();
	     java.util.Date newdate=c1.getTime();
	     newdoc.setDOB(newdate);
	     newdoc.setSpeciality("Heart Specilyst");
	     newdoc.setPhone_no(97872345);
	     newdoc.setCity("Chennai");
	     newdoc.setFees(1400);
	     int result=DoctorDao.insertDoctor(newdoc);
	     System.out.println(result);
	 }
	public static void testUpdateDoctor()
	{
		Doctor oldDoctor = DoctorDao.getDoctorById(1);
		System.out.println(oldDoctor.getDoc_id()+" "+oldDoctor.getDoc_name()+"  " +oldDoctor.getFees());
		oldDoctor.setDoc_id(18);
		oldDoctor.setDoc_name("Sheik");
		Calendar c1 = Calendar.getInstance();
		java.util.Date newDate =c1.getTime();
		oldDoctor.setDOB(newDate);
		oldDoctor.setSpeciality("Brain");			
		oldDoctor.setCity("Madurai");
		oldDoctor.setPhone_no(9877653);
		oldDoctor.setFees(2000);
		int result = DoctorDao.updateDoctor(oldDoctor);
		System.out.println(result);
		
	}				
	public static void testDeleteDoctor() {
		int result = DoctorDao.deleteDoctor(18);
		System.out.println(result);
	}
	}