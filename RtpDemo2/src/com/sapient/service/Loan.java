package com.sapient.service;

public class Loan extends Account{

	public Loan(int accId, String custName, double balance) {
		super(accId, custName, balance);
		
	}

	@Override
	public String deposit(double amt) {
		String res="loan already cleared";
		double balance=getBalance();
		if(amt<=balance && balance>0){
			balance=getBalance()-amt;
			setBalance(balance);
			res="deposited";
		}
			
			else if(amt>balance){
				setBalance(0);
			res="deposited";
		}
		return res;
	}
}
