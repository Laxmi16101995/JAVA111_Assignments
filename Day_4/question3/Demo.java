package com.question3;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student sDemo= new Student();
		System.out.println("---------------------------Student 1");
		Student j= sDemo.getStudent(true);
		System.out.println("Roll Number: "+ j.getRollNumber()); 
		System.out.println("Roll Number: "+ j.getName()); 
		System.out.println("Roll Number: "+ j.getAddress());
		System.out.println("Roll Number: "+ j.getcollageName());
		
		
		System.out.println("---------------------------Student 2");
		Student j1= sDemo.getStudent(false);
		System.out.println("Roll Number: "+ j1.getRollNumber()); 
		System.out.println("Roll Number: "+ j1.getName()); 
		System.out.println("Roll Number: "+ j1.getAddress());
		System.out.println("Roll Number: "+ j1.getcollageName());
	}

}
