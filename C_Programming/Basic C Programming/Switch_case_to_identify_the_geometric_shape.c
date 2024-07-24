#include <stdio.h>

int main() {
    int choice;

    // Display menu
    printf("Select a geometric shape:\n");
    printf("1. Circle\n");
    printf("2. Square\n");
    printf("3. Triangle\n");
    printf("4. Rectangle\n");
    printf("Enter your choice (1-4): ");
    scanf("%d", &choice);

    // Switch case to identify the geometric shape
    switch (choice) {
        case 1:
            printf("\nYou selected a Circle.\n");
            break;
        case 2:
            printf("\nYou selected a Square.\n");
            break;
        case 3:
            printf("\nYou selected a Triangle.\n");
            break;
        case 4:
            printf("\nYou selected a Rectangle.\n");
            break;
        default:
            printf("\nInvalid choice. Please enter a number between 1 and 4.\n");
    }

    return 0;
}