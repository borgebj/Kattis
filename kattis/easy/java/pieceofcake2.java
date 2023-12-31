package easy;

import java.util.Scanner;

public class pieceofcake2 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int h = scanner.nextInt();
			int v = scanner.nextInt();

			assert 2 <= n && n <= 10_000;
			assert 0 < h && h < n;
			assert 0 < v && v < n;

			int side_one = Math.max(h, n - h);
			int side_two = Math.max(v, n - v);
			int height = 4;

			int cake_volume = side_one * side_two * height;

			System.out.println(cake_volume);
		}
	}
}
