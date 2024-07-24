#include <stdio.h>

int main () {
    
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);
    
    if (n % 2 == 0) {
        printf("\nThis is an Even number");
    }
    else 
    printf("\nThis is a Odd number");
    
    return 0;
    
}
