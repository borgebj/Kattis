package easy;

import java.util.Scanner;

public class aleidibio {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		assert 1 <= a && b <= 100 && 720 <= c && c <= 1439;
		System.out.println(c-a-b);
	}
}
