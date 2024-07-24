#include <stdio.h>
int factorial (int x) {
    int fact = 1;
    for (int i = 1; i <= x; i++) {
        fact = fact * i;
    }
    return fact;
}
int combination (int n, int r) {
    int combi = factorial (n) / (factorial (r) * factorial (n - r));
    return combi;
} 
int main () {
    int n;
    printf("Enter the number of Terms: ");
    scanf("%d", &n);
    for (int i = 0; i <= n; i++) {
        for (int j = 1; j <= n - i; j++) {
            printf("  ");
        }
        for (int k = 0; k <= i; k++) {
            int combi = combination (i,k);
            printf("%d   ",combi);
        }
        printf("\n");
    }
    return 0;
}
