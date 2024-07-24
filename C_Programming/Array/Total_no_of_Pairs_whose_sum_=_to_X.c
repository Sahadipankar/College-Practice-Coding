#include <stdio.h>
int main () {
    int n;
    printf("Enter the size of the Array: ");
    scanf("%d", &n);
    printf("\n");
    int arr[n];
    for (int i = 0; i <= n - 1; i++) {
        printf("Enter the element %d of Array: ",i);
        scanf("%d", &arr[i]);
    }
    printf("\n");
    
    int a, count = 0;
    printf("Enter the number to check for pairs: ");
    scanf("%d", &a);
    for (int j = 0; j < n; j++) {
        for (int k = j + 1; k < n; k++ ) {
            if (arr[j] + arr[k] == a) {
            count++;
            printf("(%d,%d)\n",arr[j],arr[k]);
            }
        }
    }
    printf("The count of pair/pairs that make %d is: %d",a,count);
    return 0;
}
