package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class TestSet {

	public static void main(String[] args) {

		Set s = new HashSet();

		s.add(1);
		s.add(null);
		s.add(1);
		s.add(null);
		s.add(3);

		System.out.println(s);

		HashSet h = new HashSet();
		h.add("one");
		h.add("one");
		h.add("three");
		h.add("four");
		h.add(null);

		Iterator it = h.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());

		}
	}
}
