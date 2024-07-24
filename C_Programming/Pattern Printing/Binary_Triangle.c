#include <stdio.h>

int main () {
    int n;
    printf("Enter the number of terms: ");
    scanf("%d", &n);
    printf("\n");
    // for (int i = 1; i <= n; i++) {
    //     int a;
    //     if (i % 2 == 0) a = 0;
    //     else a = 1;
    //     for (int j = 1; j <= i; j++) {
    //         printf("%d ",a);
    //         if (a == 1) a = 0;
    //         else a = 1;
    //     }
    //     printf("\n");
    // }    
    for (int i = 1; i <= n; i++) { //Alternate Method
        int a = 0, b = 1;
        for (int j = 1; j <= i; j++) {
            if ((i + j) % 2 == 0) 
            printf("%d ",b);
            else printf("%d ",a);
        }
        printf("\n");
    }
    return 0;
}
