package com.sapient.service;

public class SalesPerson {
	public int id;
	public String name;
	public double salesAmount;
	public static int noOfPersons;
	public static double tSales;

	public SalesPerson(int id, String name, double salesAmount) {
		this.id = id;
		this.name = name;
		this.salesAmount = salesAmount;
		++noOfPersons;
		tSales = tSales + this.salesAmount;
	}

	public double calSalesComm() {
		double sc = 0d;
		if (salesAmount >= 50000) {
			sc = salesAmount * 0.1;
		} else if ((salesAmount >= 20000) && (salesAmount < 50000)) {
			sc = salesAmount * 0.5;
		} else if(salesAmount < 20000) {
			sc = salesAmount * 0.3;
		}
		return sc;
	}
	
	public void displayEmployee() {
		
	}
}
