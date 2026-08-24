#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);
    
    int arr[365] = {0};
    
    for (int i = 0; i < n; i++) {
        int s, t;
        scanf("%d %d", &s, &t);
        for (int j = s; j <= t; j++) {
            arr[j] = 1;
        }
    }
    
    int days = 0;
    for (int i = 0; i <= 365; i++) {
        if (arr[i] == 1) days++;
    }
    
    printf("%d", days);
    return 0;
}


/*
Example input

3
10 14
13 17
25 26

meaning days
10 - 17 and 25 - 26      10 days total
*/
