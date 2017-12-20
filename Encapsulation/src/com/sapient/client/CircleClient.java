package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Circle;

public class CircleClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius");
		double radius = sc.nextDouble();
		
		try {
			Circle obj = new Circle(radius);
			double area = obj.calArea();
			double peri = obj.calPerimeter();
			System.out.println("Area of circle: "+area);
			System.out.println("Perimeter of circle: "+peri);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}

}
