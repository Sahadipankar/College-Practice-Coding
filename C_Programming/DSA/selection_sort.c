#include <stdio.h>
int main()
{
    int n;
    printf("Enter the size of Array: ");
    scanf("%d", &n);
    printf("\n");
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        printf("Enter element no. %d: ", i + 1);
        scanf("%d", &arr[i]);
    }
    printf("\nThe given Array elements for Selection Sort are: ");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }
    for (int i = 0; i < n - 1; i++) {
        int min_index = i;
        for (int j = i + 1; j < n; j++) {
            if (arr[min_index] > arr[j])
            {
                min_index = j;
            }
        }
        int temp = arr[i];
        arr[i] = arr[min_index];
        arr[min_index] = temp;
    }
    printf("\n\nThe Sorted Array Elements are: ");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }
    return 0;
}
