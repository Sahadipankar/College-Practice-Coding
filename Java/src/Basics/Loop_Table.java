package Basics;

import java.util.*;

public class Loop_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("\nEnter the number: "); 
        int n = sc.nextInt();
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n*i);
        }
        System.out.println();
        sc.close();
    }
}
