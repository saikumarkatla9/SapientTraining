package com.sapient.service;

public class Circle {
	public double radius;
	
	public double findArea() {
		double area;
		area = Math.PI * Math.pow(radius, 2);
		return area;
	}
	
	public double findPerimeter() {
		double peri;
		peri = 2 * Math.PI * radius;
		return peri;
	}
}
