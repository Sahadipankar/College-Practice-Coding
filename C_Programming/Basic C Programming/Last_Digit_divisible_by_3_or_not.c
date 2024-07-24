#include <stdio.h>
int main () {
    
    int number;
    printf("Enter a number: ");
    scanf("%d", &number);
    
    int lastDigit = number % 10;
    if (lastDigit % 3 == 0) {
        printf("\nThe last digit of the number is divisible by 3");
    }
    else 
    printf("\nThe last digit of the number is not divisible by 3");
    
    return 0;
}