package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class alphabetspam {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			char[] line = br.readLine().toCharArray();

			// ratios
			double whitespace = 0;
			double lowercase = 0;
			double uppercase = 0;
			double symbols = 0;

			// find ratios
			for (char c : line) {
				if (c == '_') whitespace++;
				else if (Character.isLowerCase(c)) lowercase++;
				else if (Character.isUpperCase(c)) uppercase++;
				else symbols++;
			}

			// calculate ratios
			double n = line.length;
			whitespace /= n;
			lowercase /= n;
			uppercase /= n;
			symbols /= n;

			// print result
			System.out.println(whitespace);
			System.out.println(lowercase);
			System.out.println(uppercase);
			System.out.println(symbols);
		}
	}
}
