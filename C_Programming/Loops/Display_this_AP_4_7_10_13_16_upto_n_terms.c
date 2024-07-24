#include <stdio.h>

int main()
{
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);
    for (int i=4; i<=3*n+1; i=i+3){// a+(n-1)*d is the formula to find AP
        printf ("%d ",i); // a = 4, d = 3. Difference between two numbers.
    }
    
    return 0;
}
