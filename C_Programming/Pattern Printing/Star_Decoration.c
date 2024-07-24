#include <stdio.h>
int main () {
    int n;
    printf("Enter the number of Terms: ");
    scanf("%d", &n);
    printf("\n");
    int nst = n - 1, nsp = 1;
    for (int i = 1; i <= n * 2 - 1; i++) {
        printf("* ");
    }
    printf("\n");
    for (int i = 1; i <= n - 1; i++) {
        for (int j = 1; j <= nst; j++) {
            printf("* ");
        }
        for (int k = 1; k <= nsp; k++) {
            printf("  ");
        }
        for (int l = 1; l <= nst; l++) {
            printf("* ");
        }
        nst--;
        nsp += 2;
        printf("\n");
    }
    return 0;
}

