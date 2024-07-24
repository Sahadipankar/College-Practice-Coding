#include <stdio.h>

int main()
{
    float n, a;
    printf("Enter a number: ");
    scanf("%f", &n);
    a = 100;
    for (float i=1; i<=n; i++){
        printf ("%f ",a);
        a = a / 2;
    }
    return 0;
}
