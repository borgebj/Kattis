//
// Created by BBJ on 05.01.2024.
//
#include <stdio.h>   // for I/O
#include <string.h>  // for strlen

int main() {
    char line[80];

    // gets input and handles faulty
    if (fgets(line, sizeof(line), stdin) == NULL) return 1;

    char vowels[] = "aeiouAEIOU";
    int vowel_count = 0;

    // iterate through line and find vowels using vowel array
    for (size_t i=0; i < strlen(line); i++) {
        if (strchr(vowels, line[i]))
            vowel_count++;
    }

    printf("%d", vowel_count);
    return 0;
}
