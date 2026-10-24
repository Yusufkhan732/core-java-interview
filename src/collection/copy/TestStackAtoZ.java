package collection.copy;

import java.util.Stack;

public class TestStackAtoZ {

	public static void main(String[] args) {

		Stack s = new Stack();

		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(s.push(ch));
		}

		Stack s1 = new Stack();
		System.out.println();

		System.out.println("==============================");
		while (!s.empty()) {
			System.out.print(s1.push(s.pop()));
		}
	}

}
