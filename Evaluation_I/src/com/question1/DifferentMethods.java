package com.question1;

public class DifferentMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="Masai";
		String builder= new String(str);
		String c = "abc".substring(0, 2);
		String builder2= builder.concat(" Transform");
		
		System.out.println(c);
		System.out.println( str.length());
		System.out.println( str+ " welcome");
		System.out.println(builder2);
	}

}
