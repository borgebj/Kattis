package easy;

import java.util.Scanner;

public class fifa {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();

		assert n <= 1000 && 0 <= n;

		System.out.println(2022 + n / k);
	}
}
