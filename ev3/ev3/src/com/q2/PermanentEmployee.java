package com.q2;

public class PermanentEmployee extends Employee {

	private double basicPay;
	
	public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
		super(employeeId, employeeName);
		this.basicPay=basicPay;
	}
	
	



	@Override
	void calculateSalary() {
		
		double pfAmount= this.basicPay * 0.12;
		double salary= this.basicPay – pfamount;
		
		//PermanentEmployee pm= new PermanentEmployee(101,"Las",321.25);
	
		
		
	}
}
