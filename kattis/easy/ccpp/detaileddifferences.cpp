//
// Created by BBJ on 08.01.2024.
//
#include <iostream>
#include <string>

int main() {
    int n; std::cin >> n;
    std::cin.ignore(); // ignore newline

    for (size_t i=0; i < n; ++i) {
        std::string case_one, case_two;
        std::getline(std::cin, case_one);
        std::getline(std::cin, case_two);

        std::string similarities; // string to contain similarities

        for (size_t j=0; j < case_one.length(); ++j) {
            if (case_one[j] == case_two[j])
                similarities += ".";
            else similarities += "*";
        }

        std::cout << case_one << "\n";
        std::cout << case_two << "\n";
        std::cout << similarities << "\n\n";
    }
    return 0;
}