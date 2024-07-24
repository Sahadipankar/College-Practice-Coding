#include <stdio.h>
int main () {
    int n;
    printf("Enter the number of terms: ");
    scanf("%d", &n);
    printf("\n");
    int a = 0;
    for (int i = 1; i <= n * 2 - 1; i++) {
        if (i <= n) a++;
        else a--;
        printf("%d ",a);
    }
    printf("\n");
    int b = n - 1;
    int nsp = 1;
    for (int i = 1; i <= n - 1; i++) {
        int x = 1;
        for (int j = 1; j <= b; j++) {
            printf("%d ",x);
            x++;
        }
        for (int k = 1; k <= nsp; k++) {
            printf("  ");
        }
        for (int l = b; l >= 1; l--) {
            printf("%d ",l);
        }
        b--;
        nsp += 2;
        printf("\n");
    }
    return 0;
}