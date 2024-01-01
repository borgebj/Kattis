//
// Created by BBJ on 31.12.2023.
//
#include <iostream>
using std::cout;
using std::cin;
using std::string;
using std::getline;

int main() {
    string line; getline(cin, line);

    for (int i = 0; i < line.length() - 1; ++i) {
        if (line[i] != line[i + 1]) {
            cout << line[i];
        }
    }
    cout << line[line.length()-1];
    return 0;
}