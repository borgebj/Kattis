//
// Created by BBJ on 07.01.2024.
//
#include <iostream>
#include <string>
#include <list>

bool isInt(const std::string &line);
struct pair {
    std::string name;
    int num;

    // custom for sorting based on the pairs number
    bool operator<(const pair& other) const {
        return num < other.num;
    }
};

int main() {
    int n; std::cin >> n;

    std::list<pair> order;

    // goes through next n lines with name-number pairs
    for (int i=0; i < n; ++i) {
        std::string one, two;
        std::cin >> one >> two;

        if (isInt(one)) {
            order.push_back({two, std::stoi(one)/2});
        }
        else {
            order.push_back({one, std::stoi(two)});
        }
    }

    // sorts based on structure sort
    order.sort();

    // prints sorted order
    for (const pair &p : order) {
        std::cout << p.name << "\n";
    }

    return 0;
}

bool isInt(const std::string &line) {
    try {
        int num = std::stoi(line);
        return num;
    } catch(...) {
        return false;
    }
}