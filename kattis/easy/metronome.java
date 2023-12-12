package easy;

import java.util.Scanner;

public class metronome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		assert 1 <= n && n <= 100_000;

		System.out.println(n / 4.0);
	}
}
