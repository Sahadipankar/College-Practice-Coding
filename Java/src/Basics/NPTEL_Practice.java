package Basics;

import java.util.Scanner;

public class NPTEL_Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close(); // Closing Scanner to prevent memory leaks

        int count = 0;
        
        // Corrected loop to count the digits in num
        while (num > 0) {
            count++;
            num /= 10; // Reduce num by dividing by 10
            System.out.println("num: " + num);
            int a = 5, b = 2;
            System.out.println(5 / 2);
        }
        
        System.out.println("Number of digits: " + count);
    }
}
