package com.sapient.stream1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(7);
		list.add(6);
		list.add(1);
		list.add(9);
		list.add(8);
		
		//converting stream into collection
		Stream<Integer> s = list.stream().filter(i->i%2==0);
		List<Integer> list2 = s.collect(Collectors.toList());
		System.out.println("displaying lsit 2 having filtered elements");
		list.forEach(System.out::println);
		
		//converting stream into array
		System.out.println("displaying array having filtered elements");
		Stream<Integer> s2 = list.stream().filter(i->i%3==0);
		Object[] arr = s2.toArray();
		System.out.println(Arrays.toString(arr));
	}

}
