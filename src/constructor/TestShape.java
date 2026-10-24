package constructor;

public class TestShape {

	public static void main(String[] args) {

		Shape[] s = new Shape[2];

		s[0] = new Circle(2);
		s[1] = new Rectangle(2, 3);

		for (int i = 0; i < s.length; i++) {

			System.out.println(s[i].area());

		}
	}
}