//
// Created by BBJ on 05.01.2024.
//
#include <stdio.h>

#define toDigit(c) (c-'0')

void removeChar(char str[], char remove) {
    // removes - and shifts everything left. Still exists but not included
    size_t j = 0;
    for (size_t i=0; str[i]; ++i) {
        if (str[i] != remove)
            str[j++] = str[i];
    }
    str[j] = '\0'; // string-terminator
}

int main() {
    char line[12];
    if (fgets(line, sizeof(line), stdin) == NULL) return 1;

    int sum = 0;

    // "kind of" like string.replace("-", "");
    removeChar(line, '-');

    int vals[10] = {4, 3, 2, 7, 6, 5, 4, 3, 2, 1};

    for (size_t i=0; line[i]; ++i) {
        int line_val = toDigit(line[i]);
        int val_val = vals[i];
        sum += line_val * val_val;
    }

    int divisible = sum % 11 == 0 ? 1 : 0;
    printf("%d", divisible);

    return 0;
}