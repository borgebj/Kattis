//
// Created by BBJ on 12.01.2024.
//
#include <iostream>
#include <string>
#include <algorithm>
#include <cctype>

int main() {
    int n; std::cin >> n;

    int attend = 0;
    for (size_t i=0; i < n; ++i) {

        // getting line
        std::string line;
        std::cin >> line;

        // lowering line
        std::transform(line.begin(), line.end(), line.begin(), ::tolower);

        // checking for keywords
        if (line.find("rose") != std::string::npos || line.find("pink") != std::string::npos)
            attend++;
    }
    std::cout << (attend > 0 ? std::to_string(attend) : "I must watch Star Wars with my daughter");
    return 0;
}