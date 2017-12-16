package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Circle;

public class CircleClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the circle : ");
		double radius = sc.nextDouble();
		sc.close();
		Circle cir = new Circle();
		cir.radius = radius;
		System.out.println("The area of the circle is " + cir.findArea());
		System.out.println("The perimeter of the circle is " + cir.findPerimeter());	
	}
}
