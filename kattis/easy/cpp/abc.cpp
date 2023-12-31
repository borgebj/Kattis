//
// Created by BBJ on 30.12.2023.
//

#include <iostream>
#include <algorithm>

using std::cout;
using std::cin;
using std::string;
using std::endl;
using std::min;
using std::max;

int main() {
    int x,y,z;
    cin >> x >> y >> z;

    string order;
    cin >> order;

    for (char c : order) {
        switch (tolower(c)) {
            case 'a':
                cout << min(min(x,y),z) << endl;
                break;
            case 'b':
                cout << max(min(x,y), min(max(x,y), z)) << endl;
                break;
            case 'c':
                cout << max(max(x,y), z) << endl;
                break;
        }
    }
    return 0;
}