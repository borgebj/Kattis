package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class aboveaverage {
	private static double calcAvg(StringTokenizer tokenizer, int students, int[] grades) {
		double total = 0;
		for (int j = 0; j < students; j++) {
			grades[j] = Integer.parseInt(tokenizer.nextToken());
			total += grades[j];
		}

		// average calculation
		return (students == 0) ? 0 : total / students;
	}

	private static double calcAboveAvg(int[] grades, double avgGrade) {
		double count = 0;
		for (int grade : grades)
			if (grade > avgGrade) count++;

		return count;
	}

	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int cases = Integer.parseInt(br.readLine());

			for (int i = 0; i < cases; i++) {
				StringTokenizer tokenizer = new StringTokenizer(br.readLine());
				int students = Integer.parseInt(tokenizer.nextToken());
				int[] grades = new int[students];

				// Read grades and calculate average
				double avgGrade = calcAvg(tokenizer, students, grades);

				// Calculate percentage of students above average
				double aboveAverageCount = calcAboveAvg(grades, avgGrade);

				// Calculate and print result
				double percentageAboveAverage = (aboveAverageCount / students) * 100;
				System.out.printf("%.3f%%%n", percentageAboveAverage);
			}
		}
	}
}
