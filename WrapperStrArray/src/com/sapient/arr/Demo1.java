package com.sapient.arr;

import java.util.Arrays;
import java.util.Collections;

public class Demo1 {

	public static void main(String[] args) {
		String[] arr = new String[4];
		arr[0]="ronaldo";
		arr[1]="kohli";
		arr[2]="messi";
		arr[3]="zlaton";
		
		Arrays.sort(arr);
		for(String str:arr){
			System.out.println(str);
		}
		System.out.println("Descending order");
		Arrays.sort(arr,Collections.reverseOrder());
		for(String str:arr){
			System.out.println(str);
		}
	}

}
