#include <stdio.h>

// Function declarations
void quicksort(int arr[], int low, int high);
int partition(int arr[], int low, int high);

int main()
{
    int n;
    printf("Enter the size of the array: ");
    scanf("%d", &n);

    int arr[n];
    printf("Enter %d elements:\n", n);
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }

    // Sorting the array
    quicksort(arr, 0, n - 1);

    printf("Sorted array:\n");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }
    printf("\n");

    return 0;
}

// Quicksort function
void quicksort(int arr[], int low, int high)
{
    if (low < high)
    {
        // Partition the array and get the pivot index
        int pivotIndex = partition(arr, low, high);

        // Recursively sort the sub-arrays
        quicksort(arr, low, pivotIndex - 1);
        quicksort(arr, pivotIndex + 1, high);
    }
}

// Partition function
int partition(int arr[], int low, int high)
{
    int pivot = arr[low]; // Choose the first element as pivot
    int i = low + 1;      // Index of the first element after pivot

    for (int j = low + 1; j <= high; j++)
    {
        // If current element is less than or equal to pivot, swap it with arr[i]
        if (arr[j] <= pivot)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
        }
    }

    // Swap pivot with the last element smaller than or equal to pivot
    int temp = arr[low];
    arr[low] = arr[i - 1];
    arr[i - 1] = temp;

    // Return the pivot index
    return i - 1;
}
