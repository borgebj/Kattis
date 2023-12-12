package easy;

import java.util.Scanner;

public class addingtrouble {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();

			assert -1_000_000_000 <= a && a <= 1_000_000_000;
			assert -1_000_000_000 <= b && b <= 1_000_000_000;
			assert -1_000_000_000 <= c && c <= 1_000_000_000;

			if (a + b == c) System.out.println("correct!");
			else System.out.println("wrong!");
		}
	}
}
