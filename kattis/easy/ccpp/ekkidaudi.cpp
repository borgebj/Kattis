//
// Created by BBJ on 10.01.2024.
//
#include <iostream>
#include <string>
#include <sstream>

int main() {
    // two lines to scan in
    std::string line1, line2;

    // four tokens to hold parts
    std::string p11, p12, p21, p22;

    // scans in original lines
    std::getline(std::cin, line1);
    std::getline(std::cin, line2);

    // creates stream from
    std::stringstream ss1(line1);
    std::stringstream ss2(line2);

    std::getline(ss1, p11, '|');
    std::getline(ss1, p12, '|');

    std::getline(ss2, p21, '|');
    std::getline(ss2, p22, '|');

    std::cout << p11 << p21 << " " << p12 << p22;

    return 0;
}
