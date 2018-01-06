package com.sapient.service;

public class LoanService {

	public String approveLoan(int age,double income)throws AgeException, IncomeException{
		
		if(age<20 || age>40)
			throw new AgeException("Age must be between 20 and 40") ;
		else if(income<400000)
			throw new IncomeException("income must be greater than 4 lakhs");
		return "approved";
	}
}
