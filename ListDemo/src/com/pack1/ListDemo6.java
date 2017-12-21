package com.pack1;


import java.util.Arrays;
import java.util.List;

public class ListDemo6 {

	public static void main(String[] args) {
		Integer[] arr={5,6,7,8,9};
		List list = (List<Integer>)Arrays.asList(arr);
		System.out.println(list);
		
	}

}
