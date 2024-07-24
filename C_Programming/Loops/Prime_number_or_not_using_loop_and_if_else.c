#include <stdio.h>

int main() {
    int number, isPrime = 1;  // Assume the number is prime initially

    // Input: User enters the number
    printf("Enter a number to check if it's Prime: ");
    scanf("%d", &number);

    // Check if the number is less than 2 (not prime)
    if (number < 2) {
        isPrime = 0;  // Set isPrime to 0, indicating not prime
    } else {
        // Check for factors from 2 to the square root of the number
        for (int i = 2; i * i <= number; ++i) {
            if (number % i == 0) {
                isPrime = 0;  // Set isPrime to 0, indicating not prime
                break;
            }
        }
    }

    // Output: Display if the number is prime or not
    if (isPrime) {
        printf("\n%d is a Prime number.\n", number);
    } else {
        printf("\n%d is not a Prime number.\n", number);
    }

    return 0;
}
