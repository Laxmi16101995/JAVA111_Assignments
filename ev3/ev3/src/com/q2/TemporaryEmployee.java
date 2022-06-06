package com.q2;

public class TemporaryEmployee extends Employee{

	private int hoursWorked;
	private int hourlyWages;
	
	public TemporaryEmployee(int employeeId, String employeeName,int hoursWorked, int hourlyWages) {
		super(employeeId, employeeName);
	}

	@Override
	void calculateSalary() {
		salary = hoursWorked * hourlyWages;
		//Set this value to the salary attribute.
	}
	
	
}
