package easy;

import java.util.Scanner;

public class zamka {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int l = scanner.nextInt();
			int d = scanner.nextInt();
			int x = scanner.nextInt();

			assert 1 <= l && l <= 10_000;
			assert 1 <= d && d <= 10_000;
			assert 1 <= x && x <= 36;

			int max_sum = 0;
			int min_sum = 0;

			for (int i=l; i <= d; i++) {
				int sum = String.valueOf(i).chars().map(Character::getNumericValue).sum();
				if (sum == x) {
					if (min_sum == 0) min_sum = i;
					max_sum = i;
				}
			}

			System.out.println(min_sum);
			System.out.println(max_sum);
		}
	}
}
