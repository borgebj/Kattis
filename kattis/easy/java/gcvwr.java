package easy;

import java.util.Scanner;

public class gcvwr {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int gcvwr = scanner.nextInt();	// maximum weight
			int weight = scanner.nextInt();	// truck weight
			int n = scanner.nextInt();		// n next integers
			int threshold = (int) ((gcvwr - weight) * 0.9); // 90% of G - T

			assert 5000 <= gcvwr && gcvwr <= 25_000;
			assert 3000 <= weight && weight <= 12_000;

			for (int i=0; i < n; i++)
				threshold -= scanner.nextInt();

			System.out.println(threshold);
		}
	}
}
