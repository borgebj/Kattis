package easy;

import java.util.Scanner;

public class sorttwonumbers {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int a = scanner.nextInt(), b = scanner.nextInt();

			assert 0 <= a && a <= 1_000_000;
			assert 0 <= b && b <= 1_000_000;

			if (a < b) {
				System.out.println(a+" "+b);
			}
			else System.out.println(b+" "+a);
		}
	}
}
