package com.sapient.client;

import java.util.ArrayList;
import java.util.List;

import com.sapient.vivo.Emp;

public class ReduceDemo {

	public static void main(String[] args) {
		List<Emp> list=new ArrayList<Emp>();
		list.add(new Emp(1007,"ram",23000));
		list.add(new Emp(1009,"sam",54000));
		list.add(new Emp(1010,"bunny",34000));
		list.add(new Emp(2007,"ntr",58000));
		list.add(new Emp(2009,"mahesh",39000));
		
		double sum = list.stream().map(e->e.getSal()).reduce(0.0,(x,y)->x+y);
		System.out.println("Total salary "+sum);
		
		double sum2 = list.stream().mapToDouble(e->e.getSal()).sum();
		System.out.println("Total salary "+sum2);
	}

}
