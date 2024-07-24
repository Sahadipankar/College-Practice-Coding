#include <stdio.h>

int main() {
    int number, reversedNumber = 0;

    // Input: User enters the number
    printf("Enter a number: ");
    scanf("%d", &number);

    // Reverse the number
    while (number != 0) {
        int lastDigit = number % 10;
        reversedNumber = reversedNumber * 10 + lastDigit;
        number /= 10;
    }

    // Output: Display the reversed number
    printf("\nReversed number: %d\n", reversedNumber);

    return 0;
}

