package com.sapient.service;

public class CalcService {
	
	CalcService() {
		
	}
	
	
	public double calcService(int a, int b, int c) {
		double res=(double)(a+b+c)/2;
		return res;
	}
	
	public double roundToN(double val,int n){
		double p = Math.pow(10, n);
		double res=Math.round(val*p)/p;
		return res;
	}
}
