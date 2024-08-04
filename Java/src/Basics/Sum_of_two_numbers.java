package Basics;

import java.util.Scanner;

public class Sum_of_two_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the first number: ");
        double num1 = sc.nextDouble();
        System.out.print("\nEnter the second number: ");
        double num2 = sc.nextDouble();
        double sum = num1 + num2;
        System.out.println("\nSum of two numbers is: " + sum);
    }
}
