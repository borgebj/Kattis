#include <stdio.h>

int main() {
    int n, m; // rows, columns
    scanf("%d %d", &n, &m);
    
    char arr[n][m];
    
    // scan in matrix
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            scanf(" %c", &arr[i][j]);
        }
    }
    
    // shift down
    for (int col = 0; col < m; col++) {
        for (int row = n - 1; row >= 0; row--) {
            if (arr[row][col] == 'S') {
                int currow = row;
                while (currow < n - 1 && arr[currow+1][col] == '.') {
                    currow++;
                }
                
                // swap only when must, at bottom-most free spot
                if (currow != row) {
                    arr[currow][col] = 'S';
                    arr[row][col] = '.';
                }
            }
        }
    }
    
    // print result
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            printf("%c", arr[i][j]);
        } printf("\n");
    }
    return 0;
}

/*
Example input

4 3
S.S
S..
.S.
..S

*/
