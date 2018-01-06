package com.sapient.def;

import java.util.Collections;
import java.util.List;

public class DaoImp3 implements IDao{

	@Override
	public void m1() {
		System.out.println("imp3-m1");
		
	}

	@Override
	public void m2() {
		System.out.println("imp3-m2");
		
	}

	@Override
	public void m3(List<String> list) {
		Collections.sort(list);
		IDao.super.m3(list); //very imp code
	}

}
