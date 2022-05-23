package question4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter number of students wants to add: ");
		int noSt=sc1.nextInt();
		
		Student s1=new Student();
		for(int i=1; i<=noSt; i++) {
			System.out.println("Enter rollNumber: ");
			int rollNumber=sc1.nextInt();
			
			System.out.println("Enter marks: ");
			int marks=sc1.nextInt();
			
			System.out.println("Enter studentName: ");
			String studentName=sc1.next();
			
			
			s1.Student(rollNumber,marks,studentName);
			
		}
		
	}

}
