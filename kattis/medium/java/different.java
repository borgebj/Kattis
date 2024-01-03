package medium;

import java.util.Scanner;

public class different {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNextLong()) {
                long res = Math.abs(scanner.nextLong()-scanner.nextLong());
                System.out.println(res);
            }
        }
    }
}
