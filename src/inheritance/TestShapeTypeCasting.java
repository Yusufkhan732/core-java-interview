package inheritance;

public class TestShapeTypeCasting {

	public static void main(String[] args) {

		Shape shape = new Rectangle();

		shape.setColor("red");


		Rectangle rectangle = (Rectangle) shape; // Type casting

		rectangle.setColor("Yellow");

		System.out.println(rectangle.getColor());

	}

}
