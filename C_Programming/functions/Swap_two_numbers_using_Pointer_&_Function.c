#include<stdio.h>  
void swap (int* x, int* y) {
    int temp;
    temp = *x;
    *x = *y;    //a = b
    *y = temp;  //b = a
    return;
}
int main()   
{    
    
    int a, b;
    printf("Enter the First number: ");
    scanf("%d", &a);
    printf("Enter the Second number: ");
    scanf("%d", &b);

    printf("\nBefore swap a = %d b = %d",a,b); 
   
    swap (&a,&b);
    
    printf("\nAfter swap a = %d b = %d",a,b);    
    
    return 0;  
}   
