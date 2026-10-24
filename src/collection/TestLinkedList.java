package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {

		LinkedList link = new LinkedList();

		link.add("neeraj");

		link.add("akbar");

		link.add("yusuf");

		link.add("shad");

		System.out.println(link);

		Iterator it = link.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());

			System.out.println(link.get(0));

			System.out.println(link.getFirst());

			System.out.println(link.getLast());

			System.out.println(link.set(0, "azam"));

			System.out.println(link.indexOf("azam"));
		}
	}
}
