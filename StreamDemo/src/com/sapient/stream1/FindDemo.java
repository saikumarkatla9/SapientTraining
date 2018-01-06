package com.sapient.stream1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindDemo {

	public static void main(String[] args) {
		List<String> list1=Arrays.asList("rom","ram","sam","rakesh","sachin","shiva");
		Optional opt1 = list1.stream().filter(s->s.startsWith("a")).findAny();
		System.out.println(opt1);
		if(opt1.isPresent())
			System.out.println("Element found");
		else 
			System.out.println("Element not found");

	}

}
