#include <stdio.h>
int main ()
{
    int n;
    char ch;
    printf("Enter the number of terms: ");
    scanf("%d", &n);
    printf("\n");
    for (int i = 1; i <= n; i++) {
        for (int j = 65; j <= 65 + n - 1; j++) {
            ch = (char)j;
            printf("%c ",ch);
        }
        printf("\n");
    }
    return 0;
}

