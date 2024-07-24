#include <stdio.h> 
int main()
{
    int x, y, temp; 
    printf("Enter two Numbers: \n");
    scanf("%d%d", &x, &y);
    
    printf("\nBefore Swapping First variable = %d\nSecond variable = %d \n", x, y);
    
    temp = x;
    x = y;
    y = temp;
    printf("\nAfter Swapping First variable = %d\nSecond variable = %d\n", x, y);
   
    return 0;
}
