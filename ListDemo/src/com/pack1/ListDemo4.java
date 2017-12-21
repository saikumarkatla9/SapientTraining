package com.pack1;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.List;

public class ListDemo4 {

	public static void main(String[] args) {
		List<String> list =new ArrayList();
		list.add("kohli");
		list.add("sindhu");
		list.add("srikanth");
		list.add("saina");
		System.out.println("Iterating in forward way");
		ListIterator<String> it= list.listIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("Iterating in reverse way");
		while(it.hasPrevious()){
			System.out.println(it.previous());
		}

	}

}
