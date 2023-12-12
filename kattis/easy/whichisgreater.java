package easy;

import java.util.Scanner;

public class whichisgreater {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();

			assert 0 <= a && a <= 1_000_000_000;
			assert 0 <= b && b <= 1_000_000_000;

			System.out.println(a > b ? 1 : 0);
		}
	}
}
