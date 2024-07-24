#include <stdio.h>

int main () {
    
    float temp, f, k;
    printf("Enter the Celcius Temperature: ");
    scanf("%f", &temp);
    
    f = temp * 9 / 5 + 32;
    k = temp + 273.15;
    
    printf("\nThe Fahrenheit Value is %f", f);
    printf("\nThe Kelvin Value is %f", k);

    return 0;
    
}