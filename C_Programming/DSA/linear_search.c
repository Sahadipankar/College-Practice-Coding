#include <stdio.h>
int main()
{
    int n, f = -1, key;
    printf("Enter the size of Array: ");
    scanf("%d", &n);
    printf("\n");
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        printf("Enter element no. %d: ", i + 1);
        scanf("%d", &arr[i]);
    }
    printf("\nThe Array elements are: ");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }
    printf("\n\nEnter the element to be searched: ");
    scanf("%d", &key);
    for (int i = 0; i < n; i++)
    {
        if (key == arr[i])
        {
            f = i;
        }
    }
    if (f == -1)
        printf("\nSearched element is not present in the Array.");
    else
        printf("\nThe index number of the searched element is: %d", f + 1);
    return 0;
}