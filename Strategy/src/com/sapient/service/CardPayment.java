package com.sapient.service;

public class CardPayment implements PaymentStrategy{

	private final static CardPayment obj = new CardPayment();
	private CardPayment(){
		
	}
	/*
	singleton code
	*/
	public static PaymentStrategy getCard(){
		return obj;
	}
	@Override
	public void doPayment() {
		System.out.println("card payment is processed");
	} 

}
