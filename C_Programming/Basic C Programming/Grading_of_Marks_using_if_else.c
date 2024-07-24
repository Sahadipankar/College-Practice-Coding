#include <stdio.h>

int main () {
    
    int marks;
    printf("Enter the percentage of marks obtained: ");
    scanf("%d", &marks);
    
    if (marks > 100)
    printf("\nInvalid");
    else if(marks < 100 && marks >= 85)
    printf("\nA Grade");
    else if(marks <85 && marks >= 75)
    printf("\nB Grade");
    else if(marks < 75 && marks >= 50)
    printf("\nC Grade");
    else if(marks < 50 && marks >= 30)
    printf("\nD Grade");
    else
    printf("\nFail");
    
    return 0;
    
}