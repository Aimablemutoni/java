package com.allshapes;
import java.util.Scanner;

public class Calculations {

	public static void main(String[] args) {
		Scanner sr= new Scanner(System.in);

		System.out.println("Welcome to Drawing Application!");
		System.out.println("Choose a shape to calculate area:");
		System.out.println("1 - Rectangle");
		System.out.println("2 - Circle");
		System.out.print("Enter your choice (1 or 2): ");

		int choice=sr.nextInt();

		switch(choice){
		case(1):
		Rectangle rect=new Rectangle();
		System.out.print("Please enter the length :");
		double len=sr.nextDouble();
		System.out.print("Please enter the width :");
		double wid=sr.nextDouble();
		rect.setLength(len);
		rect.setWidth(wid);
		System.out.println("The area of rectangle is :"+rect.calculateArea());
		break;

		case(2):
		Circle cr=new Circle();
		System.out.print("Please enter the radius :");
		double rad=sr.nextDouble();
		cr.setRadius(rad);
		System.out.println("The area of circle is :"+cr.calculateArea());
		break;

		default:
		System.out.println("Invalid choice! Please select 1 or 2.");
		break;
		}

		sr.close();

	}

}
