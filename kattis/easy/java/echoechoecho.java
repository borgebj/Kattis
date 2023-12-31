package easy;

import java.util.Scanner;

public class echoechoecho {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String word = scanner.next();
            System.out.printf("%s %s %s", word, word, word);
        }
    }
}