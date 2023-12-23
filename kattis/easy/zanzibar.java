package easy;

import java.util.Scanner;

public class zanzibar {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int t = scanner.nextInt(); scanner.nextLine();

			for (int i = 0; i < t; i++) {
				int line_sum = 0;
				int prev_num = scanner.nextInt();

				do {
					int new_num = scanner.nextInt();
					int double_num = prev_num * 2;

					// adds generational difference
					line_sum += Math.max(0, new_num - double_num);

					prev_num = new_num;
				} while (prev_num != 0);

				System.out.println(line_sum);
			}
		}
	}
}
