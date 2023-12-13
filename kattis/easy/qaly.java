package easy;

import java.util.Scanner;


public class qaly {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();

            assert 1 <= n && n <= 100;

            double sum = 0.0;
            for (int i=0; i < n; i++) {
                double q = Double.parseDouble(scanner.next());
                double y = Double.parseDouble(scanner.next());

                assert 0 < q && q <= 1;
                assert 0 < y && y <= 100;

                sum += q * y;
            }
            System.out.println(sum);
        }
    }
}
