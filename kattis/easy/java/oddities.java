package easy;

import java.util.Scanner;

public class oddities {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numbers = scanner.nextInt();

            for (int i=0; i < numbers; i++) {
                int num = scanner.nextInt();
                if (num%2==0) System.out.println(num+" is even");
                else System.out.println(num+" is odd");
            }
        }
    }
}
