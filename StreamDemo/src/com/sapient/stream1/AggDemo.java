package com.sapient.stream1;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class AggDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(16);
		list.add(74);
		list.add(58);
		list.add(72);
		list.add(97);
		list.add(36);
		
		long size = list.stream().filter(i->i>=50).count();
		System.out.println("no of items greater than 50 is: "+size);
		OptionalInt opt1 = list.stream().mapToInt(i->i).min();
		System.out.println("Minimum value "+opt1.getAsInt());
		OptionalInt opt2 = list.stream().mapToInt(i->i).max();
		System.out.println("Maximum value "+opt2.getAsInt());
		int sum=list.stream().mapToInt(i->i).sum();
		System.out.println("Maximum value "+sum);
		OptionalDouble opt4 = list.stream().mapToInt(i->i).average();
		System.out.println("Maximum value "+opt4.getAsDouble());
		
		
	}

}
