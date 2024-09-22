package Basics;

import java.util.*;

public class SumAvg {
	public static void main (String args []) {
	Scanner sc = new Scanner (System.in);

	System.out.print("\nEnter the marks of first subject: ");
	double sub1 = sc.nextDouble();

	System.out.print("Enter the marks of second subject: ");
	double sub2 = sc.nextDouble();

	System.out.print("Enter the marks of third subject: ");
	double sub3 = sc.nextDouble();

	System.out.print("Enter the marks of fourth subject: ");
	double sub4 = sc.nextDouble();

	System.out.print("Enter the marks of fifth subject: ");
	double sub5 = sc.nextDouble();
	
	System.out.println("\nThe summation marks of 5 subject is " + (sub1+sub2+sub3+sub4+sub5));
	System.out.println("\nThe Average marks of 5 subject is " + ((sub1+sub2+sub3+sub4+sub5)/5));
	sc.close();
	}
}