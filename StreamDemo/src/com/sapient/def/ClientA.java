package com.sapient.def;

import java.util.Arrays;
import java.util.List;

public class ClientA {
	
	public static void main(String[] args) {
		IDao dao=new DaoImp3();
		dao.m1();
		dao.m2();
		List<String> list =Arrays.asList("ram","tom","sam");
		dao.m3(list);
		
	}

}
