package easy;

import java.util.Scanner;

public class heimavinna {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String line = scanner.nextLine();

			// splits the problems by ;
			String[] problems = line.split(";");
			int sum = 0;

			// counts the range and amount of problems
			for (String problem : problems) {
				String[] range = problem.split("-");

				int from = Integer.parseInt(range[0]);
				if (range.length == 2)
					sum += (Integer.parseInt(range[1]) - from) + 1;
				else
					sum += 1;
			}

			System.out.println(sum);
		}
	}
}
