#include <stdio.h>

int min (int a, int b) {
    if (a < b) return a;
    else return b;
} 
int gcd (int x, int y) {    // Alternate Way
    int hcf;
    for (int i = min (x, y); i >= 1; i --) {
        if (x % i == 0 && y % i == 0) {
            hcf = i;
            break;
        }
    }
    // for (int i = 1; i <= min (x, y); i++) {
    //     if (x % i == 0 && y % i == 0) {
    //         hcf = i;
    //     }
    // }
    return hcf;
}
int main () {
    int a, b;
    printf("Enter the First Number: ");
    scanf("%d", &a);
    printf("Enter the Second Number: ");
    scanf("%d", &b);
    printf("\n");
    int hcf = gcd (a, b);
    printf ("The HCF/GCD of %d and %d is: %d",a,b,hcf);
    return 0;
}