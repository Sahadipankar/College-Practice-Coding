#include <stdio.h>

int main () {
    
    char ch;
    printf("Enter an Alphabet: ");
    scanf("%c", &ch);
    
    if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u')
    printf ("\nThe Alphabet %c is a Vowel",ch);
    else
    printf ("\nThe Alphabet %c is a Consonant",ch);
    
    return 0;
}