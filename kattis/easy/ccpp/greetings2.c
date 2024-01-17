//
// Created by BBJ on 17.01.2024.
//
#include <stdio.h>
#include <string.h>

int main(void) {
    char line[1001];
    scanf("%s", line);

    // prints "hey" with double e's
    for (int j=0; j < strlen(line); ++j) {
        printf("%c", line[j]);

        // print once more if e
        if (line[j] == 'e') {
            printf("e");
        }
    }

    return 0;
}