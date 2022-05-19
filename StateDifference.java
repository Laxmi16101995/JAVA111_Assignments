package com.masai;

public class StateDifference {
	
	static int first=10;
	int second=20;
	
	public static void main(String[] args) {
		
		System.out.println(first);
		
		accessNonStaticVariables();
		
		
	}
	static void accessNonStaticVariables() {
		
		StateDifference s1 = new StateDifference();
		
		System.out.println(s1.second);
		
		
	}
	

}

/*
   						DIFFERANCE
   						
A static variable acts as a global variable and is 
shared among all the objects of the class. A non-static variables are 
specific to instance object in which they are created. To access Non-static variables we
need to create an object.

*/
