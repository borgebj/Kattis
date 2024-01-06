//
// Created by BBJ on 04.01.2024.
//
#include <iostream>

// gets int with least occurances, given two are always equal
int getLeast(const int& a, const int& b, const int& c) {
    if (a == b) return c;
    if (b == c) return a;
    return b;
}

int main() {
    int ax, ay; std::cin >> ax >> ay;
    int bx, by; std::cin >> bx >> by;
    int cx, cy; std::cin >> cx >> cy;

    int x = getLeast(ax, bx, cx);
    int y = getLeast(ay, by, cy);

    std::cout << x << " " << y;

    return 0;
}