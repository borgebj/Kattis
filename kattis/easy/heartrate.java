package easy;

import java.util.Scanner;

public class heartrate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();               // n lines
        assert 1 <= n && n <= 1000;

        for (int i=0; i < n; i++) {
            int b = scanner.nextInt();          // b beats
            double p = scanner.nextDouble();    // p seconds

            assert 0 < p && p < 1000;
            assert 2 <= b && b <= 1000;

            double BPM = (60 * b) / p;
            double step = BPM / b;
            double max_ABPM = BPM+step;
            double min_ABPM = BPM-step;

            System.out.println(min_ABPM+" "+BPM+" "+max_ABPM);
        }
    }
}
