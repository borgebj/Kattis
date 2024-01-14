//
// Created by BBJ on 14.01.2024.
//
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    char *tlf = (char*) malloc((7+1) * sizeof(char)); // 7+1 for null terminator
    scanf("%7s", tlf);

    // using strncmp for .startsWith
    int bool = strncmp("555", tlf, strlen("555")) ? 0 : 1;

    printf("%d", bool);

    free(tlf);
    return 0;
}