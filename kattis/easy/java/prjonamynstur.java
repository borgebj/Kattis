package easy;

import java.util.Map;
import java.util.Scanner;

public class prjonamynstur {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {

			// values
			Map<String, Integer> values = Map.of(
					".", 20,
					"O", 10,
					"\\", 25,
					"/", 25,
					"A", 35,
					"^", 5,
					"v", 22
			);
			int n = scanner.nextInt();
			int m = scanner.nextInt();

			scanner.nextLine();

			// går gjennom grid n * m
			int sum = 0;
			for (int i = 0; i < n; i++) {
				String line = scanner.nextLine();

				for (int j = 0; j < m; j++) {
					char symbol = line.charAt(j);
					sum += values.get(String.valueOf(symbol));
				}
			}

			System.out.println(sum);
		}
	}
}
