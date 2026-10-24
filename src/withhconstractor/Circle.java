package withhconstractor;

public class Circle extends Shape {

	public int radius;

	public static final double PI = 3.14;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		System.out.println("circle area method");

		return PI * radius * radius;
	}
}