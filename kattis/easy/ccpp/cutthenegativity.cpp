//
// Created by BBJ on 08.01.2024.
//
#include <iostream>
#include <list>
#include <string>

int main() {
    int size; std::cin >> size;

    std::list<std::string> flights;

    // creates a flight matrix
    for (size_t i=1; i <= size; ++i) {
        for (size_t j=1; j <= size; ++j) {
            int val; std::cin >> val;
            if (val > 0) {
                std::string line = std::to_string(i) + " " + std::to_string(j) + " " + std::to_string(val);
                flights.push_back(line);
            }
        }
    }

    // prints out positive flights
    std::cout << flights.size() << "\n";
    for (const std::string &line : flights)
        std::cout << line << "\n";

    return 0;
}