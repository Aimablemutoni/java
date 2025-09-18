package com.rectangle;

public class Rectangle {
	private double length;
	private double width;
	private double calculatearea;
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public  void setWidth(double width) {
		this.width = width;
	}


	
	public double getcalculatearea() {
		return this.calculatearea=this.width*this.length;
	}
}
