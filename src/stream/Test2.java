package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {

		List<Test1> list = new ArrayList<Test1>();
		list.add(new Test1("yusuf", 30000));
		list.add(new Test1("akbar", 40000));
		list.add(new Test1("shad", 50000));
		list.add(new Test1("azam", 60000));
//second higest
//		list.stream().map(e -> e.getSalary()).distinct().sorted(Comparator.reverseOrder()).skip(1).limit(1)
//				.forEach(System.out::println);

		// list.stream().filter(e -> e.getSalary() > 30000).forEach(e ->
		// System.out.println(e.getSalary()));

		// list.stream().map(e ->
		// e.getSalary()).distinct().sorted().forEach(System.out::println);

		// list.stream().map(e ->
		// e.getSalary()).distinct().sorted().limit(1).forEach(System.out::println);

		list.stream().map(e -> e.getSalary()).distinct().sorted().skip(1).limit(1).forEach(System.out::println);
	}

}
