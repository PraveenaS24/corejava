/**
 * 
 */
package com.chainsys.classandmethods;

/**
 * @author prav3109
 *
 */
public class Bank {
    public static int currentBalance;
    public static String customerName;
    public static int accountNumber;
    public static void deposite(int paramAmount)
    {
    	currentBalance=currentBalance+paramAmount;
    	}
    public static int withdraw(int paramAmount)
    {
    	System.out.println("withdraw amountis: " +paramAmount);
    	currentBalance=currentBalance-paramAmount;
    	return paramAmount;
     }
    public static void openAccount(String paramName,int paramAccountNumber)
    {
      System.out.println("The Account Holder Name is:" +" "+paramName);
      System.out.println("The Account number is:" +paramAccountNumber);
      customerName=paramName;
      accountNumber=paramAccountNumber;
    }
}