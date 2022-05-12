
package com.chainsys.intro;

public class Sixth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      // printNumbersOnetoTen();
	    //matrix();
	    printMatrix();
	}
	 public static void printNumbersOnetoHundred()
	 {
		 int count =0;
		 for(count=0;count<=100;count++)
		 {
			 System.out.println(count+" ");		 
	 }

}
 public static void printNumbersTentoOne()
    {
    int count=0;
    for(count=10;count>=1;count--)
    {
    	System.out.println(count +" ");
    }
   }
  public static void printMatrix()
  {
	  int countA=0;
	  for(countA=1;countA<=5;countA++)
	  {
		for(int countB=5;countB> countA;countB--)
     {
    	System.out.print(" ");
     }
		for(int countC=countA;countC>=1;countC--)
		{
			System.out.print(countC);
      }
        for(int countD=2;countD<=countA;countD++) {
        	System.out.print(countD);
        }
        System.out.println();
	  }
   
	  for(countA=4;countA>=1;countA--)
	   {
		 for(int countB=5;countB>countA;countB--)
		 {
			 System.out.print(" ");
		 }
         for(int countC=countA;countC>=1;countC--) 
	      {
		   System.out.print(countC);
	      }
		   for(int countD=2;countD<=countA;countD++)
		   {
			  System.out.print(countD);
		   }
			  System.out.println();
	    }
      }
   }