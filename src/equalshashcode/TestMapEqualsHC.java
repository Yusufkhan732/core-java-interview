package equalshashcode;

import java.util.HashMap;
import java.util.Map;

public class TestMapEqualsHC {
	public static void main(String[] args) {

		Employee e1 = new Employee(1, "Yusuf", 10000);
		Employee e2 = new Employee(1, "Yusuf", 10000);
		Employee e3 = new Employee(1, "Yusuf", 10400);
		Employee e4 = new Employee(1, "Yusuf", 10400);

		Map m = new HashMap();

		m.put(e1, "Employee1");
		m.put(e2, "Employee2");
		m.put(e3, "Employee3");
		m.put(e4, "Employee4");

		System.out.println(m);
		System.out.println(m.size());
	}

}