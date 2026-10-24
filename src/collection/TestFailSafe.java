package collection;

import java.util.Enumeration;
import java.util.Vector;

public class TestFailSafe {

	public static void main(String[] args) {

		Vector list = new Vector();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		Enumeration e = list.elements();

		list.addElement(300);
		
		list.add(200);

		while (e.hasMoreElements()) {

			System.out.println(e.nextElement());

		}

	}
}