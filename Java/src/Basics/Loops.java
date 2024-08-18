package Basics;

public class Loops {
    public static void main(String[] args) {
        // For loop
        for (int i = 0; i <= 5; i++) {
            System.out.println("For loop: " + i);
        }
        System.out.println();
        // While loop
        int j = 0;
        while (j <= 5) {
            System.out.println("While loop: " + j);
            j++;
        }
        System.out.println();
        // Do-While loop
        int k = 0;
        do {
            System.out.println("Do-While loop: " + k);
            k++;
        } while (k <= 5);
    }
}
