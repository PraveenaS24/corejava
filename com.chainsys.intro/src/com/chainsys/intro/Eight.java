package com.chainsys.intro;

import java.util.Scanner;

public class Eight {
	
	public static void main(String[] args)   {
	findEvenNumbers();	
	}
	 
   public static void findEvenNumbers()  {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter any 10 digit Number");
   long value=sc.nextLong();
   sc.close();
   long num=value;
   long reminder=0;
   while(num>0)
   {
	   reminder=num%10;
	   if(reminder%2==0)
	   {
		   System.out.println(reminder);
	   }
	   num=num/10;
       }
     }
   }
 
 
 
 