package com.question4;

import java.util.Scanner;

public class Demo {

	public static Bank getBank(String bank) {
		
		if(bank.equals("Axis")) {
			
			AxisBank bnk= new AxisBank();
			return bnk;
		}
		else if(bank.equals("ICICI")) {
			
			ICICIBank bnk= new ICICIBank();
			return bnk;
		}
	return null;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		System.out.println("Enter Bank name: ");
		String bank= scan.next();
		
		if(bank.equals("Axis")) {
			
			Bank bnk1= getBank(bank);
			AxisBank axis= (AxisBank)bnk1;
			axis.displayDetails();
			axis.getCreditCard();
		}else if(bank.equals("ICICI")) {
			Bank bnk1= getBank(bank);
			ICICIBank icici= (ICICIBank)bnk1;
			icici.displayDetails();
		}
		

		
	}

}
