package easy;

import java.util.Scanner;

public class timeloop {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int iterations = scanner.nextInt();

            for (int i=1; i <= iterations; i++)
                System.out.println(i+" Abracadabra");
        }
    }
}
