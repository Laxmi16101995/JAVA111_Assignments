package com.q3;

/*
1)  only abstract methods we can declare in interface.
2)  all the methods are by default "public abstract".
3)	interface can hold only child class object or null.
4) 	child class must override all abstract methods or mark as abstract
5)  "Implements" key-word used for Interface.
6)   forms IS_A_relationship with child.
*/

public interface Interface {

	abstract void m1();
	
}

class ChildOfInterface implements Interface{

	@Override
	public void m1() {
		
		System.out.println("inside child class of Interface");

	}
	
}