package easy;

import java.util.Scanner;

public class sith {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			scanner.nextLine(); // skips user
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();

			if (a < b && c < 0)
				System.out.println("JEDI");
			else if (a < b && c > 0)
				System.out.println("SITH");
			else
				System.out.println("VEIT EKKI");
		}
	}
}
