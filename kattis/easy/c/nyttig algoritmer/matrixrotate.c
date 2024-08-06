#include <stdio.h>
#include <math.h>
#include <string.h>

void printt(int n, char matrix[][n], char* word) {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            printf("%c ", matrix[i][j]);
        } 
        printf("\n");
    }
    printf("\n");
}

int main() {
    int d;
    scanf("%d", &d);
    
    for (int i = 0; i < d; i++) {
        char word[10000];
        scanf("%s", word);
        
        int len = strlen(word);
        int n = (int)ceil(sqrt(len));
        char matrix[n][n];

        // create matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i * n + j < len) {
                    matrix[i][j] = word[i * n + j];
                } else {
                    matrix[i][j] = ' ';
                }
            }
        }

        // reverse
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = temp;
            }
        }

        // transpose
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        // print
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                printf("%c", matrix[i][j]);
            }
        } printf("\n");
    }

    return 0;
}
  
