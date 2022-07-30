package com.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortTest {

	public static void main(String[] args) {
		List<Integer> marks = new ArrayList<Integer>();

		marks.add(10);
		marks.add(20);
		marks.add(17);
		marks.add(15);
		marks.add(30);

		System.out.println(marks);

		Comparator<Integer> comp = (i1, i2) -> (i1 < i2) ? 1 : (i1 > i2) ? -1 : 0;

		List<Integer> sortedList = marks.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);

		List<Integer> descendingList = marks.stream().sorted(comp).collect(Collectors.toList());
		System.out.println(descendingList);

		List<Integer> ascendingList = marks.stream().sorted((i1, i2) -> i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(ascendingList);
	}

}
