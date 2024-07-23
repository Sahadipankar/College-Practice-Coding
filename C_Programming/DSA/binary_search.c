#include<stdio.h>
int main () {
    int n, i, key;
    printf("\nEnter the number of elements: ");
    scanf("%d", &n);
    int arr[n];
    printf("Enter the elements:\n");
    for (i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    printf("\nElements are: ");
    for (i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    // Searching a given element in sorted array using Binary Search algorithm
    printf("\n\nSearch an element: ");
    scanf("%d", &key);
    int low = 0;
    int high = n - 1;
    while (low <= high) { // If this condition is false, then the entire loop gets terminated.. And the element not found is printed.
        int mid = (low + high) / 2;
        if (arr[mid] == key) {
            printf("\nElement found at index %d", mid + 1);
            return 0;
        }
        else if (arr[mid] < key) {
            low = mid + 1;
        }
        else {
            high = mid - 1;
        }
    }
    printf("\nElement not found.");
    return 0;
}