package Basics;

public class NPTEL_Practice {
    public static void main(String[] args) {
        int arr[] = {1, 3, 3, 5, 5, 7, 8, 8};

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) { // If the number appears only once, print it
                System.out.println(arr[i]);
            }
        }
    }
}