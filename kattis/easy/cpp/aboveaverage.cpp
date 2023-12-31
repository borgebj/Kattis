//
// Created by BBJ on 31.12.2023.
//
#include <iostream>
#include <vector>
#include <iomanip>

using namespace std;
#define for_i(x) for(int i =0; i < x; i++)


double calcAvg(vector<int>& grades, int students) {
    double total = 0;
    for_i(students) {
        cin >> grades[i];
        total += grades[i];
    }
    return (students == 0) ? 0 : total / students;
}

double calcAboveAvg(vector<int>& grades, double avg) {
    double count = 0;
    for (int grade : grades)
        if (grade > avg) count++;

    return count;
}

int main() {

    int cases; cin >> cases;

    for_i(cases) {
        int students; cin >> students;
        vector<int> grades(students);

        double avGrade = calcAvg(grades, students);

        double aboveAverageCount = calcAboveAvg(grades, avGrade);

        double percentAbove = (aboveAverageCount / students) * 100;

        cout << fixed << setprecision(3) << percentAbove << "%" << endl;

    }

    return 0;
}