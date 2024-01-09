//
// Created by borge on 09.01.2024.
//
#include <iostream>
#include <string>

char rotate(const char &c, const int &rotations);
std::string merge(const std::string (&newLines)[2], std::string DRM = "");

int main() {
    std::string line;  // define line
    std::cin >> line;  // scan line
    std::string newLines[2]; // placeholder for new message

    // divides
    size_t mid = line.length() / 2;
    std::string lines[2] = {line.substr(0, mid), line.substr(mid)};

    // rotates
    for (size_t i=0; i < 2; ++i) {
        int rotations = 0;
        std::string newWord;

        // loop 1: get rotations
        for (const char &c : lines[i])
            rotations += (int) c - (int) 'A';

        // loop 2: rotate each character
        for (const char &c : lines[i])
            newWord += rotate(c, rotations);

        newLines[i] = newWord;
    }

    // merge
    std::string DRM = merge(newLines);

    // print result
    std::cout << DRM;

    return 0;
}

char rotate(const char &c, const int &rotations) {
    int char_val = (int) c - (int) 'A';
    int new_val = (char_val + rotations) % 26;
    return (char) ('A' + new_val);
}

std::string merge(const std::string (&newLines)[2], std::string DRM)  {
    for (size_t i=0; i < newLines[0].length(); ++i) {
        char first_char = newLines[0][i];
        int rotations = (int) newLines[1][i] - (int) 'A';
        char new_char = rotate(first_char, rotations);
        DRM += new_char;
    }
    return DRM;
}