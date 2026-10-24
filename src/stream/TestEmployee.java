package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestEmployee {
	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();

		employees.add(new Employee("Alice", 50000));
		employees.add(new Employee("Bob", 70000));
		employees.add(new Employee("Charlie", 60000));
		employees.add(new Employee("David", 20000));
		employees.add(new Employee("David", 80000));
		employees.add(new Employee("Neeraj", 80000));

		// firstHigest
		employees.stream().map(e -> e.getSalary()).distinct().sorted(Comparator.reverseOrder()).limit(1)
				.forEach(System.out::println);

		System.out.println("----------SecondHighest---------");
		employees.stream().map(e -> e.getSalary()).distinct().sorted(Comparator.reverseOrder()).skip(1).limit(1)
				.forEach(System.out::println);

		System.out.println("-----Salary greator than 20000------");

		employees.stream().filter(e -> e.getSalary() > 20000).forEach(e -> System.out.println(e.getSalary()));

		System.out.println("-----------AccendingOreder----------");

		// ascending order
		employees.stream().map(e -> e.getSalary()).distinct().sorted().forEach(System.out::println);
		System.out.println("-------------firstLowest-----------");
		employees.stream().map(e -> e.getSalary()).distinct().sorted().limit(1).forEach(System.out::println);
		System.out.println("------------SecondLowest---------");
		employees.stream().map(e -> e.getSalary()).distinct().sorted().skip(1).limit(1).forEach(System.out::println);

	}

}