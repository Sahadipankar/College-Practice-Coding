#include <stdio.h>

int main () {
    int n;
    printf("Enter the number of terms: ");
    scanf("%d", &n);
    printf("\n");
    int a = 1;
    for (int i = 1; i <= n; i++) {
        int b = i - 1;
        for (int j = 1; j <= n - i; j++) {
            printf("  ");
        }
        for (int k =1; k <= i; k++) {
            printf("%d ",k);
        }
        for (int l = 1; l <= i - 1; l++) {
            printf("%d ",b);
            b--;
        }
        printf("\n");
    }
    return 0;
}