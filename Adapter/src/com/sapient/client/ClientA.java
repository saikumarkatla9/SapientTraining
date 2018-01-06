package com.sapient.client;

import java.util.ArrayList;
import java.util.List;

import com.sapient.service.IPaymentService;
import com.sapient.service.PaymentFactory;
import com.sapient.service.PaymentSerImpl;

public class ClientA {

	public static void main(String[] args) throws Exception {
		
		IPaymentService ser = PaymentFactory.getPaymentInstance();
		List<String> list = new ArrayList<String>();
		list.add("ram");
		list.add("syn10101001");
		list.add("492");
		ser.makePayment(list);
	}

}
