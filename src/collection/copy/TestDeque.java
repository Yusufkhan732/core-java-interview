package collection.copy;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestDeque {

	public static void main(String[] args) {

		Deque d = new ArrayDeque();

		d.add(20);

		d.add(30);

		d.add(40);

		d.add(50);

		d.add(70);

		System.out.println(d);

		System.out.println(d.offerFirst(10));
		System.out.println(d);
		System.out.println(d.offerLast(80));

		System.out.println(d);

	}
}
