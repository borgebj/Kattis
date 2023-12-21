package easy;

import java.util.Objects;
import java.util.Scanner;

public class vefthjonatjon {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt(); scanner.nextLine();

			int cpu = 0;
			int hdd = 0;
			int mem = 0;

			for (int i=0; i < n; i++) {
				if (Objects.equals(scanner.next(), "J")) cpu++;
				if (Objects.equals(scanner.next(), "J")) hdd++;
				if (Objects.equals(scanner.next(), "J")) mem++;
				scanner.nextLine();
			}

			System.out.println(Math.min(Math.min(cpu, hdd), mem));
		}
	}
}
