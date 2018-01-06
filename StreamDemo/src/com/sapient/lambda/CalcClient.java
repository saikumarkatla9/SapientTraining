package com.sapient.lambda;

public class CalcClient {


	/*
		demo- multiple inline implementations
	*/
	public static void main(String[] args) {
		ICalculator add = (a,b)->{return (a+b);};
		ICalculator sub = (int a,int b)->{return (a-b);};
		ICalculator mul = (a,b)->a*b;
		
		System.out.println(add.doCalc(10, 20));
		System.out.println(sub.doCalc(20, 10));
		System.out.println(mul.doCalc(5, 90));
	}

}
