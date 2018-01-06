package com.sapient.vo;

import com.sapient.service.Customer;

public class CustomerSummary {

	public void getCustomerSummary(Customer cust){
		System.out.println(cust.getIncome());
		System.out.println(cust.getMobileNo());
		System.out.println(cust.getName());
		//System.out.println(((Object) cust).getCustomerData().get);
		System.out.println(cust.getIncome());
		System.out.println(cust.getIncome());
		System.out.println(cust.getIncome());
	}
}
