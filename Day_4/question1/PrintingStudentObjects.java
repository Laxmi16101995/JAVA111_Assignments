package com.question1;

public class PrintingStudentObjects {
	
	public static void main(String[] args) {
		
		Student s1= new Student();
		s1.setRollNumber(10);
		s1.setName("Laxmi");
		s1.setAge(25);
		s1.setMarks(250);
		System.out.println("                      Sudent 1: ");
		s1.showObject();
		
		
		Student s2= new Student(50,"Aditi",53,365);
		System.out.println("                      Sudent 2: ");
		s2.showObject();
		
	}

}
