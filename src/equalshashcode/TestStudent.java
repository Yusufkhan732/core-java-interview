package equalshashcode;

import java.util.HashMap;
import java.util.Map;

public class TestStudent {
	public static void main(String[] args) {

		Student s1 = new Student(1, "Neeraj");
		Student s2 = new Student(1, "Neeraj");
		Student s3 = new Student(2, "Mewada");
		Map map = new HashMap();

		map.put(s1, "Student1");
		map.put(s2, "Student2");
		map.put(s3, "Student3");

		System.out.println(map);
		System.out.println(map.size());
	}
}