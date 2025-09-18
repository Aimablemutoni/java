package com.circle;

public class Circle {
	private double radius;
	private double pi=3.14;
	private double area;
	private double circumference;
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getarea() {
		return this.area=this.pi*(this.radius*this.radius);
		
	}
	public double getcircumference() {
		return this.circumference=(2*this.pi*radius);
	}


}
