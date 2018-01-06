package com.sapient.stream1;

import java.util.ArrayList;
import java.util.List;

public class MatchDemo {

	public static void main(String[] args){
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(7);
		list.add(6);
		list.add(1);
		list.add(9);
		list.add(8);
		
		System.out.println(list.stream().anyMatch(i->i%2==0));
		System.out.println(list.stream().allMatch(i->i%5==0));
		System.out.println(list.stream().noneMatch(i->i%5==0));
	}
}
