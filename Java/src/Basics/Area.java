package Basics;

import java.util.Scanner;

class Rec {
	double length, breadth, area;
	final double pi = 3.1415;
	
	void findAreaOfCir (double ar) {
	area = pi * ar * ar;
	}	

	void findAreaOfRec (double l, double b) {
	length = l;
	breadth = b;
	area = length * breadth;
	}

	void outputAreaOfRec () {
	System.out.println ("Area of Rectangle is: " + area);
	}

	void outputAreaOfCir () {
	System.out.println ("Area of Circle is: " + area);
	}
}

public class Area {
	public static void main (String args []) {
	Scanner sc = new Scanner(System.in);

	System.out.print("\nEnter the Length: ");
	double length = sc.nextDouble();
	System.out.print("Enter the Breadth: ");
	double breadth = sc.nextDouble();
	
	Rec obj1 = new Rec ();
	Rec obj2 = new Rec ();


	obj1.findAreaOfRec(length, breadth);
	obj1.outputAreaOfRec();

	obj2.findAreaOfCir(15);
	obj2.outputAreaOfCir();
	sc.close();
	}
}