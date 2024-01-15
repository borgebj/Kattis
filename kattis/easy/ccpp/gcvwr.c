//
// Created by BBJ on 14.01.2024.
//
#include <stdio.h>

int main() {
    int gcvwr, weight, n;
    scanf("%d %d %d", &gcvwr, &weight, &n);

    int threshold = (int) ((gcvwr - weight) * 0.9);

    for (int i=0; i < n; ++i) {
        int num; scanf("%d", &num);
        threshold -= num;
    }

    printf("%d", threshold);
    return 0;
}