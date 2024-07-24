#include <stdio.h>

int main()
{
    int n;
    printf("Enter the size of Array: ");
    scanf("%d", &n);
    int arr[n];
    printf("\n");
    for (int i = 0; i <= n - 1; i++) {
        printf("Enter the value of element %d: ",i);
        scanf("%d", &arr[i]);
    }
    int min = arr[0];
    for (int j = 1; j <= n - 1; j++) {
        if (min > arr[j]) {
            min = arr[j];
        }
    }
    printf("\n");
    printf("The minimum element of all the Array Elements is: %d",min);
    
    return 0;
}
