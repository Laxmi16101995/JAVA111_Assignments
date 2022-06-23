package com.q2;

/*   
Race condition:  When two threads work on the same data resource simultaneously, 
						the data inconsistency state is called the Race condition.
						for example, one thread is trying to read data from the array and at the same time, 
						another thread is trying to delete data from the same array so due to this data inconsistency
						state occurs called a Race condition.

How will you find Race condition: 
						When the output is not as we have excepted manner that and if two threads are 
						started in the application then we can say that a Race condition  has occurred.
						
How will you solve race condition:
						To solve the Race Condition we need to make sure the resource allows only one thread to 
						access data from it. To achieve this we put the "synchronized" keyword in the method signature.
						By this keyword, only one thread can access data from one resource at a time.
*/

//===========================================================================

public class Main {

	public static void main(String[] args) {

		RaceConditionAviod rc = new RaceConditionAviod();

		Thread rc1 = new Thread(rc);
		rc1.setName("rc1 thread");
		Thread rc2 = new Thread(rc);
		rc2.setName("rc2 thread");
		rc1.start();
		rc2.start();
	}

}
//==========================================================================

class RaceConditionAviod implements Runnable {

	@Override
	public synchronized void run() {

		System.out.println(Thread.currentThread().getName() + " Enter");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(Thread.currentThread().getName() + " Leaves");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}