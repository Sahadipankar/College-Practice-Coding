#include <stdio.h>

int main (){
    
    float salary, basic, da, ta, hra;
    printf("Enter the basic salary: ");
    scanf("%f", & basic);
    
    da = basic * 20 / 100;
    ta = basic * 5 / 100;
    hra = basic * 10 / 100;
    salary = basic + da + ta + hra;
    
    printf("\nThe Cash in Hand salary is %f", salary);
    
    
    return 0;
    
}