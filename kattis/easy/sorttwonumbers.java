package easy;

import java.util.Scanner;

public class sorttwonumbers {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt(), b = s.nextInt();

		assert 0 <= a && a <= 1_000_000;
		assert 0 <= b && b <= 1_000_000;

		if (a < b) {
			System.out.println(a+" "+b);
		}
		else System.out.println(b+" "+a);
	}
}
