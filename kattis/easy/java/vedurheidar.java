package easy;

import java.util.ArrayList;
import java.util.Scanner;

public class vedurheidar {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int v = scanner.nextInt();
			int n = scanner.nextInt();

			assert 0 <= v && v <= 200;
			assert 1 <= n && n <= 100;

			ArrayList<String> roads = new ArrayList<>();

			for (int i=0; i < n; i++) {
				String road = scanner.next();
				int wind = scanner.nextInt();

				if (v <= wind)
					roads.add(road + " opin");
				else roads.add(road + " lokud");
			}

			roads.forEach(System.out::println);
		}
	}
}
