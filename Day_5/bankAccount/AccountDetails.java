package com.bankAccount;

import java.util.Scanner;

public class AccountDetails {
	
	
	
	public Account getAccountDetails(int accountId1, int balance1, String accountType1) {
		
		Account acc= new Account();
		acc.setAccountId(accountId1);
		 if(balance1>0) {
			acc.setBalance(balance1);
		}else{
			System.out.println("Balance should be positive");
		}
		acc.setAccountType(accountType1);
		return acc;
	}
	
	
	public int getWithdrawAmount() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Withdrwal ruppee:");
		int peise= scan.nextInt();
		if(peise<=0) {
			System.out.println("Amount should be positive");
			return -1;
		}else {
			return peise;
		}
	}
	
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter accountId: ");
		int accountId= scan.nextInt();
		System.out.println("Enter accountType: ");
		String accountType= scan.next();
		System.out.println("Enter balance: ");
		int balance= scan.nextInt();
		
		AccountDetails accD= new AccountDetails();
		
		Account obj=accD.getAccountDetails(accountId, balance, accountType);
		
		int withDraw= accD.getWithdrawAmount();
		
		obj.withdraw(withDraw);

	}
	

}
