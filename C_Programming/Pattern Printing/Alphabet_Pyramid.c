#include <stdio.h>

int main () {
    int n;
    printf("Enter the number of terms: ");
    scanf("%d", &n);
    printf("\n");
    int a = 1;
    char ch;
    for (int i = 1; i <= n; i++) {
        int b = 65;
        for (int j = 1; j <= n - i; j++) {
            printf("  ");
        }
        for (int j = 1; j <= a; j++) {
            ch = (char)b;
            printf("%c ",ch);
            b++;
        }
        a = a + 2;
        printf("\n");
    }
    return 0;
}