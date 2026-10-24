package methodreturntype;

public class Circle extends Shape {

	public double radius;

	public static final float PI = 3.14f;

	public Circle(double radius) {

		this.radius = radius;
	}

	@Override
	public double area() {
		System.out.println("circle method area");
		return PI * radius * radius;
	}

}
