#include <stdio.h>

int main()
{
    int n;
    printf("Enter the number of terms: ");
    scanf("%d", &n);
    printf("\n");
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i - 1; j++) {
            printf("  ");
        }
        for (int k = 1; k <= n - i + 1; k++) {
            printf("* ");
        }
        printf("\n");
    }
    
    return 0;
}
