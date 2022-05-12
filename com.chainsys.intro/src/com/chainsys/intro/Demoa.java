package com.chainsys.intro;

public class Demoa {

	public static int DataA; //static global variable
	public final int DataB;//immutable global variable (not static)
	public final static int DAtaC=300; 
	//non static member field
	/*
	//constructor
	/*
	 * Construct is a special method
	 * The name of the constructor and the name of the class will be same
	 * Constructor dont have return type
	 * Constructor can take parameters
	 */
	public Demoa(int dataB)
	{
		/* Assigning value to the global read-only field(this.DataB)
		 * 
		 */
		this.DataB=dataB;
	  }
	/**
	 * Static method can be called without an object
	 */
	
		public static void sayHello()
		{
			System.out.println("Hello Developer!!!");
		}
       public void greetUser()
       {
    	   System.out.println("Greetings USER!!!");
      }

   }
