package easy;

import java.util.Scanner;

public class spritt {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int x = scanner.nextInt();

			assert 1 <= n && n <= 1_000;

			int count = 0;
			for (int i=0; i < n; i++) {
				count += scanner.nextInt();
			}
			System.out.println(count <=  x ? "Jebb" : "Neibb");
		}
	}
}
