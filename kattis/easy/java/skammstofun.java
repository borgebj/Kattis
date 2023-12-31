package easy;

import java.util.Scanner;

public class skammstofun {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt(); scanner.nextLine();
			String[] line = scanner.nextLine().split(" ");

			assert 1 <= n && n <= 100;

			// prints out start-charcater of every capitalized word
			for (int i=0; i < n; i++) {
				char c = line[i].charAt(0);
				System.out.print(Character.isUpperCase(c) ? c : "");
			}
		}
	}
}
