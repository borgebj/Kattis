//
// Created by BBJ on 03.01.2024.
//
#include <iostream>

int main() {
    int a; std::cin >> a;

    double one_perc = (double) (a) / 100;
    double two_perc = (double) (100 - a) /100;

    double one_ratio = 1 / one_perc;
    double two_ratio = 1 / two_perc;

    std::cout << one_ratio << std::endl << two_ratio;

    return 0;
}