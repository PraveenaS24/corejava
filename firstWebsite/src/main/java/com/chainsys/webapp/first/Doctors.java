package com.chainsys.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;
import com.chainsys.miniproject.dao.DoctorDao;
import com.chainsys.miniproject.pojo.Doctor;
import com.chainsys.miniproject.pojo.Employees;


/**
 * Servlet implementation class Doctors
 */
public class Doctors extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Doctors() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		List<Doctor> allDoctor = DoctorDao.getAllDoctor();
		Iterator<Doctor> drIterator = allDoctor.iterator();
		while (drIterator.hasNext()) {
			Doctor dr = drIterator.next();
			out.println("<br>"+dr.getDoc_id() + "<br> " + dr.getDoc_name() + "<br> " + dr.getDOB() + "<br> " + dr.getSpeciality()
					+ " " + dr.getCity() + "<br> " + dr.getPhone_no() + "<br> " + dr.getFees());
	}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(request.getParameter("change").equals("Add_doc")) {
		PrintWriter out = response.getWriter();
		try {
			Doctor newdoc = new Doctor();
			String id = request.getParameter("id");
			try {
				Validator.checkStringForParse(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();				
			}
			int docId = Integer.parseInt(id);
			newdoc.setDoc_id(Integer.parseInt(id));
			try {
				Validator.CheckNumberForGreaterThanZero(docId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();				
			}			
			newdoc.setDoc_id(docId);
			String name = request.getParameter("name");
			try {
				Validator.checkStringOnly(name);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();				
			}
			newdoc.setDoc_name(name);
			SimpleDateFormat hire_dateFormate = new SimpleDateFormat("dd/MM/yyyy");
			String doc_HireDate = request.getParameter("date");
			// Date hire_date=hire_dateFormate.parse(emp_HireDate);

			try {
				Validator.checkDateFormat(doc_HireDate);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			Date newDate = null;
			try {
				newDate = hire_dateFormate.parse(doc_HireDate);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			try {
				Validator.CheckNofutureDate(newDate);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}

			newdoc.setDOB(newDate);
			String sp = request.getParameter("specilyst");
			try {
				Validator.checkStringOnly(sp);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			newdoc.setSpeciality(sp);			
			String cy = request.getParameter("city");
			try {
				Validator.checkStringOnly(cy);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			newdoc.setCity(cy);
			String phone=request.getParameter("phone");
			try {
				Validator.checklengthOfPhno(phone);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			Long phone1=Long.parseLong(phone);
			newdoc.setPhone_no(phone1);
            String fee=request.getParameter("fees");
			float fees = Float.parseFloat(fee);
			try {
				Validator.checkfee(fees);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			newdoc.setFees(fees);
			int result = DoctorDao.insertDoctor(newdoc);
		    out.println("Record added : " + result);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		}else if(request.getParameter("change").equals("Update")) {
			doPut(request,response);
		}else if(request.getParameter("change").equals("Delete")) {
			doDelete(request,response);
	}
	}	
		
	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try {
			Doctor newdoc = new Doctor();
			String id = request.getParameter("id");
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
			out.println("Deleted successfully "+result);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try {
			Doctor newdoc = new Doctor();
			String id = request.getParameter("id");
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
			String name = request.getParameter("name");
			try {
				Validator.checkStringOnly(name);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newdoc.setDoc_name(name);
			SimpleDateFormat hire_dateFormate = new SimpleDateFormat("dd/MM/yyyy");
			String doc_HireDate = request.getParameter("date");
			// Date hire_date=hire_dateFormate.parse(emp_HireDate);

			try {
				Validator.checkDateFormat(doc_HireDate);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			Date newDate = null;
			try {
				newDate = hire_dateFormate.parse(doc_HireDate);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			try {
				Validator.CheckNofutureDate(newDate);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			newdoc.setDOB(newDate);
			String sp = request.getParameter("specilyst");
			try {
				Validator.checkStringOnly(sp);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newdoc.setSpeciality(sp);
			// newdoc.setSpeciality(sc.nextLine());
			String cy = request.getParameter("city");
			try {
				Validator.checkStringOnly(cy);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newdoc.setCity(cy);
			String phone=request.getParameter("phone");
			
			try {
				Validator.checklengthOfPhno(phone);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			Long phone1=Long.parseLong(phone);
			newdoc.setPhone_no(phone1);
			String feess= request.getParameter("fees");
			float fees =Float.parseFloat(feess);
			try {
				Validator.checkfee(fees);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newdoc.setFees(fees);
			int result = DoctorDao.updateDoctor(newdoc); 
			out.println("Update record "+result);
		}catch(Exception err)
		{
			err.printStackTrace();
		}
	}

}
