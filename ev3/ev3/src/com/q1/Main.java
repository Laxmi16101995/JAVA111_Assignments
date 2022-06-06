package com.q1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int size= sc.nextInt();
		int[] arr= new int[size];
		System.out.println("Enter the elements in the array");

		for(int i=0; i<size; i++) {
			int el= sc.nextInt();
			arr[i]=el;
		}
		
		
		try {
			System.out.println("Enter the index of the array element you want to access");
			int index= sc.nextInt();
			System.out.println("The array element at index"+ index+"="+arr[index-1]);
		}catch(ArrayIndexOutOfBoundsException a){
			System.out.println(a);
		}catch(NumberFormatException n) {
			System.out.println(n);
		}
		catch(Exception n) {
			System.out.println(n);
		}
	}

}
