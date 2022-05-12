package com.chainsys.strings;



public class StringReverse {

public static void main(String[] args) {
		
		
		String str1="javaproject";
		String str2=" ";
		for(int a=str1.length()-1;a>=0;a-- )
		{
			str2=str2+str1.charAt(a);
		}
		System.out.println(str2);
		}
	}


	
	


