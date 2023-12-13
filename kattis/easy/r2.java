package easy;

import java.util.Scanner;

public class r2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int r1 = scanner.nextInt();
            int s1 = scanner.nextInt();
            int r2 = (s1*2)-r1;
            System.out.println(r2);
        }
    }
}
