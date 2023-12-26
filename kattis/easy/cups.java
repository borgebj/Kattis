package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class cups {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int lines = scanner.nextInt(); scanner.nextLine();
			HashMap<String, Integer> order = new HashMap<>();

			// if first is int: halve it and add to hashmap, else add normally
			for (int i=0; i < lines; i++) {
				String[] words = scanner.nextLine().split(" ");
				try {
					int doubled = Integer.parseInt(words[0]);
					order.put(words[1], doubled/2);
				}
				catch (NumberFormatException ignored) {
					int radius = Integer.parseInt(words[1]);
					order.put(words[0], radius);
				}
			}
			order.entrySet().stream()
							.sorted(Map.Entry.comparingByValue())  // sorts based on key-value
							.map(Map.Entry::getKey)				   // extracts only the keys
							.forEach(System.out::println);		   // prints each
		}
	}
}
