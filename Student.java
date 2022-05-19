package com.masai;

public class Student {
	
	int roll;
	int marks;
	String name;
	
	void displayStudentDetails(int rollNumber,int examMarks,String studentName) {
		
		System.out.println("Roll Number is : "+rollNumber);
		System.out.println("Name is : "+studentName);
		System.out.println("Marks is : "+examMarks);
		
	}
	
	public static void main(String[] args) {
		
		Student stu1= new Student();
		stu1.roll= 60;
		int rollNumber=stu1.roll;
		stu1.marks= 560;
		int examMarks=stu1.marks;
		stu1.name= "Laxmi";
		String studentName=stu1.name;
		stu1.displayStudentDetails(rollNumber,examMarks,studentName);
		
		
		
		Student stu2= new Student();
		stu2.roll= 70;
		int rollNumber2=stu2.roll;
		stu2.marks= 760;
		int examMarks2=stu2.marks;
		stu2.name= "Sandhya";
		String studentName2=stu2.name;
		stu2.displayStudentDetails(rollNumber2,examMarks2,studentName2);
		
		
		stu1=null;
		stu2=null;
		
		//System.out.println(stu1);
		
	}

}
