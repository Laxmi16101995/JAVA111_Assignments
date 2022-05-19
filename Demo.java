package com.masai;

public class Demo {
	
	Demo(){
		System.out.println("It is a part of Constructor Demo with no parameter");
	}
	
	Demo(String s){
		System.out.println("It is a part of Constructor Demo with parameter string 's'");

	}
	
	Demo(int i){
		System.out.println("It is a part of Constructor Demo with parameter int 'i'");

	}
	
	Demo(float f){
		System.out.println("It is a part of Constructor Demo with parameter float 'f'");

	}
	

	
	public static void main(String[] args) {
		
		Demo d1= new Demo();
		d1= new Demo("Laxmi");
		d1= new Demo("10");
		d1= new Demo(10.55f);
		
		
		
	}

}
