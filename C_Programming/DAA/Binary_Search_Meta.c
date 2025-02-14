#include <stdio.h>

// Function to implement Meta Binary Search
int metaBinarySearch(int arr[], int n, int key) {
    int lg = 0;
    
    // Finding the highest power of 2 less than or equal to n
    while ((1 << lg) <= n - 1) {
        lg++;
    }
    
    int pos = 0; // Start position
    
    for (int i = lg - 1; i >= 0; i--) {
        if (pos + (1 << i) < n && arr[pos + (1 << i)] <= key) 
        {
            pos += (1 << i); // Move position
        }
    }
    
    // If the element is found at 'pos', return index
    if (arr[pos] == key)
        return pos;
    
    return -1; // Element not found
}

int main() {
    int arr[] = {1, 3, 5, 7, 9};
    int n = sizeof(arr) / sizeof(arr[0]);
    int key = 5;
    
    int result = metaBinarySearch(arr, n, key);
    if (result != -1)
        printf("Element found at index %d\n", result);
    else
        printf("Element not found\n");

    return 0;
}
