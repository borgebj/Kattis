package easy;

import java.util.ArrayList;
import java.util.Scanner;

public class avion {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {

			ArrayList<Integer> lines = new ArrayList<>();

			for (int i=0; i < 5; i++) {
				String line = scanner.nextLine();
				if (line.toLowerCase().contains("fbi"))
					lines.add(i+1);
			}

			if (lines.size() == 0) System.out.println("HE GOT AWAY!");
			else lines.forEach(s -> System.out.print(s + " "));
		}
	}
}
