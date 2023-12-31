package easy;

import java.util.Scanner;

public class tolvunarfraedingartelja {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		assert 1 <= n && n <= 1_000_000_000;

		System.out.println(n-1);
	}
}
