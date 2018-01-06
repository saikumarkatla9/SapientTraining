package com.sapient.stream1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapDemo {

	public static void main(String[] args) {
		List<String> list1=Arrays.asList("tom","ram","sam");
		List<String> list2 = Arrays.asList("peter","john","mary");
		Stream<List<String>> s = Stream.of(list1,list2);
		//s.forEach(System.out::println);
		Stream<String> s2 = s.flatMap(list->list.stream());
		s2.forEach(System.out::println);
	}

}
