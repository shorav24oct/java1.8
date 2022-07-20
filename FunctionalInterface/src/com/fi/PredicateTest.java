package com.fi;

import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		String[] s = { "anu", "rinki", "radha", "sharma", "saurav" };
		
		Predicate<String> p = i -> i.length() > 5;
		
		for(String s1 : s) {
			if(p.test(s1))
				System.out.println(s1);
		}
	}

}
