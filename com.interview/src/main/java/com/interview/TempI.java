package com.interview;

public interface TempI {

	/*
	 * Access modifier ‘public’ is optional in all interface method declarations.
	 */
	
	// Abstract method
	abstract void mul(int a, int b);

	// Default method Java 8
	 default void add(int a, int b) {
		sub(a, b); // private method inside default method
		div(a, b); // static method inside other non-static method
		System.out.print("Answer by Default method = ");
		System.out.println(a + b);
	}

	// Static method Java 8
	 static void mod(int a, int b) {
		div(a, b); // static method inside other static method
		System.out.print("Answer by Static method = ");
		System.out.println(a % b);
	}

	// Private method Java 9
	private void sub(int a, int b) {
		div(a, b); // static method inside other non-static Private method
		System.out.print("Answer by Private method = ");
		System.out.println(a - b);
	}

	// Private Static method Java 9
	private static void div(int a, int b) {
		System.out.print("Answer by Private static method = ");
		System.out.println(a / b);
	}

}
