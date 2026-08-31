package Basics;

import java.util.Scanner;

// Sorting an array

// public class A_Practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("\nEnter the size of the array: ");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         for (int i = 0; i < n; i++) {
//             System.out.print("Enter element " + (i + 1) + ": ");
//             arr[i] = sc.nextInt();
//         }
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 if (arr[i] >arr [j]) {
//                     int temp = arr[i];
//                     arr[i] = arr[j];
//                     arr[j] = temp;
//                 }
//             }
//         }
//         System.out.println("\nThe sorted array is:");
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         sc.close();
//     }
// }



// // Finding the largest element from an array

// public class A_Practice {
//     public static void main (String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.print("\nEnter the size of the array: ");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
        
//         for (int i = 0; i < n; i++) {
//             System.out.println("Enter element " + (i+1));
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("Enter the target value to be searched: ");
//         int target = sc.nextInt();
//         int temp = -1;
//         for (int i=0; i<n; i++) {
//             if (arr[i] == target) { 
//                 temp = i; 
//                 break;
//             }
//         }
//         if (temp != -1) System.out.println("\nTarget element " + target + " found at index: " + (temp+1));
//         else System.out.println("\nTarget element not found in array.");
//         sc.close();
//     }
// }


// Linear Search

// public class A_Practice {

//     public static int smallest (int arr[]) {

//         int smallest = arr[0];
//         for (int i = 0; i<arr.length; i++) {
//             if (arr[i] < smallest) smallest = arr[i];
//         }
//         return smallest;
//     }

//     public static void main (String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.print("\nEnter the size of the array: ");
//         int n = sc.nextInt();
//         int arr[] = new int[n];

//         for (int i = 0; i < n; i++) {
//             System.out.println("Enter element " + (i+1));
//             arr[i] = sc.nextInt();
//         }

//         int smallest = smallest(arr);
//         System.out.println("The smallest no. is: " + smallest);

//         sc.close();
//     }
// }


// Binary Search

// public class A_Practice {
//     public static void main (String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.print("\nEnter the size of the array: ");
//         int n = sc.nextInt();
//         int arr[] = new int[n];

//         for (int i = 0; i < n; i++) {
//             System.out.println("Enter element " + (i+1));
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("\nEnter the target value to be searched: ");
//         int target = sc.nextInt();

//         int low = 0, high = n - 1;
//         int temp = -1;

//         while (low <= high) {
//             int mid = low + (high-low) / 2;
//             if (target == arr[mid]) {
//                 System.out.println("\nTarget element found at index " + (mid + 1));
//                 temp++;
//                 break;
//             }
//             else if (target < arr[mid]) {
//                 high = mid - 1;
//             }
//             else low = mid + 1;
//         }
//         if (temp == -1) System.out.println("\nTarget element not found");
//         sc.close();
//     }
// }



// Binary search using Recursion

// public class A_Practice {
//     public static void main (String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.print("\nEnter the size of the array: ");
//         int n = sc.nextInt();
//         int arr[] = new int[n];

//         for (int i = 0; i < n; i++) {
//             System.out.println("Enter element " + (i+1));
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("\nEnter the target value to be searched: ");
//         int target = sc.nextInt();

//         int result = binary_search(arr, 0, n-1, target);
//         if (result == -1) System.out.println("\nTarget element not found.");
//         else System.out.println("\nTarget element found at index " + (result + 1));
//         sc.close();
//     }

//     public static int binary_search (int arr[], int low, int high, int target) {
//         while (low <= high) {
//             int mid = low + (high - low) / 2;
//             if (target == arr[mid]) {
//                 return mid;
//             }
//             else if (target < arr[mid]) return binary_search(arr, low, mid - 1, target);
//             else return binary_search(arr, mid + 1, high, target);
//         }
//         return -1;    
//     }
// }



// Default Template for taking and array input

// public class A_Practice {
//     public static void main (String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.print("\nEnter the size of the array: ");
//         int n = sc.nextInt();
//         int arr[] = new int[n];

//         for (int i = 0; i < n; i++) {
//             System.out.println("Enter element " + (i+1) + ": ");
//             arr[i] = sc.nextInt();
//         }

//         sc.close();
//     }
// }



// Num of count of digits having even num Ex - 12 123 1234 Result = 2 

// public class A_Practice {
//     public static void main (String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.print("\nEnter the size of the array: ");
//         int n = sc.nextInt();
//         int arr[] = new int[n];

//         for (int i = 0; i < n; i++) {
//             System.out.println("Enter element " + (i+1));
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("Count is: " + findNumbers(arr));

//         sc.close();
//     }

//     static int findNumbers (int arr[]) {
//         int count = 0;
//         for (int i = 0; i<arr.length; i++) {
//             if (even(arr[i])) count++;
//         }
//         return count;
//     }

//     static boolean even (int num) {
//         int numOfDigits = digits(num);
//         if (numOfDigits % 2 == 0) {
//             return true;
//         }
//         return false;
//     }

//     static int digits (int num) {
//         // if (num<0) num *= -1; // To convert negative num into positive
//         int count = 0;
//         while (num>0) {
//             count++;
//             num /= 10;
//         }
//         return count;
//     }
// }



// public class A_Practice {
//     public static void main (String[] args) {
        
        
//     }

//     public int maximumWealth(int[][] accounts) {
//         int ans = Integer.MIN_VALUE;
//         // for (int i = 0; i<accounts.length; i++) {
//         //     int sum = 0;
//         //     for (int j = 0; j<accounts[i].length; j++) {
//         //         sum += accounts[i][j];
//         //     }
//         //     if (sum > ans) {
//         //         ans = sum;
//         //     }
//         // }
//         // For each loop
//         for (int i[] : accounts) {
//             int sum = 0;
//             for (int j : i) {
//                 sum += j;
//             }
//             if (sum > ans) {
//                 ans = sum;
//             }
//         }
//         return ans;
//     }
// // }


// // Find the smallest element in an array greater than or equal to target (ceiling value)

// public class A_Practice {
//     public static void main (String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.print("\nEnter the size of the array: ");
//         int n = sc.nextInt();
//         int arr[] = new int[n];

//         for (int i = 0; i < n; i++) {
//             System.out.print("Enter element " + (i+1) + ": ");
//             arr[i] = sc.nextInt();
//         }

//         System.out.print("Enter the target value: ");
//         int target = sc.nextInt();

//         int low = 0;
//         int high = arr.length - 1;
//         int result = binary_search(arr, target, low, high);
        
//         if (result == -1) System.out.println("\nTar");
//         else {
//             System.out.println("\nCeiling value found: " + arr[result]);
//         }
        
//         sc.close();
//     }

//     static int binary_search (int arr[], int target, int low, int high) {

//         while (low <= high) {
//             int mid = low + (high - low) / 2;
//             if (arr[mid] == target) return mid;
//             else if (arr[mid] < target) {
//                 low = mid + 1;
//             }
//             else {
//                 high = mid - 1;
//             };
//         }

//         // No element >= target
//         if (low == arr.length) {
//             return -1;
//         }
    
//         return low;
//     }
// }



public class A_Practice {
    public static void main(String[] args) {
        
    }
}