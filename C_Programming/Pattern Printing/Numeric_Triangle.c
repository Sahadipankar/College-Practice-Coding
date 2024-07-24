#include <stdio.h>
int main ()
{
    int n;
    char ch;
    printf("Enter the number of terms: ");
    scanf("%d", &n);
    printf("\n");
    int a = 1;
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n - i; j++) {
            printf("  ");
        }
        for (int k = 1; k <= a; k++) {
            printf("%d ",k);
        }
        a = a + 2;
        printf("\n");
    }
    return 0;
}


