package com.sapient.arr;

import java.util.Arrays;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		String[] arr = {"rohith","dhawan","dhoni","kumar","rahane"};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("length: "+arr.length);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to search");
		String str= sc.next();
		
		int res = Arrays.binarySearch(arr, str);
		if(res>=0){
			System.out.println("found at index:"+res);
		}
		else{
			System.out.println("Not found");
		}
	}

}
