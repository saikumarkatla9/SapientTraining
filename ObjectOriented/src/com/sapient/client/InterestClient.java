package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Interest;

public class InterestClient {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the amount : ");
		double amount = sc.nextDouble();

		System.out.println("Enter the year : ");
		int years = sc.nextInt();
		
		System.out.println("Enter the rate : ");
		float rate = sc.nextFloat();
		
		sc.close();
		
		Interest cal = new Interest(amount, years, rate);
		
		System.out.println("The Simple interest is ");
		System.out.println(cal.calcSimple());
		
		System.out.println("The Compound interest is ");
		System.out.println(cal.calcCompound());
	}
}
