package easy;

import java.util.Scanner;

public class meddelande {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			scanner.nextLine();

			StringBuilder word = new StringBuilder();

			for (int i=0; i < n; i++) {
				String line = scanner.nextLine();
				for (int j=0; j < m; j++)
					if (line.charAt(j) != '.') word.append(line.charAt(j));
			}

			System.out.println(word);
		}
	}
}
