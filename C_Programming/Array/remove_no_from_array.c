#include <stdio.h>
int main()
{
    int n;
    printf("Enter the size of array: ");
    scanf("%d", &n);
    printf("\n");
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        printf("Enter the Array element %d: ", i);
        scanf("%d", &arr[i]);
    }
    printf("\n");
    printf("The elements of the Array are: ");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }
    int pos;
    printf("\n");
    printf("Enter the position from where the element is to be removed: ");
    scanf("%d", &pos);
    printf("\n");
    for (int i = pos - 1; i < n; i++)
    {
        arr[i] = arr[i + 1];
    }
    n--;
    printf("The new Array is: ");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }
    return 0;
}