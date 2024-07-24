#include <stdio.h>
int main ()
{
    int n;
    printf("Enter the number of stars: ");
    scanf("%d", &n);
    printf("\n");
    for (int i = 1; i <= n; i++) {
        int a = i;
        for (int j = 1; j <= i; j++) {
            printf("%d ",a);
            a--;
        }
        printf("\n");
    }
    return 0;
}
