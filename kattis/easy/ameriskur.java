package easy;

import java.util.Scanner;

public class ameriskur {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		assert 1 <= n && n <= 100_000;

		double factor = 0.09144;

		System.out.println(n * factor);
	}
}
