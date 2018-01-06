package com.sapient.service;

public class Customer {

	private String name;
	private String mobileNo;
	private double income;
	private CustomerData data = new CustomerData();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public CustomerData getData() {
		return data;
	}
	public void setData(CustomerData data) {
		this.data = data;
	}
	
	
}
