#include <stdio.h>
int main()
{
    int n;
    printf("Enter the number of Terms: ");
    scanf("%d", &n);
    int nst = 1, nsp = n / 2; // nst & nsp = No. of Stars and Spaces
    int mid = n / 2 + 1;
    printf("\n");
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= nsp; j++) {
            printf("  ");
        }
        for (int k = 1; k <= nst; k++) {
            printf("* ");
        }
        if(i < mid) {
            nsp--;
            nst += 2;
        }
        else {
            nsp++;
            nst -= 2;
        }
        printf("\n");
    }
    return 0;
}
