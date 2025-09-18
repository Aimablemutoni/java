package com.allshapes;

public class Circle {
	private double radius;
	private double pi=3.14;
	private double area;

	public double getRadius() {
	return radius;
	}
	public void setRadius(double radius) {
	this.radius = radius;
	}
	public double calculateArea() {
	return this.area=this.pi*(this.radius*this.radius);
	}

}
