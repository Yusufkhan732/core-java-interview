package equalshashcode;

import java.util.HashSet;
import java.util.Set;

public class TestSetEqualHC {
	public static void main(String[] args) {

		Employee e1 = new Employee(1, "Neeraj", 12000);
		Employee e2 = new Employee(2, "Rishabh", 13000);
		Employee e3 = new Employee(3, "Chetaniya", 14000);

		Employee emp = new Employee(3, "Chetaniya", 14000);

		Set s = new HashSet();

		s.add(e1);
		s.add(e2);
		s.add(e3);

		s.add(emp);
		System.out.println(s);
		System.out.println(s.size());
	}

}