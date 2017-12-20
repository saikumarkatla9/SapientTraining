package com.sapient.service;

import java.util.ArrayList;
import java.util.List;

public class EmpMemDao implements Idao{

	EmpMemDao(){
		//instance cannot be created in another package
	}
	
	@Override
	public List<String> viewEmployee(){
		List<String> list = new ArrayList<String>();
		list.add("rama");
		list.add("sai");
		list.add("pravin");
		list.add("tarun");
		return list;
	}
}
