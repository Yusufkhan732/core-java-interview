package comparable;

public class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private int salary;

	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;

	}

	@Override
	public int compareTo(Employee o) {

		if (this.name.equals(o.name)) {
			return 0;
		} else if (this.name.compareTo(o.name) < 0) {
			return -1;

		} else {
			return 1;
		}
	}
	// -1 tab aayega jab this alphabetically pehle hai.
	// 1 tab aayega jab this alphabetically baad mein hai.
	// 0 tab aayega jab dono same hain.
//
//	@Override
//	public int compareTo(Employee o) {
//		if (this.name.equals(o.name)) {
//			if (this.salary == o.salary) {
//				return 0;
//
//			} else if (this.salary < o.salary) {
//				return -1;
//
//			} else {
//				return 1;
//
//			}
//		} else if (this.name.compareTo(o.name) < 0) {
//			return -1;
//		}
//		return 1;
//	}

	@Override
	public String toString() {
		return id + " " + salary + " " + name;
	}

}