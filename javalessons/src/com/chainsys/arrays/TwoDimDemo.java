package com.chainsys.arrays;

public class TwoDimDemo {
	public static void creatingTwoDimArray()
	{
		int twod[] []=new int[4][5];
		int rowIndex,colIndex=0;
		int data=0;
		for(rowIndex=0;rowIndex<4;rowIndex++)
		{
			for(colIndex=0;colIndex<4;colIndex++)
			{
				twod[rowIndex][colIndex]=data;
				data++;
			}
			for(rowIndex=0;rowIndex<4;rowIndex++)
			{
				for(colIndex=0;colIndex<5;colIndex++)
				{
				System.out.print(twod[rowIndex][colIndex]+" ");	
				}
				System.out.println();
			}
		}
	}
public static void calculateTotalandAverage()
{
	int marks[][] = new int[][]
	{
		{82,38,45,77,55,0,0},
		{95,99,92,90,85,0,0},
		{85,100,91,92,93,0,0},
		{75,55,92,74,66,0,0},
		{85,75,85,62,75,0,0} };
		int rowIndex,colIndex,sum=0,avg=0;
		int data=0;
		for(rowIndex=0;rowIndex<5;rowIndex++)
		{
			for(colIndex=0;colIndex<5;colIndex++)
			{
				sum+=marks[rowIndex][colIndex];
			}
			marks[rowIndex][5]=sum;
			marks[rowIndex][6]=sum/5;
			sum=0;
		}
		//display the marks,total,Average
		int subjectNo=1;
		for(subjectNo=1;subjectNo<=5;subjectNo++)
		{
			System.out.print("sub"+(subjectNo)+"--");
		}
		{
			System.out.print("Total:");
			System.out.println("Average");
			System.out.println("-----------------------------------------------------");
		    String output="";
		    System.out.println();
		    for(rowIndex=0;rowIndex<5;rowIndex++)
		    {
		    	for(colIndex=0;colIndex<7;colIndex++)
		    	{
		    		int mark=marks[rowIndex][colIndex];
		    		if(mark<100)
		    		{ output=String.format("0%d",mark);
		    		}
		    		else
		    		{
		    			output=String.format("%d",mark);
		    			System.out.print(output);
		    		}
		    		System.out.println();
		    		
		    		
		    		}
		    	}
		    public static void unEvenTwoArray()
		    {
		    	int unEvenTwod=new int[4][];
		    	unEvenTwod[0]=new int[1];
		    	unEvenTwod[1]=new int[4];
		    	unEvenTwod[2]=new int[3];
		    	unEvenTwod[3]=new int[2];
		    	int rowIndex,colIndex,rowlength=0,data=0;
		    	for(rowIndex=0;rowIndex<4;rowIndex++)
		    	{
		    	 rowlength=unEvenTwod[rowIndex].length;
		    	 for(colIndex=0;colIndex<rowlength;colIndex++)
		    	 {
		    		 unEvenTwod[rowIndex][colIndex]=data;
		    		 data++;
		    	 }
		    	}
		    	for(rowIndex=0;rowIndex<4;rowIndex++)
		    	{
		    		rowIndex=unEvenTwod[rowIndex].length;
		    		for(colIndex)
    	
		    		
		    	}
		    	
		    	
		    }
			
			}
           }
		}
		


				
		