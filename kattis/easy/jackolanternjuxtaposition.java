package easy;

import java.util.Scanner;

public class jackolanternjuxtaposition {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(scanner.nextInt()*scanner.nextInt()*scanner.nextInt());
        }
    }
}