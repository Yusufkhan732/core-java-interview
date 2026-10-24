package collection;

import java.util.Enumeration;
import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {

		Vector v = new Vector();

		v.add(200);

		v.add(100);

		v.add(200);

		Enumeration en = v.elements();
		
		v.add(100);
		v.addElement(500);

		while (en.hasMoreElements()) {

			System.out.println(en.nextElement());

		}
	}
}
