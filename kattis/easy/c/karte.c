#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>

#define MAX_PAIRS 100

typedef struct {
    char key;
    int value;
} Pair;

Pair pairs[MAX_PAIRS];
int greska = 0;

int processString(const char *str) {
    int pair_count = 0;
    
    const char *p = str;

    while (*p) {
        if (isalpha(*p)) {
            char key = *p++;
            char numStr[10];
            int numIdx = 0;

            // Collect digits
            while (isdigit(*p)) {
                numStr[numIdx++] = *p++;
            }
            numStr[numIdx] = '\0';

            // Convert collected digits to integer
            int number = atoi(numStr);

            // Check for duplicates
            int is_duplicate = 0;
            for (int i = 0; i < pair_count; i++) {
                if (pairs[i].key == key && pairs[i].value == number) {
                    greska = 1;
                    return 0;
                }
            }

            // If not a duplicate, store the pair
            if (!is_duplicate) {
                pairs[pair_count].key = key;
                pairs[pair_count].value = number;
                pair_count++;
            }
        } else {
            p++;
        }
    }
    return pair_count;
}

int main() {
    char read[1001];
    scanf("%s", read);
    
    int n = processString(read);
    
    Pair cards[4] = {
        {'P', 13},
        {'K', 13},
        {'H', 13},
        {'T', 13}
    };
    
    if (greska) {
        printf("GRESKA");
    }
    else {
        // count cards from pair-pile
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                if (pairs[i].key == cards[j].key) {
                    cards[j].value--;
                }
            } 
        }
        // print results of total cards per suit
        for (int i = 0; i < 4; i++) {
            printf("%d ", cards[i].value);
        }
    }

    return 0;
}

/*
Example input

P01K02H03H04     --> "12 12 11 13"
H02H10P11H02	 --> "GRESKA"
P10K10H10T01	 --> "12 12 12 12"
*/
