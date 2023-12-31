package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class cprnummer {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String line = scanner.nextLine().replace("-", "");
			int sum = 0;

			List<Integer> values = new ArrayList<>(List.of(4, 3, 2, 7, 6, 5, 4, 3, 2, 1));
			for (int i=0; i < line.length(); i++) {
				int line_val = Character.getNumericValue(line.charAt(i));
				int val_val = values.get(i);
				sum += line_val * val_val;
			}

			int divisible = sum % 11 == 0 ? 1 : 0;
			System.out.println(divisible);
		}
	}
}
