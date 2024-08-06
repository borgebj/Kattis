#include <stdio.h>
#include <stdbool.h>

// check that all digits in number differs
bool alldiffers(int num) {
    bool seen[10] = {false};
    
    if (num < 0) num = -num;
    
    while (num) {
        int digit = num % 10;
        if (digit == 0 || seen[digit]) return false;
        seen[digit] = true;
        num /= 10;
    }
    return true;
}

// check if number is divislbe by all its digits
bool alldivisible(int num) {
    if (num == 0) return false;
    
    int original = num;
    
    while (num) {
        int digit = num % 10;
        if (digit == 0 || original % digit != 0) return false;
        num /= 10;
    }
    return true;
}

int main() {
    int start, end;
    scanf("%d %d", &start, &end);

    int count = 0;
    for (int i = start; i <= end; i++) {
        if (alldiffers(i) && alldivisible(i)) {
            count++;
        }
    }
    printf("%d\n", count);
    
    return 0;
}
