//
// Created by BBJ on 11.01.2024.
//
#include <iostream>
#include <string>
#include <unordered_set>

int main() {
    int n; std::cin >> n;

    for (size_t i=0; i < n; ++i) {
        int iterations; std::cin >> iterations;

        std::unordered_set<std::string> cities;
        for (size_t j=0; j < iterations; ++j) {
            std::string city; std::cin >> city;
            cities.insert(city);
        }

        std::cout << cities.size() << "\n";
    }
    return 0;
}