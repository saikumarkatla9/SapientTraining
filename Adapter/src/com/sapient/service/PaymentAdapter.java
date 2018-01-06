package com.sapient.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.paypol.service.IPayPal;
import com.paypol.service.PayPalImpl;

public class PaymentAdapter {

	private IPayPal paypal = new PayPalImpl();

	
	
	public void makePayment(List<String> list){
		Map<String,String> cmap = new HashMap<>();
		cmap.put("cname", list.get(0));
		cmap.put("card", list.get(1));
		cmap.put("cvv", list.get(2));
		paypal.doPayment(cmap);
	}
}
