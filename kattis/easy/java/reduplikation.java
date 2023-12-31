package easy;

import java.util.Scanner;

public class reduplikation {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String line = scanner.nextLine();
			int n = scanner.nextInt();

			assert 2 <= line.length() && line.length() <= 10;
			assert 1 <= n && n <= 9;

			for (int i=0; i < n; i++)
				System.out.print(line);
		}
	}
}
