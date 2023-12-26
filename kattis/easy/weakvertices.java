package easy;

import java.util.ArrayList;
import java.util.Scanner;

public class weakvertices {

	private static void findWeak(int[][] matrix, int v) {
		ArrayList<Integer> weak = new ArrayList<>();

		for (int i=0; i < v; i++) {
			boolean isWeak = true;

			for (int j=0; j < v; j++) {

				// edge exists from i to j : check
				if (matrix[i][j] == 1) {
					for (int k=0; k < v; k++) {
						if (matrix[i][k] == 1 && matrix[j][k] == 1) {
							isWeak = false;
							break;
						}
					}
				}
			}
			if (isWeak) weak.add(i);
		}
		weak.sort(Integer::compare); 						// sorts small to big
		weak.forEach(val -> System.out.print(val + " "));	// prints all
		System.out.println("\n0");
	}
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int v = scanner.nextInt(); scanner.nextLine(); // vertices

			int[][] matrix = new int[v][v];

			// parsing
			for (int i=0; i < v; i++)
				for (int j=0; j < v; j++)
					matrix[i][j] = scanner.nextInt();

			scanner.nextInt(); scanner.nextInt(); scanner.nextInt();

			// looks for weak vertices
			findWeak(matrix, v);
		}
	}
}
