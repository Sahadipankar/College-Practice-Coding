#include <stdio.h>
int factorial (int x) {
    int fact = 1;
    for (int i = 1; i <= x; i++) {
        fact = fact * i;
    }
    return fact;
}
int main()
{
    int n[6];
    for (int i = 0; i <= 5; i++) {
        printf("Enter Number %d: ",i + 1);
        scanf("%d", &n[i]);
    }
    printf("\n");
    for (int i = 0; i <= 5; i++) {
        int fact = factorial (n[i]);
        printf("The Factorial of Number %d is: %d",n[i],fact);
        printf("\n");
    }
    return 0;
}
