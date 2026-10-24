package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestListReverse {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add('a');
		list.add('b');
		list.add('c');
		list.add('d');
		list.add('e');

//		Collections.reverse(list);
//		System.out.println(list);

		for (int i = list.size() - 1; i >= 0; i--) {

			System.out.println(list.get(i));

		}
	}

}
