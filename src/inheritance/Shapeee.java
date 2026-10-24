package inheritance;

public class Shapeee {

	private String color;

	private String name;

	public void test() {

		name = "bmw";

		color = "red";

		System.out.println(color);
		System.out.println(name);
	}

	public static void main(String[] args) {

		Shapeee s = new Shapeee();

		s.test();
	}

}
