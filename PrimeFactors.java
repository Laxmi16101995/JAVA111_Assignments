package com.masai;

public class PrimeFactors {
	public static void main(String[] args) {
		primeFactorsPrint(12);
	}
	public static void primeFactorsPrint(int num){
	if(num<=2 || num>=100) {
		System.out.println("Invalid number");
	}else {
		
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
	}
	}
}
