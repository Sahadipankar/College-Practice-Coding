#include <stdio.h>

int main()
{
    int n, firstTerm = 0, secondTerm = 1, sum = 0;
    printf("Enter the number of terms: ");
    scanf("%d", &n);
    
    printf("\nThe fibonacci series is: %d %d ",firstTerm,secondTerm);
    
    for (int i = 1; i <= n-2; i++){
        sum = firstTerm + secondTerm;
        firstTerm = secondTerm;
        secondTerm = sum;
        printf("%d ",sum);
    }
    return 0;
}

