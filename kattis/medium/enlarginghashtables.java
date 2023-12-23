package medium;

import java.util.Scanner;

public class enlarginghashtables {

	// more effective prime-check
	private static boolean isPrime(long n) {
		if(n < 2) return false;
		if(n == 2 || n == 3) return true;
		if(n%2 == 0 || n%3 == 0) return false;

		long sqrtN = (long) Math.sqrt(n)+1;

		for(long i = 6L; i <= sqrtN; i += 6) {
			if(n%(i-1) == 0 || n%(i+1) == 0) return false;
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
