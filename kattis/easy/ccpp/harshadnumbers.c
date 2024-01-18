//
// Created by BBJ on 18.01.2024.
//
#include <stdio.h>

int sumofdigits(int n) {
    return n == 0 ? 0 : n % 10 + sumofdigits(n / 10);
}

int main() {
    int num;
    scanf("%d", &num);
    int digitsum = sumofdigits(num);

    // finds smallest harshad greater or equal to n
    while (num % digitsum != 0) {
        num += 1;
        digitsum = sumofdigits(num);
    }

    // prints result
    printf("%d", num);
    return 0;
}