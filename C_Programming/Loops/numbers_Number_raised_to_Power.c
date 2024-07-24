#include <stdio.h>
int main () {
    
    int a, b;
    printf("Enter the Base: ");
    scanf("%d", &a);
    printf("Enter the Power: ");
    scanf("%d", &b);
    
    int power = 1;
    for (int i = 1; i <= b; i++) {
        power = power * a;
    }
    printf("\nThe number %d raised to number %d is: %d",a,b,power);
    
    return 0;
}