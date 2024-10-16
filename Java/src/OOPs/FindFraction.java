package OOPs;

import java.util.Scanner;

// Class to represent a Fraction
class Fraction {
    int num; // Numerator
    int den; // Denominator

    // Default constructor (in case no values are passed)
    public Fraction() {

    }

    // Constructor to initialize a Fraction with numerator and denominator
    public Fraction(int num, int den) {
        this.num = num;
        this.den = den;

        display(); // Display the fraction before simplifying
        simplify(); // Simplify the fraction upon creation
    }

    // Method to display the fraction in "num/den" format
    public void display() {
        System.out.println("\nThe given Fraction is: " + num + "/" + den);
    }

    // Method to find the Greatest Common Divisor (GCD) using iteration
    public int GCD(int num, int den) {
        int min = Math.min(num, den); // Get the smaller number between num and den
        for (int i = min; i >= 1; i--) {
            if (num % i == 0 && den % i == 0) {
                return i; // Return the highest common divisor
            }
        }
        return min; // In case there's no higher GCD, return the smaller number itself
    }

    // To simplify any fraction we divide num and den with their HCF
    // Method to simplify the fraction by dividing num and den by their GCD
    public void simplify() {
        int HCF = GCD(num, den); // HCF is the highest common factor (GCD)
        num = num / HCF; // Divide numerator by HCF to simplify
        den = den / HCF; // Divide denominator by HCF to simplify
        System.out.println("The simplified Fraction is: " + this.num + "/" + this.den);
    }

    // Method to add two fractions and return the result as a new Fraction object
    public Fraction add(Fraction f1, Fraction f2) {
        // Formula to add two fractions: (a/b + c/d) = (a*d + c*b) / (b*d)
        int numerator = f1.num * f2.den + f2.num * f1.den; // New numerator
        int denominator = f1.den * f2.den; // New denominator
        // Create a new Fraction object with the resulting numerator and denominator
        Fraction f3 = new Fraction(numerator, denominator);
        return f3; // Return the simplified result
    }

    public void exit () {
        System.out.println("\nExiting the program...");
    }
}

public class FindFraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for user input

        // Input for first fraction
        System.out.print("\nEnter the 1st numerator: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the 1st denominator: ");
        int den1 = sc.nextInt();
        Fraction f1 = new Fraction(num1, den1); // Create first Fraction object

        // Input for second fraction
        System.out.print("\nEnter the 2nd numerator: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the 2nd denominator: ");
        int den2 = sc.nextInt();
        Fraction f2 = new Fraction(num2, den2); // Create second Fraction object

        // Create an instance of Fraction to access the 'add' method
        Fraction result = new Fraction(); 
        Fraction f3 = result.add(f1, f2); // Add two fractions and store the result in f3
        f3.exit();

        sc.close(); // Close the scanner to avoid resource leaks
    }
}
