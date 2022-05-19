package com.masai;

public class CheckWeather {
	
	public static void main(String[] args) {
		
		boolean isSnowing = false;
		boolean isRaining = false;
		double temperature = 60.0;
		//print "Let’s stay home." if its raining, snowing or
		//below 50 degrees and print "Let’s go out!" otherwise.
		takeADicision(isSnowing,isRaining,temperature);
	}
	
	static void takeADicision(boolean isSnowing, boolean isRaining, double temperature) {
		
		if(isSnowing==true || isRaining==true || temperature<50) {
			
			System.out.println("Let’s stay home.");
		}
		else {
			
			System.out.println("Let’s go out!");
		}
		
	}

}
