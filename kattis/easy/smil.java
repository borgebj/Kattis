package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class smil {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String[] smiles = {":)", ";)", ":-)", ";-)"};
			ArrayList<Integer> indexes = new ArrayList<>();
			String line = scanner.nextLine();

			// checks for every smile type in line
			for (String smile : smiles) {
				int idx = line.indexOf(smile);
				// adds smile-index while it stille exists
				while (idx != -1) {
					indexes.add(idx);
					idx = line.indexOf(smile, idx+1);
				}
			}
			// sorts -> prints descending order
			Collections.sort(indexes);
			indexes.forEach(System.out::println);
		}
	}
}
