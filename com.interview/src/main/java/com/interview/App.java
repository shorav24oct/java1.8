package com.interview;

import java.util.Date;

public class App {
	
	public static void main(String[] args) {
		ImmutableClass immutableClass = ImmutableClass.createNewInstance(10, "test", new Date());
		System.out.println(immutableClass.getMutableDate());

		immutableClass.getMutableDate().setTime(immutableClass.getMutableDate().getTime() + 1000);
		System.out.println(immutableClass.getMutableDate());
	}
}
