package com.interview;


public class App {
	public static void main(String[] args) {
		int x = 5;
		change(x);
		System.out.println(x);
	}

	public static void change(int x) {
		x = 10;
	}
}
