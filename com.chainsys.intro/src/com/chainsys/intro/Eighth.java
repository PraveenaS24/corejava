package com.chainsys.intro;

import java.util.Scanner;

public class Eighth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       checkUserName();
	}
   public static void checkUserName()
   {
	    Scanner sc =new Scanner(System.in);
	    //prompt a message in the display console
	    System.out.println("Enter Your Name");
	    //get name from the keyboard (input device),and store the name in a local variable
	    String userName = sc.nextLine();
	    sc.close();
	    //Streams are created and managed by the OS,Scanner is just a handle
	    System.out.println("Name is "+ userName);//display the input value received
	    char[] nameAsCharacters = userName.toCharArray();
	    int lengthOfCharArray=nameAsCharacters.length;
	    System.out.println("Length of your name is : "+ lengthOfCharArray);
	    if(lengthOfCharArray < 3) {
	    	System.out.println("Name must have atleast 3 chars");
	    	return;
	    }
	    if (lengthOfCharArray > 15) {
	     System.out.println("Name must NOT have MORE than 15 chars");
	     return;
	    }
	    // ascii value for Alphabets is between 65 to 90 for UPPER CASE
	    String nameInUpperCase= userName.toUpperCase();
	    //remove blank space before,and after the name
	    nameInUpperCase = nameInUpperCase.trim();
	    char[] uppercaseCharArray=nameInUpperCase.toCharArray();
	    lengthOfCharArray = uppercaseCharArray.length;
	    int asciiValue = 0;
	    for(int index=0;index<lengthOfCharArray;index++)
	    {
	    	asciiValue = (int) uppercaseCharArray[index];
	    	System.out.println("ASCII : " + asciiValue);
	    	if(asciiValue < 65 || asciiValue > 90) {
	    		if(asciiValue !=32) {
	    				System.out.println("IN Valid Character in Name: ");
	    				return;
	    			  }
	    		}
	    	}
	    }
   }