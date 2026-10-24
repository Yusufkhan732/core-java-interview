package collection.copy;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add('a');
		list.add('b');
		list.add(null);
		list.add(null);
		list.add('a');

		List list2 = new ArrayList();

		list2.add('d');
		list2.add('e');

		System.out.println(list);
		System.out.println(list.subList(1, 2));
		System.out.println(list.get(2));
		System.out.println(list.contains('a'));
		System.out.println(list.addAll(list2));
		System.out.println(list.containsAll(list2));
		System.out.println(list.remove(2));
		System.out.println(list);
		System.out.println(list.set(1, 'A'));
		System.out.println(list);

		list.clear();

		System.out.println(list.isEmpty());
		System.out.println(list);

	}
}