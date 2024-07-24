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
    
    int sumEven = 0, sumOdd = 0, diff = 0;
    for (int j = 0; j < n; j++) {
        if (j % 2 == 0) sumEven += arr[j];
        else sumOdd += arr[j];
    }
    diff = sumEven - sumOdd;
    printf("The difference of the sum of Even indices (%d) and sum of Odd indices (%d) is: %d",sumEven,sumOdd,diff);
    return 0;
}