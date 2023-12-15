package easy;

import java.util.Scanner;

public class triarea {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int height = scanner.nextInt();
			int base = scanner.nextInt();

			assert 1 <= height && height <= 1000;
			assert 1 <= base && base <= 1000;

			// triangle area formula = base * height * 1/2
			double area = (double) (base * height) / 2;

			System.out.println(area);
		}
	}
}
