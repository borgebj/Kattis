//
// Created by BBJ on 04.01.2024.
//
#include <iostream>
#include <map>

int main() {
    int p; std::cin >> p;

    std::map<int, int> candles_day;

    for (auto i=0; i < p; i++) {
        int k, n; std::cin >> k >> n;
        int candles = 0;

        for (auto j=0; j < n; j++)
            candles += j+1;

        candles_day.emplace(k, candles+n);
    }

    for (const auto& pair : candles_day) {
        int day = pair.first;
        int count = pair.second;
        std::cout << day << " " << count << std::endl;
    }

    return 0;
}