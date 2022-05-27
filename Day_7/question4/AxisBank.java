package com.question4;

public class AxisBank extends Bank{

	double rateOfInterest;
	
	@Override
	void displayDetails() {
		System.out.println("-----------------Axis bank object");
		System.out.println( branchName="AxisBank" +" :branchName");
		System.out.println( IfscCode ="Axis5644" +" :IfscCode");
		System.out.println( rateOfInterest=16.52);

	}
	
	
	void getCreditCard() {
		System.out.println("Get the Credit Card from the Axis bank");
	}
}
