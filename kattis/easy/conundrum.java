package easy;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class conundrum {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String[] line = scanner.nextLine().split("");

			String[] per = {"P", "E", "R"};
			int index = 0;
			int days = 0;

			// changes letters successively, one letter per day
			for (String s : line) {
				if (index > 2) index = 0; 				// resets letter-index
				if (!Objects.equals(s, per[index]))
					days++; index++;					// days and current index increases
			}

			System.out.println(days);
		}
	}
}
