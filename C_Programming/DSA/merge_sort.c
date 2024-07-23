#include <stdio.h>

void scan_printArray(int *arr, int n);
void printArray(int *arr, int n);
void merge_sort(int arr[], int low, int high);
void merge(int arr[], int low, int mid, int high);

int main() {
    int n;
    printf("Enter the size of Array: ");
    scanf("%d", &n);
    printf("\n");
    int arr[n];
    scan_printArray(arr, n);

    merge_sort(arr, 0, n-1);

    printArray(arr, n);

    return 0;
}

void merge_sort(int arr[], int low, int high) { // Function to sort the array using merge sort 
    if (low < high)
    {
        int mid = (low + high) / 2;
        merge_sort(arr, low, mid);
        merge_sort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }
}

void merge(int arr[], int low, int mid, int high) { // Function to merge the two arrays
    int i = low, j = mid + 1, k = 0;
    int temp[high - low + 1];
    while (i <= mid && j <= high) {
        if (arr[i] <= arr[j]) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        else {
            temp[k] = arr[j];
            j++;
            k++;
        }
    }
    while (i <= mid) {
        temp[k] = arr[i];
        i++;
        k++;
    }
    while (j <= high) {
        temp[k] = arr[j];
        j++;
        k++;
    }
    for (int idx = low; idx <= high; idx++) {
        arr[idx] = temp[idx - low];
    }
}

void scan_printArray(int *arr, int n)
{
    for (int i = 0; i < n; i++)
    {
        printf("Enter the element no. %d: ", i + 1);
        scanf("%d", &arr[i]);
    }
    printf("\nThe given Array elements are: \n");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }
}

void printArray(int *arr, int n)
{
    printf("\nThe Sorted Array is: \n");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }
}