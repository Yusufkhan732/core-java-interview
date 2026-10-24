package collection;

import java.util.SortedMap;
import java.util.TreeMap;

public class TestShortedMap {

	public static void main(String[] args) {

		SortedMap<Integer, String> m = new TreeMap<Integer, String>();

		// Reason: TreeMap में null key नहीं, लेकिन null value allowed है.
		// Agar null key bhi rakhni hai, to HashMap use kar sakte ho:

		m.put(1, "One");
		m.put(3, "Three");
		m.put(2, "Two");
		m.put(4, "abc");
		m.put(5, null);

		System.out.println(m);
		System.out.println(m.lastKey()); // sabse badi key
		System.out.println(m.firstKey()); // sabse chhoti key
		System.out.println(m.tailMap(4)); // 4 se last tak ki entries
		System.out.println(m.subMap(2, 4)); // 2 included, 4 excluded
		System.out.println(m.entrySet());// saari key-value entries
		System.out.println(m.headMap(5));// se chhoti keys return
	}
}
