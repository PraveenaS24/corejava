package com.chainsys.test;
import java.util.Scanner;
public class Jacket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        weather();
        needThings();
	}


	public static void weather() {
		{
			
			Scanner s2=new Scanner(System.in);
			System.out.println("Enter the raning are not");
			String qn=s2.nextLine();
			s2.close();
			System.out.println("To get an Umbrella");
		}
		}
		    public static void needThings() {
		
		    Scanner s1=new Scanner(System.in);
			System.out.println("Enter the Temperature");
			double degree=s1.nextDouble();
			s1.close();
			if(degree<32)
			{
				System.out.println("TO Bring Heavy Jacket");
			}
			else if(degree>=32 && degree<=50) {
				System.out.println("TO Bring Light Jacket");
			}
			else {
				System.out.println("No need Jacket");
			}
		}
	}





	
			