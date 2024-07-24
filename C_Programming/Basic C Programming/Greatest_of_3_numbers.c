#include <stdio.h>

int main () {
    
    int x, y, z;
    printf("Enter the First Number: ");
    scanf("%d", &x);
    printf("Enter the Second Number: ");
    scanf("%d", &y);
    printf("Enter the Third Number: ");
    scanf("%d", &z);
    
    if (x>y && x>z)
    printf("\n%d is the Greatest Number",x);
    else if (y>x && y>z)
    printf("\n%d is the Greatest Number",y);
    else
    printf("\n%d is the Greatest Number",z);

    return 0;
    
}