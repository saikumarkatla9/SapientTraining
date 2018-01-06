package com.sapient.client;

import com.sapient.service.ISer;
import com.sapient.service.ProxyFactory;

public class ClientA {

	public static void main(String[] args){
		ISer ser = ProxyFactory.getProxy("1001", "ram");
		System.out.println(ser.calcSimple(5000, 2, 2));
	}
}
