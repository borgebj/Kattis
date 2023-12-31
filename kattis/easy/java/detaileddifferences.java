package easy;

import java.util.Scanner;

public class detaileddifferences {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt(); scanner.nextLine();

			assert 1 <= n && n <= 500;

			for (int i=0; i < n; i++) {
				String case_one = scanner.nextLine();
				String case_two = scanner.nextLine();

				assert case_one.length() == case_two.length(); // ensures same length
				StringBuilder similarities = new StringBuilder();

				for (int j=0; j < case_one.length(); j++) {
					if (case_one.charAt(j) == case_two.charAt(j))
						similarities.append(".");
					else similarities.append("*");
				}
				System.out.println(case_one);
				System.out.println(case_two);
				System.out.println(similarities);
				System.out.println();
			}
		}
	}
}
