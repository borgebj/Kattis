package easy;

import java.util.Scanner;

public class hradgreining {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String DNA = scanner.nextLine();
		String cov = "COV";

		assert 3 <= DNA.length() && DNA.length() <= 1000;

		if (DNA.contains(cov))
			System.out.println("Veikur!");
		else
			System.out.println("Ekki veikur!");
	}
}
