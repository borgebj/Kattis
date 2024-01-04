//
// Created by BBJ on 05.01.2024.
//
#include <iostream>
#include <vector>

int main() {
    int days; std::cin >> days;
    std::vector<int> temps;

    for (auto i=0; i < days; ++i) {
        int temp; std::cin >> temp;
        if (temp < 0) temps.push_back(temp);
    }

    std::cout << temps.size();
    return 0;
}