package kattis;

import java.util.Scanner;

public class EchoEchoEcho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        System.out.printf("%s %s %s", word, word, word);
    }
}