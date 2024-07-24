#include <stdio.h>
int main () {
    
    int rows, columns;
    printf("Enter the nunber of rows: ");
    scanf("%d", &rows);
    printf("Enter the nunber of columns: ");
    scanf("%d", &columns);
    printf("\n");
    for (int i = 1; i <= rows; i++){
        for (int j = 1; j <= columns; j++) {
            if (j == 1 || j == columns || i == 1 || i == rows)
            printf("* ");
            else printf("  ");
        }
        printf("\n");
    }
    return 0;
}