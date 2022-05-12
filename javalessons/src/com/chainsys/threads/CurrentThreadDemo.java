package com.chainsys.threads;

public class CurrentThreadDemo {

		public static void main(String args[])
		{
			try
			{
				Thread t1= Thread.currentThread();
				System.out.println("Main thread ID :"+t1.getId());
				Worker w = new Worker();
				w.callme();
				System.out.println("In Main After Call me");
				
			}
			catch( Exception e)
			{
			System.out.println(e.getMessage());	
			}
		}
	}
	