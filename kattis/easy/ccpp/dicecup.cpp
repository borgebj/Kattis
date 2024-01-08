//
// Created by BBJ on 08.01.2024.
//
#include <iostream>
#include <map>
#include <list>

std::map<int,int> countDices(int &n, int &m);
std::list<int> getHighestKeys(std::map<int,int> &diceCount);


int main() {
    int n, m;
    std::cin >> n >> m;

    // counts dice throws
    std::map<int,int> diceCount = countDices(n, m);

    // gets highest throws
    std::list<int> highest = getHighestKeys(diceCount);

    // prints highest throws
    for (const auto &val : highest)
        std::cout << val << "\n";

    return 0;
}

std::map<int,int> countDices(int &n, int &m) {
    std::map<int, int> diceCount;

    // first dice roll
    for (int i=1; i <= n; ++i) {

        // second dice roll
        for (int j=1; j <= m; ++j) {

            // calculate sum of both throws and saves it
            int sum = i+j;
            diceCount[sum]++;
        }
    }
    return diceCount;
}

std::list<int> getHighestKeys(std::map<int,int> &diceCount) {
    int highestCount = 0;
    std::list<int> highestKeys;

    // go through map with throws
    for (const auto &pair : diceCount) {
        int key = pair.first;
        int val = pair.second;

        if  (val > highestCount) {
            highestCount = val;
            highestKeys.clear();
            highestKeys.push_back(key);
        }
        else if (val == highestCount) {
            highestKeys.push_back(key);
        }
    }
    return highestKeys;
}