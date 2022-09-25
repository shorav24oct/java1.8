package com.interview.sort;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<Movie> list = new ArrayList<Movie>();
		list.add(new Movie(8.3, "Force Awakens", 2015));
		list.add(new Movie(8.7, "Star Wars", 1977));
		list.add(new Movie(8.8, "Empire Strikes Back", 1980));
		list.add(new Movie(8.4, "Return of the Jedi", 1983));

		// sort by year
		Collections.sort(list);

		for (Movie movie : list) {
			System.out.println(movie);
		}

		// sort by name
		// Collections.sort(list, new NameCompare());
		Collections.sort(list, (m1, m2) -> m1.getName().compareTo(m2.getName()));
		System.out.println("\nSorted by name");

		for (Movie movie : list) {
			System.out.println(movie);
		}

		// sort by rating
		//Collections.sort(list, new RatingCompare());
		Collections.sort(list,
				(m1, m2) -> m1.getRating() < m2.getRating() ? -1 : m1.getRating() > m2.getRating() ? 1 : 0);
		System.out.println("\nSorted by rating");

		for (Movie movie : list) {
			System.out.println(movie);
		}
	}

}
