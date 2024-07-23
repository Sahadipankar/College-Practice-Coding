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
   printf("\nThe given Array elements for Bubble Sort are: ");
   for (int i = 0; i < n; i++)
   {
      printf("%d ", arr[i]);
   }

   for (int i = 0; i < n - 1; i++)
   {
      int flag = 1; // For optimising bubble sort we are using a variable to check if any swapping operation is happening 
      for (int j = 0; j < n - i - 1; j++)
      {
         if (arr[j] > arr[j + 1])
         {
            // Swap two elements using a temporary variable
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
            flag = 0;
         }
      }
      if (flag == 1) 
         break;      
   }
   printf("\nThe Sorted Array Elements are: ");
   for (int i = 0; i < n; i++)
   {
      printf("%d ", arr[i]);
   }
   return 0;
}