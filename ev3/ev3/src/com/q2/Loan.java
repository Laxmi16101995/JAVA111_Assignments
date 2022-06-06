package com.q2;

public class Loan {
	
	private Loan() {
		
	}

	public double calculateLoanAmount(Employee employeeObj) {
		
		if(employeeObj instanceof PermanentEmployee) {
			
			double am= employeeObj.salary*15;
			double amm= am/100;
			return amm;
		}if(employeeObj instanceof TemporaryEmployee) {
			
			double am= employeeObj.salary*10;
			double amm= am/100;
			return amm;
		}
	}
}
