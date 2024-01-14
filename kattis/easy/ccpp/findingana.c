//
// Created by BBJ on 14.01.2024.
//
#include <stdio.h>
#include <string.h>

int main() {
    char line[1000], copy[1000];
    scanf("%1000s", line);

    // pointer to first occurrence
    char *occ = strchr(line, 'a');

    // prints string from pointer (until null terminator)
    while (*occ != '\0') {
        printf("%c", *occ++);
    }

    return 0;
}