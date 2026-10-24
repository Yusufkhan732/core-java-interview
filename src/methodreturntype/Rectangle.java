package methodreturntype;

public class Rectangle extends Shape {

	public int length;

	public int witdh;

	public Rectangle(int length, int witdh) {

		this.length = length;
		this.witdh = witdh;
	}

	@Override
	public double area() {
		System.out.println("rectagle mthod area");
		return length * witdh;
	}

}
