package com.question2;

import java.util.Scanner;

class Child extends Parent {

	Child(int num) {
		super(num);
	}

	@Override
	void method1() {
		System.out.println("number---"+number);
	}
	
	void method4() {
		System.out.println("this method belongs to Child class");

	}
	
	
	
	
}
