package Patterns;

import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number of rows: ");
        int n = sc.nextInt();
        System.out.println();

        // upper part
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // lower part
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        sc.close();
    }
}
