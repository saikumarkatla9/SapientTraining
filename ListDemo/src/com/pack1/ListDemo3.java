package com.pack1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo3 {

	public static void main(String[] args) {
		List<String> list =new ArrayList();
		list.add("kohli");
		list.add("sindhu");
		list.add("srikanth");
		list.add("saina");
		
		Iterator<String> it= list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		}

	

}
