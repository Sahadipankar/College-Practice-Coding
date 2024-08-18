package Basics;

import java.util.*;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("\nEnter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("\nSum of first " + n + " natural numbers is: " + sum);
        sc.close();
    }
}
