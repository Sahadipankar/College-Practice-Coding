#include <stdio.h>

int main()
{
    int n;
    printf("Enter the size of Array: ");
    scanf("%d", &n);
    int arr[n];
    int product = 1;
    printf("\n");
    for (int i = 0; i <= n - 1; i++) {
        printf("Enter the value of element %d: ",i);
        scanf("%d", &arr[i]);
    }
    for (int j = 0; j <= n - 1; j++) {
        product *= arr[j];
    }
    printf("\n");
    printf("The product of all the Array Element is: %d",product);
    
    return 0;
}
