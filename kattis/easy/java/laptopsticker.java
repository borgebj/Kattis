package easy;

import java.util.Scanner;

public class laptopsticker {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int wc = scanner.nextInt(), hc = scanner.nextInt();
			int ws = scanner.nextInt(), hs = scanner.nextInt();

			if (wc-ws >= 2 && hc-hs >= 2)
				System.out.println("1");
			else System.out.println("0");
		}
	}
}
