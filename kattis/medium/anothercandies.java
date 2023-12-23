package medium;

import java.util.Scanner;

public class anothercandies {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int cases = Integer.parseInt(scanner.nextLine());

			for (int i=0; i < cases; i++) {
				scanner.nextLine();
				int n = Integer.parseInt(scanner.nextLine());
				int sum = 0;

				// sums test case
				for (int j=0; j < n; j++)
					sum += Integer.parseInt(scanner.nextLine());

				// checks if sum is divisible
				String res = (sum % n == 0) ?  "YES" : "NO";
				System.out.println(res);
			}
		}
	}
}
