package com.q2;

public class ScienceStudent extends Student{
	
	int phisicsMarks;
	int chemistryMarks;
	int mathsMarks;
	
	@Override
	int getPercentage() {
		
		int sum= phisicsMarks+chemistryMarks+mathsMarks;
		int div=sum/300;
		int per= div*100;
		return per;
	}

	@Override
	public String toString() {
		return "ScienceStudent [phisicsMarks=" + phisicsMarks + ", chemistryMarks=" + chemistryMarks + ", mathsMarks="
				+ mathsMarks + ", name=" + name + ", address=" + address + ", getPercentage()=" + getPercentage() + "]";
	}
	
	

}
