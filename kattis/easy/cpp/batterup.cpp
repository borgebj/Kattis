 //
// Created by BBJ on 03.01.2024.
//
#include <iostream>
using std::cin;
using std::cout;

int main() {
    int noAB; cin >> noAB;
    int timesAtBat = noAB;

    long double sum = 0;
    for (int i=0; i < noAB; ++i) {
        int action; cin >> action;

        if (action == -1) timesAtBat--;
        else sum += action;
    }

    cout << (sum / timesAtBat);

    return 0;
}