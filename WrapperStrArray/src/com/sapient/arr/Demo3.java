package com.sapient.arr;

import java.util.Arrays;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"rohith","dhawan","dhoni","kumar","rahane"};
		String[] arr2 = new String[arr.length];
		System.arraycopy(arr, 2, arr2, 0, 3);
		System.out.println(Arrays.toString(arr2));
	}

}
