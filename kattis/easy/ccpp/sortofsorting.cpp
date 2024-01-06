#include <iostream>
#include <string>
#include <algorithm>
#include <vector>

using std::string;
using std::vector;
using std::cout;
using std::cin;
using std::endl;
using std::getline;
using std::sort;

struct NameWithIndex {
    string name;
    size_t index;

    NameWithIndex(const string& n, size_t i) : name(n), index(i) {}
};

bool firstTwo(const NameWithIndex& a, const NameWithIndex& b) {
    if (a.name.substr(0, 2) == b.name.substr(0, 2)) {
        return a.index < b.index; // Preserve original order for names with the same first two letters
    }
    return a.name.substr(0, 2) < b.name.substr(0, 2);
}

int main() {
    bool first = true;
    while (true) {
        int n;
        cin >> n;

        // exit condition
        if (n == 0) break;

        // clears newline character after reading n
        cin.ignore(256, '\n');

        vector<NameWithIndex> names;
        string name;
        for (size_t i = 0; i < n; ++i) {
            getline(cin, name);
            names.emplace_back(name, i);
        }

        // sorts the strings while preserving original order
        sort(names.begin(), names.end(), firstTwo);

        if (!first) cout << "\n";
        else first = false;

        for (const NameWithIndex &ni : names)
            cout << ni.name << "\n";
    }
    return 0;
}
