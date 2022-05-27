package com.question2;

public class Hosteller extends Student {

	double hostelFee;
	
	@Override
	double payFee(int fee) {
		examFee=fee;
		double fee1= examFee + hostelFee;
		return fee1; 
		
	}
	
	
}
