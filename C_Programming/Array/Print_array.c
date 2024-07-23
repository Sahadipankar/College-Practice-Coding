#include <stdio.h>
int main () {
    int n;
    printf("Enter the size of Array: ");
    scanf("%d", &n);
    int arr[n];
    printf("\n");
    int a = 100;
    for (int i = 0; i < n; i++) {
        arr[i] = a;
        a = a+2;
    }
    printf("\n");
    for (int j = 0; j < n; j++) {
        printf("%d ", arr[j]);
    }
    return 0;
}