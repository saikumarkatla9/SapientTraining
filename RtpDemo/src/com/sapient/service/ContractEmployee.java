package com.sapient.service;

public class ContractEmployee extends Employee{
	
	int days;

	public ContractEmployee(int empId, String empName, double salary, int days) {
		super(empId, empName, salary);
		this.days = days;
	}

	@Override
	public double calcSalary() {
		
		
		
		return getSalary()*days;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.printf("%30d %20.2f %20s \n",days,calcSalary(),getClass().getName());
	}
	
	
}
