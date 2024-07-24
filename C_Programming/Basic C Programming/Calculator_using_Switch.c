#include <stdio.h>  
int main()  
{  
    //Declare local variables  
    char opt;  
    float num1, num2;   
    float result;  
    printf ("Choose an operator from the following: +, -, *, / to perform the operation in C Calculator: ");  
    scanf ("%c", &opt); 
    
     //Take first number as input
    printf ("\nEnter the first number: ");  
    scanf("%f", &num1); 
    //Take second number as input
    printf ("\nEnter the second number: ");  
    scanf ("%f", &num2);  
      
    switch(opt)  
    {  
        case '+':  
            result = num1 + num2; 
            printf ("\nAddition of %.2f and %.2f is: %.2f", num1, num2, result);  
            break;  
          
        case '-':  
            result = num1 - num2; 
            printf ("\nSubtraction of %.2f and %.2f is: %.2f", num1, num2, result);  
            break;  
              
        case '*':  
            result = num1 * num2;
            printf ("\nMultiplication of %.2f and %.2f is: %.2f", num1, num2, result);  
            break;            
          
        case '/':  
            if (num2 == 0)   
            {  
                printf ("\nYou cannot divide by zero. Please enter another number. ");  
                scanf ("%f", &num2);        
                }  
            result = num1 / num2;
            printf ("\nDivision of %.2f and %.2f is: %.2f", num1, num2, result);  
            break;  
        default:  
            printf ("\nEnter the following operators only: +, -, *, / ");               
    }  
    return 0;  
}
