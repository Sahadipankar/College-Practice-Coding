#include <stdio.h>
int main ()
{
    int n, a;
    printf("Enter the number of stars: ");
    scanf("%d", &n);
    printf("\n");
    a = n;
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= a; j++) {
            printf("%d ",j);
        }
        a--;
        printf("\n");
    }
    return 0;
}

