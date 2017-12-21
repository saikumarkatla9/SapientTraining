package com.pack2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		
		Emp e1= new Emp(1001,"kohli",50000);
		Emp e2= new Emp(1003,"kaka",45000);
		Emp e3= new Emp(1005,"ronaldinho",60000);
		Emp e4= new Emp(1002,"snieder",30000);
		Emp e5= new Emp(1004,"neymar",80000);
		
		List<Emp> list = new ArrayList<Emp>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		//sorting by comparable
		Collections.sort(list);
		System.out.println("Sorting based on eid");
		for(Emp emp:list){
			System.out.println(emp);
		}
		
		//sorting by comparator ename
		System.out.println("Sorting based on ename");
		Collections.sort(list,new NameComparator());
		
		for(Emp emp:list){
			System.out.println(emp);
		}
		
		//sorting by comparator sal
				System.out.println("Sorting based on sal");
				Collections.sort(list,new SalComparator());
				
				for(Emp emp:list){
					System.out.println(emp);
				}
		
	}

}
