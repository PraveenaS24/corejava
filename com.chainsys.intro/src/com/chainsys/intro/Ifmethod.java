/**
 * 
 */
package com.chainsys.intro;

public class Ifmethod {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printNumberOneToHundred();
		//matrix;
		triangle();
	}
		public static void printNumberOneToHundred()
		{
			int count=0;
			for(count=0;count<=100;count++)
			{
				System.out.println(count +" ");
		}
   
	}
		public static void matrix()
		{
			int countA=0;
			for(countA=1;countA<=5;countA++)
			{
				for(int countB=1;countB<=10;countB++)
				{
					System.out.println(countB+" ");
				}
				System.out.println();
			}
		
		}
		public static void triangle() {
			int countA=0;
			for(countA=1;countA<=5;countA++)
			{
				for(int countB=1;countB<countA;countB++)
				{ System.out.println(countA);
				}
				System.out.println();
			}
		}
}

				
				
				
			
					
		


