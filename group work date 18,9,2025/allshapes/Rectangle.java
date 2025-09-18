package com.allshapes;

public class Rectangle {
	private double length;
	private double width;
	private double area;

	public double getLength() {
	return length;
	}
	public void setLength(double length) {
	this.length = length;
	}
	public double getWidth() {
	return width;
	}
	public void setWidth(double width) {
	this.width = width;
	}
	public double calculateArea() {
	return this.area=this.length*this.width;
	}

}
