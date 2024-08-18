package Basics;

import java.util.*;

public class Switch_Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nThe Operations Available");

        System.out.println("\nChoose 1 for Addition");
        System.out.println("Choose 2 for Subtraction");
        System.out.println("Choose 3 for Multiplication");
        System.out.println("Choose 4 for Division");

        System.out.print("\nChoose an option: ");
        int option = sc.nextInt();
        if (option < 1 || option > 4) {
            System.out.println("\nInvalid Option");
            sc.close();
            return; // Exit the program
        }

        System.out.print("\nEnter the first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        switch (option) {
            case 1:
                double sum = num1 + num2;
                System.out.println("\nSum of two numbers is: " + sum);
                break;
            case 2:
                double difference = num1 - num2;
                System.out.println("\nDifference of two numbers is: " + difference);
                break;
            case 3:
                double product = num1 * num2;
                System.out.println("\nProduct of two numbers is: " + product);
                break;
            case 4:
                if (num2 != 0) {
                    double quotient = num1 / num2;
                    System.out.println("\nQuotient of two numbers is: " + quotient);
                } else {
                    System.out.println("\nError: Division by zero is not allowed.");
                }
                break;
        }
        sc.close();
    }
}
