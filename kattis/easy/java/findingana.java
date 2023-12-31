package easy;

import java.util.Scanner;

public class findingana {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String line = scanner.nextLine();

			assert 1 <= line.length() && line.length() <= 1000;

			// substring extracts word after a
			String new_string = line.substring(line.indexOf('a'));

			System.out.println(new_string);
		}
	}
}
