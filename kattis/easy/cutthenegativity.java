package easy;

import java.util.ArrayList;
import java.util.Scanner;

public class cutthenegativity {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int size = scanner.nextInt();

			ArrayList<String> flights = new ArrayList<>();

			// creating flight-matrix
			for (int i=1; i <= size; i++) {
				for (int j=1; j <= size; j++) {
					int val = scanner.nextInt();
					if (val > 0)
						flights.add(i+" "+j+" "+val);
				}
			}

			// prints out positive flights
			System.out.println(flights.size());
			flights.forEach(System.out::println);
		}
	}
}
