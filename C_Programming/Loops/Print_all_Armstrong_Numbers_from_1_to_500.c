#include <stdio.h>

int main() {
    int num, lastDigit, product, sum = 0;

    printf("Armstrong numbers from 1 to 500 are:\n");

    for (int i = 1; i <= 500; i++) {
        num = i;

        // Calculate the sum of cubes of digits
        while (num != 0) {
            lastDigit = num % 10;
            product = lastDigit * lastDigit * lastDigit;
            sum += product;
            num /= 10;
        }

        // Check if the number is an Armstrong number
        if (sum == i) {
            printf("%d\n", i);
        }
    }

    return 0;
}
