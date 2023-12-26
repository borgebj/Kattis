package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class janitortroubles {
	// max area from: https://www.geeksforgeeks.org/maximum-area-quadrilateral/
	static double maxArea(double a, double b, double c, double d)
	{
		// Calculating the semi-perimeter
		// of the given quadrilateral
		double semiperimeter = (a + b + c + d) / 2;

		// Applying Brahmagupta's formula to
		// get maximum area of quadrilateral
		return Math.sqrt((semiperimeter - a) *
						 (semiperimeter - b) *
						 (semiperimeter - c) *
						 (semiperimeter - d));
	}
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String[] line = br.readLine().split(" ");
			int a = Integer.parseInt(line[0]);
			int b = Integer.parseInt(line[1]);
			int c = Integer.parseInt(line[2]);
			int d = Integer.parseInt(line[3]);

			double max = maxArea(a, b, c, d);
			System.out.println(max);
		}
	}
}
