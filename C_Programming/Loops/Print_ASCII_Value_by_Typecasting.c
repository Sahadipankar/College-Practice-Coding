#include <stdio.h>

int main()
{
    int a;
    char ch;
    
    for (int i = 65; i <= 90; i++) {
        printf("%d ",i);
        ch = (char)i;
        printf("%c \n",ch);
    }

    return 0;
}
