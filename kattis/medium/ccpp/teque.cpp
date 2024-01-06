//
// Created by BBJ on 02.01.2024.
//
#include <iostream>
#include <deque>
using std::cin;
using std::cout;
using std::string;
using std::getline;
using std::endl;

template <typename T>
class teque {
public:
    std::deque<T> front;
    std::deque<T> back;

    void push_front(T x) {
        front.push_front(x);
        balance();
    }

    void push_back(T x) {
        back.push_back(x);
        balance();
    }

    void push_middle(T x) {
        front.push_back(x);
        balance();
    }

    T get(int index) {
        return index < front.size() ? front[index] : back[index - front.size()];
    }

    void balance() {
        while (front.size() > back.size()  + 1) {
            back.push_front(front.back());
            front.pop_back();
        }
        while (back.size() > front.size()) {
            front.push_back(back.front());
            back.pop_front();
        }
    }
};

int main() {
    int lines; cin >> lines;
    teque<int> teque;

    for (int i=0; i < lines; i++) {
        string action;
        int arg;
        cin >> action >> arg;

        if (action == "push_front")
            teque.push_front(arg);
        else if (action == "push_back")
            teque.push_back(arg);
        else if (action == "push_middle")
            teque.push_middle(arg);
        else if (action == "get")
            cout << teque.get(arg) << endl;
    }
    return 0;
}