//
// Created by BBJ on 31.12.2023.
//
#include <iostream>

int main() {
    int a; std::cin >> a;
    int b; std::cin >> b;
    int c; std::cin >> c;

    if (a + b == c) std::cout << "correct!" << std::endl;
    else std::cout << "wrong!" << std::endl;

    return 0;
}