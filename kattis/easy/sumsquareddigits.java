package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sumsquareddigits {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int lines = Integer.parseInt(br.readLine());

			for (int i=1; i <= lines; i++) {
				String[] line = br.readLine().split(" ");
				int base = Integer.parseInt(line[1]);
				int num = Integer.parseInt(line[2]);
				int SSD = 0;

				// Calculates sum of squared digits
				int quotient = num;
				while (quotient != 0) {
					// SSD is calculated - each digitin new base^2
					int digit = (quotient % base);
					SSD += (digit * digit);
					quotient /= base;
				}
				// prints index with result
				System.out.println(i + " " + SSD);
			}
		}
	}
}
