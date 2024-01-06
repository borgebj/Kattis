//
// Created by BBJ on 06.01.2024.
//
#include <iostream>
#include <vector>
#include <string>
#include <numeric>
#include <unordered_set>

// 2) comparison for first and second element
std::string comp(const int &a, const int &b){
    if (b == a) return "Equal";
    else if (a > b) return "Bigger";
    else return "Smaller";
}

// 3) median of 3 integers
int median(const int &a, const int &b, const int &c) {
    if ((a <= b && b <= c) || (c <= b && b <= a))
        return b;
    else if ((b <= a && a <= c) || (c <= a && a <= b))
        return a;
    else return c;
}

// 4) sum of array
int sum(const std::vector<int> &A) {
    return std::accumulate(A.begin(), A.end(), 0);
}

// 5) sum of even integers in array
int sumEven(const std::vector<int> &A) {
    return std::accumulate(A.begin(), A.end(), 0, [](int sum, int num) {
        return sum + (num % 2 == 0 ? num : 0);
    });
}

// 6) apply modulo, map int to char, print sequence
std::string mapToString(const std::vector<int> &A) {
    std::string sequence;
    for (const int &i : A) {
        char newChar = (char) ('a' + (i % 26));
        sequence += newChar;
    }
    return sequence;
}

// 7) Do a lot of weird stuff
void doStuff(const std::vector<int> &A) {
    int i = 0;
    size_t n = A.size();

    std::unordered_set<int> visited = {0};

    while (0 <= i && i <= n - 1) {
        i == A[i];
        if (i > n-1) {
            printf("Out"); break;
        }
        if (i == n-1) {
            printf("Done"); break;
        }
        if (visited.find(i) != visited.end()) {
            printf("Cyclic"); break;
        }
        visited.insert(i);
    }
}

int main() {
    int N, t; std::cin >> N >> t;

    // fill vector with N elements
    std::vector<int> A;
    for (size_t i=0; i < N; ++i) {
        int num; std::cin >> num;
        A.push_back(num);
    }

    // perform program based on t
    switch(t) {
        case 1:
            std::cout << 7;
            break;
        case 2:
            std::cout << comp(A[0], A[1]);
            break;
        case 3:
            if (A.size() >= 3)
                std::cout << median(A[0], A[1], A[2]);
            break;
        case 4:
            std::cout << sum(A);
            break;
        case 5:
            std::cout << sumEven(A);
            break;
        case 6:
            std::cout << mapToString(A);
            break;
        case 7:
            doStuff(A);
            break;
        default:
            std::cout << "Wrong input";
            break;
    }
    return 0;
}