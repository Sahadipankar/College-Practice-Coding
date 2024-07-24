#include <stdio.h>
int main ()
{
    int n, b;
    char ch;
    printf("Enter the number of terms: ");
    scanf("%d", &n);
    printf("\n");
    b = n;
    for (int i = 1; i <= n; i++) {
        int a = 65;
        for (int j = 1; j <= b; j++) {
            ch = (char)a;
            printf("%c ",ch);
            a++;
        }
        b--;
        printf("\n");
    }
    return 0;
}

