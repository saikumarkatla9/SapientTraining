package com.pack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo2 {

	public static void main(String[] args) {
		List<String> list =new ArrayList();
		list.add("kohli");
		list.add("sindhu");
		list.add("srikanth");
		list.add("saina");
		
		Collections.sort(list);
		for(String str:list){
			System.out.println(str);
		}
		
		
		
	}

}
