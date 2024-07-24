#include<stdio.h>

int main()
{
    int a;
    printf("Enter a number: ");
    scanf("%d",&a);
    
    if(a%5==0 && a%3==0) {
        
        printf("\nThe number is divisible by 5 and 3");
    }
    
    else{
        printf("\nThe number is not divisible by 5 and 3");
    }

    return 0;
}
