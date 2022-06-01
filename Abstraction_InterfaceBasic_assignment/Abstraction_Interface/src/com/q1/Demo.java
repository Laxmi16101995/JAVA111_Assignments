package com.q1;

import java.util.Scanner;

public class Demo {

	public Hotel provideFood(int amount) {
		
		if(amount>1000) {
			
			return new TajHotel();
		}else if(amount<1000 && amount>200) {
			
			return new RoadSideHotel();
		}
		return null;
	}
	
	
	
	public static void main(String[] args) {
		
		Demo d= new Demo();
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Your Amount: ");
		int am= s.nextInt();
		
		Hotel tr=d.provideFood(am);
		if(tr==null) {
			
			System.out.println("Please Enter valid amount ");

		}else {
			
			if(tr instanceof TajHotel) {
				
				tr.chickenBiryani();
				tr.masalaDosa();
				
				TajHotel taj= (TajHotel)tr;
				taj.welcomeDrink();
			}
			else {
				
				tr.chickenBiryani();
				tr.masalaDosa();
			}
			
		}
		
	}
}
