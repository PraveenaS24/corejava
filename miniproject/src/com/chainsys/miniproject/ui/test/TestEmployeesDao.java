package com.chainsys.miniproject.ui.test;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.dao.EmployeesDao;
import com.chainsys.miniproject.pojo.Employees;

public class TestEmployeesDao {
 public static void testGetAllEmployees()
 {
     List<Employees> allEmployees=EmployeesDao.getAllEmployees();
	 Iterator<Employees> empIterator=allEmployees.iterator();
	 while(empIterator.hasNext())
	 {
		 Employees emp = empIterator.next();
         System.out.println(emp.getEmp_Id()+" "+emp.getFirst_name()+""+emp.getSalary()); 
	 }
 }
 public static void testGetEmployeesById()
 {
	 Employees emp=
	 EmployeesDao.getEmployeesById(3);
	 System.out.println(emp.getEmp_Id()+" "+emp.getFirst_name()+""+emp.getSalary());
 }
 public static void testInsertEmployees()
 {
	 Employees newemp=new Employees();
	 newemp.setEmp_Id(300);
	 newemp.setFirst_name("Mom");
	 newemp.setLast_name("Dad");
	 newemp.setEmail("mom@123.com");
	 Calendar c1=Calendar.getInstance();
	 java.util.Date newdate=c1.getTime();
	 newemp.setHire_date(newdate);
	 newemp.setJob_id("IT_PROG");
	 newemp.setSalary(220000);
	 int result=EmployeesDao.insertEmployees(newemp);
	 System.out.println(result);
 }
 public static void testUpdateEmployees() {
	 Employees oldemp = EmployeesDao.getEmployeesById(126);
     System.out.println(oldemp.getEmp_Id()+ " " + oldemp.getFirst_name()+" " + oldemp.getSalary());
     oldemp.setFirst_name("Rishya");
     oldemp.setLast_name("sirungier");
     oldemp.setEmail("rishya123@gmail.com");
     Calendar c1 = Calendar.getInstance();
     java.util.Date newDate = c1.getTime();
     oldemp.setHire_date(newDate);
     oldemp.setJob_id("IT_PROG");
     oldemp.setSalary(70000);
     int result = EmployeesDao.updateEmployees(oldemp);
     System.out.println(result);
 }
 public static void testDeleteEmployee() {
		int result = EmployeesDao.deleteEmployees(126);
		System.out.println(result);
  }
}
 