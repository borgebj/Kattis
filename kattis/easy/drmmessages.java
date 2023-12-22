package easy;

import java.util.Scanner;

public class drmmessages {

	// encapsulated rotate-function
	static char rotate(char c, int rotations) {
		int char_val = (int) c - (int) 'A';
		int new_val = (char_val + rotations) % 26;
		return (char) ('A' + new_val);
	}
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String line = scanner.nextLine();

			String[] newLines = new String[2];

			// divides
			int mid = line.length() / 2;
			String[] lines = {line.substring(0, mid), line.substring(mid)};

			// rotates
			for (int i=0; i < lines.length; i++) {
				int rotations = 0;
				StringBuilder newWord = new StringBuilder();

				// loop 1: get rotations
				for (Character c : lines[i].toCharArray())
					rotations += (int) c - (int) 'A';

				// loop 2: rotates each character
				for (char c : lines[i].toCharArray())
					newWord.append(rotate(c, rotations));

				newLines[i] = (newWord.toString());
			}

			// merge
			StringBuilder DRM = new StringBuilder();
			for (int i=0; i < newLines[0].length(); i++) {
				char first_char = newLines[0].charAt(i);
				int rotations = (int) newLines[1].charAt(i) - (int) 'A';
				char new_char = rotate(first_char, rotations);
				DRM.append(new_char);
			}

			// print result
			System.out.println(DRM);
		}
	}
}
