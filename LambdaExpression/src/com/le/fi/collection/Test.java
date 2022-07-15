package com.le.fi.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MyComparable implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {

		return (o1 < o2) ? -1 : (o1 > o2) ? 1 : 0;
	}

}

public class Test {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(10);
		list.add(200);
		list.add(2);
		list.add(2000);
		list.add(5);

		MyComparable myComparable = new MyComparable();

		/*
		 * Lambda Expression for Implementation of compare()
		 */
		Comparator<Integer> comparator = (o1, o2) -> {
			return (o1 < o2) ? -1 : (o1 > o2) ? 1 : 0;
		};

		Collections.sort(list, comparator);
		System.out.println(list);

	}

}
