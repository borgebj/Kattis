package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ofugsnuid {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			Stack<String> stack = new Stack<>();

			int n = Integer.parseInt(br.readLine());

			// adds from start to end
			for (int i=0; i < n; i++)
				stack.add(br.readLine());

			// prints from end to start
			while (!stack.isEmpty())
				System.out.println(stack.pop());
		}
	}
}
