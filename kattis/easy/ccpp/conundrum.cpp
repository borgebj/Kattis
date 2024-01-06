//
// Created by BBJ on 05.01.2024.
//
#include <iostream>
#include <string>

int main() {
    std::string line;
    std::getline(std::cin, line);

    char per[] = {'P', 'E', 'R'};
    int index = 0;
    int days = 0;

    // change letters successively, one letter per day
    for (const char& c : line) {
        if (index > 2) index = 0;
        if (c != per[index])
            days++;
        index++;
    }

    std::cout << days; // print days needed to convert full line to (PER)^*

    return 0;
}