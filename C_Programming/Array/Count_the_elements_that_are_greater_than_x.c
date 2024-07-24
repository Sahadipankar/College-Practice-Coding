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
    
    int a;
    printf("Enter the number to check greater than elements: ");
    scanf("%d", &a);
    int count = 0;
    for (int j = 0; j < n; j++) {
        if (arr[j] > a) count += 1;
    }
    printf("The count of numbers greater than %d is: %d",a,count);
    return 0;
}