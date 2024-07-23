#include <stdio.h>

int binary_search(int arr[], int ub, int lb, int key);

int main()
{
    int n, key, result, f = -1;
    printf("Enter the size of Array: ");
    scanf("%d", &n);
    int arr[n];
    printf("\nEnter the array elements in a sorted way.\n");

    for (int i = 0; i < n; i++)
    {
        printf("Enter element no. %d: ", i + 1);
        scanf("%d", &arr[i]);
    }
    printf("\nThe sorted Array elements are: ");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }
    printf("\n\nEnter the element to be searched: ");
    scanf("%d", &key);

    result = binary_search(arr, 0, n - 1, key);
    if (result == -1)
        printf("\nSearched element is not present in the Array.");
    else
        printf("\nThe index number of the searched element is: %d", result + 1);
    return 0;
}

int binary_search(int arr[], int lb, int ub, int key)
{
    if (ub >= lb)
    {
        int mid = lb + (ub - lb) / 2;
        if (key == arr[mid])
        {
            return mid;
        }
        else if (key < arr[mid])
        {
            return binary_search(arr, 0, mid - 1, key);
        }
        else
            return binary_search(arr, mid + 1, ub, key);
    }
    else
        return -1;
}