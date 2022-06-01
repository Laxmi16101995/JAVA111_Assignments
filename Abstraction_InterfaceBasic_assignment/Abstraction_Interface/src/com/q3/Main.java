package com.q3;

/*
 Abstact class
 				1) when we want, nobody can create a object of class at that time we 
 				   declare class as Abstract class
 				2) Abstract class may be or may not have an abstract method.
 				3) empty abstract class is also a valid abstract class
 				4) Abstract class has a meaning only when it is extended by other class.
 				5) child class should override all the abstract methods of abstract class.
 				6) Abstract class referance veriable can only hold child class object and null value.
				7) "extends" keyword used for abstract class
				8) forms IS_A_relationship with child.
*/


public class Main {
	

}


abstract class Abstact{
	
	abstract void m1();
	
}

class ChildOfAbstract extends Abstact{

	@Override
	void m1() {
		System.out.println("inside child class of Abstract class");
		
	}
	
}