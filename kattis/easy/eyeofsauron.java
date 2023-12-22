package easy;

import java.util.Scanner;

public class eyeofsauron {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String[] line = scanner.nextLine().split("\\(\\)");

			// compares letters on left with letters on right
			boolean fixed = line[0].length() == line[1].length();

			// same length of letters on each side : fixed
			System.out.println(fixed ? "correct" : "fix");
		}
	}
}
