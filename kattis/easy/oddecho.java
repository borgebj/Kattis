package easy;

import java.util.ArrayList;
import java.util.Scanner;

public class oddecho {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			scanner.nextLine();

			ArrayList<String> valid = new ArrayList<>();

			for (int i=0; i < n; i++) {
				String word = scanner.nextLine();
				if (i % 2 == 0)
					valid.add(word);
			}

			valid.forEach(System.out::println);
		}
	}
}
