package com.q1;

public class TajHotel implements Hotel{

	

	@Override
	public void chickenBiryani() {
		System.out.println("chickenBiryani is ready in Taj hotel");
		
	}

	@Override
	public void masalaDosa() {
		System.out.println("masalaDosa is ready in Taj hotel");
		
	}
	
	public void welcomeDrink(){
		System.out.println("Welcome Drink from the TajHotel");
	}
	
}
