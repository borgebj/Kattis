package easy;

import java.util.Scanner;

public class vidsnuningur {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		String reversed = new StringBuilder(line).reverse().toString();

		System.out.println(reversed);
	}
}
