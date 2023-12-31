package easy;

import java.util.Scanner;

public class flatbokuveisla {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();

		assert 1 <= n && n <= 1_000_000;
		assert 1 <= m && m <= 1_000_000;

		System.out.println(n % m);
	}
}
