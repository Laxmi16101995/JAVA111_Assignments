package com.q3;

import java.util.Scanner;

public class IPL {

	void homeTeamStadium(Stadium stadium) {
		
		switch(stadium) {
		case EDEN_GARDENS_STADIUM:
			System.out.println("This is the home ground of KKR");
			break;
		case WANKHEDE_STADIUM:
			System.out.println("This is the home ground of Mumbai Indians");
			break;
		case CHIDAMBARAM_STADIUM:
			System.out.println("This is the home ground of CSK");
			break;
		case M_CHINNASWAMY_STADIUM:
			System.out.println("This is the home ground of RCB");
			break;
		}
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter Stadium name: ");
		String name= scan.next();
		
		Stadium stadium= Stadium.valueOf(name);
		
		IPL ipl= new IPL();
		ipl.homeTeamStadium(stadium);
	}
}
