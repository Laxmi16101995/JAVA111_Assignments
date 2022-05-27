package com.question2;

public class DayScholar extends Student {

	double transportFee;
	
	@Override
	double payFee(int fee) {
		examFee=fee;
		double fee1= examFee + transportFee;
		return fee1; 
		
	}
}
