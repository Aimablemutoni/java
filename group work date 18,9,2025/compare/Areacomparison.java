package com.compare;
import java.util.Scanner; 

public class Areacomparison {

	public static void main(String[] args) {

Rectangle rect=new Rectangle();
Circle cr=new Circle();
Scanner sr= new Scanner(System.in);

System.out.println("Engineer's Area Comparison Tool");
System.out.println("Enter dimensions for Rectangle:");
System.out.print("Please enter the length :");
double len=sr.nextDouble();
System.out.print("Please enter the width :");
double wid=sr.nextDouble();

rect.setLength(len);
rect.setWidth(wid);

System.out.println("\nEnter dimensions for Circle:");
System.out.print("Please enter the radius :");
double rad=sr.nextDouble();

cr.setRadius(rad);

double rectangleArea=rect.calculateArea();
double circleArea=cr.calculateArea();

System.out.println("\nArea Comparison Results:");
System.out.println("Rectangle area is :"+rectangleArea);
System.out.println("Circle area is :"+circleArea);

if(rectangleArea>circleArea){
System.out.println("The Rectangle has the larger area!");
}
else if(circleArea>rectangleArea){
System.out.println("The Circle has the larger area!");
}
else{
System.out.println("Both shapes have the same area!");
}

sr.close();
	}

}
