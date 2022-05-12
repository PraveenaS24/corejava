/**
 * 
 */
package com.chainsys.unittest;

import com.chainsys.classandmethods.Bank;

/**
 * @author prav3109
 *
 */
public class BankTestClass {

	/**
	 * @param args
	 */
public static void testDeposite()
{
	System.out.println("Before Balance"+Bank.currentBalance);
	Bank.deposite(10000);
	System.out.println("Ater Balance"+Bank.currentBalance);	
}
public static void testWithdraw()
{
	System.out.println("Before Balance"+Bank.currentBalance);
	int withdraw=Bank.withdraw(5000);
	System.out.println("After Balance"+Bank.currentBalance);
}
	public static void testOpenaccount()
	{
		Bank.openAccount("Arivu",12536357);
		System.out.println(Bank.customerName);
		System.out.println(Bank.accountNumber);
	   }	
	 }
			
	
