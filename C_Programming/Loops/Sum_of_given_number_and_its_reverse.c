#include <stdio.h>
int main () {
    
    int n, lastDigit = 0, reverse = 0, sum = 0, m;
    printf("Enter a number: ");
    scanf("%d", &n);
    m = n;
    
    while (n != 0) {
        lastDigit = n % 10;
        reverse = reverse * 10 + lastDigit;
        n /= 10;
    }
    sum = m + reverse;
    printf("\nThe Sum of given number and it's reverse is: %d",sum);

    return 0;
    
}