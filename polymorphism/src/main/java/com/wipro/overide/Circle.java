package com.wipro.overide;

public class Circle extends Shape {

	public int radius;
	
	@Override
	public double area() {
		return 3.14*radius*radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
}
