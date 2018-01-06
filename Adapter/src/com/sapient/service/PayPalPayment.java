package com.sapient.service;

import java.util.List;



public class PayPalPayment implements IPaymentService{

	private PaymentAdapter adapter = new PaymentAdapter();
	@Override
	public void makePayment(List<String> list) {
		System.out.println("new Api");
		adapter.makePayment(list);
		
	} 

}
