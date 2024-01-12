//
// Created by BBJ on 12.01.2024.
//
#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main() {
    int n;
    scanf("%d", &n);

    int attend = 0;
    for (int i = 0; i < n; ++i) {

        // getting line with buffer and scanf
        char line[31];
        scanf("%30s", line);

        // lowering line manually
        for (int j = 0; line[j]; ++j) {
            line[j] = (char) tolower(line[j]);
        }

        // checking for keywords using substring
        if (strstr(line, "rose") != NULL || strstr(line, "pink") != NULL)
            attend++;
    }

    if (attend > 0) {
        printf("%d\n", attend);
    } else {
        printf("I must watch Star Wars with my daughter\n");
    }

    return 0;
}