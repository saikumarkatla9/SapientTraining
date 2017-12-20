package com.sapient.service;

public interface Basic {
	
	String convertToBinary(int num);
	
	public default int doSum(int... a){
		int sum=0;
		for(int count:a){
			sum=sum+count;
			
		}
		return sum;
	}
	public default double doAvg(int... a){
		int sum = doSum(a);
		double avg = sum/a.length;
		return avg;
	}
	
	public static void display(){
		
	}
}
