package equalshashcode;

public class TestStringHC {
	public static void main(String[] args) {

		String s = "java";

		String s1 = "java";

		System.out.println(s.equals(s1));
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());

	}

}