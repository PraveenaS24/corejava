package com.chainsys.unittest;

import com.chainsys.test.Bank;

public class BankTest {
	public static void testName() {
		Bank sc=new Bank(3636);
		sc.setName("Srek");
		System.out.println(sc.getName());
	}

	public static void testAccountNumber() {
		Bank sc =new Bank(3636);
		sc.setAccountNumber("3636333");
		System.out.println(sc.getAccountNumber());
	}

	public static void testAddress() {
		Bank sc =new Bank(3636);
		sc.setAddress("Vanagaram,chennai");
		System.out.println(sc.getAddress());
	}

	public static void testPhoneNumber() {
		Bank sc =new Bank(3636);
		sc.setAccountNumber("9344074238");
		System.out.println(sc.getPhoneNumber());

	}

	public static void testEmailid() {
		Bank sc =new Bank(3636);
		sc.setAccountNumber("ppp@gmail.com");
		System.out.println(sc.getEmailid());

}
}
