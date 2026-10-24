package comparable;

public class Test implements Comparable<Test> {

	private int id;

	private String name;

	private int salary;

	public Test(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int compareTo(Test o) {
		if (name.equals(o.name)) {

			return 0;

		} else if (this.name.compareTo(o.name) < 0) {

			return -1;
		}

		return 1;
	}

	@Override
	public String toString() {

		return id + " " + name + " " + salary;
	}
}
