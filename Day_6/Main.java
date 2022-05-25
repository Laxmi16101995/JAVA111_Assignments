package com.array;

import java.util.Scanner;

public class Main {

	
	public static String reversString(String input){
		
		int length= input.length();
		char[] str= new char[length];
		int a=0;
		for(int i=length-1; i>=0; i--) {
			str[a]=input.charAt(i);
			a++;
		}
	
		//System.out.println(str);
		String string = new String(str);
		return string;
	}
	
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		String orignalString = sc.next();
		
		String result= reversString(orignalString);
		System.out.println("Original String is :"+ orignalString);
		System.out.println("Reversed String is :"+ result);
	
	}
	

}
