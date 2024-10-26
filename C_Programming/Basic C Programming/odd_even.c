#include <stdio.h>

int main () {
    
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);
    
    if (n % 2 == 0) {
        printf("\n%d is an Even number", n);
    }
    else 
    printf("\n%d is a Odd number", n);
    
    return 0;
    
}
