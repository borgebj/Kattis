package easy;

import java.util.Scanner;

public class sottkvi {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int bdaydays = scanner.nextInt() + scanner.nextInt();

			int friends = 0;

			for (int i=0; i < n; i++) {
				if (scanner.nextInt()+14 <= bdaydays) friends++;
			}

			System.out.println(friends);
		}
	}
}
