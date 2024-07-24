#include <stdio.h>
int main () {
    
    int n, num, lastDigit, product = 0, sum = 0;
    printf("Enter a three-digit number to check for Armstrong Number: ");
    scanf("%d", &n);
    num = n;
    
    // while (num != 0) {
    //     lastDigit = num % 10;
    //     product = lastDigit * lastDigit * lastDigit;
    //     sum += product;
    //     num /= 10;
    // }
    
    for (; num != 0; num /= 10) {
        lastDigit = num % 10;
        product = lastDigit * lastDigit * lastDigit;
        sum += product;
    }
    
    if (sum == n) printf("\n%d is an Armstrong Number",n);
    else printf("\n%d is not an Armstrong Number", n);
    
    return 0;
}
