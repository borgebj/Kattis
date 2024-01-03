package medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class primereduction {
	static HashSet<Integer> primes = new HashSet<>();

	private static ArrayList<Integer> primeFactors(int num) {
		ArrayList<Integer> factors = new ArrayList<>();

		while (num%2==0) {
			factors.add(2);
			num /= 2;
		}
		for (int i = 3; i <= Math.sqrt(num); i+=2) {
			while (num % i == 0) {
				factors.add(i);
				num /= i;
			}
		}
		if (num > 2) factors.add(num);
		return factors;
	}

	private static boolean isPrime(int num) {
		if (primes.contains(num)) return true;
		if (num < 2) return false;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) return false;
		}
		primes.add(num);
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
