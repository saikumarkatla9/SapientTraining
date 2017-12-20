package com.sapient.service;

public abstract class Account {

	private int accId;
	private String custName;
	private double balance;
	
	
	public Account(int accId, String custName, double balance) {
		super();
		this.accId = accId;
		this.custName = custName;
		this.balance = balance;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public void display(){
		System.out.println("-----------------------------------------");
		System.out.println("Acc Id: "+accId);
		System.out.println("Cust name: "+custName);
		System.out.println("Balance: "+balance);
		System.out.println("-----------------------------------------");
	}
	
	public abstract String deposit(double amt);
	
}
