package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapTest {

	public static void main(String[] args) {
		List<Integer> marks = new ArrayList<Integer>();

		marks.add(10);
		marks.add(20);
		marks.add(17);
		marks.add(15);
		marks.add(30);

		System.out.println(marks);

		List<Integer> updatedMarks = marks.stream().map(i -> i + 5).collect(Collectors.toList());
		System.out.println(updatedMarks);
	}

}
