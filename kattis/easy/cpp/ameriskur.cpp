//
// Created by BBJ on 31.12.2023.
//
#include <iostream>
#include <iomanip>
using std::cout, std::cin, std::endl, std::setprecision, std::fixed;

int main() {
    int n; cin >> n;
    double factor = 0.09144;
    double res = n * factor;
    cout << fixed << setprecision(15) << res << endl;
    return 0;
}