package easy;

import java.util.Scanner;

public class betting {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int a = scanner.nextInt();

			assert 0 < a && a < 100;

			double one_perc = (double) (a) / 100;
			double two_perc = (double) (100 - a) /100;

			double one_ratio = 1 / one_perc;
			double two_ration = 1 / two_perc;

			System.out.println(one_ratio);
			System.out.println(two_ration);
		}
	}
}
