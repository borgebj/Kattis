#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_NAME_LEN 20

// representing key-value pair
typedef struct {
    char *key;
    int value;
} KeyValPair;

// representing the hash table
typedef struct {
    int size;
    int unused;
    KeyValPair **table;
} HashTable;

// creates the table using calloc to prefill
HashTable *createTable(int size) {
    HashTable *table = malloc(sizeof(HashTable));
    
    table->size = size;
    table->unused = size;
    table->table = calloc(size, sizeof(KeyValPair *));
    
    return table;
}

// hashes string each character with prime 5381
unsigned int hash(char *str, unsigned int size) {
    unsigned int c, h = 5381;

    while ((c = (unsigned int)*str++)) {
        h = ((h << 5) + h) + c;
    }
    return h % size;
}

// inserts into table using linear probing for collision handling
void insert(HashTable *table, char *key, int value) {
    if (table->unused > 0) {
        unsigned int original = hash(key, table->size);
        unsigned int index = original;

        // Linear probing to find an available slot
        while (table->table[index] != NULL) {
            if (strcmp(table->table[index]->key, key) == 0) {
                table->table[index]->value += value;
                return;
            }
            index = (index + 1) % table->size;
            if (index == original) {
                return;
            }
        }

        KeyValPair *pair = malloc(sizeof(KeyValPair));
        pair->key = malloc(strlen(key) + 1);
        strcpy(pair->key, key);
        pair->value = value;
        
        table->table[index] = pair;
        table->unused--;
    } 
}

// gets specified key-value from table
int getValue(HashTable *table, char *key) {
    unsigned int index = hash(key, table->size);

    // Linear probing to find the key in the table
    while (table->table[index] != NULL) {
        if (strcmp(table->table[index]->key, key) == 0) {
            return table->table[index]->value;
        }
        index = (index + 1) % table->size;
    }

    return -1;
}

// deletes table by freeing allocated space
void deleteTable(HashTable *table) {
    for (int i = 0; i < table->size; i++) {
        if (table->table[i] != NULL) {
            free(table->table[i]->key);
            free(table->table[i]);
        }
    }
    free(table->table);
    free(table);
}

// prints table by iterating internal array
void printTable(HashTable *table) {
    for (int i = 0; i < table->size; i++) {
        if ( table->table[i] != NULL ) {
            printf("{%s : %d}\n", table->table[i]->key, table->table[i]->value);
        }
    }
}


void findBiggest(HashTable *table) {
    char *bName;
    int bVal = 0;
    
    for (int i = 0; i < table->size; i++) {
        KeyValPair *pair = table->table[i];
        
        if ( pair != NULL ) {
            int val = pair->value;
            char *name = pair->key;
            if ( val > bVal ) {
                bVal = val;
                bName = name;
            }
        }
    }
    printf("'%s' has biggest with %d\n", bName, bVal);
}


int main() {
    int n = 5;
    HashTable *table = createTable(n);
    
    for (int i = 1; i <= n; i++) {
        char name[6];
        for (int j = 0; j < (5); j++) {
            name[j] = i + 97 + j+(j%5);
        } 
        name[0] = name[0] - 32;
        name[6] = 0;
        insert(table, name, i + (4 % i));
    }
    
    printTable(table);
    
    findBiggest(table);

    deleteTable(table);
    return 0;
}


