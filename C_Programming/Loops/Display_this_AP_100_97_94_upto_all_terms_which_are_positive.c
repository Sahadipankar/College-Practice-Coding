#include <stdio.h>

int main()
{
    int a = 100;
    // for (int i=1; i<=100; i++){
    //     if (a>=0) printf ("%d ",a);          This is another way to solve the problem
    //     a = a - 3;
    for (int i=1; a>0; i++){
        printf ("%d ",a);
        a = a - 3;
    }
    return 0;
}
