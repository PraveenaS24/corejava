package com.chainsys.test;

public class Alphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="ArivuPrithvi";
		boolean result = s1.matches("[a-zA-Z]+");
		System.out.println(s1);
		System.out.println(result);
		char[] nameAsCharacters=s1.toCharArray();
		int lengthOfCharArray=nameAsCharacters.length;
		if(lengthOfCharArray>=8) {
		
		System.out.println("Must greater or equals to given string");
		System.out.println("Length of your name is:"+lengthOfCharArray);
		return;
		}
		else
		{
			System.out.println("Not Enough");
			
		}

	}
}

