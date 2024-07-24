#include <stdio.h>

int main() {
    int number;
    long long factorial = 1;  // We use long long to handle larger factorials

    // Input: User enters the number
    printf("Enter a number to calculate its factorial: ");
    scanf("%d", &number);

    // Check if the number is negative
    if (number < 0) {
        printf("\nFactorial is not defined for negative numbers.\n");
    } else {
        // Calculate factorial using a for loop
        for (int i = 1; i <= number; ++i) {
            factorial *= i;
        }

        // Output: Display the calculated factorial
        printf("\nFactorial of %d = %lld\n", number, factorial);
    }

    return 0;
}
