package Basics;

import java.util.Scanner;

public class TotalMarks {    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int input;

        do {
            System.out.print("\nEnter the Total Marks: ");
            int marks = sc.nextInt();
            if (marks >= 90 && marks <= 100) {
                System.out.println("\nnThis is Excellent");
            } else if (marks >= 60 && marks <= 89) {
                System.out.println("\nThis is also Good");
            } else if (marks >= 35 && marks <= 59) {
                System.out.println("\nThis is Average");
                } else if (marks >= 0 && marks <= 34) {
                System.out.println("\nYou are Failed");
            } else {
                System.out.println("\nInvalid");
            }

            System.out.print("\nWant to continue?\n\nPress 1 if Yes || Press other if No: ");
            input = sc.nextInt();
        } 
        while (input == 1);
        sc.close();
    }
}
