package com.circle;
import java.util.Scanner;

public class Circle2 {

	public static void main(String[] args) {
		
		Circle cr=new Circle();
		Scanner sr= new Scanner(System.in);
		System.out.println(" Please enter the readius of a circle :");
	    double rad=sr.nextDouble();
	    cr.setRadius(rad);
	    System.out.println("Choose option: 1 for Area, 2 for Circumference");
        int swi = sr.nextInt();
	    switch(swi){
	    case(1):
	    	System.out.println("The area is :"+cr.getarea());
	    break;
	    case(2):
	    	System.out.println("The circumference is :"+cr.getcircumference());
	    	break;
	    
	    }

	}

}
//names:Mutoni Aimable regno:221007304
//names:Habumugisha Pacifique regno:223022395
//names:Umugwaneza Merveille regno:222004557
