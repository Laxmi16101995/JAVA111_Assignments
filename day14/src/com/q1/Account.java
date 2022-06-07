package com.q1;

public class Account {

	String accountNumber;
	double Balance;
	
	
	
	public Account(String accountNumber) {
		super();
		this.accountNumber = accountNumber;
	}
	
	void deposit(int amount) {
		this.Balance= amount;
	}
	
	double withdraw(int amount) throws InsufficientFundsException {
		double a;
		if(amount<this.Balance) {
		
			a=this.Balance- amount;
			
			
		}else {
			throw new InsufficientFundsException("Insufficient balance");
		}
		return a;
	}
}
