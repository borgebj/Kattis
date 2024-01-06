//
// Created by BBJ on 03.01.2024.
//
#include <iostream>
#include <unordered_set>

int main() {
    int jack, jill;

    while (true) {
        std::cin >> jack >> jill;

        if (jack == 0 && jill == 0) break;

        std::unordered_set<int> cds;
        cds.reserve(jack > jill ? jack : jill);
        int count = 0;

        for (int i=0; i <jack; i++) {
            int num; std::cin >> num;
            cds.insert(num);
        }
        for (int j=0; j < jill; j++) {
            int num; std::cin >> num;
            if (cds.find(num) != cds.end())
                count++;
        }
        std::cout << count << "\n";
    }

    return 0;
}