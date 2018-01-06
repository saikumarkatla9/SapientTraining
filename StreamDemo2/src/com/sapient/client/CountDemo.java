package com.sapient.client;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.sapient.util.EmpUtil;
import com.sapient.vivo.Emp;

public class CountDemo {

	public static void main(String[] args) {
		List<Emp> list=new ArrayList<Emp>();
		list.add(new Emp(1007,"ram",23000));
		list.add(new Emp(1009,"sam",54000));
		list.add(new Emp(1010,"bunny",34000));
		list.add(new Emp(2007,"ntr",58000));
		list.add(new Emp(2009,"mahesh",39000));
		
		long size=list.stream().filter(e->e.getSal()>=25000).count();
		System.out.println("no of employee whose salary is >=25000 is "+size);

	}

}
