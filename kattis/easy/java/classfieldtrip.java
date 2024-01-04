package easy;

import java.util.Arrays;
import java.util.Scanner;

public class classfieldtrip {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String line_one = scanner.nextLine();
			String line_two = scanner.nextLine();

			String new_string = (line_one + line_two); 	// concatenated
			char[] letters = new_string.toCharArray();	// turns into chars
			Arrays.sort(letters);						// sorts
			System.out.println(letters);				// prints
		}
	}
}
