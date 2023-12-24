package medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class primereduction {

	private static ArrayList<Integer> primeFactors(int num) {
		ArrayList<Integer> factors = new ArrayList<>();
		for (int i = 2; i <= Math.sqrt(num); i++) {
			while (num % i == 0) {
				factors.add(i);
				num /= i;
			}
		}
		if (num > 2) factors.add(num);
		return factors;
	}

	private static boolean isPrime(int num) {
		if (num < 2) return false;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) return false;
		}
		return true;
	}

	public static void main(String[] args) throws IOException {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			String line;
			while ((line = reader.readLine()) != null) {
				int x = Integer.parseInt(line.trim());
				int processes = 1;

				while (true) {
					if (isPrime(x)) {
						System.out.println(x + " " + processes);
						break;
					} else {
						processes++;
						ArrayList<Integer> factors = primeFactors(x);
						x = factors.stream().mapToInt(Integer::intValue).sum();
					}
				}
			}
		}
	}
}
