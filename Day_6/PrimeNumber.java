package com.array;

public class PrimeNumber {

	public int[] findAndReturnPrimeNumbers(int[] inputArray){
		
		
		int[] pNArr= new int[inputArray.length];
		
		for(int i=0; i<inputArray.length; i++) {
			int count=0;
			for(int k=2; k<inputArray[i]; k++) {
				if(inputArray[i]%k==0) {
					count++;
				}
			}
			
			if(count==0) {
				pNArr[i]=inputArray[i];
			}else {
				continue;
			}
		}
		
		return pNArr;
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		PrimeNumber pN= new PrimeNumber();
		int[] arr = {10,12,5,50,11,14,15};
		int[] primeArray=pN.findAndReturnPrimeNumbers(arr);
		
		int c=0;
		for(int i=0; i<primeArray.length; i++) {
			if(primeArray[i]!=0) {
				System.out.println(primeArray[i]);
			}else {
				c++;
			}
		}
		
		if(c==primeArray.length) {
			System.out.println("Prime number not found in the supplied Array");
		}

	}

}
