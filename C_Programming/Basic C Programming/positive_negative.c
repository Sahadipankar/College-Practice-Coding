#include <stdio.h>

int main () {
    
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);
    
    if (n > 0) {
        printf("\nThis is a Positive number");
    }
    else 
    printf("\nThis is a Negative number");
    
    return 0;
    
}
