package easy;

import java.util.Scanner;

public class countthevowels {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String line = scanner.nextLine();

			assert 1 <= line.length() && line.length() <= 80;

			String VOWELS = "aeiouAEIOU";
			int vowel_count = 0;

			for (char c : line.toCharArray())
				if (VOWELS.contains(String.valueOf(c)))
					vowel_count++;

			System.out.println(vowel_count);
		}
	}
}
