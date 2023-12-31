package easy;

import java.util.Scanner;

public class cetvrta {

	// gets the int with least occurences, given two are always equal
	static int getLeast(int a, int b, int c) {
		if (a == b) return c;
		if (b == c) return a;
		return b;
	}

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int ax = scanner.nextInt(), ay = scanner.nextInt();
			int bx = scanner.nextInt(), by = scanner.nextInt();
			int cx = scanner.nextInt(), cy = scanner.nextInt();

			int x = getLeast(ax, bx, cx);
			int y = getLeast(ay, by, cy);

			System.out.println(x+" "+y);
		}
	}
}
