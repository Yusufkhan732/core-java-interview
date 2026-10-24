package collection.copy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestFailFast {

	public static void main(String[] args) {

		// ConcurrentModificationException
		List list = new ArrayList();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		Iterator it = list.iterator();

//		list.add('r'); // Iterator banne ke baad direct add nahi kr skte
//		list.remove(1); // Iterator banne ke baad direct remove nahi kr skte

		// Isliye ise Fail-Fast kehte hain — problem detect hote hi Iterator turant
		// fail/stop ho jata hai.

		while (it.hasNext()) {

			System.out.println(it.next());

		}
		System.out.println(list);
	}
}