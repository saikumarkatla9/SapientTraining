package com.sapient.stream1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SortDemo {

	public static void main(String[] args) {
		/*List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(7);
		list.add(6);
		list.add(1);
		list.add(9);
		list.add(8);

		Stream s =list.stream().sorted();
		s.forEach(System.out::println);*/
		
		List<String> list = new ArrayList<String>();
		list.add("virat");
		list.add("rohith");
		list.add("dhawan");
		list.add("rahane");
		list.add("pandey");
		list.add("iyer");

		System.out.println("Ascending order");
		Stream s =list.stream().sorted();
		s.forEach(System.out::println);
		
		System.out.println("Descending order");
		list.stream().sorted((i,j)->j.compareTo(i)).forEach(System.out::println);
	}

}
