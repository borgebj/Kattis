//
// Created by BBJ on 11.01.2024.
//
#include <iostream>
#include <string>

int main() {
    std::string line; std::cin >> line;

    size_t pos = line.find("()");
    bool fixed = line.substr(0, pos) == line.substr(pos+2);

    std::cout << (fixed ? "correct" : "fix");
    return 0;
}