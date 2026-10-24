package methodreturntype;

public class Shape {

	public double area() {
		System.out.println("shape area method");
		return 0;
	}

	public static Shape getShape(int i) {

		if (i == 1) {

			return new Rectangle(2, 3);

		}
		if (i == 2) {

			return new Circle(2);

		}

		return new Shape();
	}
}
