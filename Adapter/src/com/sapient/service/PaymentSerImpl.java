package com.sapient.service;

import java.util.List;

import com.paypol.service.PayPalImpl;

public class PaymentSerImpl implements IPaymentService{

	

	@Override
	public void makePayment(List<String> list) {
		System.out.println("payment processing");
		
		
	}

}
