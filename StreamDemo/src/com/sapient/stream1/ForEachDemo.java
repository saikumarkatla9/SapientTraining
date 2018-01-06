package com.sapient.stream1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(7);
		list.add(6);
		list.add(1);
		list.add(9);
		list.add(8);
		System.out.println("using method reference");
		list.stream().forEach(System.out::println);
		System.out.println("using lambda expression");
		list.stream().forEach(s->System.out.println(s));

	}

}
