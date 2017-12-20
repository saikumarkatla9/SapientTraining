package com.sapient.service;

import java.math.BigInteger;

public class Calculator implements Interest,Factorial{

	private static Calculator calc = new Calculator();
	private Calculator(){
		
	}
	
	public static Basic getBasic(){
		Basic basic = calc;
		return basic;
	}
	
	public static Interest getInterest(){
		Interest interest = calc;
		return interest;
	}
	
	public static Factorial getFactorial(){
		Factorial fact = calc;
		return fact;
	}
	
	
	

	@Override
	public double calcSimple(double amt, int years, float rate) {
		double si = amt*years*rate/100;
		return si;
	}

	@Override
	public double calcCompound(double amt, int years, float rate) {
		double ci = amt*Math.pow((1+rate/100),years)-amt;
		return ci;
	}

	@Override
	public BigInteger findFactorial(int num) {
		BigInteger fact = BigInteger.ONE;
		for(int count=1;count<=num;count++){
			fact=fact.multiply(BigInteger.valueOf(count));
		}
		return fact;
	}

	@Override
	public int doSum(int... a) {
		// TODO Auto-generated method stub
		return Interest.super.doSum(a);
	}

	@Override
	public String convertToBinary(int num) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
