#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

int main() {
    char line[100];
    scanf("%s", line);
    int len = strlen(line);

    char buffer[15] = { '\0' };
    int bufferIndex = 0;
    int expectedNumber = 1;
    int startcheck = 0;

    for (int i = 0; i < len; i++) {
        char c = line[i];
        buffer[bufferIndex++] = c;
        
        int num = atoi(buffer);
        if (num == expectedNumber) {
            expectedNumber++;
            bufferIndex = 0;
        }
        else if (num > expectedNumber) {
            printf("-1");
            return 0;
        }
        else if (i+1 >= len && num <= expectedNumber-1) {
            printf("-1");
            return 0;
        }
    }
    printf("%d", expectedNumber-1);
    return 0;
}
