#include <stdio.h>

int main() {
    int n, num, evenCount = 0, oddCount = 0;

    // Input: How many numbers in the series?
    printf("Enter the total number of elements in the series: ");
    scanf("%d", &n);

    // Input: Series of numbers
    printf("\nEnter the series of numbers: ");

    for (int i = 1; i <= n; i++) {
        scanf("%d", &num);

        // Check if the number is even or odd
        if (num % 2 == 0) {
            evenCount++;
        } else {
            oddCount++;
        }
    }

    // Output: Display the count of even and odd numbers
    printf("\nCount of even numbers: %d\n", evenCount);
    printf("\nCount of odd numbers: %d\n", oddCount);

    return 0;
}
