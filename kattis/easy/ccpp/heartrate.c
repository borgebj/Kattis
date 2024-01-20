//
// Created by BBJ on 20.01.2024.
//
#include <stdio.h>

int main(void) {
    int n;
    scanf("%d", &n);

    for (size_t i=0; i < n; ++i) {
        float b, p;
        scanf("%f %f", &b, &p);

        float BPM = (float) (60 * b) / p;
        float step = BPM / b;
        float max_ABPM = BPM + step;
        float min_ABPM = BPM - step;

        printf("%f %f %f\n", min_ABPM, BPM, max_ABPM);
    }

    return 0;
}