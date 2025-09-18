package com.rectangle;
import java.util.Scanner;
public class Rectangleareacalculator {

	public static void main(String[] args) {
		Rectangle rt=new Rectangle();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter width: ");
		double wadth=sc.nextDouble();
		System.out.println("Enter length: ");
		double langth=sc.nextDouble();
		rt.setWidth(wadth);
		rt.setLength(langth);
		if(langth==wadth){
			System.out.println("This is a square");
		}
		
		System.out.println("The area of a rectangle is :"+rt.getcalculatearea());

	}
	
}
