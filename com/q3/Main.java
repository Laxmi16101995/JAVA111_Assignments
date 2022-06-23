package com.q3;

public class Main {

	public static void main(String[] args) {

		Common c1 = new Common(new Common(), "Ram");
		Common c2 = new Common(new Common(), "Shyam");

		Thread c11 = new Thread(c1);
		c11.setName("Ram's Thread");
		Thread c22 = new Thread(c2);
		c22.setName("Shyam's Thread");

		c11.start();
		c22.start();
	}

}
//====================================

class Common implements Runnable {

	Common c;
	String names;

	public Common() {
		super();
	}

	public Common(Common c, String names) {
		super();
		this.c = c;
		this.names = names;
	}

	public void fun1(String name) {

		synchronized (Common.class) {

			System.out.println(Thread.currentThread().getName() + " enter" + " WELCOME");

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(Thread.currentThread().getName() + " Leaves " + name);

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

	@Override
	public void run() {

		fun1(names);
	}

}

//=====================================
