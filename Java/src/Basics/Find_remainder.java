package Basics;

import java.util.Scanner;

public class Find_remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Dividend: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the Divisor: ");
        double num2 = sc.nextDouble();
        System.out.print("The Remainder of First and Second Number is: ");
        System.out.println(num1 % num2);
        sc.close();
    }
}
