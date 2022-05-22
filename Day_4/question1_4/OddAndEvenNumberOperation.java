package com.question1_4;

import java.util.Scanner;

public class OddAndEvenNumberOperation {
	
	void wholeNumber(int num) {
		
//		Scanner scanner= new Scanner(System.in);
//		Integer i= scanner.nextInt(num);
		
		if(num<0) {
			System.out.println("Error");
		}
		
		else if(num%2!=0) {
			System.out.println(num);
		}
		else {
			
			int ans= (num/10)*10+10;
			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		
		OddAndEvenNumberOperation n= new OddAndEvenNumberOperation();
		
		n.wholeNumber(-45);

	}

}
