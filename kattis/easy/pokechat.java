package easy;

import java.util.Scanner;

public class pokechat {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String words = scanner.nextLine();
			String nums = scanner.nextLine();

			// iterates and gets every group of 3 (003002 -> 003 and 002)
			for (int i=0; i < nums.length(); i += 3) {
				int end = Math.min(i+3, nums.length());

				// gets index
				String num = nums.substring(i, end);
				int indx = Integer.parseInt(num);

				// gets assosiated char
				char word = words.charAt(indx-1);

				System.out.print(word);
			}
		}
	}
}
