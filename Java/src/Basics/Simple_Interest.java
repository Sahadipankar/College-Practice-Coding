package Basics;

public class Simple_Interest {
    public static void main(String[] args) {
        int principal = 1000; // Principal amount
        float rate = 20f; // Interest rate specified as a float literal using 'f' suffix
        int time = 3; // Time period in years
        float simpleInterest = principal * rate * time / 100; // Calculate simple interest
        System.out.println("\nSimple Interest is: " + simpleInterest); // Print the result
    }
}
