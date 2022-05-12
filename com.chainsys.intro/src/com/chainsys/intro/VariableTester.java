package com.chainsys.intro;

import com.chainsys.variables.Calculator;

/**
import 
* @author Chainsys - Venkat
* @category To test Demoa class,its fields,and methods
*date : Mar 24 2022
*/
 public class VariableTester {
/**
 * Test static variable
 */
	public static void testGlobalVariable() {
		//display the value of static field
		System.out.println("DataA: " + Demoa.DataA);
		// display the value of immutable field
		// this is not possible without an object
		// System.out.println("DataB: " + Demoa.DataB);
		// display the value of constant field
		System.out.println("DataC:" + Demoa.DAtaC);
		// modifying value of the static field DataA
		Demoa.DataA=2345;
		System.out.println("DataA: " + Demoa.DataA);
		
		// modifying value of the static field DataC
		// ERROR: The final field Demoa.DataC cannot be aasigned
		//
		 Demoa.DataA=2345; 
		 System.out.println("DataA:"+Demoa.DataA);
		}
	
 public static void testImmutableVariable()
 {
	 /*cannot make a static reference to the non-static field Demoa.DataB
	  //Demoa.DataB = 123
	   /**
	    * first create an object or the class
	    * pass an int value as an argument to the constructor
	    * access the immutable instance field using the object reference
	    */
	 
	 Demoa firstObject=new Demoa(123);{
	 System.out.println(firstObject.DataB);
	 }
 }
	 /**
	  * value assigned to an immutable field can not be changed
	  *value for the immutable field can be assigned only through the constructor
	  ***/
	 //firstObject.DataB=567;
	   //*
	  /* calling static method using class name
	  * wihtout creating an object
	  *created on:25 march 2022
     }
 /**
  * 
  */
 public static void testStaticMethod()
 {
   //ERROR
	// Demoa.GreetUser();
	 Demoa firstObject=new Demoa(111);
	 //call the non static method
	 firstObject.greetUser();
	 } 
 
 public static void testCalculator()
 {
	 System.out.println(Calculator.add(3,6));
	 System.out.println(Calculator.Mul(3,6));
	 System.out.println(Calculator.Sub(3,6));
	 System.out.println(Calculator.Divide(3,6));
 }
 
 }
 