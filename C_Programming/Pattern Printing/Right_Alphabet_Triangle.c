#include <stdio.h>

int main () {
    int n;
    char ch;
    printf("Enter the number of terms: ");
    scanf("%d", &n);
    printf("\n");
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n - i; j++) { 
            printf("  ");
        }
        int a = 65;
        for (int k = 1; k <= i; k++) {
            ch = (char)a;
            printf("%c ",ch);
            a++;
        }
        printf("\n");
    }
    return 0;
}
