package com.sapient.service;

import java.util.List;

import com.sapient.dao.IDao;
import com.sapient.vo.Emp;

public class SerImpl implements ISer{

	private IDao dao;
	
	
	public void setDao(IDao dao) {
		System.out.println("injecting mocks");
		this.dao = dao;
	}


	@Override
	public List<Emp> viewEmployee(String order) {
		List<Emp> list = dao.getEmployee();
		if(order.equals("id")){
			list.sort((e1,e2)->((Integer)e1.getEid()).compareTo((Integer)e2.getEid()));
		}
		else if(order.equals("name")){
			list.sort((e1,e2)->e1.getEname().compareTo(e2.getEname()));
		}
		else
			list.sort((e1,e2)->((Double)e1.getSal()).compareTo((Double)e2.getSal()));
		return null;
	}

}
