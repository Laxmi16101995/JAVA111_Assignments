package com.q1;

public class Main {

	public static void main(String[] args) {

		Multiplication multiplication = new Multiplication();
		multiplication.start();
		synchronized (multiplication) {

			try {
				multiplication.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Multiplication of 1 to 10 digits is " + multiplication.total);

	}

}

//============================

class Multiplication extends Thread {
	int total = 1;

	public void run() {
		synchronized (this) {

			for (int i = 2; i <= 10; i++) {
				total *= i;
			}
			this.notify();
		}
	}

}