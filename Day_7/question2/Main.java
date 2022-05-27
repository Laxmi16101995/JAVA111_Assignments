package com.question2;

public class Main {

	public static void main(String[] args) {
		
		Student stu = new Student();
		stu.studId=101;
		stu.studName="Laxmi";
		stu.examFee=1200.00;
		
		
		Hosteller hosteller= new Hosteller();
		hosteller.hostelFee=200;
		double hoFee=hosteller.payFee(2000);
		System.out.println("hosteller Fee----"+hoFee);
		
		DayScholar daysco= new DayScholar();
		daysco.transportFee=500;
		double trFee=daysco.payFee(5000);
		System.out.println("DayScholar Fee----"+trFee);

	}

}
