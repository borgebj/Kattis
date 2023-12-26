package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fiftyshades {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int n = Integer.parseInt(br.readLine());

			int attend = 0;
			for (int i=0; i < n; i++) {
				String line = br.readLine().toLowerCase();
				if (line.contains("rose") || line.contains("pink"))
					attend++;
			}
			System.out.println(attend > 0 ? attend : "I must watch Star Wars with my daughter");
		}
	}
}
