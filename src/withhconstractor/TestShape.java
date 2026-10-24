package withhconstractor;

public class TestShape {

	public static void main(String[] args) {

		Shape[] s = new Shape[2];

		s[0] = new Circle();
		s[1] = new Rectangle();

		Rectangle r = (Rectangle) s[1];

		r.setLength(2);
		r.setWidth(3);

		Circle c = (Circle) s[0];

		c.setRadius(2);

		for (int i = 0; i < s.length; i++) {

			System.out.println(s[i].area());

		}
	}
}
