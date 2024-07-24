#include <stdio.h>  
  
int main()  
{  
    int year;  
  
    printf("Enter the year: ");  
    scanf("%d", &year);  
  
    (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) ?
    printf("\n%d is a Leap Year", year) :
    printf("\n%d is not a Leap Year", year);
    
    return 0;  
}  