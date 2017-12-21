package com.pack1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListDemo5 {

	public static void main(String[] args) {
		List<String> list =new ArrayList();
		list.add("kohli");
		list.add("sindhu");
		list.add("srikanth");
		list.add("saina");
		list.add("sindhu");
		System.out.println(list);
		list.add(2,"raina");
		System.out.println(list);
		System.out.println(list.remove("sindhu"));
		System.out.println(list);
		System.out.println("size: "+list.size());
		System.out.println("element 2:"+list.get(2));
		
		
		List<String> list2 =new ArrayList<String>();
		list2.add("bumrah");
		list2.add("shreyas");
		list2.addAll(list);
		System.out.println(list2);
		
		list.toArray();
		
	}

}
