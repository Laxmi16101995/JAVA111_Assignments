package com.q3;
/*
finally will executes always when exception occure or not
A finally block will 
not execute due to other conditions 
like when JVM runs out of memory when ou
r java process is killed forcefully from task 
manager or console when our machine shuts down due
to power failure and deadlock condition in our try 
block.
*/




/*
we can use final keyword before veriables, methods, classes,constructors.
if we use final keyword then we can not modify that perticular parameter
for veriables we can not mutate it
for methods we can not override it,
for class we can not extend that class
*/

final class finalClass{
	
}


public class v {
	
	final int x=10;
	final void m2() {
		
	}
	static void m1() {
		throw new NullPointerException("providing exception");
	}
		public static void main(String args[]) { 
			try { 
				System.out.println("I am in try block"); 
				m1();
				System.exit(1);                            ///terminate further program
			} catch(Exception ex){
				System.out.println("I am in catch block"); 

				System.out.println(ex.toString());
			} finally {
				System.out.println("I am in finally block");
			} 
		}
	

}



