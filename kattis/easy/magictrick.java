package easy;

import java.util.HashMap;
import java.util.Scanner;

public class magictrick {

	private static int count_letters(String line) {
		HashMap<Character, Integer> occurances = new HashMap<>();
		for (char c : line.toCharArray()) {
			occurances.merge(c, 1, Integer::sum);
			if (occurances.get(c) > 1)
				return 0;
		}
		return 1;
	}
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String line = scanner.nextLine();

			// counts occurances of letters
			// if letter occurs more than once, return 1, else 0
			System.out.println(count_letters(line));
		}
	}
}
