#include <stdio.h>

int main () {
    int n;
    printf("Enter the number of Terms: ");
    scanf("%d", &n);
    printf("\n");
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n - i; j++) {
            printf("  ");
        }
        int a = 65;
        for (int k = 1; k <= i; k++) {
            printf("%c ",a);
            a++;
        }
        char b = a - 2;
        for (int l = 1; l <= i - 1; l++) {
            printf("%c ",b);
            b--;
        }
        printf("\n");
    }
    return 0;
}