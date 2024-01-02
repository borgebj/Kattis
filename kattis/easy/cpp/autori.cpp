//
// Created by BBJ on 01.01.2024.
//
#include <iostream>
#include <string>
#include <sstream>

int main() {
    std::string line;
    std::getline(std::cin, line);
    std::istringstream iss(line);

    // itererer over split string med for-loop
    for (std::string word; std::getline(iss, word, '-');)
        std::cout << word[0];

    return 0;
}