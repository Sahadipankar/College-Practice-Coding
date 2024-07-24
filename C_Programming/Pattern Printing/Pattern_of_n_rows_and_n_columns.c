#include <stdio.h>

int main()
{
    int i, j, n, m;
    printf("Enter number of rows: ");
    scanf("%d", &n);
    printf("Enter number of columns: ");
    scanf("%d", &m);
    printf("\n");

    for (i = 1; i <= n; i++) {
        for (j = 1; j <= m; j++) {
            printf("%d ",j);
        }
        printf("\n");
    }
    return 0;
}
