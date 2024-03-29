package com.macr;

public class MethodReferenceTest {

	public static void m1() {
		for (int i = 0; i < 10; i++)
			System.out.println("Child Thread");
	}

	public static void main(String[] args) {
		/*
		Runnable r = () -> {
			for (int i = 0; i < 10; i++)
				System.out.println("Child Thread");
		};
		*/

		Runnable r = MethodReferenceTest::m1;
		
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++)
			System.out.println("Main Thread");
	}

}
