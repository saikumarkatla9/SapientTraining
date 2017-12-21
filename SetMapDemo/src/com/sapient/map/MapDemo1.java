package com.sapient.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.sapient.pack1.Emp;

public class MapDemo1 {

	public static void main(String[] args) {

		Emp e1= new Emp(1001,"kohli",50000);
		Emp e2= new Emp(1003,"kaka",45000);
		Emp e3= new Emp(1005,"ronaldinho",60000);

		Map<Integer,Emp> map = new HashMap<Integer,Emp>();
		map.put(1001, e1);
		map.put(1003, e2);
		map.put(1005, e3);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee ID");
		int eid = sc.nextInt();
		if(map.containsKey(eid)){
			Emp e = map.get(eid);
			System.out.println(e);
		}
		else{
			System.out.println("not found");
		}
	}
	
	

}
