// https://open.kattis.com/problems/symmetricorder

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_LEN 25

// creates base list
char** createList(int n) {
    char** list = (char**)malloc(n * sizeof(char*));
    if (list == NULL) {
        fprintf(stderr, "malloc fail at %s:%d", __FILE__, __LINE__);
        exit(EXIT_FAILURE);
    }
    for (int i = 0; i < n; i++) {
        list[i] = (char*)malloc((MAX_LEN + 1) * sizeof(char));
    }
    return list;
}

void rearrange(char** list, int n) {
    int start = 0;
    int end = n - 1;
    
    // temporary list
    char** temp = (char**)malloc(n * sizeof(char*));
    if (temp == NULL) {
        fprintf(stderr, "malloc fail at %s:%d", __FILE__, __LINE__);
        exit(EXIT_FAILURE);
    }
    
    // place pairs at opposite ends going inwards toward middle
    for (int i = 0; i < n; i+=2) {
        // places start
        if (start < n) {
            temp[start] = list[i];
            start++;
        }
        // places end
        if (i + 1 < n) {
            temp[end] = list[i + 1];
            end--;
        }
    }
    
    // copies over to original list
    for (int i = 0; i < n; i++) {
        list[i] = temp[i];
    }
    free(temp);
}

// frees list memory
void freeList(char** list, int n) {
    for (int i = 0; i < n; i++) {
        free(list[i]);
    }
    free(list);
}

int main() {
    int n, totalSize = 0, j = 1;
    scanf("%d", &n);

    // list to hold strings
    char** list = createList(n);

    // total strings
    int currentSize = 0;

    while (n) {
        printf("SET %d\n", j++);

        // add new strings read
        for (int i = 0; i < n; i++) {
            char* word = (char*)malloc((MAX_LEN + 1) * sizeof(char));
            if (word == NULL) {
                fprintf(stderr, "malloc fail at %s:%d", __FILE__, __LINE__);
                exit(EXIT_FAILURE);
            }
            scanf("%s", word);

            // store new in list
            list[i] = word;
        }
        
        rearrange(list, n);
        
       // print all strings
        for (int i = 0; i < n; i++) {
            printf("%s\n", list[i]);
        }
        
        // read next set
        scanf("%d", &n);
    }

    // free list
    freeList(list, totalSize);
    return 0;
}

