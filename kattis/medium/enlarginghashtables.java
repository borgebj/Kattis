package medium;

import java.util.Scanner;

public class enlarginghashtables {

	// A good prime-checker!
	private static boolean isPrime(int num) {
		if (num<2) return false;
		for (int i=2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {

			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				if (Integer.parseInt(line) == 0) break; // eof: 0
				int n = Integer.parseInt(line);

				// calculates smallest prime larger than 2n
				int dub = 2*n;
				while (!isPrime(dub))
					dub++;

				// prints smallest prime larger than 2n, also if n is not prime
				if (isPrime(n)) System.out.println(dub);
				else System.out.println(dub + " ("+n+" is not prime)");
			}
		}
	}
}
