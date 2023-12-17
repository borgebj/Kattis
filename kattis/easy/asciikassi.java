package easy;

import java.util.Scanner;

public class sasciikassi {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();

			StringBuilder box = new StringBuilder();

			for (int i = 0; i < n + 2; i++) {
				for (int j = 0; j < n + 2; j++) {
					if ((i == 0 && j == 0) || (i == 0 && j == n + 1) || (i == n + 1 && j == 0) || (i == n + 1 && j == n + 1))
						box.append("+");
					else if (i == 0 || i == n + 1)
						box.append("-");
					else if (j == 0 || j == n + 1)
						box.append("|");
					else if (i > 0 && i < n + 1 && j > 0 && j < n + 1)
						box.append(" ");
				}
				box.append("\n");
			}

			System.out.print(box);
		}
	}
}
