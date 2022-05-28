package com.question3;
/*
 1) It is an Exception which occurs if you attempt to downcast a class, but in fact the class is not of that type.
 2) At Another t5 = (Another) new Goat(): you will get a ClassCastException 
    because you cannot create an instance of the Another class using Goat.
 3) The conversion is valid only in cases where a class extends a parent class and the child class is casted to its parent class.
*/
public class Main {

	
	public static void main(String[] args) {
		Animal a = new Animal();
		Another t5 = (Another) new Goat();//here you will get ClassCastException
	}
	
}

class Animal {
	public void eat(String str) {
		System.out.println("Eating for grass");
	}
}

class Goat extends Animal {
	public void eat(String str) {
		System.out.println("blank");
	}
}

class Another extends Goat{
	public void eat(String str) {
		System.out.println("another");
	}
}