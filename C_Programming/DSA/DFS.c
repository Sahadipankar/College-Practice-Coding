#include<stdio.h>
#include<stdlib.h>
int visited[5] = {0,0,0,0,0};
    int A [5][5] = 
    {
        {0,1,1,0,0},
        {0,0,0,1,1},
        {0,0,0,0,1},
        {0,0,0,0,1},
        {0,0,0,0,0} 
    };
void DFS(int i){
    printf("%d ", i);
    visited[i] = 1;
    for (int j = 0; j < 5; j++)
    {
        if(A[i][j]==1 && !visited[j]){
            DFS(j);
        }
    }
}
int main(){ 
    // DFS Implementation  
    DFS(0); 
    return 0;
}
