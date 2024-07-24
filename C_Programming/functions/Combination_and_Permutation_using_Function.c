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
    int n, r;
    printf("Enter the value of n: ");
    scanf("%d", &n);
    printf("Enter the value of r: ");
    scanf("%d", &r);
    printf("\n");
    int combi = combination (n, r);
    printf("The Combinaton of the numbers is: %d",combi);
    return 0;
}
