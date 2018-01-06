package com.sapient.stream1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MapDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(7);
		list.add(6);
		list.add(1);
		list.add(9);
		list.add(8);
		
		Stream s = list.stream().map(i->i*i);
		s.forEach(System.out::println);

	}

}
