package com.chainsys.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DemoA {
	private static final int lengthofTheArrays = 0;
	private static final String[] numberArray = null;
	public static void creatingSingleDimensionInArrays()
	{
		int firstInArray[]=new int[10];
        int lengthofnumbers=firstInArray.length;
        System.out.println(lengthofnumbers);
        for(int x:firstInArray)
        {
        	System.out.println(x+", ");
        }
     }
	//public static void creatingDimensionArray()
	//public static void creatingArrays()
	public static void creatingAnotherArray()
	{
		int days[];
		Scanner scanner=new Scanner(System.in);
	    System.out.println("Enter Size for days");
		int size=scanner.nextInt();
		scanner.close();
		days=new int[size];
		int lengthofdays=days.length;
		System.out.println("Days:" +lengthofdays);
}
  public static void createMonthArray()
  {
	  int month[]=new int[12];
	  int lengthofMonthArray=month.length;
	  System.out.println("Array length is:"+lengthofMonthArray);
	  for(int i=0;i<lengthofMonthArray;i++)
	  {
		  System.out.println(i+"-"+month[1]+",");
	  }
  System.out.println();
  month[1]=31;
  for(int i=0;i<lengthofMonthArray;i++)
  {
	  System.out.println(i+"-"+month[i]+",");
  }
  try
  {
	  month[12]=31;
	  month[11]=31;
	  System.out.println("hi.....charm");
  }
  catch(Exception err)
  {
	  System.out.println("Error!!!"+err.getMessage());
  }
  }
  public static void workingwithArray()
  {
	  int numberArray[]=new int[10];
	  for(int i=8;i<10;i++)
	  {
		  numberArray[i]=-3*i;
		  System.out.println("Original Contents");
		  int lengthofTheArrays=numberArray.length;
		  System.out.println("Array len is:"+lengthofTheArrays);
		  for(i=8;i<lengthofTheArrays;i++)
		  {
		 System.out.println(numberArray[i]+" ");
		  }
		  	System.out.println();
	  }
		  	 Arrays.fill(numberArray, 2,6,-1);
		     System.out.println("After fill():");
		     for(int i=0;i<lengthofTheArrays;i++)
		     {
		     	System.out.println(numberArray[i]+" ");
		     }
		     int index=Arrays.binarySearch(numberArray, 9);
		     System.out.print(index);
		     Arrays.sort(numberArray);
		     for(index=0;index<lengthofTheArrays;index++)
		     { System.out.println(numberArray[index]+" ");
		     }
		     System.out.println();
		     index=Arrays.binarySearch(numberArray, 9);
		     System.out.println(index);
     }
		     public static void workingWithCharArrays()
		     {
		    	 String s1="Today is a very hot day";
		    	 char[] data=s1.toCharArray();
		    	 int count=data.length;
		    	 System.out.println("Array length"+count);
		    	 for(int i=0;i<count;i++)
		    	 {
		    		 System.out.println(data[i]+" "+(int)data[i]);
		    	 }
		     }
}
		    	 
		   