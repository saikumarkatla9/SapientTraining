package com.sapient.service;

public class OnrollEmployee extends Employee {
	
	private double da;
	private double pf;
	public OnrollEmployee(int empId, String empName, double salary) {
		super(empId, empName, salary);
		da = calcDa();
		pf = calcPf();
	}
	
	private double calcPf(){
		return getSalary()*12;
		
	}
	
	private double calcDa(){
		return getSalary()*0.4;
		
	}
	
	@Override
	public double calcSalary() {
		
		
		return getSalary()+da-pf;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.printf("%10.2f %10.2f %30.2f %20s \n","da","pf",calcSalary(),getClass().getName());
	}
	
	
}
