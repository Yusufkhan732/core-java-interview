package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComprator {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(new Employee(1, "Rishabh", 5000));
		list.add(new Employee(3, "Rishabh", 3300));
		list.add(new Employee(2, "Ajay", 4000));
		list.add(new Employee(4, "Aditya", 5000));

		
//		  EmployeeShortByName byName = new EmployeeShortByName();
//		  
//		  Collections.sort(list, byName);
//		  
//		  for (Object o : list) { System.out.println(o); }
		 

		EmployeeShortByIdNameSalary byINS = new EmployeeShortByIdNameSalary();

		Collections.sort(list, byINS);

		for (Object o : list) {
			System.out.println(o);
		}

	}
}