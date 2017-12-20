package com.sapient.service;

public class Savings extends Account{

	public Savings(int accId, String custName, double balance) {
		super(accId, custName, balance);
		
	}

	@Override
	public String deposit(double amt) {
		double balance = getBalance()+amt;
		String res = "not deposited";
		if(amt<0)
			return "amount cannot be negative";
		if(amt<5000){
			setBalance(balance);
			res="deposited";
	}
	
	return res;
	}
}
