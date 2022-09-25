package com.le.fi.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee {
	int empNo;
	String name;

	public Employee(int empNo, String name) {
		this.empNo = empNo;
		this.name = name;
	}

	@Override
	public String toString() {
		return empNo + ":" + name;
	}
}

public class TestComparator {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee(12345, "anu"));
		list.add(new Employee(12350, "rinki"));
		list.add(new Employee(12330, "shorav"));
		list.add(new Employee(12320, "mummy"));
		list.add(new Employee(12355, "papa"));
		
		System.out.println(list);

		Collections.sort(list, (e1, e2) -> e1.empNo < e2.empNo ? -1 : e1.empNo > e2.empNo ? 1 : 0);
		
		System.out.println(list);
		
		Collections.sort(list, (e1, e2) -> e1.name.compareTo(e2.name));
		
		System.out.println(list);

	}

}
