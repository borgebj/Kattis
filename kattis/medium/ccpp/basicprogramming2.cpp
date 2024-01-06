//
// Created by BBJ on 06.01.2024.
//
#include <iostream>
#include <string>
#include <vector>
#include <unordered_set>
#include <algorithm>

std::string doOne(const std::vector<signed int> &a) {
    std::unordered_set<signed int> seen;

    for (const signed int &i : a) {
        signed int complement = 7777 - i;
        if (seen.find(complement) != seen.end())
            return "Yes";
        seen.insert(i);

    } return "No";
}

std::string doTwo(const std::vector<signed int> &a) {
    std::unordered_set<signed int> visited;

    for (const signed int &i : a) {
        if (visited.find(i) != visited.end())
            return "Contains duplicate";
        visited.insert(i);
    }
    return "Unique";
}

int doThree(const std::vector<signed int> &A, const int &N) {
    int candidate = 0, count = 0;

    for (const int &num : A) {
        if (count == 0) {
            candidate = num;
            count = 1;
        } else if (candidate == num) {
            count++;
        } else {
            count--;
        }
    }
    count = (int) std::count(A.begin(), A.end(), candidate);
    return count > N / 2 ? candidate : -1;
}

void doFour(std::vector<signed int> A, const int &N) {
    std::sort(A.begin(), A.end());

    if (N % 2 == 0)
        std::cout << A[N/2-1] << " " << A[N/2];
    else
        std::cout << A[N/2];
}

void doFive(std::vector<signed int> A) {
    std::sort(A.begin(), A.end());

    for (const signed int &i : A) {
        if (100 <= i && i <= 999) {
            std::cout << i << " ";
        }
    }
}

int main() {
    int N, t; std::cin >> N >> t;

    // fill vector with N elements
    std::vector<signed int> A;
    for (size_t i=0; i < N; ++i) {
        signed int num; std::cin >> num;
        A.push_back(num);
    }

    // perform program based on t
    switch(t) {
        case 1:
            std::cout << doOne(A);
            break;
        case 2:
            std::cout << doTwo(A);
            break;
        case 3:
            std::cout << doThree(A, N);
            break;
        case 4:
            doFour(A, N);
            break;
        case 5:
            doFive(A);
            break;
        default:
            std::cout << "Wrong input";
            break;
    }
    return 0;
}