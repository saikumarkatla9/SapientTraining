package com.sapient.stream1;

import java.util.ArrayList;
import java.util.List;

public class ReduceDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(7);
		list.add(6);
		list.add(1);
		list.add(9);
		list.add(8);
		
		Integer res1 = list.stream().map(i->i).reduce(0,(x,y)->x+y);
		System.out.println("Sum of all elements "+res1);
		Integer res2 = list.stream().filter(i->i%2==0).map(i->i).reduce(0,(x,y)->x+y);
		System.out.println("Sum of all elements divisible by two "+res2);

	}

}
