#include <stdio.h>
int main () 
{
    int n;
    printf("Enter the size of array: ");
    scanf("%d", &n);
    printf("\n");
    int arr[n];
    for (int i = 0; i < n; i++) {
        printf("Enter the Array element %d: ",i);
        scanf("%d", &arr[i]);
    }
    printf("\n");
    printf("The elements of the Array are: ");
    for (int i = 0; i < n; i++) {
        printf("%d ",arr[i]);
    }
    n++;
    int x, pos;
    printf("\n");
    printf("Enter the new element to be inserted: ");
    scanf("%d", &x);
    printf("Enter the position where the new element is to be inserted: ");
    scanf("%d", &pos);
    printf("\n");
    for (int i = n - 1; i >= pos; i--) {
        arr[i] = arr[i - 1];
    }
    arr[pos - 1] = x;
    printf("The new Array is: ");
    for (int i = 0; i < n; i++) {
        printf("%d ",arr[i]);
    }
    return 0;
}