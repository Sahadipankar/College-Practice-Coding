#include <stdio.h>

int main()
{
    int n, lastDigit = 0, sum = 0;
    printf("Enter a number: ");
    scanf("%d", &n);
    
    while (n != 0) {
        lastDigit = n % 10;
        n = n / 10;
        if (lastDigit % 2 == 0) {
        sum = sum + lastDigit;
        }
    }
    
    printf("\nThe sum of digit is: %d",sum);
    
    return 0;
}


