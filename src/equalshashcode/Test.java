package equalshashcode;

public class Test {

	private int id;
	private String name;

	private int salary;

	public Test(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;

	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("in equals");
		if (obj == null) {

			return false;
		}
		if (!(obj instanceof Test)) {
		}
		Test t = (Test) obj;

		boolean b = this.id == t.id && this.name.equals(t.name) && this.salary == salary;

		return b;

	}

	@Override
	public int hashCode() {
		System.out.println(" in hashCode");
		String str = id + name + salary;
		return str.hashCode();
	}

	@Override
	public String toString() {
		String str = id + " " + name + " " + salary;
		return str;
	}
}
