#include <stdio.h>

int main (){
    
    int totaldays, remainingdays, years, months, days;
    printf("Enter the number of Days: ");
    scanf("%d", & totaldays);
    
    years = totaldays / 365;
    remainingdays = totaldays % 365;
    months = remainingdays / 30;
    days = remainingdays % 30;
    
    printf("\n%d days is - %d years, %d months and %d days", totaldays, years, months, days);
    
    return 0;
    
}