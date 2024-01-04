//
// Created by BBJ on 03.01.2024.
//
#include <iostream>

int getValue(const char& card, bool dominant) {
    if (card == 'A') return 11;
    if (card == 'K') return 4;
    if (card == 'Q') return 3;
    if (card == 'J') {if (dominant) return 20; else return 2;}
    if (card == 'T') return 10;
    if (card == '9') {if (dominant) return 14; else return 0;}
    return 0;
}

int main() {
    int n;
    char main_suit;
    std::cin >> n >> main_suit;

    int sum = 0;
    for (auto i=0; i < 4*n; i++) {
        std::string line; std::cin >> line;
        char card = line[0];
        char suit = line[1];

        if (suit == main_suit) sum += getValue(card, true);
        else sum += getValue(card, false);
    }
    std::cout << sum;
    return 0;
}