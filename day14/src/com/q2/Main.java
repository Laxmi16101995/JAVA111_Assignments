package com.q2;

import java.util.Scanner;

public class Main {

	static void UserRegistration(String username,String userCountry) throws InvalidCountryException {
		
		if(userCountry.equalsIgnoreCase("India")){
			System.out.println("“User registration done successfully”");
		}else {
			throw new InvalidCountryException("“User Outside India cannot be registered”");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter name:");
		String cn= scanner.next();
		
		System.out.println("Enter country:");
		String cString= scanner.next();
		
		try {
			UserRegistration(cn,cString);
		} catch (InvalidCountryException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
