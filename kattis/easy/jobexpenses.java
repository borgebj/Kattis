package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jobexpenses {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int n = Integer.parseInt(br.readLine());

			int sum = 0;
			String[] nums = br.readLine().split(" ");

			// sums next n numbers if negative
			for (int i=0; i < n; i++) {
				int num = Integer.parseInt(nums[i]);
				if (num < 0) sum += num;
			}
			System.out.println(Math.abs(sum)); // print positive sum
		}
	}
}
