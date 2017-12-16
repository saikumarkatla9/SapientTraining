package com.sapient.client;

import com.sapient.service.SalesPerson;

public class SalesClient {

	public static void main(String[] args) {
	SalesPerson [] s = new SalesPerson[3];
	
	s[0] = new SalesPerson(1012, "Ram", 30_000d);
	s[1] = new SalesPerson(1013, "Prem", 51_000d);
	s[2] = new SalesPerson(1014, "Sam", 10_000d);

	}

}
