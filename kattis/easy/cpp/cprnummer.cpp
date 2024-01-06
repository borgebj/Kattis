//
// Created by BBJ on 05.01.2024.
//
#include <iostream>
#include <algorithm>
#include <string>

#define toDigit(c) (c-'0')

int main() {
    std::string line;
    std::getline(std::cin, line);
    int sum = 0;

    // similar to string.replace("-", "");
    line.erase(std::remove(line.begin(), line.end(), '-'), line.end());

    int vals[10] = {4, 3, 2, 7, 6, 5, 4, 3, 2, 1};

    for (size_t i=0; i < line.length(); ++i) {
        int line_val = toDigit(line[i]);  // character - '0' = char_int to int convertion
        int val_val = vals[i];
        sum += line_val * val_val;
    }

    int divisible = sum % 11 == 0 ? 1 : 0;
    std::cout << divisible;

    return 0;
}

