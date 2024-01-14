//
// Created by BBJ on 13.01.2024.
//
#include <stdio.h>
#include <stdlib.h>

int main() {
    char a[4], b[4];
    scanf("%3s %3s", a, b);

    // reverses A
    char revA[4], revB[4];
    for (int i=2, j=0; i >= 0; i--, j++)
        revA[j] = a[i];
    revA[3] = '\0';

    // reverses B
    for (int i=2, j=0; i >= 0; i--, j++)
        revB[j] = b[i];
    revB[3] = '\0';

    // converts back to integer
    int ati = strtol(revA, NULL, 10);
    int bti = strtol(revB, NULL, 10);

    printf("%d", (ati > bti ? ati : bti));
    return 0;
}