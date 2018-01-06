package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.PaymentFactory;
import com.sapient.service.PaymentStrategy;

public class Client {
/*
strategy pattern	
	
*/	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the payment startegy card || NEFT");
		String strategy = sc.next();
		PaymentStrategy obj  = PaymentFactory.getInstance(strategy);
		obj.doPayment();

	}

}
