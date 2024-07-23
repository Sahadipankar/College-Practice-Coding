#include <stdio.h>

int main()
{
    int n;
    printf("Enter the size of Array: ");
    scanf("%d", &n);
    int arr[n];
    int sum = 0;
    printf("\n");
    for (int i = 0; i <= n - 1; i++)
    {
        printf("Enter the value of element %d: ", i);
        scanf("%d", &arr[i]);
    }
    for (int j = 0; j <= n - 1; j++)
    {
        sum += arr[j];
    }
    printf("\n");
    printf("The sum of all the Array Element is: %d", sum);

    return 0;
}