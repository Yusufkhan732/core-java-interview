package equalshashcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test12 {

	public static void main(String[] args) {

		Test t1 = new Test(1, "ilyas", 1200);

		Test t3 = new Test(1, "ilyas", 1200);

		System.out.println("t1 " + t1);
		System.out.println("t3 " + t3);

		System.out.println(t1.equals(t3));

		// System.out.println(t1.equals("ilyas"));

		System.out.println(t1.hashCode());
		System.out.println(t3.hashCode());

		Set s = new HashSet();

		s.add(t1);

		s.add(t3);

		System.out.println("s" + s);


	}

}
