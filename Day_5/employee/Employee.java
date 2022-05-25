package com.employee;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private double salary;
	private double netSalary;
	
	
	public Employee(){}
	
	public void setRollNumber(int rollNum) {
		employeeId=rollNum;
	}
	public int getRollNumber() {
		return employeeId;
	}
	
	
	public void setName(String name1) {
		employeeName=name1;
	}
	public String getName() {
		return employeeName;
	}
	
	
	public void setSal(int sal) {
		salary=sal;
	}
	public double getSal() {
		return salary;
	}
	
	public void setnSal(Double nsal) {
		netSalary=nsal;
	}
	public double getnSal() {
		return netSalary;
	}
	
	
	public Object showObject(int id,String name,int salary) {
		//Employee e= new Employee();
		setRollNumber(id);
		setName(name);
		setSal(salary);
		return this;
	}
	
	public void calculateNetSalary(int pfpercentage) {
		
		int a= 100-pfpercentage;
		double c= getSal() ;
		double b= (a*c/100);
		
		setnSal(b);
		
	}


}
