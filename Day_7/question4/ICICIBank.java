package com.question4;

public class ICICIBank extends Bank{

	double rateOfInterest;
	
	
	@Override
	void displayDetails() {
		System.out.println("-----------------ICICI bank object");
		System.out.println( branchName="ICICIBank" +" :branchName");
		System.out.println( IfscCode ="ICICI5644" +" :IfscCode");
		System.out.println( rateOfInterest=10.52);

	}
}
