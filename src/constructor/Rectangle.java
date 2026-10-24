package constructor;

public class Rectangle extends Shape {

	public int length;
	public int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;

	}

	@Override
	public double area() {
		System.out.println("rectagle area method");
		return length * width;

	}
}
