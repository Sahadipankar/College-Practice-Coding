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
    for (int j = 0; j <= n - 1; j++) {
        if (j % 2 != 0) {
            arr[j] *= 2;    //Odd indices - Elements *2
        }
        else {
            arr[j] += 10;   //Even indices - Elements +2
        }
    }
    printf("The Array elements are: ");
    for (int k = 0; k < n; k++) {
        printf("%d ",arr[k]);
    }
    return 0;
}
