package com.q4;

/*
wait():  		When any one of the threads is active and whenever we want to suspend a 
				thread unconditionally at that time we use the wait method. when we call the wait
 				method any particular thread that will go in the blocked state and to resume it we 
 				need to give the signal.
 			
 			
notify(): 	To give a signal to the suspended thread to resume we need to use notify method. 
				By using this method we can transfer the suspended thread to the running state from 
				the blocked state.  	
				
			
notifyAll():			
				The notifyAll() method of thread class is used to wake up all threads. 
				This method gives the notification to all waiting threads of a particular object.
				If we use notifyAll() method and multiple threads are waiting for the notification
				then all the threads got the notification but execution of threads will be 
				performed one by one because thread requires a lock and only one lock is 
				available for one object.

*/

public class Main {

	public static void main(String[] args) {

	}

}
