package comparator;

import java.util.Comparator;

public class EmployeeShortByIdName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getId() == o2.getId()) {
			return o1.name.compareTo(o2.getName());
		}
		return o1.getId() - o2.getId();
	}
}