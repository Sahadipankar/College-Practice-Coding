#include <stdio.h>
int main () {
    int n, x, count;
    printf("Enter the size of Array: ");
    scanf("%d", &n);
    printf("\n");
    int arr[n];
    for (int i = 0; i < n; i++) {
        printf("Enter the element %d of Array: ",i);
        scanf("%d", &arr[i]);
    }
    printf("\n");
    printf("Enter the number to check for Triplets: ");
    scanf("%d", &x);
    for (int j = 0; j < n; j++) {
        for (int k = j + 1; k < n; k++) {
            for (int l = k + 1; l < n; l++) {
                if (arr[j] + arr[k] + arr[l] == x) {
                    count++;
                    printf("(%d,%d,%d)\n",arr[j],arr[k],arr[l]);
                }
            }
        }
    }
    printf("The count of Triplets that make %d is: %d",x,count);
    return 0;
}