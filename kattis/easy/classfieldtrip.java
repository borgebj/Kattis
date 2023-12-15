package easy;

import java.util.Arrays;
import java.util.Scanner;

public class classfieldtrip {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String line_one = scanner.nextLine();
			String line_two = scanner.nextLine();

			assert 1 <= line_one.length() && line_one.length() <= 100;
			assert 1 <= line_two.length() && line_two.length() <= 100;

			String new_string = (line_one + line_two); 	// concatenated
			char[] letters = new_string.toCharArray();	// turns into chars
			Arrays.sort(letters);						// sorts
			System.out.println(letters);				// prints
		}
	}
}
