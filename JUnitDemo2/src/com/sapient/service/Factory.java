package com.sapient.service;

public class Factory {

	public static CalcService getCalcService(){
		CalcService ser = new CalcService();
		return ser; 
		
	}
	public static Palindrome getPalindromeService(){
		Palindrome ser = new Palindrome();
		return ser;
		
	}
	
	public static EmpService getEmpService(){
		EmpService ser = new EmpService();
		return ser;
	}
	
	public static String[] getInput(){
		return new String[]{"kohli","dhoni","rohith","dhawan","sachin","dravid","dada","yuvraj","raina",
				"laxman","srinath","zaheer","sehwag","gambhir","bumrah","bhuvneshwar","kaif","irfan","yousuf",
				"parthiv","shreyas"};
	}
	
}
