//
// Created by BBJ on 30.12.2023.
//
#include <iostream>
#include <string>

int main() {
    std::string say;
    std::cin >> say; // reads what i said

    std::string hear;
    std::cin >> hear; // reads what needs to be heard

    if (say.length() >= hear.length())
        std::cout << "go";
    else
        std::cout << "no";

    return 0;
}