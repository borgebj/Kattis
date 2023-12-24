package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class towering {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			ArrayList<Integer> towers = new ArrayList<>();
			for (int i=0; i<6; i++) towers.add(scanner.nextInt());

			int[] sizes = {scanner.nextInt(), scanner.nextInt()};

			// strategy: shuffle collections and check 3 first digits
			// if 3 first = sum, good!
			for (int size : sizes) {
				for (int sum=0; sum != size;) {
					Collections.shuffle(towers);
					sum = towers.subList(0, 3).stream().mapToInt(Integer::intValue).sum();
				}
				List<Integer> sorted = towers.subList(0, 3);
				sorted.sort(Collections.reverseOrder());
				sorted.forEach(value -> System.out.print(value + " "));}
		}
	}
}
