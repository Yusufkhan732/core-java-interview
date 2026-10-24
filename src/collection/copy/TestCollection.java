package collection.copy;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {

	public static void main(String[] args) {

		Collection c = new ArrayList();

		c.add("Neeraj");
		c.add("Dheeraj");
		c.add("Veeraj");
		c.add("Yuraj");

		System.out.println("Collection : " + c);
		System.out.println("Size : " + c.size());
		System.out.println("Contains Neeraj : " + c.contains("Neeraj"));
		System.out.println("Is Empty : " + c.isEmpty());
		c.remove("Yuraj");
		System.out.println("After remove : " + c);
		Collection c1 = new ArrayList();
		c1.add("Raj");
		c1.add("Vijay");
		c.retainAll(c1);
		System.out.println("After retainAll : " + c);
		c.addAll(c1);
		System.out.println("After addAll : " + c);
		System.out.println("Contains all c1 : " + c.containsAll(c1));
		System.out.println(c.removeAll(c1));
		System.out.println("After clear : " + c);
		System.out.println("Is Empty : " + c.isEmpty());
	}
}