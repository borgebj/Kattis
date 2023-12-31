//
// Created by BBJ on 31.12.2023.
//
#include <iostream>
#include <string>
using std::cout, std::cin, std::endl, std::string;

int main() {

    string line; getline(cin, line);
    double space = 0, lower=0, upper=0, symbol=0;
    auto n = (double) line.length();

    // for-each basert iterering
    for (auto &c : line) {
        if (c == '_') space++;
        else if (c>='a' && c<='z') lower++;
        else if (c>='A' && c<='Z') upper++;
        else symbol++;
    }

    // calculate ratios
    space /= n; lower /= n; upper /= n; symbol /= n;

    // print result
    cout << space << endl << lower << endl << upper << endl << symbol << endl;

    return 0;
}