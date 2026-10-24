package equalshashcode;

public class Student {

	public int id;
	public String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null) {
			return false;
		}

		if (!(obj instanceof Student)) {
			return false;
		}

		Student s = (Student) obj;

		return this.id == s.id && this.name.equals(s.name);
	}

	@Override
	public int hashCode() {
		return name.hashCode() + id;
	}

	@Override
	public String toString() {
		return id + " = " + name;
	}

}
