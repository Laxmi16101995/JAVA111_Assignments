package com.q4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {
	
	static void valid(String username,String password,String mobile) {
		
		if(Pattern.matches("[A-Za-z]{3,8}", username) && 
				Pattern.matches("[A-Za-z]{1,}[0-9]{1,}", password)&& 
				Pattern.matches("[6789]{1}[0-9]{9}", mobile)) {

			Customer c= new Customer();
			c.setMobileNumber(mobile);
			c.setPassword(password);
			c.setUsername(username);
			
			System.out.println(c.toString());
			
		}else {
			System.out.println("Enter valid details");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter username");
		String un= sc.next();
		
		System.out.println("Enter password");
		String ps= sc.next();

		System.out.println("Enter mobile");
		String mo= sc.next();
		
	    valid(un,ps,mo);

	}

}
