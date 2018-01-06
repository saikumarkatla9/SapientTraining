package com.sapient.client;

import java.util.ArrayList;
import java.util.List;

import com.sapient.util.EmpUtil;
import com.sapient.vivo.Emp;

public class SortDemo {
	public static void main(String[] args){
		List<Emp> list=new ArrayList<Emp>();
		list.add(new Emp(1007,"ram",23000));
		list.add(new Emp(1009,"sam",54000));
		list.add(new Emp(1010,"bunny",34000));
		list.add(new Emp(2007,"ntr",58000));
		list.add(new Emp(2009,"mahesh",39000));
		
		System.out.println("sort by emp id");
		list.stream().filter(e->e!=null).sorted().forEach(EmpUtil::display);
		
		System.out.println("sort by emp name");
		list.stream().filter(e->e!=null).sorted((e1,e2)->e1.getName().compareTo(e2.getName()))
										.forEach(EmpUtil::display);
		
		System.out.println("sort by emp sal");
		list.stream().filter(e->e!=null).sorted((e1,e2)->e1.getSal().compareTo(e2.getSal()))
										.forEach(EmpUtil::display);
		
	}

}
