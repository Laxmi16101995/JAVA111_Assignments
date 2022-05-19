package com.masai;

public class SwitchProgram {

	public static void main(String[] args) {
		anotherNameOfCity("nanded");
	}
	
	public static void anotherNameOfCity(String city){
		//System.out.println(city);
		switch(city){
		case "Mumbai":
			System.out.println("Financial city");
			break;
		case "Kolkata":
			System.out.println("City of Joy");
			break;
		case "Delhi":
			System.out.println("Capital of the country");
			break;
		case "Bangalore":
			System.out.println("Cyber Cit");
			break;
		default:
			System.out.println("May be Other Indian City");
			break;
		}
		
	}

}
