package easy;

import java.util.Scanner;

public class knotknowledge {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();

			assert 2 <= n && n <= 50;

			int sum_one = 0;
			for (int i=0; i < n; i++)
				sum_one += scanner.nextInt();

			int sum_two = 0;
			for (int j=0; j < n-1; j++)
				sum_two += scanner.nextInt();

			System.out.println(sum_one - sum_two);
		}
	}
}
