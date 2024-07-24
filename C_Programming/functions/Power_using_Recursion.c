#include <stdio.h>

// Function to calculate power using recursion
double power(double base, int exponent) {
    if (exponent == 0) {
        return 1;  // Any number raised to the power of 0 is 1
    } else if (exponent > 0) {
        return base * power(base, exponent - 1);  // Recursive call for positive exponent
    } else {
        return 1 / (base * power(base, -exponent - 1));  // Recursive call for negative exponent
    }
}

int main() {
    double base;
    int exponent;

    // Input from user
    printf("Enter the base: ");
    scanf("%lf", &base);
    printf("Enter the exponent: ");
    scanf("%d", &exponent);

    // Calculate and display the result
    printf("%.1lf raised to the power of %d is: %.1lf", base, exponent, power(base, exponent));

    return 0;
}
