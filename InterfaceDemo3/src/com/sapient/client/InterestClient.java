package com.sapient.client;

import com.sapient.service.Calculator;
import com.sapient.service.Interest;

public class InterestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Interest obj = Calculator.getInterest();
		System.out.println(obj.calcSimple(5000, 2, 4));
		System.out.println(obj.calcCompound(5000, 4, 3));
		System.out.println(obj.convertToBinary(12));
		System.out.println(obj.doSum(6,8,15));
		System.out.println(obj.doAvg(14,65,87));
	}

}
