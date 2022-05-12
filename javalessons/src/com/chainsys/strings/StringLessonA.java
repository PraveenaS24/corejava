
package com.chainsys.strings;

import java.util.Scanner;

public class StringLessonA {
	public static void lessonOne()
	{
		String firstString="Chainsys";
		System.out.println(firstString);
		char dataOne[]={'C','h','a','i','s','y','s'};
		String secondString=new String(dataOne);
		System.out.println(secondString);
		String thirdString=new String(new char[]{'c','h','a','i','s','y','s'});
		System.out.println( thirdString);
	}
	public static void lessonTwo()
	{
		String firstString="Hello";
		String secondString="Hello";
		String thirdString="Hello";
		int firstNumber=100;
		int secondNumber=100;
		int thirdNumber=100;
		System.out.println(firstString);
		System.out.println(secondString);
        firstString="Welcome";
        System.out.println(firstString);
		System.out.println(secondString);
	}
	public static void creatingStringInaForLoop()
	{
		for(int count=0;count<10;count++)
		{
			String s1="Hello";
		}
	}
	public static void stringToCharArray() {
		String secondString="Hope it rain";
		System.out.println("Before Trim"+secondString.length());
		secondString=secondString.trim();
		System.out.println("After Trim"+secondString.length());
	}
	
	
	
		/*java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("Enter a Word");
		String firstString=scanner.nextLine();
		int stringlength=firstString.length();
		System.out.println("Length" +stringlength);
		char[] data=firstString.toCharArray();
		int dataarraylength=data.length;
		System.out.println("Length "+dataarraylength);
		
	} */
	public static void stringToUpperLower()
	{
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("Enter a Word");
		String firstString=scanner.nextLine();
		scanner.close();
		System.out.println(firstString);
		String StringInUppercase=firstString.toUpperCase();
		System.out.println("toUpperCase=" +StringInUppercase);
		
		System.out.println("s1=" +firstString);
		String StringInLowercase=firstString.toLowerCase();
		System.out.println("toLowerCase=" +StringInLowercase);
		System.out.println("s1=" +firstString);
		//substring
		//from the 4th char till end
		String subString=firstString.substring(2,6);
		System.out.println(subString);
		//replace
		String replacedstring=firstString.replace('a','e');
		System.out.println(replacedstring);
		//equals
		boolean flag1=firstString.equals(StringInUppercase);//false
		System.out.println(flag1);
		//equalsIgnoreCase
		boolean flag=firstString.equalsIgnoreCase(StringInUppercase);
		System.out.println(flag);
	}
		
			public static void testStringTrim()
			{
				String secondString="     Hope       it     rain    ";
				System.out.println("Before Trim:" +secondString.length());
				secondString=secondString.trim();
				System.out.println("After Trim: +secondString.length());");}
			public static void testSpilt() {
				String firstString="    Tom and Jerry are good friends  ";
				String trimmedString=firstString.trim();
				String[] data=trimmedString.split(" ");
				int count=data.length;
				System.out.println("word count"+count);
			}
	
	public static void testSpiltDays() {
		String weekdays="Mon;Tue;Wed;Thu;Fri;Sat;Sun";
		String[] data=weekdays.split(";");
		int count=data.length;
		System.out.println("Days Count"+count);
		for (int index=0;index<count;index++)
		System.out.println("Enter a sentence");
		String sentence= "";
		Scanner scanner = null;
		try {
			sentence=scanner.nextLine();
			}
		finally
		{
			scanner.close();
		}
	}	
			
			//write code to reverse aString
			public static void reverse()
			{
			java.util.Scanner scanner=new java.util.Scanner(System.in);
			System.out.println("Enter a Sentence");
			String sentence="";
			try {
				sentence=scanner.nextLine();
			} finally {
			  scanner.close();  }
			}
			//TODO: reverse the sentence here
			public static void main(String[] args)
			{
				StringBuffer reverse3=new StringBuffer("pravi");
				System.out.println("reverse3"+reverse3);
				reverse3.reverse();
				System.out.println("After reverse"+reverse3);
			}
}
				
				
