package com.masai;

public class VowelAndConsonant {
	
	
	void ckeckAlpha(char alphabate) {
		
		
		
		if(alphabate=='a' || alphabate=='e' || alphabate=='i' || alphabate=='o' || alphabate=='u' ||
				alphabate=='A' || alphabate=='E' || alphabate=='I' || alphabate=='O' || alphabate=='U') {
			
			System.out.println("Alphabate is a Vowel");
			
		}
		else if(alphabate=='b' || alphabate=='c' || alphabate=='d' ||alphabate=='f' ||
				alphabate=='g' || alphabate=='h' ||alphabate=='j' || alphabate=='k' || 
				alphabate=='l' || alphabate=='m' || alphabate=='n' ||alphabate=='p' ||
				alphabate=='q' || alphabate=='r' || alphabate=='s' || alphabate=='t' || alphabate=='v' ||
				alphabate=='w' || alphabate=='x' || alphabate=='y' || alphabate=='z' || 
				alphabate=='B' || alphabate=='C' || alphabate=='D' ||alphabate=='F' ||
				alphabate=='G' || alphabate=='H' ||alphabate=='J' || alphabate=='K' || 
				alphabate=='L' || alphabate=='M' || alphabate=='N' ||alphabate=='P' ||
				alphabate=='Q' || alphabate=='R' || alphabate=='S' || alphabate=='T' || alphabate=='V' ||
				alphabate=='W' || alphabate=='X' || alphabate=='Y' || alphabate=='Z'){
			
			System.out.println("Alphabate is a Consonant");
		}
		else{
			System.out.println("Not an Alphabate");
			
		}
		
	}
	
	public static void main(String[] args) {
		
		VowelAndConsonant vc= new VowelAndConsonant();
		
		vc.ckeckAlpha('a');
		vc.ckeckAlpha('A');
		vc.ckeckAlpha('0');
		
	}
	

}
