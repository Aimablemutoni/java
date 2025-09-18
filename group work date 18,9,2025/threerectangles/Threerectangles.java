package com.threerectangles;
import java.util.Scanner;

public class Threerectangles {

	public static void main(String[] args) {
		Rectangles[] rectangles = new Rectangles[3];
		Scanner sr= new Scanner(System.in);

		for(int i=0; i<3; i++){
		rectangles[i] = new Rectangles();
		System.out.println("Enter dimensions for rectangle " + (i+1) + ":");
		System.out.print("Please enter the length :");
		double len=sr.nextDouble();
		System.out.print("Please enter the width :");
		double wid=sr.nextDouble();

		rectangles[i].setLength(len);
		rectangles[i].setWidth(wid);
		}

		System.out.println("\nAreas of the rectangles:");
		for(int i=0; i<3; i++){
		System.out.println("Rectangle " + (i+1) + " area is :" + rectangles[i].calculateArea());
		}

		}

		

	}


