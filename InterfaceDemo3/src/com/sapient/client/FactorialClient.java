package com.sapient.client;

import com.sapient.service.Calculator;
import com.sapient.service.Factorial;

public class FactorialClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial obj = Calculator.getFactorial();
		System.out.println(obj.findFactorial(7));
		System.out.println(obj.doSum(2,3,4,5,6));
	}

}
