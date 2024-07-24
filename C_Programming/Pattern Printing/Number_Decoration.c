#include <stdio.h>
int main () {
    int n;
    printf("Enter the number of Terms: ");
    scanf("%d", &n);
    printf("\n");
    int a = n - 1, nsp = 1;
    for (int i = 1; i <= n * 2 - 1; i++) {
        printf("%d ",i);
    }
    printf("\n");
    for (int i = 1; i <= n - 1; i++) {
        int b = 1;
        for (int j = 1; j <= a; j++) {
            printf("%d ",b);
            b++;
        }
        for (int k = 1; k <= nsp; k++) {
            printf("  ");
            b++;
        }
        for (int l = 1; l <= a; l++) {
            printf("%d ",b);
            b++;
        }
        a--;
        nsp += 2;
        printf("\n");
    }
    return 0;
}