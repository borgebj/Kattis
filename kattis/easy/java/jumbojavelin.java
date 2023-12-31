package easy;

import java.util.Scanner;

public class jumbojavelin {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();

            int totalSum = 0;
            for (int i=0; i < n; i++) {
                totalSum += scanner.nextInt()-1;
            }
            System.out.println(totalSum+1);
        }
    }
}
