package com.sapient.client;

public class Area {

	public static int calcArea(int side){
		System.out.println("int arg");
		return side*side;
	}
	
	public static double calcArea(double side){
		System.out.println("double arg");
		return side*side;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calcArea(9));
		System.out.println(calcArea(9.9));
	}

}
