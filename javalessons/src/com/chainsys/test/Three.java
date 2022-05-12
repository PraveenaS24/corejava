package com.chainsys.test;

public class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		armstrongNumber();
	}
	public static void armstrongNumber()
	{
		int n,a,k,c=0;
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter a Number");
		n=sc.nextInt();
		k=n;
		while(n>0)
		{
			a=n%10;
			c=c+(a*a*a);
			n=n/10;
		}
		if(c==k)
		{
			System.out.println("same as input");
		}
		else
		{
			System.out.println("Differnt number");
		}
	}
}
		

