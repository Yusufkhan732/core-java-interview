package superthis;

public class Rectangle extends Shape {

	private int length;

	private int width;

	public Rectangle() { // default constructor
	}

	public Rectangle(int length, int width) { // constructor with 2 parameters
		this.length = length;
		this.width = width;
	}

	public Rectangle(String color, int borderWidth) { // using super keyword to access color and borderwidth from Shape
														// class
		super(color, borderWidth);
	}

	public Rectangle(int length, int width, String color, int borderWidth) { // constructor with 4 parameters
		this(color, borderWidth);
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	@Override
	public void area() {
		int rArea = length * width;
		System.out.println("Rectangle Area: " + rArea);
	
	}
}