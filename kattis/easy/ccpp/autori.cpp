//
// Created by BBJ on 01.01.2024.
//
#include <iostream>
#include <string>
#include <sstream>
using std::cin;
using std::cout;
using std::istringstream;
using std::string;
using std::getline;


int main() {
    string line; getline(cin, line);
    istringstream iss(line);

    // itererer over split string med for-loop
    for (string word; getline(iss, word, '-');)
        cout << word[0];

    return 0;
}