package com.student;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of student object to be created :");
		int numobj= scan.nextInt();
		
		int[] studentArr= new int[numobj];
		int sum=0;
		
		Student s=new Student();
		
		for(int i=0; i<numobj; i++) {
			
			System.out.println("Enter Name :");
			String name= scan.next();
			System.out.println("Enter roll number :");
			int roll= scan.nextInt();
			System.out.println("Enter Marks :");
			int Marks= scan.nextInt();
			sum+=Marks;
			scan.nextLine();
			System.out.println("Enter Address :");
			String address= scan.nextLine();
			
			s.setName(name);
			s.setMarks(Marks);
			s.setRoll(roll);
			s.setAddress(address);
			System.out.println("Name :"+ s.getName());
			System.out.println("roll number :"+ s.getRoll());
			System.out.println("Marks :"+ s.getMarks());
			System.out.println("Address :"+ s.getAddress());
			
			
			
		}
		
		System.out.println("Average: "+sum/numobj);

	}

}
