package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmployee {
	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();

		list.add(new Employee(1, "Neeraj", 120000));
		list.add(new Employee(4, "Rishabh", 140000));
		list.add(new Employee(2, "Lucky", 120000));
		list.add(new Employee(3, "Ankit", 110000));
		list.add(new Employee(5, "Rishabh", 140000));

		Collections.sort(list);

		System.out.println(list);
	}
}