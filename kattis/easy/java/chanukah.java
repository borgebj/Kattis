package easy;

import java.util.HashMap;
import java.util.Scanner;

public class chanukah {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int p = scanner.nextInt();

			assert 1 <= p && p <= 10_000;

			HashMap<Integer, Integer> candles_day = new HashMap<>();

			for (int i=0; i < p; i++) {
				int k = scanner.nextInt();
				int n = scanner.nextInt();

				assert 1 <= n && n <= 10_000;

				int candles = 0;

				for (int j=0; j < n; j++) {
					candles += j+1;
				}

				candles_day.put(k, candles+n);
			}

			candles_day.forEach((day, count) -> System.out.printf("%d %d %n", day, count));
		}
	}
}
