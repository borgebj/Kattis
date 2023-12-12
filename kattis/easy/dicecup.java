package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class dicecup {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();

			assert 4 <= n && n <= 20;
			assert 4 <= m && m <= 20;

			HashMap<Integer, Integer> diceCounts = new HashMap<>();

			// first dice roll
			for (int i=1; i <= n; i++) {

				// second dice rolle
				for (int j=1; j <= m; j++) {

					// calculates sum of both throws and saves it
					int sum = i + j;
					diceCounts.put(sum, diceCounts.getOrDefault(sum, 0)+1);
				}
			}


			int highestCount = Integer.MIN_VALUE;
			ArrayList<Integer> highestKeys = new ArrayList<>();

			for (Map.Entry<Integer, Integer> entry : diceCounts.entrySet()) {
				Integer key = entry.getKey();
				Integer val = entry.getValue();

				if (val > highestCount) {
					highestCount = val;
					highestKeys.clear(); // Clear previous highest keys
					highestKeys.add(key);
				} else if (val == highestCount) {
					highestKeys.add(key); // Add another key with the same highest value
				}
			}

			highestKeys.forEach(System.out::println);
		}
	}
}
