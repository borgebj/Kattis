//
// Created by BBJ on 14.01.2024.
//
#include <stdio.h>

int main() {
    int a, b, c, d, e, score;
    scanf("%d %d %d %d %d %d", &a, &b, &c, &d, &e, &score);

    if (score >= a) printf("A");
    else if (score >= b) printf("B");
    else if (score >= c) printf("C");
    else if (score >= d) printf("D");
    else if (score >= e) printf("E");
    else if (score < e) printf("F");
    return 0;
}