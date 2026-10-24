package inheritance;

public class TestShape {

	public static void main(String[] args) {

		Shape s = new Shape();

		s.area();

		Rectangle r = new Rectangle();

		r.setColor("red");
		r.setName("car");
		r.setWidth(5);
		r.setLength(3);

		System.out.println(r.getColor());
		System.out.println(r.getName());
		System.out.println(r.getLength());
		System.out.println(r.getWidth());
		r.area();
	}
}