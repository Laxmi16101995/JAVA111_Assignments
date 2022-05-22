package com.question1_4;

public class Demo {
	
	public Demo(){
		this(10000000); 
		System.out.println("It is a part of Constructor Demo with no parameter");
	}
	
	public Demo(int i){
		this(10f); 
		System.out.println("It is a part of Constructor Demo with parameter int 'i'");
		
	}
	
	public Demo(float f){
		this("Hello");
		System.out.println("It is a part of Constructor Demo with parameter float 'f'");
		
	}

	public Demo(String s){
		//this("Hello");
		System.out.println("It is a part of Constructor Demo with parameter string 's'");
		
	}


}
