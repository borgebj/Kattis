//
// Created by BBJ on 04.01.2024.
//
#include <iostream>
#include <string>
#include <algorithm>

int main() {
    std::string one, two;
    std::getline(std::cin, one);  // scan line 1
    std::getline(std::cin, two);  // scan line 2

    std::string three = one + two;      // merge lines
    std::sort(three.begin(), three.end());  // sort letters

    std::cout << three;  // print result

    return 0;
}