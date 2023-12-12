package easy;

import java.util.Scanner;

public class knightpacking {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();

			assert 1 <= n && n <= 1000;

			String win = n % 2 == 0 ? "second" : "first";

			System.out.println(win);
		}
	}
}
