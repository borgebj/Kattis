package easy;

import java.util.Scanner;

public class ekkidaudi {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String[] line1 = scanner.nextLine().strip().split("\\|");
			String[] line2 = scanner.nextLine().strip().split("\\|");

			// constructs new lines
			String newLine1 = line1[0] + line2[0];
			String newLine2 = line1[1] + line2[1];

			// prints
			System.out.println(newLine1+" "+newLine2);
		}
	}
}
