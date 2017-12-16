package com.sapient.service;

public class Factorial {
	public int num;
	private int fact;
	
	public int findFact() {
		fact = 1;
		for(int i = num; i>0; i--) {
			fact = fact * i;
		}
		return fact;
	}
}
