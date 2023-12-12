package easy;

import java.util.Scanner;

public class twosum {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();

			assert 0 <= a && a <= 1000;
			assert 0 <= b && b <= 1000;

			System.out.println(a+b);
		}
	}
}
