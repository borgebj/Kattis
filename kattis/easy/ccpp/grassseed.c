//
// Created by borge on 15.01.2024.
//
#include <stdio.h>

int main(){
    float cost;
    int lawns;
    scanf("%f %d", &cost, &lawns);

    float total = 0;
    for (size_t i=0; i < lawns; ++i) {
        float a, b;
        scanf("%f %f", &a, &b);
        float sum = (a * b);
        total += (sum * cost);
    }

    printf("%f", total);
    return 0;
}