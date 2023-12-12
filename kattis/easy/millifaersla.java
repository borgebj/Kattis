package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class millifaersla {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> names = new HashMap<>();

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		// boundary assertion
		assert 1 <= a && a <= 1_000_000_000;
		assert 1 <= b && b <= 1_000_000_000;
		assert 1 <= c && c <= 1_000_000_000;

		names.put("Monnei", a);
		names.put("Fjee", b);
		names.put("Dolladollabilljoll", c);

		// Find the key with the maximum value using Stream API
		String keyWithMaxValue = names.entrySet()
				.stream()
				.min(Map.Entry.comparingByValue())
				.map(Map.Entry::getKey)
				.orElse(null);

		System.out.println(keyWithMaxValue);
	}
}
