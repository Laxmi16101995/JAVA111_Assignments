package com.question2;
import java.util.Scanner;
public class Course {
	
	int courseId;
	String courseName;
	int courseFee;
	
	void displayCourseDetails() {
		//Course obj= new Course();
		System.out.println("courseId: "+ courseId);
		System.out.println("courseName: "+ courseName);
		System.out.println("courseFee: "+ courseFee);
	}
	
	static void authenticate(String username, String password) {
		
		if(username.contentEquals("Admin") && password.contentEquals("1234") ) {
			Course obj1= new Course();
			obj1.courseId=101;
			obj1.courseName="Laxmi";
			obj1.courseFee= 2000;
			obj1.displayCourseDetails();
		}
		else {
			System.out.println("Invalid Username or password");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Course obj= new Course();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username:");
		String username=sc.next();
		sc.nextLine();
		System.out.println("Enter Password:");
		String password=sc.next();
		//String pass= toString(password);
		obj.authenticate(username,password);
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Username:");
		String username1=sc1.next();
		sc1.nextLine();
		System.out.println("Enter Password:");
		String password1=sc1.next();
		//String pass= toString(password);
		obj.authenticate(username1,password1);
	}

}
