#include <stdio.h>
#include <stdlib.h>
#include <time.h>

// doubly linked list structure
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
        head->prev = link; // assigns  previous if possible
    }
    link->prev = NULL;
    
    head = link; // assign new head
}

int popLargest() {
    if (head == NULL) return -1;
    
    Node *current = head;       // holds current
    Node *largest = current;    // holds largest
    
    // iterate through to find largest
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

void print() {
    Node *current = head;
    
    while (current) {
        printf("%d <--> ", current->val);
        current = current->next;
    }
    printf("\n");
}

void popAll() {
    for (int i = 0; head; i++) {
        int largest = popLargest();
        printf("%d ---> ", largest);
    }
    printf("\n");
}


int main() {
    int N = 10;
    srand(time(NULL));
    
    for (int i = 0; i < N; i++) {
        int rng = rand() % 100;
        insert(rng);
    }
    
    printf("\n == [ all numbers ] ==\n");
    print();
    
    printf("\n == [ largest ] ==\n");
    popAll();
    
    return 0;
}

