package easy;

import java.util.Scanner;

public class digitswap {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String code = scanner.nextLine();

			assert code.length() == 2;

			char a = code.charAt(0);
			char b = code.charAt(1);
			System.out.println(b+String.valueOf(a));
		}
	}
}
