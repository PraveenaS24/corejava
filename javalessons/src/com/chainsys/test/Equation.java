package com.chainsys.test;
import java.math.*;
import java.util.Scanner;

public class Equation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solvingEquation();
		

	}

	private static void solvingEquation() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a = 0;
		System.out.println("Enter a number between 5 to 10:");
		a=sc.nextInt();
		sc.close();
		int x=a;
		int y=(2*(x*x)+x+5);
		System.out.println(y+" ");
		
		
	}

}
