package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class cd {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			String line;
			while (!(line = br.readLine()).equals("0 0")) {
				String[] info = line.split(" ");
				int jack = Integer.parseInt(info[0]);
				int jill = Integer.parseInt(info[1]);

				HashSet<Integer> cds = new HashSet<>();
				int count = 0;

				for (int i=0; i < jack; i++) {
					cds.add(Integer.parseInt(br.readLine()));
				}

				for (int j=0; j < jill; j++) {
					if (cds.contains(Integer.parseInt(br.readLine()))) {
						count++;
					}
				}
				System.out.println(count);
			}
		}
	}
}
