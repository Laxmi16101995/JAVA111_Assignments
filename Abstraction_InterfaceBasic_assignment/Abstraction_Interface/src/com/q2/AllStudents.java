package com.q2;

import java.util.Scanner;

public class AllStudents {

	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter address");
		String add= scan.nextLine();
		System.out.println("Enter name");
		String nam= scan.next();
		System.out.println("Enter phisics Marks");
		int phisicsMarks1= scan.nextInt(); 
		System.out.println("Enter chemistry Marks");
		int chemistryMarks1= scan.nextInt(); 
		System.out.println("Enter maths Marks");
		int mathsMarks1= scan.nextInt(); 
		
		ScienceStudent ss= new ScienceStudent();
		ss.address=add;
		ss.name=nam;
		ss.phisicsMarks=phisicsMarks1;
		ss.chemistryMarks=chemistryMarks1;
		ss.mathsMarks=mathsMarks1;
		int per= ss.getPercentage();
		
		System.out.println("----------------Science Student");
		System.out.println(ss.toString());
		
		
		HistoryStudent hs= new HistoryStudent();
		System.out.println("Enter history Marks");
		int historyMarks1= scan.nextInt(); 
		System.out.println("Enter civics Marks");
		int civicsMarks1= scan.nextInt(); 
		hs.address=add;
		hs.name=nam;
		hs.civicsMarks=civicsMarks1;
		hs.historyMarks=historyMarks1;
		
		System.out.println("----------------History Student");
		System.out.println(hs.toString());
	}

}
