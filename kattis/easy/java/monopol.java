package easy;

import java.util.Arrays;
import java.util.Scanner;

public class monopol {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt(); scanner.nextLine();

			int total_outcome = 6*6;
			int favorable_outcome = 0;

			assert 1 <= n && n <= 11;

			// filles int array with n-nextInt()s
			int[] hotels = Arrays.stream(new int[n])
					.map(i -> scanner.nextInt())
					.toArray();

			// calculate favorable with 2 dice throws
			for (int i=1; i <= 6; i++) {
				for (int j=1; j <= 6; j++) {
					for (int hotel : hotels) {
						if (i + j == hotel) {
							favorable_outcome++;
							break;
						}
					}
				}
			}

			double probability = (double) favorable_outcome / total_outcome;
			System.out.println(probability);
		}
	}
}
