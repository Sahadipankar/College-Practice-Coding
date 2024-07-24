#include <stdio.h>

int main () {
    int n;
    printf("Enter the number of terms: ");
    scanf("%d", &n);
    printf("\n");
    int a = n;
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= a - 1; j++) { //Also we can use (j <= n - i) without using extra variable
            printf("  ");
        }
        a--;
        for (int k = 1; k <= i; k++) {
            printf("* ");
        }
        printf("\n");
    }
    return 0;
}

