#include <stdio.h>

int main()
{
    int n, a;
    printf("Enter a number: ");
    scanf("%d", &n);
    a = 1;
    for (int i=1; i<=n; i++){
        printf ("%d ",a);
        a = a * 2;
    }
    return 0;
}
