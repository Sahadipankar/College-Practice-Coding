package Basics;

import java.util.Scanner;

// Class to demonstrate 3D array operations

public class a3DArray {
    public static void main(String args[]) {

        // Create a Scanner object for taking input from the user

        Scanner scanner = new Scanner(System.in);

        // Step 1: Ask the user to enter the size of the 3D array
        
        System.out.print("\nEnter the number of layers: ");
        int layers = scanner.nextInt(); // Number of layers in the array (1st dimension)

        System.out.print("\nEnter the number of rows per layer: ");
        int rows = scanner.nextInt(); // Number of rows in each layer (2nd dimension)

        System.out.print("\nEnter the number of columns per row: ");
        int columns = scanner.nextInt(); // Number of columns in each row (3rd dimension)

        // Step 2: Declare the 3D array based on user input
        
        int my3DArray[][][] = new int[layers][rows][columns];

        // Step 3: Populate the 3D array with values from the user
        
        System.out.println("\nEnter the values for the 3D array:");
        for (int i = 0; i < layers; i++) { // Loop through each layer
            System.out.println("\nLayer " + i + ":");
            for (int j = 0; j < rows; j++) { // Loop through each row in the current layer
                for (int k = 0; k < columns; k++) { // Loop through each column in the current row
                    System.out.print("Enter value for my3DArray[" + i + "][" + j + "][" + k + "]: ");
                    my3DArray[i][j][k] = scanner.nextInt(); // Take input from the user
                }
            }
        }

        // Step 4: Print the 3D array to verify the entered values
        
        System.out.println("\nThe 3D array is:");
        for (int i = 0; i < layers; i++) { // Loop through each layer
            System.out.println("\nLayer " + i + ":");
            for (int j = 0; j < rows; j++) { // Loop through each row in the current layer
                for (int k = 0; k < columns; k++) { // Loop through each column in the current row
                    System.out.print(my3DArray[i][j][k] + " "); // Print the value
                }
                System.out.println(); // Move to the next line after printing all columns in the row
            }
            System.out.println(); // Add a blank line to separate layers
        }

        // Close the scanner to avoid memory leaks
        
        scanner.close();
    }
}
