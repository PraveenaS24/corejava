/**
 * 
 */
package com.chainsys.unittest;

import com.chainsys.classandmethods.Employee;

/**
 * @author prav3109
 *
 */
public class EmployeeTester {
	public static void testName() {
		Employee firstEmployee=new Employee(3636);
		firstEmployee.setName("Arivu");
		System.out.println(firstEmployee.getName());
	}
   public static void testCity()
   {
	   Employee firstEmployee=new Employee(3636);
	   firstEmployee.setCity("Thanjavur");
	   System.out.println(firstEmployee.getCity());
	   
			   
   }
}
