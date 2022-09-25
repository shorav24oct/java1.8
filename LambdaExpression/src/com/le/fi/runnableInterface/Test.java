package com.le.fi.runnableInterface;

class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++)
			System.out.println("Child Thread");
	}

}

public class Test {

	@SuppressWarnings({ "unused" })
	public static void main(String[] args) {
		
		Runnable myRunnable = new MyRunnable();
		
		/*
		 * Lambda Expression for Implementation of run()
		 */
		Runnable r = () -> {
			for (int i = 0; i < 10; i++)
				System.out.println("Lambda Thread");
		};

		Thread thread = new Thread(r);
		thread.start();

		for (int i = 0; i < 10; i++)
			System.out.println("Main Thread");
	}

}
