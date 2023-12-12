package easy;

import java.util.Scanner;

public class bela {

	private static int getValue(String card, Boolean dominant) {
		return switch (card) {
			case "A" -> 11;
			case "K" -> 4;
			case "Q" -> 3;
			case "J" -> dominant ? 20 : 2;
			case "T" -> 10;
			case "9" -> dominant ? 14 : 0;
			default -> 0;
		};
		// note: kattis kan ikke kjøre return switch, sendt inn er gammel switch
	}

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			String main_suit = scanner.next();
			scanner.nextLine();

			int sum = 0;
			for (int i=0; i < 4*n; i++) {
				String line = scanner.nextLine();
				String card = String.valueOf(line.charAt(0));
				String suit = String.valueOf(line.charAt(1));

				if (suit.equals(main_suit))
					sum += getValue(card, true);
				else sum += getValue(card, false);
			}
			System.out.println(sum);
		}
	}
}
