#include <stdio.h>

int main () {
    
    int x, y;
    printf("Enter 1st number: ");
    scanf("%d", &x);
    printf("Enter 2nd number: ");
    scanf("%d", &y);
    
    (x > y) ? printf("\n%d is the Greatest Number",x) : printf("\n%d is the Greatest Number",y);

    return 0;
    
}