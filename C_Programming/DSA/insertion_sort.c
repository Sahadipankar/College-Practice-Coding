#include <stdio.h>

int scan_printArray(int *arr, int n);
int printArray(int *arr, int n);

int main()
{
    int n;
    printf("Enter the size of Array: ");
    scanf("%d", &n);
    printf("\n");
    int arr[n];
    scan_printArray(arr, n);

    for (int i = 1; i < n; i++)
    {
        int temp = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > temp)
        {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = temp;
    }
    printArray(arr, n);
    return 0;
}

int scan_printArray(int *arr, int n)
{
    for (int i = 0; i < n; i++)
    {
        printf("Enter the element no. %d: ", i + 1);
        scanf("%d", &arr[i]);
    }
    printf("\nThe given Array elements are: ");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }
}

int printArray(int *arr, int n)
{
    printf("\nThe Sorted Array is: ");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }
}
