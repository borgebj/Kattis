package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class relocation {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String[] info = br.readLine().split(" ");
			int n = Integer.parseInt(info[0]);
			int q = Integer.parseInt(info[1]);

			int[] companies = new int[n+1];

			// Reads and adds companies
			String[] company_line = br.readLine().split(" ");
			for (int i = 1; i <= n; i++) {
				companies[i] = Integer.parseInt(company_line[i-1]);
			}

			// Reads and processes requests
			for (int i = 0; i < q; i++) {
				String[] process = br.readLine().split(" ");
				int type = Integer.parseInt(process[0]);
				int b = Integer.parseInt(process[1]);
				int c = Integer.parseInt(process[2]);

				if (type == 1) { // Move company c to x
					companies[b] = c;
					// 1 C X
				} else { // Query
					int bval = companies[b];
					int cval = companies[c];
					int distance = Math.abs(bval-cval);
					System.out.println(distance); // Distance = absolute of difference
					// 2 A B
				}
			}
		}
	}
}
