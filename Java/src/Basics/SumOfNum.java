package Basics;
import java.util.Scanner;

public class SumOfNum {
    public static void main(String[] args) {
        int count, num, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of integers you want to sum: ");
        count = sc.nextInt();
        System.out.println("Enter " + count + " integers:");
        for (int i = 1; i<=count; i++) {
            num = sc.nextInt();
            sum += num;
        }
        System.out.println("Sum of the integers is: " + sum);
        sc.close();
    }
}
