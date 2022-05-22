package com.question1;

public class Student {
	private int roll;
	private String name;
	private int age;
	private int marks;
	//----------------------------------NO Parameter-------------------------------------------------
	public Student() {
		
	}
	
	public void setRollNumber(int rollnum) {
		roll=rollnum;
	}

	
	public void setName(String name1) {
		name=name1;
	}

	
	
	public void setAge(int age1) {
		if(age1>18 && age1<60) {
			age=age1;
		}
	}

	
	
	public void setMarks(int marks1) {
		if(marks1>0 && marks1<500) {
			marks=marks1;
		}
	}

	
	//-----------------------------------------With parameter------------------------------------------------------------
	
	public Student(int roll1,String name1,int age1, int marks1) {
		
		roll=roll1;
		name=name1;
		age=age1;
		marks=marks1;
		
	}
	
	//-----------------------------------------Display Object-----------------------------------------------------------

	
	public void showObject() {
		
		System.out.println("Roll Number is: "+roll);
		System.out.println("Name is: "+name);
		System.out.println("Age is: "+age);
		System.out.println("Marks are: "+marks);
	}

}
