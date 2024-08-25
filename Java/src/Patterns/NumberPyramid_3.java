package Patterns;

import java.util.Scanner;

public class NumberPyramid_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("\nEnter the number of rows: ");
        int n = sc.nextInt();
        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
        System.out.println();
        sc.close();
    }
}
