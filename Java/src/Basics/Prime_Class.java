package Basics;

import java.util.Scanner;

class PrimeCalculator {
    private int LB;
    private int UB;
    private int Count;
    private int Sum;

    // Constructor
    public PrimeCalculator(int LB, int UB) {
        this.LB = LB;
        this.UB = UB;
        this.Count = 0;
        this.Sum = 0;
    }

    // Method to check if a number is prime
    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to validate the range
    private boolean validateRange() {
        return LB > 0 && UB > 0 && LB < UB;
    }

    // Method to calculate the sum and count of prime numbers
    public void calculatePrimes() {
        if (!validateRange()) {
            System.out.println("Both bounds must be positive ");
            return;
        }
        for (int i = LB; i <= UB; i++) {
            if (isPrime(i)) {
                Count++;
                Sum += i;
            }
        }
    }

    // Method to display the results
    public void displayResults() {
        if (Count == 0) {
            System.out.println("No prime numbers found in the specified range.");
        } else {
            System.out.println("Total prime numbers found: " + Count);
            System.out.println("Sum of all prime numbers: " + Sum);
        }
    }
}

public class Prime_Class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower bound of the range: ");
        int LB = sc.nextInt();
        System.out.print("Enter the upper bound of the range: ");
        int UB = sc.nextInt();
        PrimeCalculator pc = new PrimeCalculator(LB, UB);
        pc.calculatePrimes();
        pc.displayResults();
        sc.close();
    }
}
