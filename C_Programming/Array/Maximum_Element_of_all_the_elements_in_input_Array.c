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
    int max = arr[0];
    for (int j = 1; j <= n - 1; j++) {
        if (max < arr[j]) {
            max = arr[j];
        }
    }
    printf("\n");
    printf("The maximum element of all the Array Elements is: %d",max);
    
    return 0;
}
