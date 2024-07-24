#include <stdio.h>

int main()
{
    int marks[10];
    for (int i = 0; i <= 9; i++) {
        printf("Enter the marks of student no. %d: ",i + 1);
        scanf("%d", &marks[i]);
    }
    printf("\n");
    printf("The roll number of students who got below 35 are: ");
    for (int j = 0; j <= 9; j++) {
        if (marks[j] < 35) printf("%d ",j);
    }
    return 0;
}
