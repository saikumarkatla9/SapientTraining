package com.sapient.service;

public class NEFTPayment implements PaymentStrategy{

	private final static NEFTPayment obj = new NEFTPayment();
	private NEFTPayment(){
		
	}
	/*
	singleton code
	*/
	public static PaymentStrategy getNEFT(){
		return obj;
	}
	
	@Override
	public void doPayment() {
		System.out.println("NEFT payment");
		
	}

}
