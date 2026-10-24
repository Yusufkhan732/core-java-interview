package collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestSortedSet {

	public static void main(String[] args) {

		SortedSet s = new TreeSet();
		s.add(12);
		s.add(13);
		s.add(14);
		s.add(15);
		s.add(16);
		s.add(18);
		s.add(17);
		s.add(17);

		System.out.println(s); // Set ka pura data
		System.out.println(s.first());
		System.out.println(s.last());
		System.out.println(s.headSet(15)); // 15 se chhoti values
		System.out.println(s.tailSet(13)); // 13 aur uske baad ki values
		System.out.println(s.subSet(12, 15)); // 12 se 15 ke beech ki values
	}
}