package Basics;

import java.util.Scanner; //    For Taking Input

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//  For Taking Input
        System.out.print("\nEnter the radius: ");
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;
        // double area = (22 / 7) * radius * radius;
        System.out.println("Area of circle is: " + area);
        sc.close(); // Closing Scanner
    }
}
