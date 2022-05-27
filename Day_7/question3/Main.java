/*
			"this"
 "this" keyword used to call default constructor of the same class.
 and load all the members in that class.
 
 			"super"
 "super" keyword used to call default constructor of the parent class.
  related to parent class
*/



package com.question3;

public class Main {

    int age;
    
    void thisMain(int age){
        this.age = age;
        System.out.println("Print age with this keyword----"+this.age);
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.thisMain(20);
    }



}


class MyAgeAfter extends Main{
	
	
//	MyAgeAfter(){
//		super();
//	}
	
	public static void main(String[] args) {
		
		MyAgeAfter agf=new MyAgeAfter();
		agf.age=50;
		System.out.println(agf.age);
	}


}