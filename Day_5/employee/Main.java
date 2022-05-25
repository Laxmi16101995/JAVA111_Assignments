package com.employee;

import java.util.Scanner;

public class Main {
	
	public static int getPFPercentage() {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter Your PF Percentage:");
		int pf= scan.nextInt();
		return pf;
	}
	
	public static Employee getEmployeeDetails(int id1,String name1,int salary1,int pf1) {
		Employee e= new Employee();
		
		e.calculateNetSalary(pf1);
		Object o= e.showObject(id1,name1,salary1);
		Employee a = Employee.class.cast(o);
		return a;
		
	}

	public static void main(String[] args) {
		Main d1=new Main();
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter Your ID:");
		int id= scan.nextInt();
		scan.nextLine();
		System.out.println("Enter Your Name:");
		String name= scan.nextLine();
		System.out.println("Enter Your Salary:");
		int salary= scan.nextInt();
		int pf=getPFPercentage();
		Employee human= d1.getEmployeeDetails(id,name,salary,pf);
		System.out.println("id: " +human.getRollNumber());
		System.out.println("Name: " +human.getName());
		System.out.println("Salary: " +human.getSal());
		System.out.println("Net Salary: " +human.getnSal());
		

	}

}
