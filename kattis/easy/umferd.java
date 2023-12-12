package easy;

import java.util.Scanner;

public class umferd {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int m = scanner.nextInt(); // cells per lane
			int n = scanner.nextInt(); // number of lanes
			scanner.nextLine();

			assert 1 <= n && n <= 500;
			assert 1 <= m && m <= 500;

			double count = 0;

			for (int i=0; i < n; i++) {
				String line = scanner.nextLine();
				count += line.chars().filter(c -> c == '.').count();

			}
			System.out.println(count / (m * n));
		}
	}
}