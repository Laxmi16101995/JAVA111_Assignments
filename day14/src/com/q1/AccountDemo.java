package com.q1;

import java.util.Scanner;

public class AccountDemo {

	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Withdrawal amount:");
		int am = sc.nextInt();
		Account ac= new Account("123456");
		ac.deposit(2000);
			
		try {
			System.out.println("amount after withdrawal: "+ac.withdraw(am));
		} catch (InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("Main end");
		
	}
}
