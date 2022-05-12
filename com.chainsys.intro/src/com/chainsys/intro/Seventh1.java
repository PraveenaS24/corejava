package com.chainsys.intro;

public class Seventh1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		diamond();
	}
    public static void diamond()
    {
     int countA=0;
     for(countA=1;countA<=5;countA++)
     {
    for(int countB=2;countB<countA;countB++)
     {
     System.out.print(countB);
     }
     for(int countc=countA;countc>=1;countc--)
     {
    	System.out.print(countc);
     }
     System.out.println();
     }
    }
  }
  

