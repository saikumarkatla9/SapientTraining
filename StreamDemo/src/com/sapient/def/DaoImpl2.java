package com.sapient.def;

import java.util.List;

public class DaoImpl2 implements IDao{

	@Override
	public void m1() {
		System.out.println("impl2-m1");
		
	}

	@Override
	public void m2() {
		System.out.println("impl2-m2");
		
		
	}

	@Override
	public void m3(List<String> list) {
		list.forEach(System.out::println);
		
		// IDao.super.m3(list);
	}

}
