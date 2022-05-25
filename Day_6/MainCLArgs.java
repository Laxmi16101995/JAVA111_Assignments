package com.array;

public class MainCLArgs {
	
	public static void calFactorial(int a) {
		
		int fact=1;
		for(int i=2; i<=a; i++ ) {
			fact*=i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		
		if(args.length==1) {
			
			int num=Integer.parseInt(args[0]);  
			calFactorial(num);
		}
		else if(args.length==2) {
			
			int abDiff= Math.abs(Integer.parseInt(args[0])-Integer.parseInt(args[1]));
			calFactorial(abDiff);
		}
		else if(args.length>=3) {
			System.out.println("Error");
		}
		
	}

	

}
