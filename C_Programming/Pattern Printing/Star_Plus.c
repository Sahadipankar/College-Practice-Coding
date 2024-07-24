#include <stdio.h>
int main () {
    
    int n;
    printf("Enter the nunber of terms: ");
    scanf("%d", &n);
    printf("\n");
    for (int i = 1; i <= n; i++){
        int a = n / 2 + 1;
        for (int j = 1; j <= n; j++) {
            if (j == a || i == a) printf("* ");
            else printf("  ");
        }
        printf("\n");
    }
    return 0;
}