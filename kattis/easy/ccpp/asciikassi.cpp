//
// Created by BBJ on 31.12.2023.
//
#include <iostream>
#include <string>

using std::cin;
using std::cout;
using std::string;

int main() {
    int n; cin >> n;
    string box;
    box.reserve((n + 2) * (n + 2));  // reserve space for (n+2) * (n+2) elements in memory

    // creates box based on index location
    for (int i=0; i < n + 2; ++i) {
        for (int j=0; j < n + 2; ++j) {
            if ((i==0 && j==0) || (i==0 && j==n+1) || (i==n+1 && j==0) || (i==n+1 && j==n+1))
                box += "+";
            else if (i==0 || i==n+1)
                box += "-";
            else if (j==0 || j==n+1)
                box += "|";
            else if (i > 0 && i < n+1 && j > 0 && j < n+1)
                box += " ";
        }
        box += "\n";
    }
    cout << box;
    return 0;
}