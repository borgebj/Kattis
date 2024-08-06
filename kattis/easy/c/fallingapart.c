#include <stdio.h>
#include <stdlib.h>

typedef struct node {
    int val;
    struct node *prev;
    struct node *next;
} Node;

struct node *head = NULL;

void insert(int val) {
    struct node *link = (struct node*) malloc(sizeof(struct node));
    
    link->val = val;   // assign value
    
    link->next = head; // place before head
    
    if (head != NULL) {
        head->prev = link;
    }
    link->prev = NULL;
    
    head = link; // assign new head
}

int popLargest() {
    if (head == NULL) return -1;
    
    Node *current = head;
    Node *largest = current;
    
    while (current != NULL) {
        if (current->val > largest->val) {
            largest = current;
        }
        current = current->next;
    }
    
    if (largest->prev != NULL) {
        largest->prev->next = largest->next;
    } else {
        head = largest->next;
    }
    
    if (largest->next != NULL) {
        largest->next->prev = largest->prev;
    }
    
    // remove largest
    int largestval = largest->val;
    free(largest);
    
    return largestval;
}


int main() {
    int n, num;
    scanf("%d", &n);
    
    for (int i = 0; i < n; i++) {
        scanf("%d", &num);
        insert(num);
    }
    
    int a = 0, b = 0, i = 0;
    
    for (int i = 0; head; i++) {
        int val = popLargest();
        
        if (i % 2 == 0) a+=val;
        else b+=val;
    }
    
    printf("%d %d\n", a, b);
    
    return 0;
}


/*
Uses linked list to pop largest
Example input:

3
3 1 2

output:
4 2
*/
