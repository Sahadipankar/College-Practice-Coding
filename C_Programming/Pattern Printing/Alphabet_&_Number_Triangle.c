#include <stdio.h>
int main () {
    
    int n;
    char ch;
    printf("Enter the nunber of terms: ");
    scanf("%d", &n);
    printf("\n");
    for (int i = 1; i <= n; i++){
        int a = 65;
        for (int j = 1; j <= i; j++) {
            if (i % 2 == 0) {
                ch = (char)a;
                printf("%c ",ch);
                a++;
            }
            else 
            printf("%d ",j);
        }
        printf("\n");
    }
    return 0;
}