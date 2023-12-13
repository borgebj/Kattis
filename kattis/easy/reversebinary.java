package easy;

import java.util.Scanner;

public class reversebinary {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // innebygd måte
            String binary = Integer.toBinaryString(scanner.nextInt());
            String reversebinary = new StringBuilder(binary).reverse().toString();
            System.out.println(Integer.parseInt(reversebinary, 2));
        }
    }
}
