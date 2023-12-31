package easy;

import java.util.Scanner;

public class undeadoralive {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String line = scanner.nextLine();

			int smile = 0;
			int frown = 0;

			if (line.contains(":)")) smile = 1;
			if (line.contains(":(")) frown = 1;

			if (smile == 1 && frown == 1) System.out.println("double agent");
			else if (smile == 1) System.out.println("alive");
			else if (frown == 1) System.out.println("undead");
			else System.out.println("machine");
		}
	}
}
