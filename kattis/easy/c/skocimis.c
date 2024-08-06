
#include <stdio.h>

int main() {
    int a, b, c;
    scanf("%d %d %d", &a, &b, &c);
    int aa = a, bb = b, cc = c;
    int moves = 0;
    
    int range = (c - a) - 1;
    while (range > 1) {
        int anchor = (b - a > c - b ? -1 : 1);
        
        if (anchor == 1) {
            int pos = c - 1;
            if (pos > b) {
                a = b;
                b = pos;
            }
        }
        else if (anchor == -1) {
            int pos = a + 1;
            if (pos < b) {
                c = b;
                b = pos;
            }
        }
        
        range = (c - a) - 1;
        moves++;
    }
    printf("%d", moves);
    return 0;
}

/*
Example input

3 5 9

/*
