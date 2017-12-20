package com.sapient.service;

public abstract class Employee {

	private int empId;
	private String empName;
	private double salary;
	public Employee(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void display(){
		System.out.printf("%10d %20s %10.2f",empId,empName,salary);
	}
	
	public abstract double calcSalary();
	
}
