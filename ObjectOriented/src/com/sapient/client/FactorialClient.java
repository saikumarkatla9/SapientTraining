package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Factorial;

public class FactorialClient {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		sc.close();
		Factorial fa = new Factorial();
		fa.num = num;
		System.out.println(fa.findFact());

	}

}
