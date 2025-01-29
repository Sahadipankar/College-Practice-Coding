package Basics;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a Number to check for Prime or Not: ");
        int n = sc.nextInt();

        if (n == 0 || n == 1) {
            System.out.println("\n" + n + " is neither prime nor composite.");
        } else {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println("\n" + n + " is a prime number.");
            } else {
                System.out.println("\n" + n + " is not a prime number.");
            }
        }
        System.out.println();
        sc.close();
    }
}
