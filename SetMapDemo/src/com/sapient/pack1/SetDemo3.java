package com.sapient.pack1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo3 {

	public static void main(String[] args) {
		Emp e1= new Emp(1001,"kohli",50000);
		Emp e2= new Emp(1003,"kaka",45000);
		Emp e3= new Emp(1005,"ronaldinho",60000);
		Emp e4= new Emp(1002,"snieder",30000);
		Emp e5= new Emp(1004,"neymar",80000);
		Emp e6= new Emp(1001,"kohli",50000);
		Emp e7= e2;
		
		Set<Emp> set = new TreeSet<Emp>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		set.add(e6); //is ignored based on the content
		set.add(e7); //is ignored based on the reference
		
		for(Emp emp:set){
			System.out.println(emp);
		}

	}

}
