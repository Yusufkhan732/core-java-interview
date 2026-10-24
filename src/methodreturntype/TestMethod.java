package methodreturntype;

public class TestMethod {

	public static void calArea(Shape[] s) {

		for (int i = 0; i < s.length; i++) {

			System.out.println("Area " + s[i].area());

		}
	}

	public static void main(String[] args) {

		Shape s[] = new Shape[3];

		s[0] = Shape.getShape(1);

		s[1] = Shape.getShape(2);
		s[2] = Shape.getShape(3);

		calArea(s);
	}

}
