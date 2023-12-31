package easy;

import java.util.Scanner;

public class fyi {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();

			assert 1000000 <= n && n <= 9999999;

			String tlf = Integer.toString(n);
			int bool = tlf.startsWith("555") ? 1 : 0;
			System.out.println(bool);
		}
	}
}
