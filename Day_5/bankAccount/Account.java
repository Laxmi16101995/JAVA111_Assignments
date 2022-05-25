package com.bankAccount;

public class Account {

	private int accountId;
	private int balance;
	private String accountType;
	
	public void setAccountId(int a) {
		accountId= a;
	}
	public int getAccountId() {
		return accountId;
	}
	
	public void setBalance(int a) {
		balance= a;
	}
	public int getBalance() {
		return balance;
	}
	
	public void setAccountType(String a) {
		accountType= a;
	}
	public String getAccountType() {
		return accountType;
	}
	
	
	
	public boolean withdraw(int a) {
		
		if(a < this.balance) {
			//System.out.println("jhgthjfty"+getBalance());
			int balance1= this.balance-a;
			setBalance(balance1);
			System.out.println("Balance amount after withdraw : "+ getBalance());
			return true;
		}else{
			System.out.println("Sorry!!! No enough balance");
			return false;
		}
		
	}
}
