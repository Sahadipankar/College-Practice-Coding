#include <stdio.h>
int main () {
    int n;
    printf("Enter the number of terms: ");
    scanf("%d", &n);
    printf("\n");
    int x = 65;
    for (int i =1; i <= n * 2 - 1; i++) {
        printf("%c ",x);
        x++;
    }
    int a = n - 1;
    int nsp = 1;
    printf("\n");
    for (int i =1; i <= n - 1; i++) {
        int y = 65;
        for (int j = 1; j <= a; j++) {
            printf("%c ",y);
            y++;
        }
        for (int j = 1; j <= nsp; j++) {
            printf("  ");
            y++;
        }
        for (int k = 1; k <= a; k++) {
            printf("%c ",y);
            y++;
        }
        a--;
        nsp += 2;
        printf("\n");
    }
    return 0;
}