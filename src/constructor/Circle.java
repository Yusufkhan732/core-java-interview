package constructor;

public class Circle extends Shape {

	public int redius;

	public static final double PI = 3.14;

	public Circle(int redius) {
		this.redius = redius;
	}

	@Override
	public double area() {
		System.out.println("circle area method");
		return PI * redius * redius;
	}

}
