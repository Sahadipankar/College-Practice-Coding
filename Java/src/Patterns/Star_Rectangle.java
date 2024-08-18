package Patterns;

import java.util.*;

public class Star_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("\nEnter the number of rows: "); 
        int rows = sc.nextInt();
        System.out.print("\nEnter the number of columns: "); 
        int cols = sc.nextInt();
        System.out.println();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        sc.close();
    }
}
