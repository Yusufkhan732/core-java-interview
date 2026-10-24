package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(new Employee(1, "abc", 1200));
		list.add(new Employee(2, "abcd", 1300));
		list.add(new Employee(3, "ab", 1300));

		EmployeeShortByName name = new EmployeeShortByName();

		Collections.sort(list, name);
		
		
		for(Object obj : list) {
			
			System.out.println(obj);
			
		}
	}

}
