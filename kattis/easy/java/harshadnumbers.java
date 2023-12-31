package easy;

import java.util.Scanner;

public class harshadnumbers {

	static int sumOfDigits(int num) {
		return num == 0 ? 0 : num % 10 + sumOfDigits(num / 10);
	}

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int num = scanner.nextInt();
			int digitSum = String.valueOf(Math.abs(num)).chars().map(Character::getNumericValue).sum();

			// finds smallest harshad greater or equal to n
			while (num % digitSum != 0) {
				num += 1;
				digitSum = sumOfDigits(num);
			}

			// prints result
			System.out.println(num);
		}
	}
}
