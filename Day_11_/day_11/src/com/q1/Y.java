package com.q1;

public interface Y {
	
	void abstractMethodY();
	
	default void defaultMethodY() {
		System.out.println("inside defaultMethodY of Y interface");
	}
	
	static void staticMethodY() {
		System.out.println("inside staticMethodY of Y interface");

	}
}
