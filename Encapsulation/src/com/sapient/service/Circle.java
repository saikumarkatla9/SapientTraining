package com.sapient.service;

public class Circle {

	public double radius;
	public Circle(double radius) throws Exception {
		super();
		if(radius<=0)
			throw new Exception("radius cannot be negative");
		
		this.radius = radius;
	}

	public double calArea(){
		double area = 3.14*radius*radius;
		return area;
	}
	
	public double calPerimeter(){
		double peri = 2*3.14*radius;
		return peri;
	}
}
