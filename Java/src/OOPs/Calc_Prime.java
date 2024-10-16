package OOPs;

import java.util.Scanner;

class Check_Prime {
    private int lb, ub, primeSum, primeCount;

    public Check_Prime(int lb, int ub) {
        this.lb = lb;
        this.ub = ub;
        this.primeSum = 0;
        this.primeCount = 0;
    }

    public boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void calc_prime() {
        System.out.print("\nPrime numbers present in the range: ");
        for (int i = lb; i <= ub; i++) {
            if (isPrime(i)) {
                primeSum += i;
                primeCount++;
                System.out.print(i + " "); // Listing the prime numbers added
            }
        }
        System.out.println(); // Move to the next line after listing primes
    }

    public void displayResults() {
        System.out.println("\nTotal number of primes in range " + lb + " to " + ub + " is: " + primeCount);
        System.out.println("Sum of primes in range " + lb + " to " + ub + " is: " + primeSum);
    }
}

public class Calc_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("\nEnter the starting number of the range to start checking for Prime: ");
            int lb = sc.nextInt();
            System.out.print("\nEnter the ending number of the range to stop checking for Prime: ");
            int ub = sc.nextInt();

            if (lb < 0 || ub < 0 || lb > ub) {
                System.out.println("\nInvalid range. Please enter a valid range where the starting range is less than or equal to the ending range, and both are non-negative.");
            } else {
                Check_Prime obj = new Check_Prime(lb, ub);
                obj.calc_prime();
                obj.displayResults();
            }

            // Ask if the user wants to continue or exit
            System.out.print("\nDo you want to check another range? (Press '1' for Yes / Press '0' for No): ");
            
            int choice = sc.nextInt();
            if (choice != 1) {
                System.out.println("\nExiting Program...");
                break;
            }
        }
        sc.close();
    }
}
