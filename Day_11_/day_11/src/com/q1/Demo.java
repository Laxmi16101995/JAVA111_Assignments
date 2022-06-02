package com.q1;

public class Demo {

	public static void main(String[] args) {

		ZImpl zImpl= new ZImpl();
		zImpl.abstractMethodX();
		zImpl.abstractMethodY();
		zImpl.abstractMethodZ();
		zImpl.defaultMethodX();
		zImpl.defaultMethodY();
		X.staticMethodX();
		Y.staticMethodY();
	}

}
