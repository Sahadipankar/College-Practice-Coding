package Basics;

import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a Number to check for Odd or Even: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("\nThe Number " + num + " is Even.\n");
        } else {
            System.out.println("\nThe Number " + num + " is Odd.\n");
        }
        sc.close();
    }
}