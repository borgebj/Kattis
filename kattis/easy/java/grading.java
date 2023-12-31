package easy;

import java.util.Scanner;

public class grading {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			int d = scanner.nextInt();
			int e = scanner.nextInt();
			scanner.nextLine();
			int score = scanner.nextInt();

			if (score >= a) System.out.println("A");
			else if (score >= b) System.out.println("B");
			else if (score >= c) System.out.println("C");
			else if (score >= d) System.out.println("D");
			else if (score >= e) System.out.println("E");
			else if (score < e) System.out.println("F");
		}
	}
}
