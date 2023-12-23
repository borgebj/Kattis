package medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class teque {
	private static class Teque<E> extends LinkedList<E> implements Deque<E> {
		public void push_back(E x) {
			super.addLast(x);
		}
		public void push_front(E x) {
			super.addFirst(x);
		}
		public void push_middle(E x) {
			int k = this.size();
			int middle = (k+1)/2;
			super.add(middle, x);
		}
		@Override
		public E get(int index) {
			return super.get(index);
		}
	}
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int lines = Integer.parseInt(br.readLine());

			Teque<Integer> teque = new Teque<>();

			for (int i=0; i < lines; i++) {
				String[] action = br.readLine().split(" ");
				String call = action[0];
				int arg = Integer.parseInt(action[1]);

				switch (call){
					case "push_front":
						teque.push_front(arg); break;
					case "push_back":
						teque.push_back(arg); break;
					case "push_middle":
						teque.push_middle(arg); break;
					case "get":
						System.out.println(teque.get(arg)); break;
				}
			}
		}
	}
}
