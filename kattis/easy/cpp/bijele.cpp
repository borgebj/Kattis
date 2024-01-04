//
// Created by BBJ on 03.01.2024.
//
#include <iostream>

int main() {
    int king, queen, rooks, bishops, knights, pawns;
    std::cin >> king >> queen >> rooks >> bishops >> knights >> pawns;

    printf("%d ", king > 0 ? 1-king : king+1);
    printf("%d ", queen > 0 ? 1-queen : queen+1);
    printf("%d ", rooks > 0 ? 2-rooks : rooks+2);
    printf("%d ", bishops > 0 ? 2-bishops : bishops+2);
    printf("%d ", knights > 0 ? 2-knights : knights+2);
    printf("%d ", pawns > 0 ? 8-pawns : pawns+8);

    return 0;
}