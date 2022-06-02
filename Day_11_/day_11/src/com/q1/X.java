package com.q1;

public interface X {
	
	void abstractMethodX();
	
	default void defaultMethodX() {
		System.out.println("inside defaultMethodX of X interface");

	}
	
	static void staticMethodX() {
		System.out.println("inside staticMethodX of X interface");

	}
}
