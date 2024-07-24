#include <stdio.h>
int main () {
    
    int n, sum = 0;
    printf("Enter the number of terms: ");
    scanf("%d", &n);
    
    for (int i = 1; i <= n; i++) {
        if (i % 2 != 0) {
            sum += i;
        } else {
            sum -= i;
        }
    }
    // Series (1-2+3-4+5-6...)
    // Formula 
    // if (n % 2 == 0) sum = -n/2;
    // else sum = -n/2 + n;
    printf("\nThe sum of the series is: %d",sum);
    
    return 0;
}
