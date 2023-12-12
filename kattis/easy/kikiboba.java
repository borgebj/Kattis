package easy;

import java.util.Scanner;

public class kikiboba {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();

		int b_count = 0;
		int k_count = 0;

		for (char c : line.toCharArray()) {
			if (c == 'b') b_count++;
			if (c == 'k') k_count++;
		}
		if (b_count > k_count) System.out.println("boba");
		if (b_count < k_count) System.out.println("kiki");
		if (b_count == k_count && b_count != 0) System.out.println("boki");
		if (b_count == 0 && k_count == 0) System.out.println("none");
	}
}
