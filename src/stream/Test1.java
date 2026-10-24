package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Test1 {

	public String name;

	public double salary;

	public Test1(String name, double salary) {
		this.name = name;

		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
}
