package com.sapient.client;

import com.sapient.service.Emp;

public class EmpClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp emp = new Emp();
		try {
			emp.setName("sai");
			emp.setAge(22);
			System.out.println(emp.getName()+" "+emp.getAge()+" "+emp.getBusUnit());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
