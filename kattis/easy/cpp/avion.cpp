//
// Created by BBJ on 02.01.2024.
//
#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

int main() {
    std::vector<int> lines;

    for (int i=0; i  < 5; ++i) {
        std::string line; std::cin >> line;

        // string.tolower
        std::transform(line.begin(), line.end(), line.begin(), ::tolower);

        // fbi-check
        if (line.find("fbi") != std::string::npos)
            lines.push_back(i+1);
    }
    if (lines.empty()) std::cout << "HE GOT AWAY!";
    else for (const auto& num : lines) std::cout << num << " ";
    return 0;
}