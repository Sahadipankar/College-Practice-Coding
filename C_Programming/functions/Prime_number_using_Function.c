#include <stdio.h>
#include <stdbool.h>

bool isPrime(int num) {
    if (num <= 1) {
        return false;  // 0 and 1 are not prime numbers
    }

    for (int i = 2; i * i <= num; i++) {
        if (num % i == 0) {
            return false;  // Not a prime number if divisible by any number from 2 to sqrt(num)
        }
    }

    return true;  // Prime number
}

int main() {
    int num;

    // Input from user
    printf("Enter a number: ");
    scanf("%d", &num);

    // Check if the number is prime and display the result
    if (isPrime(num))
        printf("\n%d is a prime number.\n", num);
        else
        printf("%d is not a prime number.", num);

    return 0;
}
